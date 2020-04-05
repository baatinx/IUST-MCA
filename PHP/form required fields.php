<!DOCTYPE html>
<html>
  <head>
    <style >
    .error_msg{
      color: red;

    }

    </style>
    <meta charset="utf-8">
    <title>insert into database</title>
  </head>
  <body>

    <?php
    $name=$age=$gender=$address=$contact='';
    $name_err=$age_err=$gender_err=$address_err=$contact_err='';
    if ($_SERVER["REQUEST_METHOD"]=="POST") {
        if (empty($_POST['name'])) {
            $name_err='name is required';
        } else {
            $name=TestInput($_POST['name']);
        }

        if (empty($_POST['age'])) {
            $age_err='age is required';
        } else {
            $age=TestInput($_POST['age']);
        }

        if (empty($_POST['gender'])) {
            $gender_err='gender is required';
        } else {
            $gender=TestInput($_POST['gender']);
        }
        if (empty($_POST['address'])) {
            $address_err='address is required';
        } else {
            $address=TestInput($_POST['address']);
        }
        if (empty($_POST['contact'])) {
            $contact_err='contact is required';
        } else {
            $contact=TestInput($_POST['contact']);
        }

        $servername='localhost';
        $username='basit';
        $password='';
        $db='sms';

        $conn=new mysqli($servername, $username, $password, $db);

        if ($conn->connect_error==true) {
            die('connect error'.$conn->connect_error);
        } else {
            $sql="insert into student values(0,'".$name."',".$age.",'".$gender."','".$address."',".$contact.");";
            if ($conn->query($sql)==true) {
                echo "new record added";
            } else {
                echo $conn->connect_error;
            }
        }
    }
    function TestInput($data)
    {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
     ?>
    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="POST">
  <label>name </label><input type="text" name="name" value="<?php echo $name ?>" ><span class="error_msg">* <?php echo $name_err;?></span>
      <br><br>
    <label>age </label>  <input type="text" name="age" value="<?php echo $age ?>" ><span class="error_msg">* <?php echo $age_err;?></span>
      <br><br>
      <label>Female</label><input type="radio" name="gender" value="Female" <?php if (isset($gender) && $gender=='Female') {
         echo "checked";
     }
  ?> >
      <label>Male</label><input type="radio" name="gender" value="Male"<?php if (isset($gender) && $gender=='Male') {
      echo "checked";
  }
  ?> ><span class="error_msg">* <?php echo $gender_err;?></span>
      <br><br>
    <label>address </label>  <input type="text" name="address"  value="<?php echo $address ?>"  ><span class="error_msg">* <?php echo $address_err;?></span>
      <br><br>
      <label>contact </label><input type="text" name="contact" value="<?php echo $contact ?>"  ><span class="error_msg">* <?php echo $contact_err;?></span>
      <br><br>
      <input type="submit" name="submit">
    </form>
  </body>
</html>
