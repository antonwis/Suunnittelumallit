package Builder;

public class Main {

    public static void main(String[] args) {
        Kokki kokki = new Kokki();
        Builder hesburger = new Hesburger();
        Builder mcDonalds = new McDonalds();
        kokki.setBurgerBuilder(hesburger);
        kokki.constructBurger();
        System.out.println("Hesen burgeri:");
        System.out.println(kokki.getBurger());
        System.out.println();
        kokki.setBurgerBuilder(mcDonalds);
        kokki.constructBurger();
        System.out.println("Mäkin burgeri:");
        System.out.println(kokki.getBurger());
    }

}
