
import java.util.*;

public class Person {

    private String name;
    private String house;
    private Person mother;
    private Person father;
    private ArrayList<Person> children;


    /** Creates a new Person
     * @param name and house */
    public Person(String name, String house1)
    {
        this.house = house1;
        this.name = name;
        this.mother = null;
        this.father = null;
        this.children = null;
    }

    public void setMother(Person mother){
        this.mother = mother;
    }

    public void setFather(Person father){
        this.father = father;
    }

    public void addChildren(Person child) {
        if (children == null) {
            children = new ArrayList<Person>();
        }
        children.add(child);
    }


    public ArrayList<Person> getChildren(){
        return this.children;
    }

    public int numKids(){
        if(children == null){
            return 0;
        }
        return children.size();
    }
    //counts how many children there are
    public Person nthKid(int childNumber) {
        if(children == null){
            return null;
        }
        return children.get(childNumber);
    }

    public Person getMother(){
        return this.mother;
    }

    public Person getFather(){
        return this.father;
    }

    public String getName(){
        return name;
    }
    public String getHouse(){
        return this.house;
    }
}
