# HCF
import java.io.*;
import java.util.*;
public class HCF
{
  public static void main(String args[])
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a,b,i;
     int d=1;
     int c=0;
     System.out.print("Enter the first number : ");
     a=Integer.parseInt(br.readLine());
     System.out.print("Enter the second number : ");
     b=Integer.parseInt(br.readLine());
     if (a>b)
     c=a;
     else
     c=b;
     for(i=1;i<=c;i++)
     {
        if (a%i==0 && b%i==0 && i>d)
        d=i;
    }
    System.out.println("The H.C.F. = "+d);
}
}
