package lecture15;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        int experience;
        int desiredSalary;
        String questionOne;
        String questionTwo;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            print("На какую должность вы претендуете?");
            questionTwo = scanner.nextLine();
            if(questionTwo.equals("Разработчик")){
                print("Отличнно! Даватйе продолжим");
            }else{
                print("Мы ищем только разработчиков, досвидания.");
                break;
            }
            print("У вас есть опыт работы?");
            questionOne = scanner.nextLine();
            if (questionOne.equals("Да")) {
                print("Сколько лет вы там проработали?");
                experience = scanner.nextInt();
                if(experience>5){
                    print("Отлично, тогда продолжаем");
                }else{
                    print("Мы ищем сотрудников с опытом не менее 5 лет. Вы нам не подходите.");
                    break;
                }
            } else if (questionOne.equals("Нет")) {
                print("Сожалеем, но мы рассматриваем только сотрудников с опытом.");
                break;
            }
            print("Какие у вас зарплатные ожидание? В ряблях :");
            desiredSalary = scanner.nextInt();
            if(desiredSalary > 100_000) {
                print("Мы не готовы предложить вам такой заработок. Досвидания");
                break;
            }else
                print("Отлично! Наш менеджер свяжется с вами для подписания оффера.");
            break;
        }
    }

    static void print(String text){
        System.out.println(text);
    }
}
