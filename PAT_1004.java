import java.util.Scanner;

class Student {
    String name;
    String ID;
    int score;
}

public class PAT_1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] student = new Student[n];
        int height = 0;
        int low = 100;
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
            student[i].name = in.next();
            student[i].ID = in.next();
            student[i].score = in.nextInt();
            height = height > student[i].score ? height : student[i].score;
            low = low < student[i].score ? low : student[i].score;
        }
        for (int i = 0; i < n; i++) {
            if (student[i].score == height) {
                System.out.println(student[i].name + " " + student[i].ID);
            }
        }
        for (int i = 0; i < n; i++) {
            if (student[i].score == low) {
                System.out.println(student[i].name + " " + student[i].ID);
            }
        }
    }
}