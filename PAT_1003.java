import java.util.Scanner;

public class PAT_1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String str = s;
            if (str.contains("P") && str.contains("A") && str.contains("T")) {
                str = str.replace("A", "");
                str = str.replace("P", "");
                str = str.replace("T", "");
                if (str.isEmpty()) {
                    int p = s.indexOf("P");
                    int t = s.indexOf("T");
                    int len = s.length();
                    int b = t - p - 1;
                    int c = len - t - 1;
                    if (p * b == c) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
