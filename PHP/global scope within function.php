<?php

  $pi=2.14;
  myfunc();


  function myfunc()
  {
      global $pi;
      echo $pi;
  }
