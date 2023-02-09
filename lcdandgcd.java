import java.util.*;
import java.io.*;

class lcdandgcd{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int num1,num2,Temp,gcd=0;lcm=0;

System.out.println("Enter the number1 :");
num1=sc.nextLine();

System.out.println("Enter the number2 :");
num2=sc.nextLine();

int a=num1;
int b=num2;

while(num2 !=0)
{
Temp=num2;
num2=num1%num2;
num1=Temp;
}
gcd=num1;
System.out.println(\n GCD of " +a+ "and" +b+ " = " +gcd);

lcm=(a*b)/gcd;
System.out.println(\n lcm of " +a+ "and" +b+ " = " +lcm);
}
}

