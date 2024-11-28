class  c1:
    a = 1


class c2(c1):
    b = 2


class c3(c2):
    c = 3

o = c1()
print(o.a)
# print(o.b)  #Error
# print(o.c)  #Error

o = c2()
print(o.a)
print(o.b)
# print(o.c)  #Error


o = c3()
print(o.a)
print(o.b)
print(o.c)