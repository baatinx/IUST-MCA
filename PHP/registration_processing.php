<?php

if (isset($_POST['name']) && isset($_POST['address']) && isset($_POST['gender']) && isset($_POST['email']) && isset($_POST['contact'])) {
    if (!empty($_POST['name']) && !empty($_POST['address']) && !empty($_POST['gender']) && !empty($_POST['email']) && !empty($_POST['contact'])) {
        echo 'name : '.$_POST['name'].'<br/>address : '.$_POST['address'].'<br/>gender : '.$_POST['gender'].'<br/>email : '.$_POST['email'].'<br/>contact : '.$_POST['contact'];
    } else {
        echo "alteast one field is empty";
    }
} else {
    echo "atleast one field is not present";
}
