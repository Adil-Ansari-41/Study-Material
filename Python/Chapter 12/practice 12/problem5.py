n = int(input("Enter Number: "))

table = [n*i for i in range(1,11)]

print(table)

with open("Tables.txt", "a") as f:
    f.write(f"Table of {n} : {str(table)} \n")