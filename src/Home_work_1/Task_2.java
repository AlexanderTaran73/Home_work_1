package Home_work_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b = in.nextInt(),c = in.nextInt();
        int max = task_1(a, b, c);
        System.out.println(max);
    }
    public static int task_1(int a,int b, int c) {
        return Math.max(Math.max(a, b), Math.max(a, c));
    }
}
