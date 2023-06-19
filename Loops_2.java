import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the first n natural number");
        int i=a.nextInt();
        int n=a.nextInt();
        do{
            System.out.println(i);
            i++;

        }
        while(i<=n);
    }
}
