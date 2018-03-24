import java.util.Scanner;

public class PAT_1007 {
    public static boolean isPrime(int n) {
        boolean boo = true;
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                boo = false;
                break;
            }
        }
        return boo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int p = 3, k = 0;
        for (int i = 5; i <= num; i++) {
            if (isPrime(i)) {
                if (i - p == 2) {
                    k++;
                }
                p = i;
            }
        }
        System.out.println(k);
    }
}