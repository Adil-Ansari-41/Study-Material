/*Q6.a)Write a C++ program to implement I/O operations on characters.
I/O operations includes inputting a string, Calculating length of the string,
Storing the String in a file, fetching the stored characters from it, etc.*/
#include<iostream>
#include <conio.h>
#include<fstream>
#include<string.h>
using namespace std;
int main(){
char string[80];
cout<<"Enter a String \n";
cin>>string;
int len = strlen(string);
fstream file;
file.open("TEXT", ios::in | ios::out);
for(int i=0;i<len;i++)
file.put(string[i]);
file.seekg(0);
char ch;
while(file){
file.get(ch);
cout<<ch;
}
getch();
return 0;
}