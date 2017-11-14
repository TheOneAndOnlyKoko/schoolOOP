public class Student extends Person {
    int aweScore;
    Section studentSection;
    public Student(String firstName, String lastName, int aweScore, Section studentSection) {
        super(firstName, lastName);
        this.nextId++;
        this.studentId = nextId;
        this.aweScore = aweScore;
        this.studentSection = studentSection;
    }
}