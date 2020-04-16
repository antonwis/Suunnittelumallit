package Visitor;

public class PlagueVisitor implements Visitor {

    @Override
    public void visit(Outbreak outbreak) {
        outbreak.bonusSpread(50);
    }

    @Override
    public void visit(Epidemic epidemic) {
        epidemic.bonusSpread(500);
    }

    @Override
    public void visit(Pandemic pandemic) {
        pandemic.bonusSpread(5000);
    }
}
