package lecture11;

public class Test {
    public static boolean playerNumberNow = true;
    private static int count = 1;
    public static void print (String text){
        System.out.println(text);
    }
    public static void print (int text){
        System.out.println(text);
    }
    public static void main(String[] args) {
        print(String.valueOf(triangle(1,1,3)));
        print(nums(1,2,3,4));
        bringBring(true,true);
        bringBring(true, false);
        bringBring(false,false);
        bringBring(false, true);
        triangleAngles(120,15,45);
        triangleAngles(90,60,30);
        triangleAngles(87,46,47);
        triangleAngles(60,60,60);
        triangleAngles(80,50,50);
        botControl(0);
        botControl(18);
        botControl(13);
        yourWayToday(-1);
        yourWayToday(64);
        yourWayToday(12);
        nameControl("Антон");
        nameControl("Денис");
        nameControl("Алексей");
        count();
        count();
        count();
        count();
        count();
        count();
        waterStatus(98);
        waterStatus(-2);
        waterStatus(103);
        marriage("male","male");
        marriage("male","female");
        print(String.valueOf(stringComparison(" "," ")));
        print(String.valueOf(httpCheck("http://")));
        nameCheck("Иван","Иванов");
        nameCheck("Иван","Петров");
        nameCheck("Александр","Петров");
        print(numsModule(10));
        print(numsModule(-2));
        print(numsModule(0));
        fourAngle(5,5,5,5);
        fourAngle(5,5,10,10);
        fourAngle(5,5,8,12);
        fourAngle(5,8,5,4);
        controlNums(2,3,5,5,4);
        lesson(3,false);
        game(1,"step1");
        game(1,"step2");
        game(2,"step3");
        game(1,"step4");
    }
    public static boolean triangle(int a, int b, int c){
        return (a + b) < c || (a + c) < b || (b + c) < a;

    }
    public static int nums (int a, int b, int c, int d){
        if(a>b && a>c && a> d) {
            return a;
        } else if (c>a && c>b && c>d){
            return c;
        } else if (b>a && b>c && b>d){
            return b;
        } else
            return d;
    }
    public static void bringBring (boolean isWeekend, boolean isHoliday){
        if(isWeekend && isHoliday)
            print("Спи ержан, сегодня праздник");
        else if(isWeekend)
            print("Ержан, надо вставать в 11:00");
        else if (isHoliday)
            print("Спи ержан, сегодня праздник");
        else
            print("Вставай ержан, на работу в 06:00 пора");
    }
    public static void triangleAngles(int angle1, int angle2, int angle3){
        if(angle1 == angle2 && angle1 == angle3)
            print("Равносторонний");
        else if(angle1 == 90 || angle2 == 90 || angle3 == 90)
            print("Прямоугольный");
        else if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3)
            print("Равнобедренный");
        else if(angle1>90 || angle2>90 || angle3>90)
            print("Тупоугольный");
        else
            print("Остроугольный");
    }
    public static void botControl(int age){
        if(age >=18 && age <=100)
            print("Доступп разрешён");
        else if(age <18 && age > 1)
            print("Доступ запрещён");
        else
            print("Вы бот");
    }
    public static void yourWayToday(int age){
        if(age >= 65 && age < 110)
            print("ваш путь в поликлинику");
        else if(age > 25 && age < 65)
            print("ваш путь на работу");
        else if(age > 18 && age <= 25)
            print("ваш путь в универ");
        else if (age > 7 && age <=18)
            print("ваш путь в школу");
        else if (age >1 && age <=7)
            print("ваш путь в детсад");
        else
            print("вы бот");
    }
    public static void nameControl (String name){
        if(name.equals("Антон") || name.equals("Денис"))
            print("Добро пожаловать отсюда");
        else
            print("Добро пожаловать");
    }
    public static void count (){
        if(count<6){
            print("Мутод вызван " + count + " раз");
            count++;
        }else
            print("вы привысили лимит");
    }
    public static void waterStatus (int temp){
        if(temp > 0 && temp < 100)
            print("Вода");
        else if (temp < 0)
            print("Лёд");
        else
            print("Пар");
    }
    public static void marriage (String gender1, String gender2){
        if(gender1.equals(gender2))
            print("Валите  в США!");
        else
            print("Совет вам да любовь");
    }
    public static boolean stringComparison (String text1, String text2) {
        boolean result = false;
        if (text1.equals(text2)) {
            if (!text1.isEmpty())
                result = true;
        }
        return result;
    }
    public static boolean httpCheck (String text){
        return text.equals("http://");
    }

    public static void nameCheck (String name, String secondName){

        if (name.equals("Иван") && secondName.equals("Иванов"))
            print("ККККомбо!!");
        else if(name.equals("Иван")||secondName.equals("Иванов"))
            print("отказ");
        else
            print("Здравствуйте " + name + " " + secondName);
    }
    public static int numsModule (int num){
        if(num >0 )
            return num;
        else if(num < 0)
            return num * -1;
        else{
            print("Это ноль");
            return 0;
        }
    }
    public static void fourAngle(int a, int b, int c, int d){
        if(a == b && c == d && a == c)
            print("Это квадрат");
        else if(a == b && d == c )
            print("это прямоугольник");
        else
            print("Это четырёхугольник");
    }
    public static void controlNums(int n1,int n2, int n3, int n4, int n5){
        int nums = (n1+n2+n3+n4+n5)/5;
        if(n1>1&&n1<6){
            if(n2>1&&n2<6)
                if(n3>1&&n3<6)
                    if(n4>1&&n4<6)
                        if(n5>1&&n5<6)
                            if(nums<=2)
                                print("двоечник");
                            else if (nums == 3)
                                print("троечник");
                            else if (nums ==4)
                                print("хорошист");
                            else if (nums>4)
                                print("отличник");
        }else
            print("оценки не в рамаках пятибальной шкалы");

    }
    public static void lesson (int lessonMumber, boolean isUserPremium){
        if(lessonMumber>0 && lessonMumber<=100){
            if(isUserPremium)
                print("можете решать любой урок");
            else print("вы можете решить только первй урок");

        }else
            print("номер невалидный");
    }
    public static void game (int playerNumber, String step){
        if(playerNumber == 1 && playerNumberNow || playerNumber == 2 && !playerNumberNow) {
            print(step);
            playerNumberNow = !playerNumberNow;
        }
    }
}
