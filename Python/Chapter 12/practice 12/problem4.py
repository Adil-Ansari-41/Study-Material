try:
    a = int(input("Enter a Number 1: "))
    b = int(input("Enter a Number 2: "))
    print(a/b)
except ZeroDivisionError as v:
    print("Infinite")

