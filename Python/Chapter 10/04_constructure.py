class Employee:
    language = "Python" 
    salary = 1200000

    def __init__(self, name, salary, language):   #This is Dunder methods, which is automatically call
        self.name = name
        self.salary = salary
        self.language = language
        

    @staticmethod  # decorator to mark greet as a static method 
    def greet():
        print("Hello")

    def getInfo(self):   # parameter is important  # This is a method
        print(f"Name is {self.name} \nThe language is {self.language}. \n The Salary is {self.salary}")

zaid = Employee("Zaid", 120000, "Javascript") 

zaid.greet()
zaid.getInfo()    # = Employee.getInfo(zaid)
