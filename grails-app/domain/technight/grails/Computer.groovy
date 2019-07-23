package technight.grails

class Computer {

    String name;
    Date introduced;
    Date discontinued;

    static belongsTo = [company : Company]


    static constraints = {
        name nullable:true, unique: false, minSize: 3, maxSize: 50
        // brackets parenthesis and semi-columns are optional
        introduced nullable: false, validator: {val, obj -> ComputerValidator.validateIntroducedValue(obj, val)}

        discontinued nullable: false, validator: {val, obj -> ComputerValidator.validateDiscontinuedValue(obj, val)}


    }
}
