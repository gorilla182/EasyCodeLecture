package lecture14;

public class ExerciseSix {
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5,6,7});

    }
    static void reverse (int [] numbers){
        for (int i = numbers.length-1; i >=  0 ; i--)
            System.out.println(numbers[i]);
    }
}
