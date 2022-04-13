'''
Fruit Shop
Activity 11
Create a Python dictionary that contains a bunch of fruits and their prices.
Write a program that checks if a certain fruit is available or not.
'''
fruit_shop = {
    "apple": 10,
    "banana": 5,
    "grapes": 60,
    "papaya": 20
}
fruit_choice=input("Please enter your choice fruit: ").lower()
if(fruit_choice in fruit_shop):
    print("Fruit is available")
else:
    print("Fruit is not available")