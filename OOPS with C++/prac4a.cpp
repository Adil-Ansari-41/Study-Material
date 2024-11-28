// Q4.a)Write a C++ program to overload new/delete operators in a class.
#include<iostream>
#include <conio.h>
#include<stdlib.h>
using namespace std;
class CustomMemory{
public:
void* operator new(size_t objectSize);
//Overloaded new 
void operator delete(void* ptr);
//Overloaded delete
};
void* CustomMemory::operator new(size_t objectSize){

cout<<"Custom memory allocation"<<endl;

//May Write costume memory allocation algorithm here

return malloc(objectSize);

}

void CustomMemory::operator delete(void* ptr)

{

cout<<"Custom memory de-allocation"<<endl;

free(ptr);

}



int main(){
// call overloaded new from the class
CustomMemory *obj = new CustomMemory();
// call overloaded delete
delete obj;
getch();
return 0;
}