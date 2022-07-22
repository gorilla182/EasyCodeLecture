package lecture23;

public abstract class Employee {
    private final Range type;
    protected  String name;
    protected final int experience;
    protected final int salary;

    protected Employee(String name, int experience, int salary, Range type) {
        this.type = type;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    public Range getType (){
        return type;
    }

    @Override
    public String toString(){
        return "Уровень: " + getType() + " Опыт: " + experience;
    }

}
