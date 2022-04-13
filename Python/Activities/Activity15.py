'''
Handling Errors
Activity 15
Write a Python program that throws a NameError.
Handle the error so it doesn't halt execution.
'''
try:
    print(1/x)
except NameError:
    print("variable is not defined")
except:
    print("some other exception")
else:
    print("There is no exception")
finally:
    print("This will get printed in any case")