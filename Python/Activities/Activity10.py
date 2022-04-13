'''
Tuple Number Checker
Activity 10
Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5'''
num_tuple = (11,44,55,66,66,77,88,99,100,44,55,66)
for number in num_tuple:
    if(number%5==0):
        print(number)