'''
Rock-Paper-Scissors-2
Activity 4
Using Loops:

    Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
    If they say 'Yes', the game should begin again.
    If they say 'No', the game should exit.

'''
choice="Yes"
while choice=="Yes":
    player1=input("Please enter first player's name: ")
    player2=input("Please enter second player's name: ")
    player1ch = input(f"Please enter {player1}'s choice: ").lower()
    player2ch = input(f"Please enter {player2}'s choice: ").lower()
    print(f"{player1}'s choice is {player1ch}")
    print(f"{player2}'s choice is {player2ch}")
    if player1ch==player2ch:
        print("Tie")
    elif player1ch=='rock':
        if player2ch=='scissors':
            print(f"Player1 {player1} wins.")
        else:
           print(f"Player2 {player2} wins.")
    elif player1ch=='scissors':
         if player2ch=='paper':
            print(f"Player1 {player1} wins.")
         else:
            print(f"Player2 {player2} wins.")
    elif player1ch=='paper':
        if player2ch=='rock':
            print(f"Player1 {player1} wins.")
        else:
            print(f"Player2 {player2} wins.")
    else:
        print("Please enter a valid choice: rock/scissors/boat")

    choice=input("Do you want to continue: (Yes) to continue")
else:
    print("Game over!!!!")
