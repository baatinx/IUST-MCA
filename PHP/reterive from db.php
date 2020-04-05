<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>get data from db</title>
  </head>
  <body>
  <?php
if ($_SERVER['REQUEST_METHOD']=='POST') {
    $servername='localhost';
    $username='basit';
    $password='';
    $db='sms';

    $conn=new mysqli($servername, $username, $password, $db);
    if ($conn->connect_error==true) {
        die('connection error'.$conn->connect_error);
    }
    $sql='select * from student ;';
    $result=$conn->query($sql);

    if ($result->num_rows > 0) {
        echo "<table border=1><tr><th>ID</th><th>NAME</th><th>AGE</th><th>GENDER</th><th>ADDRESS</th><th>CONTACT</th></tr>";
        while ($row=$result->fetch_assoc()) {
            $tr='<tr><td>'.$row['id'].'</td><td>'.$row['name'].'</td><td>'.$row['age'].'</td><td>'.$row['gender'].'</td><td>'.$row['address'].'</td><td>'.$row['contact'].'</td></tr>';
            echo $tr;
        }
        echo "</table>";
    } else {
        echo "0 rows returned";
    }
    $conn->close();
}
   ?>
   <form  action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST">
<input type="submit" >
   </form>
  </body>
</html>
