import java.util.Scanner;
public class recursionFibo {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms to print :");
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        System.out.println("The Nth fibonacci number is :"+fibo(N));
    }
}
