package LinkedList;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class Linked_list
{
    Node head;
    public void insertFirst(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        Node tmp=head;
        while(tmp.next!=null)
            tmp=tmp.next;
        
        tmp.next=newNode;
    }
    public void display()
    {
        Node tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    public void rotate(int k)
    {
        if(head==null ||head.next==null||k==0)
            return;
        int len=1;
        Node tmp=head;
        while(tmp.next!=null)
        {
            len++;
            tmp=tmp.next;
        }
        k%=len;
        tmp.next=head;
        for(int i=0;i < len-k ;i++)
            tmp=tmp.next;
        
        head=tmp.next;
        tmp.next=null;
    }
}
public class LinkedList
{
    public static void main(String[] args)
    {
        Linked_list l=new Linked_list();
        l.insertFirst(10);
        l.insertLast(20);
        l.insertLast(30);
        l.insertLast(40);
        l.insertLast(50);
        l.insertLast(60);
        l.display();
        l.rotate(3);
        l.display();
    }
}
