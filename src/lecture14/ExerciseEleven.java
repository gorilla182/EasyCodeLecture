package lecture14;

public class ExerciseEleven {
    public static void main(String[] args) {
        int[] doubleArrays = doubleArray(new int[]{1,2,3,4});
        for(int num : doubleArrays)
            System.out.println(num);

    }
    static int[] doubleArray(int [] numbers){
        int[] secondArrayXtwo = new int[numbers.length*2];
        int d = 0;
        for(int i = 0; i< secondArrayXtwo.length;i+=2){
            secondArrayXtwo[i] = numbers[d];
            secondArrayXtwo[i+1] = numbers[d];
            d++;
        }
        return secondArrayXtwo;
    }
}
