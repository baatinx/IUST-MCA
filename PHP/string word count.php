<?php
  $str='my name is basit .';
  $output=str_word_count($str);
  echo $output."<br/>";

  $output=str_word_count($str, 1);
  print_r($output);
  echo "<br/>";

  $output=str_word_count($str, 2);
  print_r($output);
  echo "<br/>";

  $output=str_word_count($str, 2, '.');
  print_r($output);
