'''
Writing Excel Files
Activity 19
Using Pandas:
Write the following data into an excel file:
FirstName 	LastName 	Email 	PhoneNumber
Satvik 	Shah 	satshah@example.com 	4537829158
Avinash 	Kati 	avinashk@example.com 	5892184058
Lahri 	Rath 	lahri.rath@example.com 	4528727830
'''
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter
data = {
    "FirstName": ["Satvik","Avinash","Lahri"],
    "LastName": ["Shah","Kati","Rath"],
    "Email": ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber" : [4537829158,5892184058,4528727830]
}
dataframe=pandas.DataFrame(data)

writer = ExcelWriter("CustomerDetails.xlsx")
dataframe.to_excel(writer,"Sheet1", index=False)
writer.save()
