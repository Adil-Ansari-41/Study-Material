//Q8.b)Write a C++ Program to get maximum of two number using Class template.
#include <iostream>
#include <algorithm>
using namespace std;
template<class T>
class TClassMax {
    T x, y;
public:
    TClassMax() {}
    TClassMax(T first, T second) {
        x = first;
        y = second;
    }
    T getMaximun() {
        return max(x, y);
    }
};
int main() {
    int a, b, i;
    float c, d, j;
    cout << "Class Template Programs: Generic Programming: Get Maximum Number \n";
    cout << "Enter A,B values(integer):";
    cin >> a >> b;
    TClassMax<int> iMax(a, b);
    i = iMax.getMaximun();
    cout << "Result Max Int : " << i << endl;
    cout << "\n\nEnter C,D values(float):";
    cin >> c >> d;
    TClassMax<float> fMax(c, d);
    j = fMax.getMaximun();
    cout << "Result Max Float : " << j << endl;
    return 0;
}