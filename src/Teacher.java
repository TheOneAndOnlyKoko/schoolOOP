public class Teacher extends Person {
    static int teacherId = 0;
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        this.nextId++;
        this.teacherId = nextId;
    }
}
