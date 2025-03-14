// TWIN PRIME NO. ARE TWO PRIME NUMBERS HAVING DIFFERENCE OF 2 
import java.util.*;
public class TwinPrimeNumber extends PrimeNumber
{
    public void display()
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("ENTER TWO NUMBERS");
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int i=1,c=0,j=1,c2=0;
        while(i<=n)
        {
            if(n%i==0)
            c+=1;
            i+=1;
        }
        while(j<=n2)
        {
            if(n2%j==0)
            c2+=1;
            j+=1;
        }
        int a = Math.abs(n-n2);
        if(c==2&&c2==2&&a==2)
        System.out .println("TWIN PRIME NUMBER");
        else
        System.out .println("NOT A TWIN PRIME NUMBER");
    }
}