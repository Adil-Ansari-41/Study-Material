// Q4.c) Write a C++ Program that illustrate single inheritance.
#include <iostream>
#include <conio.h>
using namespace std;
class base //single base class
{
public:
int x;
void getdata(){
cout << "Enter the value of x = ";
cin >> x;
}
};
class derive: public base //single derived class
{
private:
int y;
public:
void readdata(){
cout << "Enter the value of y = ";
cin >> y;
}
void product(){
cout << "Product = " << x * y;
}
};
int main(){
    derive a;
    a.getdata();
    a.readdata();
    a.product();
    getch();
    return 0;
}