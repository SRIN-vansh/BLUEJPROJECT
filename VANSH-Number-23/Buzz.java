// BUZZ NUMBER IS COMPLETELY EITHER COMPLETELY DIVISIBLE BY 7 OR IT ENDS WITH UNIT DIGIT 7
import java.util.*;
public class Buzz
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        if((n%7==0)||(n%10==7))
        System.out.println("BUZZ NUMBER");
        else
        System.out.println("NOT A BUZZ NUMBER");
    }
}