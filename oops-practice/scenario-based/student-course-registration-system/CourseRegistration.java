class CourseRegistration extends RegistrationService {

    private static final int MAX_COURSES = 3;

    @Override
    void enrollCourse(Student student, String course)
            throws CourseLimitExceededException {

        if (student.getCourses().size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Maximum course limit reached");
        }

        student.getCourses().add(course);
        student.getGrades().add("Not Assigned");

        System.out.println("Course Enrolled: " + course);
    }

    @Override
    void dropCourse(Student student, String course) {
        int index = student.getCourses().indexOf(course);

        if (index != -1) {
            student.getCourses().remove(index);
            student.getGrades().remove(index);
            System.out.println("Course Dropped: " + course);
        } else {
            System.out.println("Course not found");
        }
    }

    @Override
    void viewGrades(Student student) {
        System.out.println("----- Grades -----");
        for (int i = 0; i < student.getCourses().size(); i++) {
            System.out.println(
                    student.getCourses().get(i) + " : " +
                            student.getGrades().get(i)
            );
        }
        System.out.println();
    }
}
