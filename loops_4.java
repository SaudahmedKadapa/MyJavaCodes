import java.util.Scanner;

public class loops_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        System.out.println("shows Even Number");
        for(int i=0;i<e;i++)
        {
            System.out.println(2*i);
        }
        System.out.println("shows Odd number");
        int o=sc.nextInt();
        for(int i=0;i<o;i++)
        {
            System.out.println(2*i+1);
        }


    }
}
