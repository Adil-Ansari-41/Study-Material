import random
n = random.randint(1, 100)

a = -1
guesses = 0
while(a != n):
    a = int(input("Guess the Number between (1 - 100): "))

    if(a > n):
        print("Lower Number Please!")
    elif(a < n):
        print("Higher Number Please!")

    guesses += 1

print(f"You have Guessed the Number {n} correctly in {guesses} attempts")
