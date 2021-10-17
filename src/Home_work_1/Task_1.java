package Home_work_1;

import java.lang.Math;
import java.util.Scanner;

public class Task_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b = in.nextInt();
        int c = task_1(a, b);
        System.out.println(c);
    }
    public static int task_1(int a,int b) {
      return Math.max(a, b);
    }
}
