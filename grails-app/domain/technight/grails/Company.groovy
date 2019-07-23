package technight.grails

class Company {

    String name;

    static hasMany = [computers : Computer]

    static constraints = {
    }
}
