import pytest
@pytest.fixture
def num_list():
    list1=[]

    for i in range(11):
        list1.append(i)

    return list1
@pytest.fixture
def wallet():
    amount=0
    return amount
