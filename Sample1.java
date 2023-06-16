class Queue{
    static int f,r,n,cs;
    static int ar[];
    Queue(int cap)
    {
        n=cap;
        f=cs=0;
        r=cap-1;
        ar=new int[n];
    }

    void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("Over Flow");
            return;
        }
        r=(r+1)%n;
        ar[r]=x;
        cs++;
    }

    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Under Flow");
            return Integer.MIN_VALUE;
        }

        int tmp=ar[f];
        f=(f+1)%n;
        cs--;
        return tmp;
    }

    int front()
    {
        return isEmpty() ? Integer.MIN_VALUE : ar[f];
    }

    int rear()
    {
        return isEmpty() ? Integer.MIN_VALUE : ar[r];
    }

    void display()
    {
        if(cs==0)
        {
            System.out.println("No elements in queue");
            return;
        }
        for(int i=0,j=f;i<cs;i++)
            System.out.print(ar[(i+j)%n]+" ");
        System.out.println();
    }

    private boolean isFull(){
        return cs==n;
    }
    private boolean isEmpty(){
        return cs==0;
    }
}
public class Sample1 {

    public static void main(String args[])
    {
        Queue q=new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.enqueue(100);
        q.display();
    }
}