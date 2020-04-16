package Visitor;

public interface Visitor {

    void visit(Outbreak outbreak);
    void visit(Epidemic epidemic);
    void visit(Pandemic pandemic);

}
