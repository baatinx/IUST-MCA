<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>insert into database</title>
  </head>
  <body>

    <?php
    if ($_SERVER["REQUEST_METHOD"]=="POST") {
        if (isset($_POST['name'])  && isset($_POST['age']) && isset($_POST['gender']) && isset($_POST['address']) && isset($_POST['contact'])) {
            if (!empty($_POST['name']) && !empty($_POST['age']) && !empty($_POST['gender']) && !empty($_POST['address']) && !empty($_POST['contact'])) {
                $name = $age = $gender = $address = $contact ="";

                $name=TestInput($_POST['name']);
                $age=TestInput($_POST['age']);
                $gender=TestInput($_POST['gender']);
                $address=TestInput($_POST['address']);
                $contact=TestInput($_POST['contact']);
                $servername='localhost';
                $username='basit';
                $password='';
                $db='sms';
                $conn = new mysqli($servername, $username, $password, $db);
                if ($conn->connect_error) {
                    die("conecton error" . $conn->connect_error);
                } else {
                    $sql ="insert into student values(0,'".$name."',".$age.",'".$gender."','".$address."',".$contact.");";
                    if ($conn->query($sql)==true) {
                        $last_id=$conn->insert_id;
                        echo "New record created successfully. Last inserted ID is: " . $last_id;
                    } else {
                        echo $conn->error;
                    }
                }

                $conn->close();
            } else {
                echo "all fields are required";
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
  <label>name </label><input type="text" name="name">
      <br><br>
    <label>age </label>  <input type="text" name="age">
      <br><br>
      <label>gender </label><select name="gender">
        <option value="female">female</option>
        <option value="male">male</option>
      </select>
      <br><br>
    <label>address </label>  <input type="text" name="address" >
      <br><br>
      <label>contact </label><input type="text" name="contact" >
      <br><br>
      <input type="submit" name="submit">
    </form>
  </body>
</html>
