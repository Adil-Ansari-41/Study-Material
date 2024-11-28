'''
1 for snake 
2 for water
3 for gun
'''
import random
computer = random.choice([1, 2, 3])

youstr = input("Enter your choice : ")
youDict = {"s": 1, "w": 2, "g": 3,}
reverseDict = {1: "Snake", 2: "Water", 3: "Gun"}
you = youDict[youstr]

print(f"You Chose {reverseDict[you]}\nComputer Chose {reverseDict[computer]}")


if((computer - you)  == -1 or   (computer - you) == 2):
    print("You Lose!")

elif(computer == you):
    print("Its a Draw")

else:
    print("You Win")  



'''
explain:
s=1
w=2
g=3

C   Y     C-Y
1   2   = -1   L
1   3   = -2   W
2   1   =  1   W
2   3   = -1   L
3   1   =  2   L
3   2   =  1   W

(computer - you) == 1 and (computer - you) ==-2    =Win
(computer - you) == -1 and (computer - you) ==2    =Lose

'''