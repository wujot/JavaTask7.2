public class Teacher extends Human{
    private int teacherId;

    public Teacher() {}

    public Teacher(String firstName, String lastName, int teacherId) {
        super(firstName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" " + getTeacherId() + "\n");
    }
}
