class Employee:
    language = "Python"   #This is a class attribute
    salary = 1200000

zaid = Employee()
zaid.language= "HTML"        #This is a instance attribute
print(zaid.language,zaid.salary)