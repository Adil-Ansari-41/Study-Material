class Employee:
    language = "Python" 
    salary = 1200000

    @staticmethod  # decorator to mark greet as a static method 
    def greet():
        print("Hello")

    def getInfo(self):   # parameter is important  # This is a method
        print(f"Name is {self.name} \nThe language is {self.language}. \n The Salary is {self.salary}")

zaid = Employee()
zaid.name= "Zaid" 

zaid.greet()
zaid.getInfo()    # = Employee.getInfo(zaid)
