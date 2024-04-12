#include <iostream>
using namespace std;

class Singleton{
    
    public:
    static Singleton& getInstance()
    {
        static Singleton instance;
        return instance;
    }

    private:
    Singleton()
    { 
        
    }

    Singleton(Singleton const&) = delete;
    Singleton& operator=(Singleton const&) = delete;
};

int main()
{
    Singleton& instance1 = Singleton::getInstance();
    cout<<instance1<<endl;
    Singleton& instance2 = Singleton::getInstance();
    cout<<instance2<<endl;

    return 0;
}