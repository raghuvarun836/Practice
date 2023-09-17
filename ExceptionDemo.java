import java.util.*;
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
public class ExceptionDemo
{
	public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int age=obj.nextInt();
	    
	    try
	    {
	        if(age<18)
	            throw new MyException("Age should not be less than 18");
	    } 
	    catch(MyException e)
	    {
	        System.out.println("Cannot Vote "+e);
	    }
        finally
		{
			obj.close();
		}
	}
}