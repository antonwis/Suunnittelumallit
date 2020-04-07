package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Alkio 1");
        list.add("Alkio 2");
        list.add("Alkio 3");
        list.add("Alkio 4");
        list.add("Alkio 5");
        list.add("Alkio 6");

        // Rivinvaihto joka alkion jälkeen
        Context context = new Context(new OperationBreakAll());
        System.out.println(context.executeStrategy(list));

        // Rivinvaihto joka toisen alkion jälkeen
        context = new Context(new OperationBreakTwo());
        System.out.println(context.executeStrategy(list));

        // Rivinvaihto joka kolmannen alkion jälkeen
        context = new Context(new OperationBreakThree());
        System.out.println(context.executeStrategy(list));
    }

}
