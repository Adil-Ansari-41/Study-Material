//Q1.c)Find the volume of square,cone, and rectangle.
#include<iostream>
#include<conio.h>
using namespace std;
int main () {
     const float pi = 3.14159; 
     float r,h,l,b,s,vol;
cout<<"\n Enter the radius and height of the cone:";
cin>>r>>h;
// Cone's volume.
vol=(1.0/3.0)*pi*(r*r)*h;
cout <<"\n The volume of the Cone is: " << vol;
cout<<"\n\n Enter the length, breadth and height of a Rectangle: ";
cin>>l>>b>>h;
// Rectangle's volume.
vol=(l*b*h);
cout<<"\nThe volume of the Rectangle is: " << vol;
cout<< "\n\n Enter the side of a Square: ";
cin>>s;
// Square's volume.
vol=(s*s*s);
cout<<"\n The volume of the Square is: " << vol;
getch();
return 0;
}