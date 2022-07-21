package lecture23;

public class Middle extends Employee{
    protected Middle(String name, int experience, int salary, String... stack) {
        super(name, experience, salary, stack);
    }
    public Middle(int experience, int salary){
        super(experience, salary);
    }
    public Middle (Middle old, String name, String... stack){
        super(name, old.experience, old.salary, stack);
    }

    @Override
    protected void getStack() {
        for(String st : stack)
            System.out.println("Стэк технологий: " + st + "\nИмею опыт решения нестандартных задач.");
    }


}
