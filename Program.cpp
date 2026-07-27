#include <iostream>
#include <vector>

using namespace std;

void changeVal(vector<int> &vec)
{
    vector<int> newVec = {1, 2, 3, 4, 5};
    vec = newVec;
}

int main()
{
    // vector<int> vec = {1, 2, 3};

    // changeVal(vec);

    // for (int val : vec)
    // {
    //     cout << val << " ";
    // }

    // int a = 10;

    // int b = a;

    // b = 20;


    // int a = 10;

    

    // int* p = &a;

    // cout << p << endl;

    // p = p + 1;

    // // 1000 -> 1004

    // *p = 20;

    // cout << a << endl;




    int a; // 1000 - 0


    int b = 20; // 1004



    int arr[5] = {1,2,3,4,5};

    cout << arr << endl; //-- 0x16d3c6450
    cout << *(arr + 1) << endl; //-- 0x16d3c6450





    return 0;
}