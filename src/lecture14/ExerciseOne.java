package lecture14;

public class ExerciseOne {
    public static void main(String[] args) {
        printNumbers(new int[]{1,2,3,4,5,6,7,8,9,10,11,12},9);

    }

    static void printNumbers(int[] numbers, int number) {
        int result;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] <=number) {
                result = numbers[i];
                System.out.println(result);
            }
        }

    }
}

