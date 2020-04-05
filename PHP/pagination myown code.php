<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <style>
        .active{
            color: red;
        }
    </style>
  </head>
  <body>
    <?php
    $dbservername='localhost';
    $dbusername='root';
    $dbpassword='';
    $dbname='sms';

    $page_no='';
    $total_rows='';
    $rows_per_page=10;
    $last_page='';

    $conn=new mysqli($dbservername, $dbusername, $dbpassword, $dbname);
    $sql='select count(id) from users';
    $result=$conn->query($sql);
    if ($conn->connect_error==true) {
        die("connection error occured. ".$connect_error);
    }
    $data=$result->fetch_array();
    $total_rows=$data[0];

    $last_page=ceil($total_rows/$rows_per_page);

    if (isset($_GET['pn'])) {
        if ($_GET['pn']<=0 && $_GET['pn']>$last_page) {
            $_GET['pn']=1;
        }
        $page_no=$_GET['pn'];
    } else {
        $page_no=1;
    }
    $limit='limit '.($page_no-1)*$rows_per_page.','.$rows_per_page;
    $sql='select * from users '.$limit;
    $result=$conn->query($sql);
    if ($conn->connect_error==true) {
        die('connection error'.$conn->connect_error);
    }

    if ($result->num_rows > 0) {
        echo "<table border=1 cellpadding=7 ><tr><th>ID</th><th>NAME</th><th>AGE</th><th>GENDER</th><th>ADDRESS</th><th>CONTACT</th></tr>";
        while ($row=$result->fetch_array()) {
            $tr='<tr><td>'.$row[0].'</td><td>'.$row[1].'</td><td>'.$row[2].'</td><td>'.$row[3].'</td><td>'.$row[4].'</td><td>'.$row[5].'</td></tr>';
            echo $tr;
        }
        echo "</table>";
    } else {
        echo "0 rows returned";
    }
    $pagination_contorls='';
    if ($last_page!=1) {
        if ($page_no>1) {
            $previous=$page_no-1;
            $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$previous.'">previous</a>&nbsp';
            for ($i=$page_no-4;$i<$page_no;$i++) {
                if ($i>0) {
                    $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$i.'">'.$i.'</a>&nbsp';
                }
            }
        }
        $pagination_contorls.='<a class="active">'.$page_no.'</a>&nbsp';

        for ($i=$page_no+1;$i<=$last_page;$i++) {
            $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$i.'">'.$i.'</a>&nbsp';
            if ($i>=$page_no+4) {
                break;
            }
        }

        if ($page_no!=$last_page) {
            $next=$page_no+1;
            $pagination_contorls.='<a href="'.$_SERVER['PHP_SELF'].'?pn='.$next.'">next</a>&nbsp';
        }
        echo $pagination_contorls;
    }
    ?>
  </body>
</html>
