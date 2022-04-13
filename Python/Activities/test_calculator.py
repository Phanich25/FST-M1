'''
Calculator Test
Activity 21
Using pytest:
Create a new test file and write test to validate the following cases:
    Sum of two numbers
    Difference of two numbers
    Product of two numbers
    Quotient of two numbers
'''
import pytest
import math
def test_sum():
    numb1=10
    numb2=21
    result=30
    assert numb1+numb2 == result

def test_diff():
    numb1=10
    numb2=21
    result=-10
    assert numb1-numb2 == result
'''@pytest.mark.activity'''
def test_prod():
    numb1=10
    numb2=20    
    result=200
    assert numb1*numb2 == result

def test_div():
    numb1=20
    numb2=4
    result=5
    assert numb1/numb2 == result
