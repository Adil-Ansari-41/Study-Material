// Q3.b) Write a C++ program for Structure bank employee to print name of the employee, account_no. & balance. Display the same also display the balance after withdraw and deposit.
#include<iostream>
#include<conio.h>
#include<iomanip>
#include<string.h>
using namespace std;
class Bank{
private:
int Accno;
char  AccName;
char AccType;
float BalanceAmt;
public:
void getAccountDetails(){
cout<<"Please enter account details:"<<endl;
cout<<"Account Number:";
cin>>Accno;
cout<<"Account Holder Name:";
cin>>AccName;
cout<<"AccountType(c-Current,s-Savings):";
cin>>AccType;
cout<<"Balance Amount:";
cin>>BalanceAmt;
}
void printAccountDetails(){
cout<<"Account holder details:"<<endl;
cout<<". ."<<endl;
cout<<"Account Number:"<<Accno<<endl;
cout<<"Name:"<<AccName<<endl;
cout<<"Account type:"<<AccType<<endl;
cout<<"Balance Amount:"<<BalanceAmt<<endl;
cout<<"........ "<<endl;
}
void doTransaction(){
char type;
float tamt;
cout<<"Transation Process"<<endl;
cout<<"....."<<endl;
cout<<"Get transation  amount:";
cin>>tamt;
cout<<"Get transation  typetype(W-withdrawl, D.deposite):";
cin>>type;
if(type =='W'|| type =='w'){
if (BalanceAmt-tamt>0){
BalanceAmt= BalanceAmt-tamt;
cout<<"Transation completed"<<endl;
cout<<"Your current Balance is"<<BalanceAmt<<endl;
}
else{
cout<<"Sorry! Insufficient funds in your account."<<endl;
}
}
else if(type=='D'||type=='d'){
BalanceAmt=BalanceAmt+tamt;
cout<<"Your current Balance is"<<BalanceAmt<<endl;}
}
};
int main(){
Bank B;
B.getAccountDetails();
cout<<"......"<<endl;
cout<<"Account Details Before Transation"<<endl;
B.printAccountDetails();
B.doTransaction();
cout<<"....."<<endl;
cout<<"Account Details after Transation"<<endl;
B.printAccountDetails();
getch();
return 0;
}