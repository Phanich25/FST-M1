'''
Fibonacci Numbers
Activity 14
Using Recursion:
    Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.
    Hint: The Fibonnaci seqence is a sequence of numbers where the next number in the sequence is the sum of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …
'''
def fibonacci(numb):
    if(numb==0):
        return 0
    if(numb==1):
        return 1
    return(fibonacci(numb-1)+fibonacci(numb-2))
numb=10
for i in range(numb+1):
    print(fibonacci(i))
