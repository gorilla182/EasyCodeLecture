package lecture15;

import java.util.Scanner;

public class WeightLossProgram {

    public static void main(String[] args) {
       menu();
    }
    static void print (String text){
        System.out.println(text);
    }
    static double harrisonBennedictBasicWomen(int age, double weight, double height){
        return 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
    }
    static double harrisonBenndedictBasicMen(int age, double weight, double height){
        return 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
    }
    static void menu () {
        Scanner scanner = new Scanner(System.in);
        int weight;
        int height;
        int age;
        int result;
        int gender;
        while (true) {
            print("Введите ваш вес в килограммах: ");
            weight = scanner.nextInt();
            if (weight > 0 && weight < 500 ) {
                print("Введите ваш рост в сантиментрах: ");
                height = scanner.nextInt();
                if (height > 0 && height <250 ) {
                    print("Введите ваш возраст:");
                    age = scanner.nextInt();
                    if (age > 0 && age < 120) {
                        print("\n1.Сидячий\n2.Средняя активность\n3.Спортсмен\nВыберите ваш уровень активности: ");
                        result = scanner.nextInt();
                        if (result > 0 && result < 4) {
                            print("\n1.мужчина\n2.женщина\nВыберите ваш гендер цифрой: ");
                            gender = scanner.nextInt();
                            if (gender > 0 && gender < 3) {
                                if (gender == 1) {
                                    if(result == 1) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBenndedictBasicMen(weight, height, age)*1.2 + " ккал");
                                        break;
                                    } else if(result == 2) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBenndedictBasicMen(weight, height, age)*1.55 + " ккал");
                                        break;
                                    } else if(result == 3) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBenndedictBasicMen(weight, height, age)*1.9 + " ккал");
                                        break;
                                    }
                                } else if (gender == 2){
                                    if(result == 1) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBennedictBasicWomen(weight, height, age)*1.2 + " ккал");
                                        break;
                                    } else if(result == 2) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBennedictBasicWomen(weight, height, age)*1.55 + " ккал");
                                        break;
                                    } else if(result == 3) {
                                        System.out.println("Для поддержания веса необходимо" +
                                                "потреблять " + harrisonBennedictBasicWomen(weight, height, age)*1.9 + " ккал");
                                        break;
                                    }
                                }

                            } else {
                                print("Извините, такой команды нет, попробуйте еще раз");
                                menu();
                            }

                        } else {
                            print("Извините, такой команды нет, попробуйте еще раз");
                            menu();
                        }
                    } else {
                        print("Извините, такой команды нет, попробуйте еще раз");
                        menu();
                    }

                }else {
                    print("Извините, такой команды нет, попробуйте еще раз");
                    menu();
                }
            }else {
                print("Извините, такой команды нет, попробуйте еще раз");
                menu();
            }
        }
    }
}
