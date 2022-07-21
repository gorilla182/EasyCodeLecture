package lecture15;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        write();

    }
    static void write(){
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        while(!name.equals("Даниил")) {
            print("Введите своё имя: ");
            name = scanner.nextLine();
            if(!name.equals("Даниил"))
                print("Привет, " + name);
        }
        print("Программа завершена");

    }
    static void print(String text){
        System.out.println(text);
    }

}
