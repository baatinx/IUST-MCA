<!DOCTYPE html>
<?php
if ($_SERVER['REQUEST_METHOD']=='POST') {
    if (is_uploaded_file($_FILES['filetoupload']['tmp_name'])) {
        $target_dir_for_full_sized='Uploads/Images/fullsized/';
        $target_dir_for_thumbs='Uploads/Images/thumbs/';

        $full_target_file=$target_dir_for_full_sized.basename($_FILES['filetoupload']['name']);

        $uploadok=1;

        if (isset($_POST['submit'])) {
            $mime=mime_content_type($_FILES['filetoupload']['tmp_name']);
            if ($mime=='image/png' || $mime=='image/jpg' || $mime=='image/jpeg') {
                move_uploaded_file($_FILES['filetoupload']['tmp_name'], $full_target_file);
                echo "file uploaded sucessfully";
            } else {
                echo 'Attempts are being made to upload a irrelavent file or fake image ['.$mime.']';
            }

            $final_image_width=100;

            switch ($mime) {
                case 'image/png':
                $im=imagecreatefrompng($full_target_file);
                    break;
                case 'image/jpeg':
                    $im=imagecreatefromjpeg($full_target_file);
                        break;
            }

            $original_image_width=imagesx($im);
            $original_image_height=imagesy($im);

            $thumbs_width=$final_image_width;
            $thumbs_height=floor($original_image_height *($final_image_width/$original_image_width));

            $new_image=imagecreatetruecolor($thumbs_width, $thumbs_height);
            imagecopyresized($new_image, $im, 0, 0, 0, 0, $thumbs_width, $thumbs_height, $original_image_width, $original_image_height);

            imagepng($new_image, 'Uploads/couple.png');
        }
    }
}
 ?>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <form  action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="POST" enctype="multipart/form-data">
            <label>choose file</label>
            <input type="file" name="filetoupload" >
            <br>
            <input type="submit" name="submit" value="submit">
        </form>

    </body>
</html>
