package lecture23;

public class Junior extends Employee{
    protected Junior(String name, int experience,int salary, String... stack) {
        super(name, experience, salary, stack);
    }
    public Junior(int experience, int salary){
        super(experience, salary);
    }
    public Junior (Junior old, String name, String... stack){
        super(name, old.experience, old.salary, stack);
    }

}
