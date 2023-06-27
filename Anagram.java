import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        obj.close();
        if(isAnagram(s1,s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Aagram");
    }
    public static boolean isAnagram(String s1,String s2)
    {
        int ar[]=new int[26];
        s1=s1.toLowerCase().replace(" ","");
        s2=s2.toLowerCase().replace(" ","");;
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++)
            ar[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)
            ar[s2.charAt(i)-'a']--;
        
        for(int i=0;i<26;i++)
        {
            if(ar[i]!=0)
                return false;
        }
        return true;
    }
}
