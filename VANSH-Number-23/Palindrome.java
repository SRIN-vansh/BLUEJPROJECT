import java.util.Scanner;
public class Palindrome
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = sc.nextInt();
        int n=num,q,dig,rnum=0;
        while(n>0)
        {
            q=n/10;
            dig=n%10;
            rnum=rnum*10+dig;
            n=q;
        }
        if (num==rnum)
        System.out.println("PALINDROME");
        else
        System.out.println("NOT PALINDROME");
    }
}