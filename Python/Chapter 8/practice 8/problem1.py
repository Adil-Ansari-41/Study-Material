def fun1(a, b, c):
    if(a > b and a > c):
        print("a is Greater")

    elif(b > a and b > c):
        print("b is Greater")

    else:
        print("c is Greater")


a = int(input("Enter Number  1 : "))               
b = int(input("Enter Number  2 : "))               
c = int(input("Enter Number  3 : "))      

fun1(a, b, c)