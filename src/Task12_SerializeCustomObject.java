import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task12_SerializeCustomObject {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Merry",20));
        people.add(new Person("Jack",10));
        people.add(new Person("Jeniffer",50));

        serialize(people, "./person.ser");
        System.out.println(deserialize("./person.ser"));

    }

    static void serialize(List<Person> people, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(people);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static List<Person>  deserialize(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            return (List<Person> ) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name + " - " + age ;
    }
}