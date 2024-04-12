#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// S O L I D : [S] -> Single responsibility principle.

class UserInfo
{
    public:
    
    void addUser(string name)
    {
        // User add code.        
    }
    
    void delUser(string name)
    {
        // User delete code.
    }
};

class Logger
{
    public:
    
    void logError(string err)
    {
        // Log error.
    }
};

int main()
{
    cout<<"Hello World";
    
    return 0;
}
