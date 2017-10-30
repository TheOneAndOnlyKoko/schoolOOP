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

    public void addStudent(String firstName, String lastName, int aweScore) {

        if (students.size() <= maxSize) {
            Student student = new Student(firstName, lastName, aweScore);
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
                System.out.println(students.get(i).firstName + " " + students.get(i).lastName);
                students.remove(i);
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

    public void getStudentById (int id, Section curr) {
        //return index for students array to return the first name and last name of the student you are trying to get
        for (int i = 0; i < curr.students.size(); i++) {
            if (curr.students.get(i).studentId == id) {
                System.out.println("You just removed " + curr.students.get(i).firstName + " " + curr.students.get(i).lastName + " from " + curr.name + " class.");
            }
        }
    }
}
