<?php
  $str='ABCDEF123456';
  $output=str_shuffle($str);
  echo $output."<br/>";

  $output=strlen($str);
  echo $output."<br/>";

  $output=substr($str, 0, 4);
  echo $output."<br/>";

  $output=strrev($str);
  echo $output;


  #calculate similarity between two strings
  $a="hello world";
  $b="hi world";
  similar_text($a, $b, $output);
  echo "<br/>".$output;
