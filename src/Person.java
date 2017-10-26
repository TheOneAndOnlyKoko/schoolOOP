/**
 * Created by h205p2 on 9/29/17.
 */
public class Person {
    String firstName;
    String lastName;
    static int nextId = 0;
    int studentId = 0;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nextId++;
        this.studentId = nextId;
    }
}

