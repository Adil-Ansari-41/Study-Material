//Q1.b)Convert second into hours,minutes and seconds.
#include<iostream>
#include <conio.h>
using namespace std;
int main(){
int seconds, hours, minutes;
cout<<"\n Enter time in seconds: ";
cin>>seconds;
minutes=seconds/60;
hours=minutes/60;
cout<<seconds<<" Seconds is equivalent to "<<int(hours)<<" hours "<<int(minutes%60)<< " minutes " << int(seconds%60) << " seconds.";
getch();
return 0;
}