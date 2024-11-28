// Q3.e)Write a C++ Program to allocate memory dynamically for an object of a given class using class's constructor.
#include <iostream>
#include <conio.h>
using namespace std;
class Memory{
const char*p;
public:
// default constructor
Memory(){
// allocating memory at run time
p = new char[6];
p = "Sweta";
}
void display(){
cout << p << endl;
}
};
int main(){
Memory obj;
obj.display();
getch();
return 0;
}