package raghu;

import java.util.*;
public class Sample{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("  ");
                if(i==j || j==n-i-1)
                    System.out.print("\u001B[3"+i+"m"+"*"+"\u001B[0m");
            }
            System.out.println(" ");
        }
    }
}