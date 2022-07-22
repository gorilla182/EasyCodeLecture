package lecture23;

public class Middle extends Employee{
    protected Middle(String name, int experience, int salary) {
        super(name, experience, salary, Range.MIDDLE);
    }
}
