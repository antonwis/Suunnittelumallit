package Prototype;

public interface Viisari {
    void  tick();
    int getArvo();
    void setArvo(int a);
    Object clone() throws CloneNotSupportedException;
}
