package State;

public class Pandemic implements PlagueState {
    private long bodyCount;
    private long maxCasualties = (long) Math.pow(999999999, 2);

    public Pandemic(long bodyCount) {
        this.bodyCount = bodyCount;
    }

    @Override
    public void spread(Plague plague) {
        bodyCount = (long) Math.pow(bodyCount, 2);
        System.out.println(bodyCount + " people infected.");
        if(checkUpgradeCriteria()) {
            plague.evolve();
        }
    }

    @Override
    public void evolve(Plague plague) {
        System.out.println("Next stop: Space!");

    }

    @Override
    public boolean checkUpgradeCriteria() {
        if(bodyCount >= maxCasualties) return true;
        else return false;
    }
}
