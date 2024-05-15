#include <iostream>
#include <string>
using namespace std;

class vehicle
{
    public:
    string name;
    string model;
    int noOfTyres;

    vehicle(string _name, string _model, int _noOfTyres)
    {
        cout<<"I am inside vehicle ctor "<<endl;
        this->name = _name;
        this->model = _model;
        this->noOfTyres = _noOfTyres;
    }

    public:
    void start_engine()
    {
        cout<<"Engine is starting "<< name<< " "<<model<<endl;
    }

    void stop_engine()
    {
        cout<<"Engine is stoping "<<name<<" "<<model<<endl;
    }

    ~vehicle()
    {
        cout<<"I am inside vehicle dtor"<<endl;
    }
};

class car : public vehicle
{
    public: 
    int noOfDoors;
    string transmissionType;

    car(string _name, string _model, int _noOfTyres, int _noOfDoors, string _transmissionType): vehicle(_name,_model,_noOfTyres)
    {
        cout<<"I am inside car ctor"<<endl;
        this->noOfDoors = _noOfDoors;
        this->transmissionType = _transmissionType;
       
    }

    void StartAc()
    {
        cout<<"Ac has started of "<<name<<endl;
    }

    ~car()
    {
        cout<<"I am inside car dtor"<<endl;
    }
};

class MotorCycle : public vehicle
{
    protected:  
    string handleBarStyle;
    string suspensiontype;

    public:
    MotorCycle(string _name, string _model, int _noOfTyres, string _handleBarStyle, string _suspensiontype):vehicle(_name, _model, _noOfTyres)
    {
        cout<<"I am inside motorCycle ctor "<<endl;
        this->handleBarStyle = _handleBarStyle;
        this->suspensiontype = _suspensiontype;
    }

    void wheelie()
    {
        cout<<"Weelie started "<<name<<endl;
    }

    ~MotorCycle()
    {
        cout<<"I am inside motorcycle dtor"<<endl;
    }
};

int main()
{
    car A("Maruti 800", "LXI", 4, 4, "Manual");
    A.StartAc();
    
    MotorCycle M("BMW", "VXI", 2, "U", "Hard");

    return 0;
}