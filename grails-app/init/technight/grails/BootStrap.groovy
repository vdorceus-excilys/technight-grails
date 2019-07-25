package technight.grails

class BootStrap {

    def init = { servletContext ->

        def companies = []
        Company asus = new Company(name: "Asus")
        companies.add(asus)

        Company dell = new Company(name: "Dell")
        companies.add(dell)

        Company lenovo = new Company(name: "Lenovo")
        companies.add(lenovo)

        Company hp = new Company(name: "HP")
        companies.add(hp)

        companies.each {company -> company.save(flush:true, failOnError:true)}

        def computers =[]
        Computer asus1 = new Computer(name: "ROG", company: asus)
        computers.add(asus1)

        Computer dell2 = new Computer(name: "LATITUDE", company: dell)
        computers.add(dell2)

        Computer lenovo3 = new Computer(name: "THINKPAD", company: lenovo)
        computers.add(lenovo3)

        Computer hp4 = new Computer(name: "ENVY", company: hp)
        computers.add(hp4)

        computers.each {computer -> computer.save(flush:true, failOnError: true)}

    }
    def destroy = {
    }
}
