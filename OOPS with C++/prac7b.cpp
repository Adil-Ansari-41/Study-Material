// Q7.b)Write a C++ program Exception. to implement the exception handling with rethrowi.
#include<iostream>
#include <conio.h>
using namespace std;
void divide(double x, double y){
cout<<"Inside Function\n";
try{
if(y==0.0) 
throw y;
else
cout<<"Division ="<<x/y<<"\n";
}
catch(double){
    cout<<"Caught double inside function\n";
throw;
}
cout<<"End of Function\n";
}
int main(){
cout<<"Inside Main\n";
try{
divide(10.5,2.0);
divide(20.0,0.0);
}
catch(double){
cout<<"Caught double inside main\n";
}
cout<<"End of Main\n";
getch();
return 0;
}