package lecture23;

import java.util.Scanner;

public class MonthCheck {

    public int daysInMonth(String numberOfMonth){
        int days = 0;
        int month = Integer.parseInt(numberOfMonth);
        switch (month) {
            case 1:
                days = 31;
            case 2:
                days = 30;
            case 3:
                days = 31;
            case 4:
                days = 30;
            case 5:
                days = 31;
            case 6:
                days = 30;
            case 7:
                days = 31;
            case 8:
                days = 30;
            case 9:
                days = 31;
            case 10:
                days = 30;
            case 11:
                days = 31;
            case 12:
                days = 30;
        }
        return days;

    }
}
