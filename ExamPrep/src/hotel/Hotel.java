package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new ArrayList<>();
    }

    public void add(Person person){
        if(this.roster.size() < this.capacity){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        return roster.removeIf(person -> person.getName().equals(name));
    }

    public Person getPerson(String name, String hometown){
        return roster.stream()
                .filter(person -> person.getName().equals(name) && person.getHometown().equals(hometown))
                .findFirst()
                .orElse(null);
    }

    public int getCount(){
        return roster.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:%n", this.name));

        for (Person person : roster) {
            sb.append(String.format("%s%n", person.toString()));
        }

        return sb.toString();
    }
}
