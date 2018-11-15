<?php 
function canBalance($array)
{
  $total = 0;
  
  for($i=0; $i < count($array); $i++)
  {
    $total = $total + $array[$i];
  }
  
  if($total % 2 == 0)
  {
       echo implode(",",$array)." -> true<br>";
  }else{
       echo implode("",$array)." -> false<br>";
  }
}
canBalance(array(1,1,1,2,1));
canBalance(array(2,1,1,2,1));
canBalance(array(10,10));
canBalance(array(2,1,1,1,4));
canBalance(array(1));
canBalance(array(1,2,3,1,0,2,3));        
?>
