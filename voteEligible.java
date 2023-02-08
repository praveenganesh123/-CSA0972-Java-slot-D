import java.util.*;
import java.io.*;

class voteEligible{
public static void main(String arg[])
{

try 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age:");

int a=sc.nextInt();
int y=18-a;
if(a<=18)
{
System.out.println("your are not eligible to vote");
System.out.println("your are allowed to votee after " +y+ ",year");
}
else{
System.out.print("your are eligible to vote");
}
}
catch(Exception e)
{
System.out.println("invalid user input");
}



}
}