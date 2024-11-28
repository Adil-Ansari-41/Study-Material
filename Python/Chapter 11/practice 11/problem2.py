class animals():
    pass


class pets(animals):
    pass



class dog(pets):
    @staticmethod
    def bark():
        print("Dog is barking ")


d = dog()
d.bark()