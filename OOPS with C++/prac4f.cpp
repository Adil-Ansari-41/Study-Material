// Q4.f) Write a C++ Program that illustrate Hierarchical inheritance.
#include<iostream>
#include <conio.h>
using namespace std;
class A //single base class
{
public:
int x, y;
void getdata(){
cout << "\nEnter value of x and y:\n"; cin >> x >> y;
}
};
class B: public A //B is derived from class base
{
public:
void product(){
cout << "\nProduct= " << x * y;
}
};
class C: public A //C is also derived from class base
{
public:
void sum(){
cout << "\nSum= " << x + y;
}
};
int main(){
B obj1;   //object of derived class B
C obj2;   //object of derived class C
obj1.getdata();
obj1.product();
obj2.getdata();
obj2.sum();
getch();
return 0;
}