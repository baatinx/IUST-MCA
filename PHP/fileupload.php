<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <?php
    if ($_SERVER['REQUEST_METHOD']=='POST') {
        $target_dir="Uploads/Images/fullsized/";
        $target_file=$target_dir.basename($_FILES['filetoupload']['name']);
        $imagefiletype=pathinfo($target_file, PATHINFO_EXTENSION);
        $uploadOk=1;
        $imagefiletype=pathinfo($target_file, PATHINFO_EXTENSION);
        if (isset($_POST['submit'])) {
            $check=getimagesize($_FILES["filetoupload"]["tmp_name"]);
            if ($check!=false) {
                echo "file is an image : ".$check["mime"].'<br>';
                $uploadOk=1;
            } else {
                echo "file is not an image ".'<br>';
                $uploadOk=0;
            }
            if (file_exists($target_file)) {
                echo "sorry, file already exists".'<br>';
                $uploadOk=0;
            }

            if ($_FILES['filetoupload']['size']>500000) {
                echo "sorry, your file was too large".$_FILES['filetoupload']['size'].'<br>';
                $uploadOk=0;
            }

            if ($imagefiletype!='jpg' && $imagefiletype!='jpeg'&& $imagefiletype!='png' && $imagefiletype!='gif') {
                echo "soryy only jpg / jpeg / png / gif files are allowed ".'<br>';
                $uploadOk=0;
            }


            if ($uploadOk==0) {
                echo "sorry, your file was not uploaded".'<br>';
            } else {
                if (move_uploaded_file($_FILES['filetoupload']['tmp_name'], $target_file)) {
                    echo "file is uploaded";
                } else {
                    echo "sorry, there was an error uploading your file".'<br>';
                }
            }
        }
    }
    /*if ($_SERVER['REQUEST_METHOD']=='POST') {
        if (is_uploaded_file($_FILES['filetoupload']['tmp_name'])) {
            $target_dir='Uploads/';
            $target_file=$target_dir.basename($_FILES['filetoupload']['name']);
            $uploadok=1;

            if (isset($_POST['submit'])) {
                $mime=mime_content_type($_FILES['filetoupload']['tmp_name']);
                if ($mime=='image/png' || $mime=='image/jpg' || $mime=='image/jpeg') {
                    move_uploaded_file($_FILES['filetoupload']['tmp_name'], $target_file);
                    echo "file uploaded sucessfully";
                } else {
                    echo 'Attempts are being made to upload a irrelavent file or fake image ['.$mime.']';
                }
            }
        }
    }*/
    ?>
    <form  action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="post" enctype="multipart/form-data">
<p>select image to upload</p>
<input type="file" name="filetoupload">
<input type="submit" name="submit" value="upload image">
    </form>

  </body>
</html>
