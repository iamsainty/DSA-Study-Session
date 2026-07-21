#include <iostream>

using namespace std;

int main()
{

    int bankbalance = 10000;

    // int* ptr 

    int a = 10;
    int* ptr = &a;

    *ptr = 20;

    cout << a << endl;
    cout << ptr << endl;

    cout << *ptr << endl;


    return 0;
}