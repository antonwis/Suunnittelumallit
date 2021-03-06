package State;

public class Epidemic implements PlagueState {
    private long bodyCount;

    public Epidemic(long bodyCount) {
        this.bodyCount = bodyCount;
    }

    @Override
    public void spread(Plague plague) {
        bodyCount = bodyCount * 2;
        System.out.println(bodyCount + " people infected.");
        if(checkUpgradeCriteria()) {
            plague.evolve();
        }
    }

    @Override
    public void evolve(Plague plague) {
        System.out.println("Plague has turned into a pandemic!");
        plague.setState(new Pandemic(bodyCount));

    }

    @Override
    public boolean checkUpgradeCriteria() { return bodyCount >= 5000; }

    @Override
    public boolean genocide() { return false; }
}
