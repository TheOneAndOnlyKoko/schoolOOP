import java.util.ArrayList;

/**
 * Created by h205p2 on 9/29/17.
 */

public class Section {
    Teacher teacher;
    String name;
    int maxSize;
    int currentSize;
    Student student;
    ArrayList<Student> students = new ArrayList<Student>();

    public Section (String name, int maxSize, String firstName, String lastName) {
        this.name = name;
        this.maxSize = maxSize;
        this.currentSize = students.size();
        this.teacher = new Teacher(firstName, lastName);
    }

    public void addStudent(String firstName, String lastName) {

        if (students.size() <= maxSize) {
            Student student = new Student(firstName, lastName);
            students.add(student);
            sectionSeatsRemaining();
        }
        else {
            sectionSeatsRemaining();
        }
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId == id) {
                students.remove(i);
                System.out.println(students.get(i).firstName + " " + students.get(i).lastName);
            }
        }
    }

    public void sectionSeatsRemaining() {
        if (students.size() <= maxSize) {
            System.out.println(maxSize - students.size());
        }
        else {
            System.out.println("Class is full.");
        }
    }
}
