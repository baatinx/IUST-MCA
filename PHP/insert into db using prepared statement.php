<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>insert into database</title>
  </head>
  <body>
    <?php
    $check=$_SERVER["REQUEST_METHOD"]=="POST";
    if ($check) {
        $severname='localhost';
        $username='basit';
        $password='';
        $db='sms';
        $conn=new mysqli($severname, $username, $password, $db);
        if ($conn->connect_error) {
            die("connection error".$conn->connect_error);
        } else {
            $stmt=$conn->prepare("insert into student(id,name,age,gender,address,contact) values(0,?,?,?,?,?)");
            $stmt->bind_param("sissi", $name, $age, $gender, $address, $contact);

            $name= 'abc';
            $age=19;
            $gender='Male';
            $address='solina';
            $contact=9906785522;
            $stmt->execute();


            $name= 'def';
            $age=19;
            $gender='Male';
            $address='solina';
            $contact=9906785522;
            $stmt->execute();

            $name= 'ghi';
            $age=19;
            $gender='Male';
            $address='solina';
            $contact=9906785522;
            $stmt->execute();
            echo "multiple records inserted";
        }
    }

     ?>
    <form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST">

      <input type="submit" name="submit" >
    </form>
  </body>
</html>
