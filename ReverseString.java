import java.util.*;
import java.io.*;

class ReverseString{
public static void main(String args[]){

try{
String RevStr;
int i;

Scanner sc= new Scanner(System.in);

System.out.println("String :");
RevStr = sc.nextLine();

String newStr = "";

for(i= RevStr.length() -1; i >=0; i--)
{
newStr += RevStr.charAt(i);
}
System.out.println("Reverse:" +newStr);
}
catch(ArithmeticException e)
{
System.out.println("INVALID STATE" +e);
}

}
}