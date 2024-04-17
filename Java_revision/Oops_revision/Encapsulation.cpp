#include <iostream>
using namespace std;

class Student{
    
private:
    int id;
    int age;
    string name;
    int nos;
    int *gpa;
    string gfName;

public:
    Student()
    {
        cout<<"Student default ctor called"<<endl;
    }

    void setName(string name)
    {
        this->name = name;
    }

    string getName()
    {
        return name;
    }
    
    Student(int id, int age, string name, int nos, int gpa, string gfName)
    {
        cout<<"Student parameterised ctor called"<<endl;
        this->id = id;
        this->age = age;
        this->name = name;
        this->nos = nos;
        this->gpa = new int(gpa);
        this->gfName = gfName;
    }

    void sleep()
    {
        cout<<this->name<<" sleeping."<<endl;
    }

    ~Student()
    {
        cout<<"Student default dtor called."<<endl; 
        delete this->gpa;
    }

private:
    void gfchatting()
    {
        cout<<this->name<<" chatting with gf."<<endl;
    }

};

int main()
{
    Student A(1,12,"Jhon",6,9,"Arpita"); 
    A.sleep();
    // A.setName("Rahul");
    cout<<A.getName()<<endl;

    return 0;
}

