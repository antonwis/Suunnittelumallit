package Builder.Osat;

public class Juusto implements Osa {
    private String name;
    public Juusto(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}
