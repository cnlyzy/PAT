import java.util.Scanner;

public class PAT_1002 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String[]str = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String num = in.next();
        int len = num.length();
        int sum = 0;
        for(int i=0 ;i<len ;i++){
            sum += (num.charAt(i)-48);
        }
        String s1 = sum+"";
        int len1 = s1.length();
        for(int i=0 ;i<len1-1 ;i++){
            System.out.print(str[s1.charAt(i)-48]+" ");
        }
        System.out.print(str[s1.charAt(len1-1)-48]);
    }
}
