# 5! = 1X 2X 3X 4X 5

n = int(input("Enter Number : "))
product = 1
for i in range(1, n+1):
    product = product * i

print(f"The Factorial of {n} is {product}")    