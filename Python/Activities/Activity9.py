'''
Combining Lists
Activity 9
Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.
'''
list1 = [11,22,33,44,55,66,77,88,99]
list2 = [15,26,35,46,55,66,75,86,95]
list3 = []
for number in list1:
    if(number%2==1):
        list3.append(number)
for number in list2:
    if(number%2==0):
        list3.append(number)
print(list3)