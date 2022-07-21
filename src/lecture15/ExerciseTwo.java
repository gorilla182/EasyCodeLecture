package lecture15;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        while(count <= 19){
            count++;
            print("Введите число: ");
            number = scanner.nextInt();
            if(number%5 == 0) {
                print("Кратно пяти");
            } else
                print("не кратно пяти");
        }

    }
    static void print (String text){
        System.out.println(text);
    }
}
