import random

def game():
    print("You are playing the game..")
    score = random.randint(1,60)
    print(f"Your score : {score}")
    # Fetch the hiscore
    with open("hiscore.txt") as f:
        hiscore = f.read()
        if(hiscore != ""):
            hiscore = int(hiscore)
        else:
            hiscore = 0    
    if(score>hiscore):
        with open("hiscore.txt", "w") as f:
            f.write(str(score))

    return score

game()