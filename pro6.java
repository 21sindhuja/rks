import java.util.Scanner;
class pro6
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a%4 || a%400 ==0)
{
System.out.println("this year is leap year");
}
else
System.out.println("this year is not a leap year");
}
}
