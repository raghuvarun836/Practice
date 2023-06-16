class TreeNode
{

    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        data=x;
        left=null;
        right=null;
    }
}
public class Samplee {
    public static void main(String[] args)
    {
        TreeNode root1=new TreeNode(10);
        root1.left=new TreeNode(20);
        root1.right=new TreeNode(30);
        root1.left.left=new TreeNode(40);

        TreeNode root2=new TreeNode(10);
        root2.left=new TreeNode(30);
        root2.right=new TreeNode(20);
        root2.right.right=new TreeNode(40);

        System.out.println(IsIdentical(root1,root2));
        System.out.println(IsMirror(root1, root2));

        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.left.left=new TreeNode(30);
        root.left.right=new TreeNode(40);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(30);
        root.right.right=new TreeNode(40);
        System.out.println(IsSymmetric(root));
    }

    private static boolean IsMirror(TreeNode root1, TreeNode root2)
    {
        if(root1==null || root2==null)
            return root1==root2;
        if(root1.data != root2.data)
            return false;
        return root1.data==root2.data && IsMirror(root1.left, root2.right) && IsMirror(root1.left, root2.right);
    }
    private static boolean IsIdentical(TreeNode root1, TreeNode root2)
    {
        if(root1==null || root2==null)
            return root1==root2;
        if(root1.data != root2.data)
            return false;
        return root1.data==root2.data && IsIdentical(root1.left, root2.left) && IsIdentical(root1.right, root2.right);
    }
    private static boolean IsSymmetric(TreeNode root)
    {
        return CheckSymmetric(root.left,root.right);
    }
    private static boolean CheckSymmetric(TreeNode lroot,TreeNode rroot)
    {
        if(lroot==null || rroot==null)
            return lroot==rroot;
        if(lroot.data != rroot.data)
            return false;
        return lroot.data==rroot.data && CheckSymmetric(lroot.left, rroot.left) && CheckSymmetric(lroot.right, rroot.right);
    }
}
