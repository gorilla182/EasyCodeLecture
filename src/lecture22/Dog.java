package lecture22;



public class Dog extends Animal{


    protected Dog(String name, int legs) {
        super(name, legs);
    }

    @Override
    protected void go() {
        System.out.println(" Бегу...");
    }
}
