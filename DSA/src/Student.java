/**
 * Tao class Student.
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Khai bao.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
        this.group = "K62CB";
    }

    /**
     * Khai bao.
     * @param name la ten cua sinh vien.
     * @param id la mssv cua sinh vien.
     * @param email la email cua sinh vien.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * Khai bao.
     * @param s la mot object thuoc lop sinh vien
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {

        return name + " - " + id + " - " + group + " - " + email;
    }

    public static void main(String[] argv) {

    }
}
