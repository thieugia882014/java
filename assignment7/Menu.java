package assignment7;

public interface Menu {
    void addStudent(int id, String name, int age, String address, float gpa);
    void editStudent(int id);
    void deleteStudent(int id);
    void sortStudentGPA();
    void sortStudentName();
    void showStudent();
    void exit();
}
