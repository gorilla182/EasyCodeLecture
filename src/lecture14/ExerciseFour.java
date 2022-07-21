package lecture14;

public class ExerciseFour {
    public static void main(String[] args) {
        minAndMax(new int[]{1,2,3,-4,5,6});

    }
    static void minAndMax(int [] numbers){
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers){
            if(min > number){
                min = number;
            }
            if (max < number){
                max = number;
            }
        }
        System.out.println(max-min);
    }
}
