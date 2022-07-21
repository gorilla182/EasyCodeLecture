package lecture22;

public class Duck extends Animal{

    protected Duck(String name,int legs) {
        super(name, legs);
    }
    @Override
    protected void go() {
        System.out.println(" Кря кря, бегу...");
    }

}
