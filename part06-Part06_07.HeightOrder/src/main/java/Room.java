/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotabe
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    // Add a person to the room
    public void add(Person person) {
        this.persons.add(person);
    }

    // Check if the room is empty
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    // Get the list of persons in the room
    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    // Find the shortest person in the room without removing them
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    // Take the shortest person (remove them from the room)
    public Person take() {
        Person shortestPerson = this.shortest();
        if (shortestPerson != null) {
            this.persons.remove(shortestPerson);
        }
        return shortestPerson;
    }
}
