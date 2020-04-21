package Builder.Osat;

public class Pihvi implements Osa {
    private String name;
    public Pihvi(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}
