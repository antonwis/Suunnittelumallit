package Adapter;

public class ModifiedAdapter implements BinaryAdapter{
    private Luku l;
    public ModifiedAdapter(Luku l) { this.l = l; }
    @Override
    public String convert() { return Integer.toBinaryString(l.getI()); }
}
