package lecture23;

import java.util.Scanner;

public class MonthCheck {

    public int daysInMonth(){
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        String numberOfMonth = scanner.nextLine();
        switch (numberOfMonth.toLowerCase()) {
            case "январь":
            case "january":
                days = 31;
                break;
            case "февраль":
            case "february":
                days = 30;
                break;
            case "март":
            case "march":
                days = 31;
                break;
            case "апрель":
            case "april":
                days = 30;
                break;
            case "май":
            case "may":
                days = 31;
                break;
            case "июнь":
            case "june":
                days = 30;
                break;
            case "июль":
            case "july":
                days = 31;
                break;
            case "август":
            case "august":
                days = 30;
                break;
            case "сентябрь":
            case "september":
                days = 31;
                break;
            case "октябрь":
            case "october":
                days = 30;
                break;
            case "ноябрь":
            case "november":
                days = 31;
                break;
            case "декабрь":
            case "december":
                days = 30;
                break;
        }
        return days;
    }
}
