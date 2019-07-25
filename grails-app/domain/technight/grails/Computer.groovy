package technight.grails

import technight.grails.validator.ComputerValidator

class Computer {

    String name
    Date introduced
    Date discontinued

    @Override
    String toString() {
        return name
    }
    static belongsTo = [company: Company]


    static constraints = {
        name nullable:true, unique: false, minSize: 3, maxSize: 50
        // brackets parenthesis and semi-columns are optional
        introduced nullable: false, validator: ComputerValidator.introduced

        discontinued nullable: false, validator: ComputerValidator.discontinued

    }
}
