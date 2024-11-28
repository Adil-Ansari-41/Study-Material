from functools import reduce

l = [1,2,34,54,64,75,35,57,47,32,55]

def greater(a,b):
    if(a > b):
        return a
    return b

print(reduce(greater, l))