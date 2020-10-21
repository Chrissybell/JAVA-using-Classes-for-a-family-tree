

import java.util.*;
import java.io.*;

public class FamilyTree {
    private Person person;
    private ArrayList<Person> list_of_persons;

    public FamilyTree(){
        person = null;
        list_of_persons = new ArrayList<Person>();
    }

    public void read (Scanner input) {
        int index = 0;
        input.useDelimiter("[^a-zA-Z']");
        String house;
        String name;
        String personName, motherName, fatherName;

        name = input.nextLine();
        house = input.nextLine();
//reads all the names that are in the tree until the relationships
        while (name.length() > 0 && !name.equals("(person,mother,father)")) {
            if(!in_list(name)){
                list_of_persons.add(new Person(name, house));
            }
            name = input.nextLine();
            house = input.nextLine();

        }

        name = house;

        //reads all relationships in the text file.
        while (name.length() > 0 && !name.equals("Finish")) {
            if (name.equals("-")) {
                name = input.nextLine();
                continue;
            }

            //gets the relationship status
            if(!in_list(name)){
                System.out.println("Wrong input");
                System.exit(1);
            } else{
                personName = name;
                motherName = input.nextLine();
                fatherName = input.nextLine();

                add_family_tree(personName, motherName, fatherName);
            }

            name = input.nextLine();

        }

    }

    public Boolean in_list(String name) {

        if (list_of_persons.isEmpty()) {
            return false;
        }

        for(Person person:list_of_persons) {
            if (person.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public Person getPerson(String name) {
        for(Person person:list_of_persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    // adds the family tree information of the person
    private void add_family_tree(String personName, String motherName, String fatherName) {

        Person p = getPerson(personName);
        if (!motherName.equals("Not known")) {
            Person mother = getPerson(motherName);

            if(mother == null){
                System.out.println("Wrong input for mother");
                System.exit(1);
            }

            p.setMother(mother);
            mother.addChildren(p);
        } else
            p.setMother(new Person("Not known", "Not known"));

        if (!fatherName.equals("Not known")) {
            Person father = getPerson(fatherName);

            if(father == null){
                System.out.println("Wrong input for father");
                System.exit(1);
            }

            p.setFather(father);
            father.addChildren(p);
        }else
            p.setFather(new Person("Not known", "Not known"));
    }
}








