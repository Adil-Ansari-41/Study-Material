class  c1:
    def __init__(self):
        print("Constructor of c1")
    a = 1


class c2(c1):
    def __init__(self):
        # super().__init__()
        print("Constructor of c2")
    b = 2


class c3(c2):
    def __init__(self):
        super().__init__()
        print("Constructor of c3")
    c = 3

# o = c1()

# o = c2()

o = c3()
