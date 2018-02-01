public class School {

    public static void main(String[] args) {

        // create student
        Student student = new Student();
        student.setFirstName("Wojciech");
        student.setLastName("Jeziorski");
        student.setStudentId(8);

        // create teacher
        Teacher teacher = new Teacher();
        teacher.setFirstName("Agata");
        teacher.setLastName("Chytry");
        teacher.setTeacherId(1);

        student.show();

        teacher.show();
    }
}
