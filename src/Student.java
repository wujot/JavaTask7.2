public class Student extends Human {
    private int studentId;

    public Student() {}

    public Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" " + getStudentId() + "\n");
    }
}

