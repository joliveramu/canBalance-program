
#include <iostream>
#include <string>

using namespace std;

static void canBalance(int arr[], int length);

int main()
{
    
int array1[] = {1};    
canBalance(array1,1);

int array2[]={1,2};
canBalance(array2,2);

int array3[]={1,2,3};
canBalance(array3,3);

int array4[]={1,2,3,4};
canBalance(array4,4);

int array5[]={1,2,3,4,5};
canBalance(array5,5);

}

static void canBalance(int arr[], int length)
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
        cout << "\n -> true";
    }else{
        
        cout << "\n -> false";
    }
}
