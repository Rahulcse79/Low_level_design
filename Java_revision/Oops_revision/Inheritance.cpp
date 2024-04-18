#include <iostream>
using namespace std;

class vehicle{

protected:
    string name;

public:
    string model;
    int noOfTyres;

    string getName()
    {
        return this->name;
    }

    vehicle(string name, string model, int noOfTyres)
    {
        cout<<"I am inside vehicle ctor"<<endl;
        this->name = name;
        this->model = model;
        this->noOfTyres = noOfTyres;
    }

    void start_engine()
    {
        cout<<"Engine is starting "<< name << " " << model << endl;
    }

    void stop_engine()
    {
        cout<<"Engine is stoping "<< name << " "<< model <<endl;
    }
};

class Car: public vehicle
{

public:
    int noOfDoors;
    string transmissionType;

    Car(string name, string model, int noOfTyres, int noOfDoors, string transmissionType):vehicle(name,model,noOfTyres)
    {
        this->noOfDoors = noOfDoors;
        this->transmissionType = transmissionType;
    }

    void startAc()
    {
        cout<< "Ac has started of "<< name <<endl;
    }      
};

int main()
{
    Car A("Maruti 800", "LXI", 4, 4, "Manual");

    cout<<"Name: "<<A.getName()<<endl;
    cout<<"Model: "<<A.model<<endl;
    cout<<"NoOfTyres: "<<A.noOfTyres<<endl;
    cout<<"NoOfDoors: "<<A.noOfDoors<<endl;
    cout<<"TransmissionType: "<<A.transmissionType<<endl; 

    return 0;
}