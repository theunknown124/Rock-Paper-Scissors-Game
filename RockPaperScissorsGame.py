import random # import random method

#author Warren Cheng

print("Welcome to the Rock, Paper, Scissors game")


# Return computer choice from random number
def getComputerChoice():

    computerNum = random.randint(1,3)
    computerOptions = {1: 'Rock', 2: 'Paper', 3: 'Scissors'} #Dict of choices for computer

    computerChoice = computerOptions[computerNum]

    return computerChoice

# Returns playerchoice from user input
def getplayerChoice():


    player_input = input("Enter 1 for Rock, 2 for Paper, 3 for Scissors: ")
    playerNum = int(player_input) #convert input string to integer

    playerOptions = {1: 'Rock', 2: 'Paper', 3: 'Scissors'}    #Dict of choices for player

    playerChoice = playerOptions[playerNum] # gets the word associated with the number in the Dict

    return playerChoice

def winner(playerChoice, computerChoice):

    winner = ""

    if playerChoice == 'Rock':
        if computerChoice == 'Scissors':
            winner  = "Rock smashes Scissors, You Win"
        elif computerChoice == 'Paper':
            winner = "Paper covers Rock, You Lose!"
        elif computerChoice == 'Rock':
            winner = "It is a Tie"

    elif playerChoice == 'Paper':
        if computerChoice == 'Scissors':
            winner = "Scissors cut Paper, You Lose!"
        elif computerChoice == 'Rock':
            winner = "Paper covers Rock, You Win!"
        elif computerChoice == 'Paper':
            winner = "It is a Tie"

    elif playerChoice == 'Scissors':
        if computerChoice == 'Paper':
            winner = "Scissors cuts Paper, You Win!"
        elif computerChoice == 'Rock':
            winner = "Rock smashes Scissors, You Lose!"
        elif computerChoice == 'Scissors':
            winner = "It is a Tie"


    return winner




while_condition = True

while while_condition: # This while loop allows

    computerPick = getComputerChoice()
    playerPick = getplayerChoice()
    result = winner(playerPick, computerPick)

    print(f"Computer chose: {computerPick}")
    print(f"Player chose: {playerPick}")
    print(result)


    print("Would you like to play again? Enter yes or no")
    playerInput2 = input()

    if (playerInput2 == "no"):
        print("Stopping game")
        while_condition = False

    elif (playerInput2 == "yes"):
        continue



