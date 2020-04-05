<?php
echo "for loop <br/>";
for ($i=0;$i<=5;$i++) {
    echo $i."<br/>";
}

echo "while loop <br/>";

$i=0;
while ($i<=5) {
    echo $i."<br/>";
    $i++;
}

echo "do while loop <br/>";
$i=0;
do {
    echo  $i."<br/>";
    $i++;
} while ($i<=5);
