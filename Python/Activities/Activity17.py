'''
Writing CSV Files
Activity 17
Using Pandas:
Write the following data into a CSV file.
Usernames 	Passwords
admin 	password
Charles 	Charl13
Deku 	AllMight
'''
import pandas as pd
data = {
    "Usernames" : ["admin","Charles","Deku"],
    "Passwords" : ["password","Charl13","AllMight"]
}
df = pd.DataFrame(data)
print(df)
df.to_csv("userdetails.csv",index=False)