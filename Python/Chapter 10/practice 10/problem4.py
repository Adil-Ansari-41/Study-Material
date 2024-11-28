class Calculator:
    def __init__(self, a):
        self.a = a

    @staticmethod
    def greet():
        print("Hello")    
    
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
    n.greet()
    n.square()
    n.cube()
    n.square_root()

d = int(input("Enter Number : "))
t = Calculator(d)
call_func(t)