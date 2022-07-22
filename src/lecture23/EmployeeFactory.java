package lecture23;

public class EmployeeFactory {
    public Employee create (String name,int experience, int salary){
        if(experience < 1 && salary < 50_000){
            return new Junior(name,experience,salary);
        } else if ((experience >2 && experience <= 5)&&salary>=50_000&& salary<100_000)
            return new Middle(name,experience,salary);
        else if ( experience > 5 && salary >=100_000)
            return new Senior(name,experience,salary);
        else
            throw new IllegalArgumentException("Вы нам неподходите...");
    }
}
