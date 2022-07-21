package lecture22;

abstract class Animal {
    private final String name;
    private final int legs;
    protected Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    protected abstract void go();
    protected String getType(){
        return getClass().getSimpleName();
    }
    protected String showName(){
        return name;
    }
    @Override
    public String toString(){
        return getType() + " Имя: " + name + " Колличество ног: " + legs;
    }
}
