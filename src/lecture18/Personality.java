package lecture18;

import javax.print.attribute.standard.MediaSize;

public class Personality {
    final String NAME;
    final String SURNAME;
    final int AGE;


    public Personality(String NAME, String SURNAME, int AGE) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.AGE = AGE;
    }
    public void personInfo(){
        System.out.println("Имя: " + NAME + "\nФамилия: " + SURNAME + "\nВозраст: " + AGE);
    }
}
