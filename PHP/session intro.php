<?php
session_start();
    ?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <?php
$_SESSION['username']='basit';
$_SESSION['userid']='72';
$_SESSION['usertype']='admin';
echo "session variable are set<br><hr>";
echo 'username = :'.$_SESSION['username'].'<br>userid = '.$_SESSION['userid'].'<br>usertype = '.$_SESSION['usertype'];

function show_session_data()
{
    $str='username = :'.$_SESSION['username'].'<br>userid = '.$_SESSION['userid'].'<br>usertype = '.$_SESSION['usertype'];
    echo '<script>'.$str.'</script>';
}
?>
  </body>


</html>
