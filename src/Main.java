
import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args)  {
        Scanner console = new Scanner(System.in);
        // description of program
        System.out.println("Program reads a text file of family tree");
        System.out.println(" and displays the maternal line, paternal line, house, and children.");

        Scanner input = null;
        try {
            input = new Scanner(new File("textfile"));
            System.out.println("The file i'm using is in the src folder");
            FamilyTree family = new FamilyTree();
            family.read(input);
            input.close();

            // Continues running till user types exit
            String name = "Keep finding people";
            while(!name.equals("exit")) {
                System.out.println("Type a name to search or type 'exit' to end the program.");
                name = console.nextLine();   // reads the name or exit
                System.out.println();
                if (name.equalsIgnoreCase("exit")) break; //ends the program
                Person next = family.getPerson(name);
                if (next == null) {
                    System.out.println("No match.");
                } else {
                    show_House(next);
                    show_Maternal_Line(next);
                    show_Paternal_Line(next);
                    show_Children(next);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // method for obtaining the maternal line
    public static void show_Maternal_Line(Person person) {
        System.out.println("Maternal line: ");
        person = person.getMother();
        String name = person.getName();
        System.out.println(name + " of house: " + person.getHouse());
        System.out.println();
    }

    // method for obtaining the paternal line
    public static void show_Paternal_Line(Person person) {
        System.out.println("Paternal line: ");
        person = person.getFather();
        String name = person.getName();
        System.out.println(name + " of house: " + person.getHouse());
        System.out.println();
    }

    // method to show the each of each person
    public static void show_House(Person person){
        System.out.println("This person is a part of house : " + person.getHouse());
        System.out.println();
    }
    // method for obtaining the children of a person
    public static void show_Children(Person person) {
        System.out.println("Children:");
        if (person.numKids() == 0) {
            System.out.println("This person has no children");
        } else {
            for (int i = 0; i < person.numKids(); i++) {
                System.out.println(" " + person.nthKid(i).getName());
            }
            System.out.println();
        }
    }
}
