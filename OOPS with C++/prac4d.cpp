// Q4.d)Write a C++ Program that illustrate multiple inheritance.
#include <iostream>
#include <conio.h>
using namespace std;
class student_detail {
protected:
    int rno;
    int marks[5];
    int sum;
    int s_mark;
public:
    void get_detail() {
        cout << "Enter Roll No: ";
        cin >> rno;
    }
    void get_marks() {
        cout << "Enter marks for 5 subjects: ";
        for(int i = 0; i < 5; i++) {
            cin >> marks[i];
        }
    }
    void calculate_total() {
        sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        cout<<"\nRoll No:"<<rno<<endl;
        cout << "Total Marks: " << sum << endl;
    }
    void display_average() {
        int tot = sum + s_mark;
        double avg = tot / 6.0;
        cout << "Average Marks: " << avg << endl;
    }
};
class result : public student_detail {
public:
    void detail() {
        get_detail();
        get_marks();
    }
    void disp() {
        calculate_total();
        display_average();
    }
};
int main() {
    result obj;
    obj.detail();
    obj.disp();
    getch();
    return 0;
}