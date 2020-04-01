package State;

public interface PlagueState {
    public void spread(Plague plague);
    public void evolve(Plague plague);
    public boolean checkUpgradeCriteria();
    public boolean genocide();
}
