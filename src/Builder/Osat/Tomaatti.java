package Builder.Osat;

public class Tomaatti implements Osa {
    private String name;
    public Tomaatti(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}
