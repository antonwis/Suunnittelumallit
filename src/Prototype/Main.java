package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowKello shallowKello = new ShallowKello("Shallow kello");
        new Thread(shallowKello).start();
        ShallowKello shallowClone = (ShallowKello) shallowKello.clone();
        shallowClone.setNimi("Shallow clone");
        new Thread(shallowClone).start();
        shallowClone.setTime(13,50,0); // Aika vaihtuu molemmissa

        DeepKello deepKello = new DeepKello("Deep kello");
        new Thread(deepKello).start();
        DeepKello deepClone = (DeepKello) deepKello.clone();
        deepClone.setNimi("Deep clone");
        new Thread(deepClone).start();
        deepClone.setTime(5,15,0); // Aika vaihtuu vain toisessa.
    }
}
