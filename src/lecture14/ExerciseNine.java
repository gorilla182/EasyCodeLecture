package lecture14;

import java.util.Arrays;

public class ExerciseNine {
    public static void main(String[] args) {
        int[] array = newArray(new int[]{1,2,3,4,5});
        for(int nums : array)
            System.out.println(nums);

    }
    static int[] newArray (int[]numbers){
        int [] generatedArray = new int[numbers.length];
        for(int i = 0; i< numbers.length-1;i++){
            generatedArray[i] = numbers[i] + numbers[i + 1];
        }
        generatedArray[generatedArray.length-1] = numbers[numbers.length-1];
        return generatedArray;
    }
}
