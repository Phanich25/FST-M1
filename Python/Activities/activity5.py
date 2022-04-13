'''
Activity 5
Using Loops:
Write a Python program to create the multiplication table (from 1 to 10) of a number.
'''
number=int(input("Enter a number of your choice: "))
print(f"The multiplication table of {number} is: ")
for i in range(1,11):
    print(f"{i} X {number} = {i*number}")