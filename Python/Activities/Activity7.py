'''
List Sum Calculator
Activity 7
Write a Python program to calculate the sum of all the elements in a list.'''
list1=[]
choice='Y'
while choice=='Y':
    number=int(input("Please enter a number: "))
    list1.append(number)
    choice=input("Do you wish to continue (Y)")
else:
    print("List is completed.")
print(list1)
sum=0
for numb in list1:
    sum+=numb
print("Sum of the numbers in the given list is : " + str(sum))