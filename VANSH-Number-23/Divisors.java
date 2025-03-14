import java.util.*;
public class Divisors extends PrimeNumber{
    public void display()
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("ENTER A NUMBER");
        int n=sc.nextInt();
        System.out.println("DIVISORS OF " + n + " ARE:");
        int i=1;
        while(i<n)
        {
            if(n%i==0)
            System.out.println(i);
            i+=1;
        }
    }
}