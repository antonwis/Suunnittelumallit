package Adapter;

public class Main {

    public static void main(String[] args) {
        BinaryAdapter adapter = new ModifiedAdapter(new Luku(13501488));
        System.out.println(adapter.convert());
    }
}