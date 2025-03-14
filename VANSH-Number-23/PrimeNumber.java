// NUMBERS HAVING NO COMMON FACTOR OTHER THAN 1
import java.util.*;
public class PrimeNumber
{
    public void display()
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("ENTER A NUMBER");
        int n=sc.nextInt();
        int i=1,c=0;
        while(i<=n)
        {
            if(n%i==0)
            c+=1;
            i+=1;
        }
        if(c==2)
        System.out .println("PRIME NUMBER");
        else
        System.out .println("NOT A PRIME NUMBER");
    }
}