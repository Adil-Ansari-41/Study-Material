#include<iostream>
#include<conio.h>
using namespace std;

// class student{
//     public:
// string name;
// int age;
// bool gender;
// };
// class A{
//     public:
//     void Afunc(){
//         cout<<"func A\n";
//     }
// };

// class B{
//     public:
//     void Bfunc(){
//         cout<<"func B\n";
//     }
// };

// class C:public A,public B {
//     public:
// };

class day{
    private:
    int days;
    public:
    void set_date(){
        cout<<"Enter no day you want to display:"<<endl;
        cin>>days;
    }
    void display_day(){
        switch(days){
            case1:
            cout<<"monday"<<endl;
            break;
            case2:
            cout<<"tuesday"<<endl;
            break;
            case3:
            cout<<"wednesday"<<endl;
            break;
            case4:
            cout<<"thurday"<<endl;
            break;
        }

    }
};

int main(){
    day d1;
    d1.set_date();
    d1.display_day();


// C c;
// c.Afunc();
// c.Bfunc();

// // student a;
// // a.name ="Adil";
// // a.age=18;
// // a.gender=0;

// // student b;
// // b.name='Nam';
// // b.age=14;
// // b.gender=1;

int a=5;
a++;
cout<<"a++ is"<<a<<endl;


int x=10;
char y='a';
 x=x+y;
float z=x+1.0;
cout<<x<<endl;
cout<<y<<endl;
cout<<z<<endl;


float f2=6.1;
int r=static_cast <int> (f2);
cout<<r<<endl;
getch();
    return 0;
}