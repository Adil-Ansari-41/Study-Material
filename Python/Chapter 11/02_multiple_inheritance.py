class Employee:
    company = "ITC"

    def show(self):
        print(f"The name of the Employee is {self.name} and the salary is {self.salary}")
class coder:
    pass
                        
class Programmer (Employee, coder):
    company = "ITC Infotech"

    def showLanguage(self):
        print(f"The name is {self.name} and he is good with {self.language} language ")

a = Employee()

b = Programmer()

print(a.company, b.company)