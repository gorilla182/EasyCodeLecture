package lecture22;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Fish("Петр",0);
        animals[1] = new Dog("Бобик",4);
        animals[2] = new Duck("Эдик",2);
        for(Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
}
