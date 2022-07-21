package otherTasks;

import otherTasks.Box;

public class Korobka extends Box {
    private final int weight;

    public Korobka(String information, int weight){

        super(information);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " ее вес: " + weight;
    }
}
