package technight.grails;

import java.util.Date;

public abstract class ComputerValidator {

    static public boolean validateIntroducedValue(Computer computer, Date value) {
        return true;
    }

    static public boolean validateDiscontinuedValue(Computer computer, Date value){
        return true;
    }
}
