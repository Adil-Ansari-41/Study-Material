// Q5.a)Write a C++ program to maintain the records of person with details (Name and Age) and find the eldest among them. The program must use this pointer to return the result.
#include<iostream>
#include<cstring>
#include<conio.h>
using namespace std;
class person{
    char name[20];
    float age;
public:
    person(char *s, float a){
        strcpy(name, s);
        age = a;
    }
    static person* greater(person *x, person *y){
        if(x->age >= y->age)
            return x;
        else
            return y;
    }
    void display(){
        cout<<"Name: "<<name<<"\n"<<"Age: "<<age<<"\n";
    }
};
int main(){
    person p1("Sweta", 25.0), p2("Sadaf", 35.0), p3("Kubra", 32.0);
    person *p = person::greater(&p1, &p3);
    cout<<"Elder Person is:\n";
    p->display();
    p = person::greater(&p1, &p2);
    cout<<"\nElder Person is:\n";
    p->display();
    getch();
    return 0;
}