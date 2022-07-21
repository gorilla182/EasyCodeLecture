package lecture13;

public class ExerciseSix {
    public static void main(String[] args) {
        subsequence(new int[]{1,2,3,4,5});

    }
    static void subsequence(int [] numbers){
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i+1]-numbers[i] == 1) {
                System.out.println("это последовательность");
            }else
                System.out.println("это не последовательность");
        }
    }
}
