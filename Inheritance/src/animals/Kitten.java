package animals;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    public String produceSound(){
        return "Meow";
    }


}
