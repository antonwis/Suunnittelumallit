package Strategy;

import java.util.Iterator;
import java.util.List;

public class OperationBreakAll implements ListConverter{

    @Override
    public String listToString(List list) {
        String returnString = "";
        Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()) {
            returnString += listIterator.next() + "\n";
        }
        return returnString;
    }
}
