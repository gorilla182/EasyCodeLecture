package lecture14;

public class ExerciseThirteen {
    public static void main(String[] args) {
        int[] multiply = multiplyArrays(new int[]{1,2,3},new int[]{1,2,3,4});
        for (int num : multiply)
            System.out.println(num);

    }
    static int[] multiplyArrays (int[] array1, int[] array2){
        int[] thirdArray = new int[array1.length];
        if(array1.length == array2.length){
            for (int i = 0; i<array1.length; i++){
                thirdArray[i] = array1[i]*array2[i];
            }
        } else
            System.out.println("массивы не равны по длинне");
        return thirdArray;
    }

}
