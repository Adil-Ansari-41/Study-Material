class Employee:
    language = "Python"   #This is a class attribute
    salary = 1200000

zaid = Employee()
zaid.name= "Zaid"        #This is a instance attribute
print(zaid.name,zaid.language,zaid.salary)

ali = Employee()
print(ali.language,ali.salary)


#here name is object attribute, salary and language are class attribute as they directly belong to the class