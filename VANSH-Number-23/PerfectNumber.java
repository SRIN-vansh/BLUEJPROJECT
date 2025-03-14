// A PERFECT NUMBER IS THE NO. WHICH IS EQUAL TO SUM OF ITS DIVISORS EXCLUDING THE NUMBER ITSELF
import java.util.Scanner;
public class PerfectNumber
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt(); 
        int i=1,sum=0;
        while(i<n)
        {
            if(n%i==0)
            {
            sum+=i;
        }
        }
        if(sum==n)
        {
        System.out.println("NUMBER IS PERFECT");
        }
        else
        {
        System.out.println("NUMBER IS NOT PERFECT");
         }
}
}