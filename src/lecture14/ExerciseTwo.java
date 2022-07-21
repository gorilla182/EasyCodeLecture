package lecture14;

public class ExerciseTwo {
    public static void main(String[] args) {
        multiples(new int[]{1,2,3,4,5,6,7,8,9,10},2);

    }
    static void multiples (int [] numbers, int divider){
        int result;
        for(int num : numbers){
            if(num%divider == 0) {
                result = num;
                System.out.println(result);
            }

        }
    }

}
