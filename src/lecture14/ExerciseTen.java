package lecture14;

public class ExerciseTen {
    public static void main(String[] args) {
        int[] array = abc(new int[]{1,2,3,4});
        for (int num : array)
            System.out.println(num);

    }
    static int[] abc (int[] numbers){
        int[] abc2 = new int[numbers.length];
        if(numbers.length%2 == 0) {
            for (int i = 0; i < numbers.length; i++) {
                abc2[i] = numbers[i] + numbers[numbers.length - 1 - i];
            }
        }
        return abc2;
    }

}
