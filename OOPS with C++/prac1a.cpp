//Q1.a)Create a simple calculator.
#include<iostream>
#include<conio.h>
using namespace std; 
int  main()
{
float numOne,numTwo,res;
int choice;
do
{
cout<<"1. Addition\n"; cout<<"2. Subtraction\n"; cout<<"3. Multiplication\n"; cout<<"4. Division\n"; cout<<"5. Exit\n\n";
cout<<"Enter Your Choice(1-5): ";
cin>>choice;
if(choice>=1 && choice<=4)
{
cout<<"\nEnter any two Numbers: "; cin>>numOne>>numTwo;
}
switch(choice)
{
case 1:
res=numOne+numTwo;
cout<<"\nResult = "<<res;
break;
case 2:
res =numOne-numTwo;
cout<<"\nResult = "<<res;
break;
case 3:
res =numOne*numTwo;
cout<<"\nResult = "<<res;
break;
case 4:
res = numOne/numTwo;
cout<<"\nResult = "<<res;
break;
case 5:
default:
cout<<"\n Wrong Choice!";
break;
}
cout<<"\n _______\n";
} while (choice !=5);
cout<<endl;
getch();
return 0;
}