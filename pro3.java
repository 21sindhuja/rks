import java.util.Scanner;
class JavaProgram
{
  public static void main(String args[])
    {
        char ch;
        Scanner sc= new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = sc.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }
}
