package Chain_of_Responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();
        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        boolean stop = false;
        try {
            while (!stop) {
                System.out.println("Welcome, worker.\n");
                System.out.print("Enter your name: ");
                String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.print("Hello " + name + ". Enter current salary: ");
                double salary = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.print("Enter preferred salary: ");
                double raise = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.raiseRequest(new Employee(name, salary, raise));

                System.out.println("Continue? Y/N");
                String cont = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if(cont.equals("N") || cont.equals("n")) {
                    System.out.println("Exiting...");
                    stop = true;
                }
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }

}
