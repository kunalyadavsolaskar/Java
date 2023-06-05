//Write a Java program that uses stream api to perform operations on a large data set,
//such as sorting or filtering the data.

package ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
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
}

public class StreamAPIDemo {
    public static void main(String[] args) {
        // Creating a large data set of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("kunal", 25));
        people.add(new Person("Akhil", 32));
        people.add(new Person("shree", 37));
        people.add(new Person("nitin", 28));
        

        // Sorting the data by age in ascending order
        List<Person> sortedByAge = people.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toList());

        System.out.println("Sorted by age in ascending order:");
        for (Person person : sortedByAge) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        // Filtering the data to get people above a certain age
        int ageThreshold = 30;
        List<Person> aboveAgeThreshold = people.stream()
                .filter(person -> person.getAge() > ageThreshold)
                .collect(Collectors.toList());

        System.out.println("\nPeople above age " + ageThreshold + ":");
        for (Person person : aboveAgeThreshold) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
