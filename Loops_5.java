import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the revrese number");
        int n=sc.nextInt();
        int s=sc.nextInt();
        for(int i=n;i>s;--i)
        {
            System.out.println(i);
        }
    }
}
