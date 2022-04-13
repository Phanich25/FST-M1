'''
Recursive Adder
Activity 12
Write a recursive function to calculate the sum of numbers from 0 to 10
'''
def recSum(numb):
    if(numb<=0):
        return 0
    else:
        return(numb+recSum(numb-1))

print("sum of the first 10 natural numbers is : ", recSum(100))

def recSum1(numb):
    if(numb):
        return numb+recSum1(numb-1)
    else:
        return 0
print("sum of the first 10 natural numbers is : ", recSum1(100))