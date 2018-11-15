#I re-write the code in Python since I want to translate it here

#canBalance is the name of the function
def canBalance(arr):
    #Declared total as the sum of all the numbers in the array
    total = 0
    #Declared i as the counter
    i = 0
    
    
    while i < len(arr):
             #As it loops, the index of the array will be added to the total variable         
             total = total + arr[i]
             i += 1
    #End of Loop
    
    #If the sum is divisible by two, it is balanced.
    if total % 2 == 0:
        print(arr)
        print("is -> true \n")
    #Else it's not
    else:
        print(arr)
        print("is -> false \n")

canBalance([1])
canBalance([1,2])
canBalance([1,2,3])
canBalance([1,2,3,4])
canBalance([1,2,3,4,5])
