package technight.grails

class Computer {

    String name;
    Date introduced;
    Date discontinued;

    static belongsTo = [company : Company]


    static constraints = {

    }
}
