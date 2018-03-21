import java.util.Arrays;
import java.util.Scanner;

public class PAT_1005 {
    public static void main(String[] args) {
        int[] book = new int[10000];
        int flag = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            num[i] = m;
            while (m != 1) {
                if (m % 2 != 0) m = 3 * m + 1;
                m = m / 2;
                book[m] = 1;
            }
        }
        Arrays.sort(num);
        int[] num1 = new int[n];
        int k = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            num1[k] = num[i];
            k++;
        }
        for (int i = 0; i < num1.length; i++) {
            if (book[num1[i]] != 1) {
                if (flag == 1) {
                    System.out.print(" ");
                }
                System.out.print(num1[i]);
                flag = 1;
            }
        }
    }
}