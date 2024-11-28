// Q2.c)Write a C++ program to generate all the prime numbers between 1 and n, where n is a value supplied by the user.
#include <iostream>
#include <conio.h>
 using namespace std;
int main(){
int num, i, upto; // Take input from user
cout << "Find prime numbers upto : ";
cin >> upto;
cout << endl << "All prime numbers upto "<< upto <<" are: " << endl; 
for(num = 2; num <= upto; num++){
for(i=2; i <= (num/2); i++){
if(num % i == 0){
i = num;
break;
}
}
// If the number is prime then print it.
if(i!= num){
cout <<num << " "<<endl;
}
}
getch();
return 0;
}