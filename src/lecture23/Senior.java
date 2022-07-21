package lecture23;

public class Senior extends Employee{
    protected Senior(String name, int experience, int salary, String... stack) {
        super(name, experience, salary, stack);
    }
    public Senior (int experience, int salary){
        super(experience, salary);
    }
    public Senior (Junior old, String name, String... stack){
        super(name, old.experience, old.salary, stack);
    }
    @Override
    public void getStack(){
        for(String st : stack)
            System.out.println("Стэк технологий: " + st + "\nИмею опыт решения нестандартных задач, а также работал на позиции тимлида 6 месяцев.");
    }


}
