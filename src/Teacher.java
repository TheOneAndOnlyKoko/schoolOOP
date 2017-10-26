/**
 * Created by h205p2 on 9/29/17.
 */
public class Teacher extends Person {
    static int teacherId = 0;
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        this.nextId++;
        this.teacherId = nextId;
    }
}
