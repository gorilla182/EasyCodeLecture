package lecture18;

import lecture19.FourAngle;

public class Main {
    public static void main(String[] args) {
        boolean valid = FourAngle.validArguments(1,2,1,2);
            if(valid){
                FourAngle one = new FourAngle(1,2,1,2);
                System.out.println(one.isSquare(1,2,1,2));
            }
    }
}
