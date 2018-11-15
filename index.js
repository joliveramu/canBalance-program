<!-- <script>-->
function canBalance(array)
{
  var total = 0;
  
  for(var i=0; i < array.length; i++)
  {
    total = total + array[i];
  }
  
  if(total % 2 == 0)
  {
    //document.write(array + " -> true");
    console.log(array + " -> true");
  }else{
    //document.write(array + " -> false");
    console.log(array + " -> false");
  }
  
}

canBalance([1,1,1,2,1);
canBalance([2,1,1,2,1]);
canBalance([10,10]);
canBalance([2,1,1,1,4]);
canBalance([1]);
canBalance([1,2,3,1,0,2,3]);

<!--</script>-->
