import java.io.*;
import java.util.*;
class input
{
      public static void main(String arg[])
      {
            int a,b;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<b)
            {
                   System.out.println("second number is greater");
            }
            else
            { 
                   System.out.println("first number is greater");
            }
      }
}