class Programmer:
    company = "Microsoft"

    def __init__(self, name, salary, pin):
        self.name = name
        self.salary = salary
        self.pin = pin 

    def info(self):
        print(f"Name : {self.name}\nSalary : {self.salary}\nPin : {self.pin}\nCompany : {self.company}\n")


p1 = Programmer("Zaid", 140000, 23238)   
p1.info()     

p2= Programmer("Ali", 130000, 7564)
p2.info()