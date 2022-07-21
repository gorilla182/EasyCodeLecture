package lecture13;

public class ExerciseFour {
    public static void main(String[] args) {
        minusCount(new int[]{1,1,4,6,8,12,12,12,12},12);

    }
    static void minusCount(int [] numbers, int number){
        int count = 0;
        for (int j : numbers) {
            if (number == j)
                count++;
        }
        print(count);
    }
    static void print(int i){
        System.out.println("число встречается " + i + " раз(а)");
    }
}
