<?php
  #multi-dimensional arrays

    $food=array('healthy'=>
                            array('salad','vegetables','apples'),
                'unhealthy'=>
                            array('pizza','ice cream')
                );

      #echo $food['healthy'][0];

      foreach ($food as $element=> $inner_element) {
          echo '<strong>'.$element.'</strong><br/>';
          foreach ($inner_element as $item) {
              echo $item.'<br/>';
          }
      }
