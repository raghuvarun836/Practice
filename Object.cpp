#include<stdio.h>
#include <iostream>
#include <string>
using namespace std;

class Person
{
    private:
    string name;
    int age;
    
    public:
    Person(string name,int age)
    {
        this->name=name;
        this->age=age;
    }
    void setName(string name)
    {
        this->name=name;
    }
    void setAge(int age)
    {
      this->age = age;
    }
    string getName()
    {
        return name;
    }
    int getAge()
    {
      return age;
    }
    void toString()
    {
        cout<<name<<"-->"<<age<<endl;
    }
};

int main()
{
    Person obj1("Raghu",23);
    Person obj2("Varun",22);

    obj1.toString();
    obj2.toString();
    
    return 0;
}