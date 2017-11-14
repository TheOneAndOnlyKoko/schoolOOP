import java.util.*;



public class Runner {

    public static ArrayList<Student> allStudents = new ArrayList<Student>();
    public static ArrayList<Section> allSections = new ArrayList<Section>();

    public static String teacherFirstMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the first name of the this class's teacher be?");
        String a = sc.next();
        return a;
    }

    public static void printRoster() {
        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println((i+1) + ": " + allStudents.get(i).firstName + " " + allStudents.get(i).lastName + ", Section: " + allStudents.get(i).studentSection.name);
        }
    }

    public static void search(String firstName, String lastName) {
        int count = 0;
        for (int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).firstName == firstName && allStudents.get(i).lastName == lastName) {
                count++;
                System.out.println(count + ": " + firstName + " " + lastName + " is in " + allStudents.get(i).studentSection.name + " class.");
            }
        }
    }

    public static String teacherLastMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the last name of the this class's teacher be?");
        String a = sc.next();
        return a;
    }

    public static String studentFirstMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this students first name?");
        String k = sc.next();
        return k;
    }

    public static String studentLastMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this students last name?");
        String k = sc.next();
        return k;
    }

    public static void classCreator () {
        Scanner sc = new Scanner(System.in);
        System.out.println("What subject does this class teach? (Ex: Calculus)");
        String c = sc.next();
        System.out.println("What is the max number of students that can be in this class? (Ex: 30)");
        int d = sc.nextInt();
        String f = teacherFirstMethod();
        String g = teacherLastMethod();
        Section A = new Section (c, d, f, g);
        System.out.println("Here is what we have so far: Name = " + A.name + ", Max Size = " + A.maxSize + ", Teacher = " + A.teacher.firstName + " " + A.teacher.lastName + ".");
        System.out.println("How many students would you like to add to this class? (Don't exceed your max size!)");
        int h = 0;
        if (sc.hasNextInt()) {
            h = (sc.nextInt());
        }
        if (!sc.hasNextInt()) {
            System.out.println("Error: You did not enter an integer. Please try again");
            System.out.println("How many students would you like to add to this class? (Don't exceed your max size!)");
            if (sc.hasNextInt()) {
                h = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            System.out.println(" ");
            System.out.println("Student number " + (i+1) + " out of " + h + ".");
            System.out.println(" ");
            String k = studentFirstMethod();
            String l = studentLastMethod();
            System.out.println("How awesome is this student? (scale of 1-10 and make sure it is an integer)");
            int m = 0;
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            }
            int n = 0;
            if (!sc.hasNextInt()) {
                System.out.println("Error: You did not enter an integer. Please try again");
                System.out.println("How awesome is this student? (scale of 1-10 and make sure it is an integer)");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }
            }
            A.addStudent(k, l, (m+n), A);
            allStudents.add(A.students.get(i));
        }
        allSections.add(A);
    }

    public static void main(String[] args) {

        System.out.println("Hello new user. What is your name?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a + ", you are the principal of a new school. You need to build this school from the ground up.");
        System.out.println("How many classes would you like to create? (enter an integer and make sure not to add any letters or spaces)");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
            System.out.println(b + " b");
        }
        else {
            System.out.println("Error: You did not enter an integer. Please try again");
            System.out.println("How many classes would you like to create? (enter an integer and make sure not to add any letters or spaces)");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                System.out.println(b + " b");

            }
        }
        for (int i = 1; i < (b+1); i++){
            classCreator();
        }
        System.out.println("Please enter the number of a student that you would like removed because the school is overflowing. Here is the roster of the school.");
        printRoster();
        int c = (sc.nextInt()-1);
        allStudents.get(c).studentSection.removeStudent(allStudents.get(c).firstName, allStudents.get(c).lastName);
        allStudents.remove(c);
        System.out.println("Enter the name of a student that you would like to search");
        String d = studentFirstMethod();
        String e = studentLastMethod();
        search(d, e);
    }
}
