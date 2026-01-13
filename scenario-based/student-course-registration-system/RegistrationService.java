abstract class RegistrationService {
    abstract void enrollCourse(Student student, String course)
            throws CourseLimitExceededException;

    abstract void dropCourse(Student student, String course);

    abstract void viewGrades(Student student);
}
