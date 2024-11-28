// Q3.c) Write a C++ Program to design a class having static member function named showcount () which has the property of displaying the number of objects created of the class.
#include <iostream>
#include<conio.h>
using namespace std;
class test{
int objNo;
static int objCnt;
public:
test(){
objNo=++objCnt;
}
~test(){
--objCnt;
}
void printObjNumber(void){
cout << "object number:" << objNo << "\n";
}
static void printObjCount(void) {
cout << "count:" << objCnt<<"\n";
}
};
int test::objCnt;
int main(){
test t1, t2;
test::printObjCount();
test t3;
test::printObjCount();
t1.printObjNumber();
t2.printObjNumber();
t3.printObjNumber();
getch();
return 0;
}