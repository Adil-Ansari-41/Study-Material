// Q4.e)Write a C++ Program that illustrate multi-level inheritance.
#include<iostream>
#include <conio.h>
using namespace std;
// Base class A
class A{
public:
A(){
     int a = 5, b=6, c;
      c = a+b;
 cout << "Sum is:" <<c << endl;
  }
};
// Class B
class B: 
public A{
public:
B(){
int d=50,e=35, f;
f=d-e;
cout << "Difference is:" <<f<< endl;
}
};
// Derived class C
class C: public B{
public:
C(){
int g=10, h=20, i;
i = g * h;
cout << "Product is:" <<i<< endl;
}
};
int main(){
C obj;
getch();
return 0;
}