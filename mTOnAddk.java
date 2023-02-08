import java.util.*;
import java.io.*;
class mTOnAddk
{
public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num1=sc.nextInt();
    System.out.println("enter the number2");
    int num2=sc.nextInt();
    System.out.println("enter the k");
    int k=sc.nextInt();
    while(num1<=num2)
    {
        num1=num1+k+1;
        System.out.println(num1);
    }
    
}
}