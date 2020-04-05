<?php
if (isset($_GET['email']) && isset($_GET['hash'])) {
    if (!empty($_GET['email']) && !empty($_GET['hash'])) {
        $email=$_GET['email'];
        $hash=$_GET['hash'];
        $dbservername='localhost';
        $dbusername='root';
        $dbpassword='';
        $dbname='sms';

        $conn=new mysqli($dbservername, $dbusername, $dbpassword, $dbname);
        if ($conn->connect_error==true) {
            die('connection error'.$conn->connect_error);
        } else {
            $sql="select email,hash,active from users where email='".$email."' AND hash='".$hash."' AND active='0'";
            $result=$conn->query($sql);

            if ($result->num_rows > 0) {
                $sql="update users set active='1' where email='".$email."' and hash='".$hash."' and active='0'";
                if ($conn->query($sql)) {
                    echo "account activated";
                } else {
                    echo "click  again on the provided link.";
                }

                $conn->close();
            }
        }
    }
}
