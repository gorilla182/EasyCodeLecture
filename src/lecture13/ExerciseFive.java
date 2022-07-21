package lecture13;

public class ExerciseFive {
    public static void main(String[] args) {
        zeroStrings(new String[]{"насрал", "кек","привет"," ","Алеша",""});

    }
    static void zeroStrings (String [] strings){
        int count = 0;
        for (String string : strings) {
            if (string.isEmpty())
                count++;
        }
        System.out.println("пустых строк: " + count);
    }
}
