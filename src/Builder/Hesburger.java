package Builder;

import Builder.Osat.*;
import java.util.ArrayList;
import java.util.List;

public class Hesburger implements Builder {

    List<Object> l = new ArrayList<>();

    @Override
    public void buildJuusto() { l.add(new Juusto("Juusto")); }

    @Override
    public void buildPihvi() { l.add(new Pihvi("Pihvi")); }

    @Override
    public void buildSalaatti() { l.add(new Salaatti("Salaatti")); }

    @Override
    public void buildSämpylä() { l.add(new Sämpylä("Sämpylä")); }

    @Override
    public void buildTomaatti() { l.add(new Tomaatti("Tomaatti")); }

    @Override
    public Object getBurger() { return l; }
}
