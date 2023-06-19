import java.util.*;
public class ExcelNo
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    String s=obj.next();
    System.out.println(ENumeric(s));
  }
  public static int ENumeric(String s)
  {
    int len=s.length();
    int res=0;
    for(int i=len-1;i>=0;i--)
    {
      int ch=s.charAt(i)-'A'+1;
      res+=ch*(Math.pow(26,len-i-1));
    }
    return res;
  }
}
