package Builder;

public class McDonalds implements Builder {

    private StringBuilder s = new StringBuilder();

    @Override
    public void buildJuusto() { s.append("Juusto").append(", "); }

    @Override
    public void buildPihvi() { s.append("Pihvi").append(", "); }

    @Override
    public void buildSalaatti() { s.append("Salaatti").append(", "); }

    @Override
    public void buildSämpylä() { s.append("Sämpylä").append(", "); }

    @Override
    public void buildTomaatti() { s.append("Tomaatti").append(", "); }

    @Override
    public Object getBurger() { return s; }
}
