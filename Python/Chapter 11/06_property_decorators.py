class prop:
        @property
        def name(self):
            return f"{self.fname} {self.lname}"
        
        @name.setter
        def name(self, value):
              self.fname = value.split(" ")[0]
              self.lname = value.split(" ")[1]


e = prop()
e.name= "Zaid Khan"
print(e.fname, e.lname)