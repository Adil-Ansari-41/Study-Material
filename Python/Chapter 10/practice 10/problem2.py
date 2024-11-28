class Calculator:
    def __init__(self, a):
        self.a = a
    
    def square(self):
        ans = self.a * self.a
        print(f"Square of {self.a} is {ans}")

    def cube(self):
        ans = self.a * self.a * self.a
        print(f"Cube of {self.a} is {ans}")


    def square_root(self):
        ans = pow(self.a, 1/2)
        print(f"Square root of {self.a} is {ans}\n") 
                       
def call_func(n):
    n.square()
    n.cube()
    n.square_root()

f = Calculator(5)       
f.square()
f.cube()
f.square_root()


c = Calculator(33)
call_func(c)

d = int(input("Enter Number : "))
t = Calculator(d)
call_func(t)