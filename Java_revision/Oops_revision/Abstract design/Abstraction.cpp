#include <iostream>
#include "Bird.h"
using namespace std;

void birddoesSomething(Bird*&bird)
{
    bird->eat();
    bird->fly();
}

int main()
{
    Bird* bird = new sparrow();
    birddoesSomething(bird);
    
    return 0;
}