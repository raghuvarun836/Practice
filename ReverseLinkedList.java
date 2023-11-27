class Node
{
    char data;
    Node next;
    Node(char data)
    {
        this.data=data;
        next=null;
    }
}
class LinkedList
{
    Node head;
    public void insertFirst(char data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(char data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
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
            System.out.print(tmp.data);
            tmp=tmp.next;
        }
    }
}
public class ReverseLinkedList
{
	public static void main(String[] args)
	{
	    LinkedList l=new LinkedList();
	    String s="My name is Raghu";
	    for(int i=0;i<s.length();i++)
	        l.insertLast(s.charAt(i));
	    
	    l.display();
	}
}
