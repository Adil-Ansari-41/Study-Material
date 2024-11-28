// Q3.d) Write a C++ Program using copy constructor to copy data of an object to another object.
#include<iostream>
#include<conio.h>
using namespace std;
class Demo{
private: int num1, num2;
public:
Demo(int n1, int n2)
{
num1 = n1;
num2 = n2;
}
Demo(const Demo &n)
{
num1=n.num1;
num2=n.num2;
}
void display(){
cout<<"\nnum1 = "<<num1 <<endl;
cout<<"num2 = "<<num2 <<endl;
}
};
int main(){
Demo obj1(10,20);
Demo obj2 =obj1;
obj1.display();
obj2.display();
getch();
return 0;
}