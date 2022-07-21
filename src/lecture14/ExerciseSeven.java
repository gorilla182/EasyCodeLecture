package lecture14;

public class ExerciseSeven {
    public static void main(String[] args) {
        findThis(new String[]{"hello","kek","lol","this"});
        findThis(new String[]{"this"});

    }
    static void findThis (String [] words){
        int count = -1;
        for (int i = 0; i< words.length;i++){
            count++;
            if(words[i].equals("this"))
                System.out.println(count);
        }
    }
}
