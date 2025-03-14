import java.util.Scanner;
public class SumOfDigits
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt(); 
        int q,dig,sum=0;
        while(n>0)
        {
            q=n/10;
            dig=n%10;
            sum+=dig;
            n=q;
        }
        System.out.println("SUM OF DIGITS IS "+ sum);
    }
}