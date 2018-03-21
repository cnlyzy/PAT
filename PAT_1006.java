import java.util.Scanner;

public class PAT_1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0, b = 0, c = 0;
        if (num / 10 == 0) {
            a = num;
        } else if ((num / 10) / 10 == 0) {
            a = num % 10;
            b = num / 10;
        } else {
            a = num % 10;
            c = num / 100;
            b = num / 10 - c * 10;
        }
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < c; i++) {
            str.append("B");
        }
        for (int j = 0; j < b; j++) {
            str.append("S");
        }
        for (int k = 1; k <= a; k++) {
            str.append(k);
        }
        System.out.print(str);
    }
}