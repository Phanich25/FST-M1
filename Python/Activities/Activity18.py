'''
Reading CSV Files
Activity 18
Using Pandas:
Read the CSV made in the previous program:
    Print the values only in the Usernames column
    Print the username and password of the second row
    Sort the Usernames column data in ascending order and print data
    Sort the Passwords column in descending order and print data
'''
import pandas as pd
dataframe=pd.read_csv("userdetails.csv")
print(dataframe)
print(dataframe["Usernames"])
print(dataframe[:][1:2])
print(dataframe[1:2])
	
print("===============")
	
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])
print(dataframe.sort_values("Usernames"))
print(dataframe.sort_values("Passwords",ascending=False))