/**
 * Created by h205p2 on 9/29/17.
 */
public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.nextId++;
        this.studentId = nextId;
    }
}
