public class Teacher {
    private String firstName;
    private String lastName;
    private int teacherId;

    public Teacher() {}

    public Teacher(String firstName, String lastName, int teacherId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void show() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getTeacherId());
    }
}
