using System;
					
public class Program
{
	

public static void  Main()
{
    
  int[] array1 = {1};    
  canBalance(array1,array1.Length);

  int[] array2={1,2};
  canBalance(array2, array2.Length);

  int[] array3={1,2,3};
  canBalance(array3, array3.Length);

  int[] array4={1,2,3,4};
  canBalance(array4, array4.Length);

  int[] array5={1,2,3,4,5};
  canBalance(array5,array5.Length);
	
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
        Console.WriteLine("\n -> true");
    }else{
        Console.WriteLine("\n -> false");
    }
}

}
