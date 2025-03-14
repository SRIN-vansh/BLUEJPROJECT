// NUMBER WHOSE SUM OF DIGITS EQUALS TO NUMBER OF DIGITS
import java.util.Scanner;
public class SuperSpyNumber
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt(); 
        int q,dig,sum=0,ctr=0;
        while(n>0)
        {
            q=n/10;
            dig=n%10;
            sum+=dig;
            n=q;
            ctr+=1;
        }
        if(ctr==sum)
        System.out.println("SUPER SPY NUMBER");
        else
        System.out.println("NOT SUPER SPY NUMBER");
    }
}