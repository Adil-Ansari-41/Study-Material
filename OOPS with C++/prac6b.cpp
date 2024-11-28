// Q6.b)Write a C++ program file to another. to copy the Contents of one
#include <iostream>
#include <fstream>
#include <conio.h>
using namespace std;
int main(){
char source [67],
target [67];
char ch;
cout << endl <<" Enter Source filename";
cin>> source;
cout << endl <<" Enter target filename";
cin>> target;
ifstream intile (source);
ofstream outfile (target);
while (intile){
intile.get(ch);
outfile.put (ch);
}
getch();
return 0;
 }