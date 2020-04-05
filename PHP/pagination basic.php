<!DOCTYPE html>
<html>
  <head>
    <style>
  .active{
    color: red;
    cursor: not-allowed;
    }
    a{
      font-size: 20px;
    }
    </style>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
  <?php
  $dbservername='localhost';
  $dbusername='root';
  $dbpassword='';
  $dbname='sms';
  $sql="select count(id) from users";
  $conn=new mysqli($dbservername, $dbusername, $dbpassword, $dbname);
  $result=$conn->query($sql);
  $data=$result->fetch_array();
  $rows=$data[0];
  $page_rows=10;
  $last=ceil($rows/$page_rows);
  if ($last<1) {
      $last=1;
  }
  $page_num=1;
  if (isset($_GET['pn'])) {
      $page_num=$_GET['pn'];
  }
  if ($page_num<1) {
      $page_num=1;
  } elseif ($page_num>$last) {
      $page_num=$last;
  }

  $limit='LIMIT '.($page_num-1)*$page_rows.','.$page_rows;
  $sql='select * from users '.$limit;
  $result=$conn->query($sql);
      if ($result->num_rows > 0) {
          echo "<table border=1><tr><th>ID</th><th>NAME</th><th>AGE</th><th>GENDER</th><th>ADDRESS</th><th>CONTACT</th></tr>";
          while ($data=$result->fetch_array()) {
              $tr='<tr><td>'.$data[0].'</td><td>'.$data[1].'</td><td>'.$data[2].'</td><td>'.$data[3].'</td><td>'.$data[4].'</td><td>'.$data[5].'</td></tr>';
              echo $tr;
          }
          echo "</table>";
      } else {
          echo "0 rows returned";
      }


  echo "total no of rows $rows <br>";
  echo "page no $page_num of $last"."<br><br>";
  $pagination_contorls='';
  if ($last!=1) {
      if ($page_num>1) {
          $previous=$page_num-1;
          $pagination_contorls='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$previous.'">previous</a>&nbsp';
          for ($i=$page_num-4;$i<$page_num;$i++) {
              if ($i>0) {
                  $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$i.'">'.$i.'</a>&nbsp';
              }
          }
      }

      $pagination_contorls.='<a class="active">'.$page_num."</a>&nbsp";

      for ($i=$page_num+1;$i<=$last;$i++) {
          $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$i.'">'.$i.'</a>&nbsp';
          if ($i>=$page_num+4) {
              break;
          }
      }
      if ($page_num!=$last) {
          $next=$page_num+1;
          $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$next.'">next</a>';
      }
  }


  echo $pagination_contorls;

   ?>

  </body>
</html>
