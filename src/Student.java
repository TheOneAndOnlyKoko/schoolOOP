/**
 * Created by h205p2 on 9/29/17.
 */
public class Student extends Person {
    int aweScore;
    public Student(String firstName, String lastName, int aweScore) {
        super(firstName, lastName);
        this.nextId++;
        this.studentId = nextId;
        this.aweScore = aweScore;
    }
}
