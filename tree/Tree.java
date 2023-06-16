package tree;

public class Tree
{

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int x)
        {
            data=x;
            left=right=null;
        }
    }



    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        inorder(root);
        System.out.println();
        System.out.println(MaxHeight(root));
        KthNodes(root, 2);
        System.out.println();
        System.out.println(size(root));
        System.out.println(maxElement(root));
    }

    static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    static int MaxHeight(Node node)
    {
        if(node == null)
            return 0;
        else
        {
            int lh=MaxHeight(node.left);
            int rh=MaxHeight(node.right);
            return lh > rh ? lh+1 : rh+1 ;
        }
    }

    static void KthNodes(Node node,int k)
    {
        if(node == null)
            return;
        if(k==0)
            System.out.print(node.data+" ");
        else
        {
            KthNodes(node.left, k-1);
            KthNodes(node.right, k-1);
        }
    }

    static int size(Node node)
    {
        if(node==null)
            return 0;
        else
        {
            int l=size(node.left);
            int r=size(node.right);
            return l+r+1;
        }
    }
    static int maxElement(Node node)
    {
        if(node==null)
            return Integer.MIN_VALUE;
        else
        {
            // int leftmax=maxElement(node.left);
            // int rightmax=maxElement(node.right);
            // int max= leftmax > rightmax ? leftmax : rightmax ;
            // return node.data > max ? node.data : max ;
            return Math.max(node.data,Math.max(maxElement(node.left), maxElement(node.right)));
        }
    }
}
