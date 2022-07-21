package lecture15;

import java.util.Scanner;

public class ExerciseThree {
    static final int salary = 25000;
    static final int creditTerm = 12;
    static final int creditValue = 150_000;
    public static void main(String[] args) {
    startCreditBot();


    }
    static void startCreditBot(){
        Scanner scanner = new Scanner(System.in);
        int preResult = 0;
        print("Введите вашу ежемесячную зарплату в рублях: ");
        int salaryIn = scanner.nextInt();
        if(salaryIn > salary){
            preResult++;
        }
        print("Введите желаемй срок заёма в месяцах: ");
        int creditTermIn = scanner.nextInt();
        if(creditTermIn<creditTerm) {
            preResult++;
        }
        print("Введите желаемую сумму зйма в рублях: ");
        int creditValueIn = scanner.nextInt();
        if(creditValueIn < creditValue) {
            preResult++;
        }
        if(preResult >= 3)
            print("Вам одобрен кредит");
        else {
            print("Вам не одобрен кредит");
        }
    }
    static void print (String text){
        System.out.println(text);
    }
}
