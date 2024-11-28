def fun():   
    try:
        a = int(input("Enter a Number : "))
        print(a)
        return

    except Exception as e:
        print(e)
        return

    finally:   # finally is use in functions
        print("This is finally part")
# CODE


fun()   