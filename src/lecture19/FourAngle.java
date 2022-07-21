package lecture19;

public class FourAngle {
    private final int SIDE1;
    private final int SIDE2;
    private final int SIDE3;
    private final int SIDE4;

    public FourAngle(int SIDE1, int SIDE2, int SIDE3, int SIDE4) {
        this.SIDE1 = SIDE1;
        this.SIDE2 = SIDE2;
        this.SIDE3 = SIDE3;
        this.SIDE4 = SIDE4;
    }
    public  boolean isSquare(int SIDE1, int SIDE2, int SIDE3, int SIDE4){
        return SIDE1 == SIDE2 && SIDE3 == SIDE4;
    }
    public static boolean validArguments(int SIDE1, int SIDE2, int SIDE3, int SIDE4){
        return SIDE1 == SIDE3 && SIDE2 == SIDE4;
    }
}
