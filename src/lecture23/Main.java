package lecture23;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();
        print(factory.create("Ivan",0,20_000), factory.create("Petr",10,200_000));



    }
    private static void print (Employee... employees){
        for (Employee emp : employees)
            System.out.println(emp.toString());
    }

}
