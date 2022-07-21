package lecture14;

public class ExerciseThree {
    public static void main(String[] args) {
        fibbonachi(100);

    }
    static void fibbonachi(int n){
        long [] fibbonachiSubsequence = new long[n];
        fibbonachiSubsequence [0] = 0;
        fibbonachiSubsequence [1] = 1;
        for (int i = 2; i< fibbonachiSubsequence.length;i++){
            fibbonachiSubsequence[i] = fibbonachiSubsequence[i-1] + fibbonachiSubsequence[i-2];
        }
        for(long num : fibbonachiSubsequence)
            System.out.println(num);
    }
}
