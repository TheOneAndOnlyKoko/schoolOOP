import java.util.*;


public class Runner {

    public static void main(String[] args) {
        /*System.out.println("Hello user. What is your name?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a + " is a very nice name.");

        System.out.println("Hello " + a +"! should we make a new Section? (yes or no)");
        String b = sc.next();
        Section A = null;
        switch (b) {
            case "yes": A = new Section("Math 1", 30, "Harrison", "Ford");
            break;
            case "no": System.out.println("Too bad");
                A = new Section("Math 1", 30, "Harrison", "Ford");
            break;
        }
        System.out.println("Now that we created a new Section, we need to create students to put into that class. How many students would you like to add (Remember it needs to be smaller than 30)?");
        int c = sc.nextInt();
        for (int i = 1; i <= c; i++) {
            System.out.println("What is the first name of the student you would like to add?");
            String c1 = sc.next();
            System.out.println("What is the last name of the student you would like to add?");
            String c2 = sc.next();
            System.out.println(c1);
            System.out.println(c2);
            A.addStudent(c1, c2);
        }
        for (int i = 0; i < c; i++) {
            System.out.println("Student number " + (i+1) + ". " + "Student name: " + A.students.get(i).firstName + " " + A.students.get(i).lastName);
        }
        System.out.println("Great. You completed a section and you filled it with all the students listed above.");
        System.out.println("Lets see the section we created");
        System.out.println("Name: " + A.name + ", Maximum Size: " + A.maxSize + ", Teacher: " + A.teacher.firstName + " " + A.teacher.lastName);
        System.out.println("Great now that we have created a section with a teacher and students, you will need to try this yourself. What is the Section name?");
        String d = sc.next();
        System.out.println("What is the Maximum Class Size?");
        int e = sc.nextInt();
        System.out.println("What will the teacher of this section first name?");
        String f = sc.next();
        System.out.println("What will be the last name?");
        String g = sc.next();
        Section C = new Section(d, e, f, g);
        System.out.println("Lets see what you have so far.");
        System.out.println("Name: " + C.name + ", Maximum Size: " + C.maxSize + ", Teacher: " + C.teacher.firstName + " " + C.teacher.lastName);
        System.out.println("We have not added any students. How many students would you like to add to the class (remember that you cannot add more students than your max size)?");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {
            System.out.println("What is the first name of the student you would like to add?");
            String j = sc.next();
            System.out.println(j + "  first name");
            System.out.println("What is the last name of the student you would like to add?");
            String k = sc.next();
            System.out.println(k + "  last name");
            C.addStudent(j, k);
        }
        for (int i = 0; i <= h; i++) {
            System.out.println("Student number " + (i+1) + "." + " There name is " + C.students.get(i).firstName + " " + C.students.get(i).lastName);
        }
        System.out.println("Great. You completed a section and you filled it with all the students listed above.");
        System.out.println("Lets let the class run its course.");
        System.out.println("We realized that the class is over flowing with students. We need to remove one. Below is the class roster.");
        for (int i = 0; i < C.students.size(); i++) {
            System.out.println(C.students.get(i).firstName + " " + C.students.get(i).lastName + ", " + C.students.get(i).studentId);
        }
        System.out.println(" ");
        System.out.println("Enter the exact id on the next line.");
        int l = sc.nextInt();
        C.removeStudent(l);*/
        System.out.println("Hello new user. What is your name?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a + ", you are the principal of a new school. You need to build this school from the ground up.");
        System.out.println("How many classes would you like to create? (enter an integer and make sure not to add any letters or spaces)");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        else {
            System.out.println("Error: You did not enter an integer. Please try again");
            System.out.println("How many classes would you like to create? (enter an integer and make sure not to add any letters or spaces)");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
            }
        }
        for (int i = 0; i < b; i++); {
            System.out.println("What subject does this class teach? (Ex: Calculus)");
            String c = sc.next();
            System.out.println("What is the max number of students that can be in this class? (Ex: 30)");
            int d = 0;
            if (sc.hasNextInt()) {
                d = sc.nextInt();
            }
            else {
                System.out.println("Error: You did not enter an integer. Please try again");
                System.out.println("How many classes would you like to create? (enter an integer and make sure not to add any letters or spaces)");
                if (sc.hasNextInt()) {
                    d = sc.nextInt();
                }
            }

            Section[] sectionList = new Section()
        }
    }
}
