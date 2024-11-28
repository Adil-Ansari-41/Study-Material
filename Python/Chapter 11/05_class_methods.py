class add:
    a= 1

    @classmethod
    def show(cls):
        print(f"The Class attributeof a is {cls.a}")


e = add()

e.a = 88

e.show()