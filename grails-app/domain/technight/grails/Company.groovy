package technight.grails

class Company {

    String name;

    @Override
    String toString() {
        return name
    }
    static hasMany = [computers: Computer]

    static constraints = {
        name ([ unique: true, nullable: false, minSize: 2, maxSize: 50 ]);
        //brackets and parenthesis are optional
    }
}
