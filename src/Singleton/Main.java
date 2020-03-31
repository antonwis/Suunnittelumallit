package Singleton;

public class Main {

    public static void main(String[] args) {

        Master master = new Master("Billy Herrington");
        Salesman salesman = new Salesman("Steve Rambo");

        System.out.println("Introducing " + master.toString());
        System.out.println("Introducing " + salesman.toString());

        master.openDoors();
        salesman.sell();

        master.closeDoors();
        salesman.sell();

        master.openGate();
        salesman.sell();

    }
}

