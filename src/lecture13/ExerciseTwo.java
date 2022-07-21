package lecture13;

public class ExerciseTwo {
    public static void main(String[] args) {

        multiplyNums(new double[]{0, 2, 7, 6, 12, 4});

    }

    static void print(double i) {
        System.out.println(i);
    }

    static void multiplyNums(double[] multi) {
        double result = 1;
        for (int i = 0; i < multi.length; i++) {
            if (multi[i] == 0){
                System.out.println("zero found");
                return;
            }
                result *= multi[i];
        }
        print(result);
    }
}
