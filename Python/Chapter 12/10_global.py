a = 54  # Global variable 

def fun():
    global a
    a = 3  # Local variable 
    print(a)


print(a)
fun()
print(a)