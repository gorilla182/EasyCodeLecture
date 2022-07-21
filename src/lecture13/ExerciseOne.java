package lecture13;

public class ExerciseOne {
    public static void main(String[] args) {
        minimumNum(new int[]{});



    }
    public static void minimumNum(int [] num){
        if(num.length == 0){
            return;
        }
        int minimum = num [0];
        for (int j : num) {
            if (minimum > j) {
                minimum = j;
            }
        }
        print(minimum);

    }
    static void print(int i){
        System.out.println("minimum is: " + i);
    }
}
