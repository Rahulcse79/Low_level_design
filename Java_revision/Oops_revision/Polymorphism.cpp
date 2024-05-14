#include <iostream>
using namespace std;

class Complex
{
    public:
    int real;
    int imag;

    Complex()
    {
        real = imag = -1;
    }

    Complex(int r, int i): real(r), imag(i){};

    Complex operator+(const Complex &B)
    {
        Complex temp;
        temp.real = this->real + B.real;
        temp.imag = this->imag + B.imag;

        return temp;
    }

    void print()
    {
        printf("[%d + i%d]\n", this->real, this->imag);
    }
};

int main()
{
    Complex A(2,5);
    A.print();
    Complex B(2,3);
    B.print();
    Complex c = A + B;
    c.print();

    return 0;
}