<html>
  <head>
    <title>Google recapcha demo</title>
    <script src='https://www.google.com/recaptcha/api.js'></script>
  </head>
  <body>
    <h1>Google reCAPTHA Demo</h1>
    <form id="comment_form" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="post">
      <div class="g-recaptcha" data-sitekey="6Lcd7h8UAAAAAMUhOkBjMl5Uzy20vyY5wviazO9t"></div>
<input type="submit" name="submit" value="submit">
</form>
<?php
 if ($_SERVER['REQUEST_METHOD']=='POST') {
     if (isset($_POST['g-recaptcha-response'])) {
         $captcha=$_POST['g-recaptcha-response'];
     }
     if (!$captcha) {
         echo '<h2>Please check the the captcha form.</h2>';
         exit;
     }

     $secretKey = "6Lcd7h8UAAAAAAl41k47n3rmnK92ZrLfI7GLL2r8";
     $ip = $_SERVER['REMOTE_ADDR'];
     $response=file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=".$secretKey."&response=".$captcha."&remoteip=".$ip);
     $responseKeys = json_decode($response, true);
     if (intval($responseKeys["success"]) !== 1) {
         echo '<h2>You are spammer !</h2>';
     } else {
         echo '<h2>verified .</h2>';
     }
 } ?>
   </body>

</html>
