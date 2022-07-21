package lecture13;

public class ExerciseThree {
    public static void main(String[] args) {
        minusNums(new int[]{-2,-5,4,7,3,-1});

    }
    static void print (int i){
        System.out.println(i);
    }
    static void minusNums(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        print(count);
    }
}
