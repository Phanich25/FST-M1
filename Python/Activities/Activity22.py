'''
Subsets
Activity 22
Using pytest:
In the same file as the previous activity, do the following:
    Apply the marker 'activity' to the last 2 test methods.
    Run tests based on substring
    Run tests based using the 'activity' marker.
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
@pytest.mark.activity
def test_prod():
    numb1=10
    numb2=20    
    result=200
    assert numb1*numb2 == result
@pytest.mark.activity
def test_div():
    numb1=20
    numb2=4
    result=5
    assert numb1/numb2 == result
