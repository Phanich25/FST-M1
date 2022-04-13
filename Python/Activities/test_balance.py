'''Activity 24
Parameterization
Using pytest:
Create a new test file and do the following:
    Create a fixture named wallet() that initializes the variable 'amount' with 0
    Create a test with the following parameters:
	earned 	spent 	expected
	30 	10 	20
	20 	2 	18
    Write a test that performs the following scenario with the parameters
            My wallet initially has 0,
            I add {earned} units of cash to the wallet,
            I spend {spent} units of cash, and
            I should have {expected} units of cash remaining after the two transactions.
            '''
import pytest
@pytest.fixture
def wallet():
    amount=0
    return amount
@pytest.mark.parametrize("earned,spent,balance",[(30,10,20),(20,2,18)])
def test_balance(wallet,earned,spent,balance):
    assert wallet==0
    wallet=wallet+earned
    assert wallet==earned
    wallet=wallet-spent
    assert wallet==balance
