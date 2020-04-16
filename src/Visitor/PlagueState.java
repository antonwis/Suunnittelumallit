package Visitor;

public interface PlagueState {
    public void spread(Plague plague);
    public void evolve(Plague plague);
    public boolean checkUpgradeCriteria();
    public boolean genocide();
    void accept(Visitor visitor);
    void bonusSpread(long bodycount);
}
