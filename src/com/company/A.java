import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        int r = n % m;
        if ( r == 0) {
            System.out.println("a is NOT a prime number");
        } else {
            if (n < n - 1) {
                m = m + 1;
            } else {
                System.out.println("n is a prime nunber");
            }
        }
    }
}