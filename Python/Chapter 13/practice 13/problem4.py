def divisible5(n):
    if(n%5 == 0):
        return True
    return False

a = [1,2,34,545,646,875,35657,347,632,55]

f = list(filter(divisible5, a))

print(f)