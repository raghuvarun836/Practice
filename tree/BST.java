package tree;
public class BST 
{
    
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int x)
        {
            data=x;
            left=null;
            right=null;
        }
    }



    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(40);
        root.right=new Node(60);
        root.left.left=new Node(35);
        root.left.right=new Node(45);
        root.right.left=new Node(55);
        root.right.right=new Node(65);

        //System.out.println(Search(root,55));
        if(Search(root,55)!=null)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }

    private static Node Search(Node node,int x) {
        if(node==null || node.data==x)
            return node;
        else
            return x > node.data ? Search(node.right, x) : Search(node.left, x) ;
    }
}
