<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
<?php

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'Resources/PHPMailer/vendor/phpmailer/phpmailer/src/Exception.php';
require 'Resources/PHPMailer/vendor/phpmailer/phpmailer/src/PHPMailer.php';
require 'Resources/PHPMailer/vendor/phpmailer/phpmailer/src/SMTP.php';


if ($_SERVER['REQUEST_METHOD']=='POST') {
    if (isset($_POST['submit'])) {
        require 'Resources/PHPMailer/vendor/autoload.php';

        $from='mailtobasit74@gmail.com';
        $password='lifeliveIT';
        $to=$_POST['to'];
        $subject=$_POST['subject'];
        $message=$_POST['message'];

        $mail = new PHPMailer(true);
        try {
            $mail->SMTPDebug = 0;                                 // Enable verbose debug output
            $mail->isSMTP();                                      // Set mailer to use SMTP
            $mail->Host = 'smtp.gmail.com';  // Specify main and backup SMTP servers
            $mail->SMTPAuth = true;                               // Enable SMTP authentication
            $mail->Username = $from;             // SMTP username
            $mail->Password = $password ;                          // SMTP password
            $mail->SMTPSecure = 'tls';                            // Enable TLS encryption, `ssl` also accepted
            $mail->Port = 587;                                    // TCP port to connect to

            //Recipients
            $mail->setFrom($from, 'web developers');
            $mail->addAddress($to, 'wasit');     // Add a recipient
            $mail->addAddress($from, 'basit');     // send mail to myself  note : Name is optional

            //Attachments
               $mail->addAttachment('Uploads/Qwerty.jpg', 'my image.jpg');    // Optional name

            //Content
            $mail->isHTML(true);                                  // Set email format to HTML
            $mail->Subject = $subject;
            $mail->Body    = $message;
            $mail->AltBody = 'This is the body in plain text for non-HTML mail clients';
            $mail->send();
            echo 'Message has been sent';
        } catch (Exception $e) {
            echo 'Message could not be sent.';
            echo 'Mailer Error: ' . $mail->ErrorInfo;
        }
    }
}

     ?>
    <form  action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="POST">
      <label>TO :</label>
      <input type="text" name="to" >
      <br><br>
      <label>Subject</label>
      <input type="text"  name="subject">
      <br><br>
      <label>Message</label>
      <textarea  rows="8" cols="80" name="message"></textarea>
      <br><br>
      <label>Add Attachments (incomplete yet)</label>
      <input type="file" name="attachment_file" >
      <br><br><br>
      <input type="submit" name="submit" value="submit">
    </form>


  </body>
</html>
