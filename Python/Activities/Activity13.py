'''
Adding List Numbers
Activity 13
Write a function sum() such that it can accept a list of elements and print the sum of all elements
'''
def findSum(numbList):
    sum=0
    for numb in numbList:
        sum+=numb
    return(sum)
list1=[44,55,66,77,88,99,11,22,33]
print("Sum of the given numbers in the list is : ", findSum(list1))