'''
    Make a two-player Rock-Paper-Scissors game.
    Remember the rules:
        Rock beats scissors
        Scissors beats paper
        Paper beats rock
'''
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
