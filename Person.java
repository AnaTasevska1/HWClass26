package HWClass26;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    private String name, lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void details(){
        System.out.println("User details: "+name+" "+lastName+" "+age+" "+salary);
    }
}
class TestClass {
    public static void main(String[] args) {

        Map<Integer, Person> users = new TreeMap<>();
        Person user1 = new Person("Niko", "Lee", 30, 1000.0);
        Person user2 = new Person("Kiko", "Tas", 18, 2000.0);
        Person user3 = new Person("Nela", "John", 50, 8000.0);

        users.put(758, user1);
        users.put(123, user2);
        users.put(954, user3);

      //  for (var p : users.entrySet()) {
       //     System.out.println("User ID: " + p.getKey());
       //     p.getValue().details();
        for (Person person : users.values()) {
            person.details();
        }
    }
    }


/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
