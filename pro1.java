import java.io.*;
import jaca.util.Scanner;
public class pro1
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a>0)
{
System.out.println("a is positive");
}
else if(a == 0)
{
System.out.println("a is zero");
}
else
System.out.println("a is negative");
}
}
