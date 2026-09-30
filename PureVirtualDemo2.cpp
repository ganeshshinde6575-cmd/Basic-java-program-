#include<iostream>
using namespace std;

class Base
{
    public: int i, j;

    int Addition(int a, int b)  //concrete function
    {
        return a+b;
    }

    virtual int Subtraction(int a, int b)=0;    //abstract function
};

class Derived : public Base //inheritance
{
    public: int x;

    
};
int main()
{

    Base *bp = new Derived();   //upCasting

    return 0;
}