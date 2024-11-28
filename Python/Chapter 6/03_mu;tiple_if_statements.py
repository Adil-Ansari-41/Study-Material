a = int(input("Enter Your Age : "))

if(a%2 ==0):
    print("a is even")

    
if(a>=18):
    print("Yes")
    print("You are Eligible")

elif(a<0):
    print("Not Valid Age")

elif(a==0):
    print("Not Valid Age")

else:
    print("No")

print("End of Program")