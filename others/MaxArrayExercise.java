package others;

public class MaxArrayExercise {
    public static void main(String[] args){
        int[] numbers = {9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }

    public static int max(int[] m){
        int max_num = 0;
        for (int i: m){
            if (i >= max_num) {
                max_num = i;
            }
        }
        return max_num;
    }
}
