public class StudentCourseApp {
    public static void main(String[] args) {

        Student student = new Student(101, "Dheeraj");

        RegistrationService service = new CourseRegistration();

        try {
            service.enrollCourse(student, "Java");
            service.enrollCourse(student, "DBMS");
            service.enrollCourse(student, "Operating Systems");
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        service.viewGrades(student);

        service.dropCourse(student, "DBMS");

        service.viewGrades(student);
    }
}
