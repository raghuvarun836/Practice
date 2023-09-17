import java.util.*;

class Student
{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Comparator1
{
    public static void main(String[] args)
    {
        List<Student> l=new ArrayList<>();
        l.add(new Student("Raghu", 23));
        l.add(new Student("Ravi", 21));
        l.add(new Student("Varun", 18));
        l.add(new Student("Sahil", 15));
        l.add(new Student("Rutu", 25));

        Comparator<Student> com= (i,j) -> i.age>j.age ? 1 : -1 ;

        Collections.sort(l,com);
        System.out.println(l);
    }
}