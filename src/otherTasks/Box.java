package otherTasks;

public abstract class Box {

    private final String information;
    public Box (String information){
        this.information = information;
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    public String toString(){
        return getType() + " это коробка: " + information;
    }

}
