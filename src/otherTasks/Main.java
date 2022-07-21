package otherTasks;

public class Main {
    public static void main(String[] args) {

       Figure[] figures = new Figure[2];
       FiguweFactory factory = new FiguweFactory();
       figures[0] = factory.create(1,2);
       figures[1] = factory.create(1,2,4);
       for(Figure fig : figures){
           System.out.println(fig.toString());
       }
    }
    static void pritn(double text){
        System.out.println(text);
    }
}
