package animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    public String produceSound(){
        return "MEOW";
    }

}
