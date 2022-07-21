package lecture23;

public class EmployeeFactory {
    public Employee create (int experience, int salary){
        if(experience < 1 && salary < 50_000){
            return new Junior(experience,salary);
        } else if ((experience >2 && experience <= 5)&&salary>=50_000&& salary<100_000)
            return new Middle(experience,salary);
        else if ( experience > 5 && salary >=100_000)
            return new Senior(experience,salary);
        else
            throw new IllegalArgumentException("Вы нам неподходите...");
    }
}
