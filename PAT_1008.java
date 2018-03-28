import java.util.Scanner;

public class PAT_1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int y = x % n;
        for (int i = n - y; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n - y - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - y - 1]);
    }
}
