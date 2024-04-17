#include <iostream>
using namespace std;

class Student
{
    public:
    // Attributes 
    int id;
    int age;
    string name;
    int nos;
    int *gpa = nullptr;
 
    Student(int gpa) // Constructor
    {
        cout<<"Student constructor is called."<<endl;
        this->gpa = new int(gpa);
    }

    // Copy constructor
    Student(const Student &srcobj)
    {
        cout<<"Copy constructor called!"<<endl;
        this->id = srcobj.id;
        this->age = srcobj.age;
        this->name = srcobj.name;
        this->nos = srcobj.nos;
        this->gpa = new int(*(srcobj.gpa));
    }

    // Behaviour / methods / Functions

    void study()
    {
        cout<< this->name <<" Studying"<<endl;
    }

    void sleep()
    {
        cout<< *(this->gpa) <<" Sleeping"<<endl;
    }

    void bunk()
    {
        cout<<this->name <<" Bunking"<<endl;
    }   

    ~Student()   // Destructor
    {
        cout<<"Student "<<this->name<<" destructor is called."<<endl;
        delete this->gpa;
    }
};

int main()
{
    // Student A;
    // A.age = 23;
    // A.id = 1;
    // A.name = "Rahul singh";
    // A.nos = 9;
    // A.study();
    // A.sleep();

    // Student B;
    // B.name = "Akash singh";
    // B.study();

    // Copy 
    // Student B = A;
    // B.sleep();

    Student* C = new Student(9);
    C->id = 2;
    C->age = 24;
    C->name = "Jhon";
    C->nos = 12;
    C->study();
    C->sleep();

    delete C;

    return 0;
}