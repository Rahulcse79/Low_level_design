#include <iostream>
using namespace std;

class shape
{
    public: 
    virtual void draw() // Do not bind.... its bind at run time.
    {
        cout<<"Generic drawing."<<endl;
    }
};

class Circle : public shape
{
    public: 
    void draw()
    {
        cout<<"Circle drawing."<<endl;
    }
};

class Rectangle : public shape
{
    public: 
    void draw()
    {
        cout<<"Rectangle drawing."<<endl;
    }
};

class Triangle : public shape
{
    public:
    void draw()
    {
        cout<<"Triangle drawing."<<endl;
    }
};

void shapeDrawing(shape *s)
{
    s->draw(); // Polymorphic.
}

int main()
{
    // Circle c;
    // Rectangle r;

    // shapeDrawing(&c);
    // shapeDrawing(&r);

    // Triangle *t = new Triangle();
    // shapeDrawing(t);
    
    // virtual keyword.
    shape *s = new shape();
    s->draw();

    // UpCasting.
    shape *s1 = new Circle();
    s1->draw();

    Circle *c = new Circle();
    c->draw();
    
    // DownCasting.
    shape *s2 = new shape();
    Circle *c2 = (Circle *)s2;
    c2->draw();

    return 0;
}