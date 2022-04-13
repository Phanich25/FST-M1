'''Write a program that asks the user to enter their name and their age. '''
name = input("Please input your name: ")
age=int(input("please enter your age: "))
hundredthYear = 100-age+2022
print(f"{name} is 100 years old in {hundredthYear}")
text="{} reaches 100 years in {}"
print(text.format(name,hundredthYear))
print("In {1}, {0} will attain 100 years".format(name,hundredthYear))
print(name + " will attain 100 years in the year: " + str(hundredthYear))