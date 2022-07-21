package lecture14;

public class ExerciseEight {
    public static void main(String[] args) {
        signReplacement(new int[]{-1,2,5,7,0,-8});

    }
    static void signReplacement(int [] numbers){

        for(int i = 0; i< numbers.length;i++){
            if(numbers[i] < 0)
                numbers[i] = numbers[i]*-1;
        }
        for(int nums: numbers)
            System.out.println(nums);
    }

}
