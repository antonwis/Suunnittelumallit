package Strategy;

import java.util.List;

public class OperationBreakTwo implements ListConverter {
    @Override
    public String listToString(List list) {
        String returnString = "";
        int counter = 0;
        for(Object s : list) {
            if(counter % 2 == 0) returnString += "\n";
            returnString = returnString + " " + s;
            counter++;
        }
        return returnString;
    }
}
