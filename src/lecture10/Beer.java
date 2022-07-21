package lecture10;

public class Beer {
    public static void main(String[] args) {
        drink(true,true);
        drink(true,false);
        drink(false,false);
        drink(false,true);
        whiskey(40,40,100);
        whiskey(40,60,60);
        whiskey(40,50,45);
        whiskey(40,50,20);

    }
    public static void drink (boolean isTodayFriday, boolean aLotOfMoney){
        if(isTodayFriday == true){
            if(aLotOfMoney == true) {
                print("Погнали, выпьем пивка!");
            }else{
                print("Давай возьмём в долг у Наташки и бахнем по пивку!");
            }
        }else {
            print("Делать нечего, гречи, что-ли, похаваю..");
        }
    }
    public static void whiskey (int beerPrice, int whiskeyPrice, int moneyInPocket){
        if(moneyInPocket >= (beerPrice+whiskeyPrice)){
            print("Сегодня гуляем! Виски и пиво, пожалуйста!");
        }else if (moneyInPocket >= beerPrice && moneyInPocket < whiskeyPrice){
            print("Кружечку пива, пожлуйста");
        } else if (moneyInPocket >= whiskeyPrice && moneyInPocket < (whiskeyPrice+beerPrice)) {
            print("Один виски, пожалуйста");
        }else {
            print("Сегодня поем гречи, денег нет, пойду домой");
        }
    }
    public static void print (String text){
        System.out.println(text);
    }
    public static void divide(int a, int b){
        if(b == 0)
            System.out.println(a/b);

    }
    public static void showDivision (int number1, int number2){
        if(number2 !=0) {
            System.out.println(number1 / 2);
        } else if(number1 == 0) {
            System.out.println("неопределённость 0/0");
        }else {
            System.out.println("на ноль делить нельзя");
        }

    }

}
