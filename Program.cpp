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
    vector<int> vec = {1, 2, 3};

    changeVal(vec);

    for (int val : vec)
    {
        cout << val << " ";
    }

    return 0;
}