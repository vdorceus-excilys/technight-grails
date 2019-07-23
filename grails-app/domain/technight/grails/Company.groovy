package technight.grails

class Company {

    String name;

    static hasMany = [computers : Computer]

    static constraints = {
        name ([ unique: true, nullable: false, minSize: 3, maxSize: 50 ]);
        //brackets and parenthesis are optional
    }
}
