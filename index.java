import java.util.*;
public class index{

public static void main(String[] args)
{
    
  int[] array1 = {1};    
  canBalance(array1,array1.length);

  int[] array2={1,2};
  canBalance(array2, array2.length);

  int[] array3={1,2,3};
  canBalance(array3, array3.length);

  int[] array4={1,2,3,4};
  canBalance(array4, array4.length);

  int[] array5={1,2,3,4,5};
  canBalance(array5,array5.length);
	
}

public static void canBalance(int[] arr, int length)
{
    int i=0;
    int total=0;
    while(i < length)
    {
        total = total + arr[i];
        i++;
    }
    
    if(total % 2 == 0)
    {
        System.out.println(Arrays.toString(arr) + "-> true");
    }else{
        System.out.println(Arrays.toString(arr) + " -> false");
    }
}
}
