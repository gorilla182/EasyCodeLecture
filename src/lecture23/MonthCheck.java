package lecture23;

import java.util.Scanner;

public class MonthCheck {

    public int daysInMonth(){
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        String numberOfMonth = scanner.nextLine();
        switch (numberOfMonth) {
            case "Январь":
                days = 31;
                break;
            case "Февраль":
                days = 30;
                break;
            case "Март":
                days = 31;
                break;
            case "Апрель":
                days = 30;
                break;
            case "Май":
                days = 31;
                break;
            case "Июнь":
                days = 30;
                break;
            case "Июль":
                days = 31;
                break;
            case "Август":
                days = 30;
                break;
            case "Сентябрь":
                days = 31;
                break;
            case "Октябрь":
                days = 30;
                break;
            case "Ноябрь":
                days = 31;
                break;
            case "Декабрь":
                days = 30;
                break;
        }
        return days;
    }
}
