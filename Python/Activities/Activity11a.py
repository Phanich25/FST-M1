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
print("Total number of fruits in the list is : " + str(len(fruit_shop)))
for fruit in fruit_shop:
    print(fruit)
for fruit in fruit_shop:
    print(fruit,fruit_shop[fruit])
for fruit in fruit_shop.values():
    print(fruit)
for x,y in fruit_shop.items():
    print(x,y)
fruit_shop.pop("banana")
print(fruit_shop)
fruit_shop.popitem()
print(fruit_shop)
fruit_shop["mango"]=20
print(fruit_shop)
fruit_shop["peach"]=30
print(fruit_shop)
test_dictionary=dict(stname="Phani",stno=111,stschool="ABC School")
print(test_dictionary)
my_pets = {
	
  "timmy": {
	
    "type": "dog",
	
    "color": "blonde"
	
  },
	
  "chippy": {
	
    "type": "cat",
	
    "color": "brown"
	
  }
	
}
for pet,pet_details in my_pets.items():
    print(pet)
    for key in pet_details:
        print(key,":",pet_details[key])
