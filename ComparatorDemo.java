import java.util.*;

public class ComparatorDemo
{
    public static void main(String[] args)
    {
        Comparator<String> com=new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                if(s1.length()>s2.length())
                    return 1 ;
                else if(s1.length()<s2.length())
                    return -1;
                else
                    return s1.compareTo(s2);
            }
        };
        List<String> l=new ArrayList<>();
        l.add("Coding");
        l.add("Codes");
        l.add("Cod");
        l.add("Cpp");
        l.add("Code");

        Collections.sort(l,com);

        System.out.println(l);
    }
}
