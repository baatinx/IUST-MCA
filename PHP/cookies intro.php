<?php
$c_name='user';
$c_value='basit';
setcookie($c_name, $c_value, time()+(86400*30), "/");
    ?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>

    <?php
    if (count($_COOKIE) >0) {
        if (!isset($_COOKIE[$c_name])) {
            echo "cookie named ".$c_name." is not set!";
        } else {
            echo "cookie ".$c_name." is set! "."<br>";
            echo"value is : ". $_COOKIE[$c_name];
        }
        setcookie("user", "", time()-36000);
    } else {
        echo "cookies are disabled";
    }
    ?>

  </body>
</html>
