#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node* next;
    Node(int data)
    {
        this->data=data;
        this->next=nullptr;
    }
};
class LinkedList
{
    private:
    Node* head;
    public:
    LinkedList()
    {
        head=nullptr;
    }

    int size()
    {
        Node* tmp=head;
        int size=0;
        while(tmp!=nullptr)
        {
            tmp=tmp->next;
            size++;
        }
        return size;
    }

    void insertFirst(int data)
    {
        Node* newNode=new Node(data);
        if(head==nullptr)
            head=newNode;
        else
        {
            newNode->next=head;
            head=newNode;
        }
    }

    void insertLast(int data)
    {
        Node* newNode=new Node(data);
        if(head==nullptr)
            head=newNode;
        else
        {
            Node* tmp=head;
            while(tmp->next!=nullptr)
                tmp=tmp->next;
            tmp->next=newNode;
        }
    }

    void insertbyPos(int data,int pos)
    {
        if(pos==0)
            insertFirst(data);
        else if(pos==size())
            insertLast(data);
        else if(pos>0 && pos<size())
        {
            Node* newNode=new Node(data);
            Node* tmp=head;
            for(int i=0;i<pos-1 && tmp!=nullptr;i++)
                tmp=tmp->next;
            newNode->next=tmp->next;
            tmp->next=newNode;
        }
        else
            cout<<"Out of Range"<<endl;
    }

    void removeFirst()
    {
        if(head==nullptr)
        {
            cout<<"Nothing to remove"<<endl;
            return;
        }
        Node* tmp=head;
        head=head->next;
        delete(tmp);
    }

    void display()
    {
        Node* tmp=head;
        while(tmp!=nullptr)
        {
            cout<<tmp->data<<" ";
            tmp=tmp->next;
        }
        cout<<endl;
    }
};
int main()
{
    LinkedList ll;
    ll.insertFirst(30);
    ll.insertFirst(20);
    ll.insertFirst(10);
    ll.display();
    ll.insertLast(60);
    ll.insertLast(70);
    ll.insertLast(80);
    ll.display();
    ll.insertbyPos(40,3);
    ll.insertbyPos(50,4);
    ll.display();
    ll.removeFirst();
    //ll.removeLast();
    ll.display();
}