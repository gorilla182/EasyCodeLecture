package lecture23;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();
        print(factory.create(0,20_000), factory.create(10,200_000));
        MonthCheck month = new MonthCheck();
        System.out.println(month.daysInMonth());






    }
    private static void print (Employee... employees){
        for (Employee emp : employees)
            System.out.println(emp.toString());
    }

}
