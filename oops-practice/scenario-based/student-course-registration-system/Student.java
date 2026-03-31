import java.util.ArrayList;

class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String message) {
        super(message);
    }
}

class Student extends Person {
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> grades = new ArrayList<>();

    public Student(int id, String name) {
        super(id, name);

        System.out.println("Student Registered:");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println();
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }
}
