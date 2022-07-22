package lecture23;

public class Senior extends Employee{
    protected Senior(String name, int experience, int salary) {
        super(name, experience, salary, Range.SENIOR);
    }
}
