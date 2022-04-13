'''
Reading Excel Files
Activity 20
Using Pandas:
Use pandas to read data the Excel file

    Print the number of rows and columns
    Print the data in the emails column only
    Sort the data based on FirstName in ascending order and print the data
'''
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter
dataframe=pandas.read_excel("CustomerDetails.xlsx")
noOfRows=dataframe.shape[0]
noOfCols=dataframe.shape[1]
print("The number of rows is ",noOfRows)
print("The number of columns is ",noOfCols)
print(dataframe["Email"])
print(dataframe.sort_values("FirstName"))