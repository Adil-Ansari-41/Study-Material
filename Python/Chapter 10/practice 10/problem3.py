class demo:
    a = 4



h = demo()
print(h.a)   # Print the class attribute because instance attribute is not present

h.a = 0    # Instance attribute  is set

print(h.a)   # Print the Instance attribute because instance attribute is present



print(demo.a)    # Print the class