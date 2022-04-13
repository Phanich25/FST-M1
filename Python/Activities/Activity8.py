'''
List Checker
Activity 8
Given a list of numbers, return True if first and last number of a list is same.'''
numbers=list(input("Enter a sequence of comma separated values: ").split(", "))
if numbers[0]==numbers[-1]:
    print("First and last numbers in the list are same.")
    print(True)
else:
    print("First and last numbers in the list are not same.")
    print(False)