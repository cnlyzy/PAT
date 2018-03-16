import java.util.Scanner;

public class PAT_1001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3 + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}