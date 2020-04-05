<!DOCTYPE html>
<?php
if ($_SERVER['REQUEST_METHOD']=='POST') {
    $x;
    $y;
    $x=3;
    $y=9;
    echo "x = $x y =$y <br>";
    echo "in main value of x is $x and value of y is $y <br>";
    func1($x, $y);
    echo "after function call value of x is $x and value of y is $y <br>";
}
function func1(&$x, &$y)
{
    $x=100;
    $y=200;
    echo "in function value of x is $x and value of y is $y <br>";
}
 ?>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <form  action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>" method="POST">
        <p>click on the submit button  to see the output</p>
        <input type="submit" name="submit" value="submit">
    </form>
    </body>
</html>
