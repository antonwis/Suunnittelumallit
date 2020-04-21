package Builder;

public class Kokki {
    private Builder b;

    public void constructBurger() {
        b.buildJuusto();
        b.buildPihvi();
        b.buildTomaatti();
        b.buildSalaatti();
        b.buildSämpylä();
    }

    public void setBurgerBuilder(Builder b) {
        this.b = b;
    }

    public Object getBurger() {
        return b.getBurger();
    }
}
