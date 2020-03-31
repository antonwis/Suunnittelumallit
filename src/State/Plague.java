package State;

public class Plague {

    private PlagueState state;

    public Plague(PlagueState state) {
        this.state = state;
    }

    public void setState(PlagueState state) {
        this.state = state;
    }

    public void evolve() {
        state.evolve(this);
    }

    public void spread() {
        state.spread(this);
    }

}
