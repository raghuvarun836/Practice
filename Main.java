@FunctionalInterface
interface A
{
    void display();
}
public class Main
{
	public static void main(String[] args)
    {
        A obj = () -> System.out.println("in A Interface");
        obj.display();
	}
}
