package lecture23;

public abstract class Employee {
    protected  String name;
    protected final int experience;
    protected  String[] stack;
    protected final int salary;

    protected Employee(String name, int experience, int salary, String... stack) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.stack = stack;
    }
    protected Employee(int experience, int salary){
        this.experience = experience;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Уровень: " + getClass().getSimpleName() + " Опыт: " + experience + " зарплата: " + salary;
    }
    protected void getStack(){
        System.out.println("Стэк технологий: ");
        for(String st : stack)
            System.out.println(st);
    }
}
