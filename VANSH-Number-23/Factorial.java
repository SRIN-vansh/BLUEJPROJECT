// FACTORIAL OF A NUMBER IS THE PRODUCT OF NUMBERS STARTING FROM 1 TO THE NUMBER
import java.util.Scanner;
public class Factorial
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt(); 
        int i,fact=1;
        for(i=1;i<=n;i+=1)
        {
            fact*=i;
            }
            System.out.println("FACTORIAL OF "+ n +" IS:"+fact);
    }
}