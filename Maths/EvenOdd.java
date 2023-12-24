import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r=n&1;
        if(r==0) System.out.println("Even");
        else System.out.println("Odd");
    }

}
