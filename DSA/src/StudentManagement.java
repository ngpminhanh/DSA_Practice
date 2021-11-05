import java.util.Locale;

/**
 * Tao class StudentManagement.
 */

public class StudentManagement {
    Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equalsIgnoreCase(s2.getGroup());
    }

    /**
     * Them object vao array students.
     * @param newStudent la object thuoc class Student.
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * Xep sinh vien theo lop.
     * @return String la sap xep danh sach sinh vien theo lop.
     */
    public String studentsByGroup() {
        StringBuilder sbg = new StringBuilder();
        String[] array = new String[100];
        array[0] = students[0].getGroup();
        int groups = 1;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            int found = 0;

            for (int j = 0; j < groups; j++) {
                if (students[i].getGroup().equalsIgnoreCase(students[j].getGroup())) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                array[groups] = students[i].getGroup();
                groups++;
            }
        }

        for (int j = 0; j < groups; j++) {
                sbg.append(array[j].toUpperCase()).append("\n");

                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        break;
                    }
                    if (students[i].getGroup().equalsIgnoreCase(array[j])) {
                        sbg.append(students[i].getInfo()).append("\n");
                    }
                }
            }
            return sbg.toString();

    }

    /**
     * Loai object ra khoi array students.
     * @param id la mssv cua object ay.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < students.length; j++) {
                    students[j] = students[j + 1];
                    if (students[j] == null) {
                        break;
                    }
                }
            }
         }
    }

    public static void main(String[] args) {

    }




}




