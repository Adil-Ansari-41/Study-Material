//Q3.a)Write a C++ program using classes and object Student to print name of the student, roll_no. Display the same.
#include<iostream>
#include <conio.h>
using namespace std;
class Student{
private:
char name[30];
int rollNo;
public:
//member function to get student's details
void getDetails(void);
//member function to print student's details
void putDetails(void);
};
//member function definition, outside of the class 
void Student::getDetails(){
cout << "Enter Name:"<<endl;
cin >> name;
cout << "Enter Roll Number: "<<endl;
cin >> rollNo;
}
//member function definition, outside of the class 
void Student::putDetails(){
cout << "Student details:\n" <<endl;
cout <<"************" <<endl;
cout << "\nName:"<<name <<endl;
cout <<"Roll Number:" << rollNo <<endl;
}
int main(){
Student s; //object creation
s.getDetails();
s.putDetails();
getch();
return 0;
}