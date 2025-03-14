// NUMBER WHOSE SUM OF DIGITS EQUALS TO PRODUCT OF DIGITS
import java.util.Scanner;
public class SpyNumber
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt(); 
        int q,dig,sum=0,p=1;
        while(n>0)
        {
            q=n/10;
            dig=n%10;
            sum+=dig;
            p*=dig;
            n=q;
        }
        if(sum==p)
        {
        System.out.println("SPY NUMBER");
            }
              else
                   {
                       System.out.println("NOT SPY NUMBER");
                           }
    }
}