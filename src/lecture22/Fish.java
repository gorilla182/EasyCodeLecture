package lecture22;


public class Fish extends Animal{

    protected Fish(String name, int legs) {
        super(name, legs);

    }
    @Override
    protected void go() {
        System.out.println(" Плыву...");
    }
}
