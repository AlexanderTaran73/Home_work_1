package Home_work_1;


public class Task_3 {
    public static void main(String[] args) {

        System.out.println(Sum(10, 4)+Sum(100, 4)+Sum(220, 3));
    }
    public static int Sum(int start, int num){
        int sum = 0;
        for (int i = 0; i < num; i++){
            sum += start;
            start += 10;
        }
        return sum;
    }
}//comment
