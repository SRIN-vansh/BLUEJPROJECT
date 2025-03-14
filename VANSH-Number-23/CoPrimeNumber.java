// NUMBERS HAVING NO COMMON FACTORS OTHER THAN 1
import java.util.*;
public class CoPrimeNumber extends PrimeNumber
{
    public void display()
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("ENTER TWO NUMBERS");
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int c=0,i=1;
        int min = Math.min(n,n2);
        while(i<=min)
        {
            if(n%i==0&&n2%i==0)
            c+=1;
            i+=1;
        }
        if(c==1)
        System.out .println("CO-PRIME NUMBER");
        else
        System.out .println("NOT A CO-PRIME NUMBER");
    }
}