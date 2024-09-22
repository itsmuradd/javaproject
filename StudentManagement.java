import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students;

    // Constructor to initialize the ArrayList
    public StudentManagement() {
        students = new ArrayList<>();
    }

    // Add a student to the list
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added: " + student);
    }

    // Remove a student by ID
    public void removeStudentById(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + " removed.");
    }

    // Display all students
    public void displayStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        // Create students
        Student student1 = new Student("tufan ali", 1);
        Student student2 = new Student("Ali Ahmed", 2);
        Student student3 = new Student("Emon Hasan", 3);

        // Add students to the management system
        management.addStudent(student1);
        management.addStudent(student2);
        management.addStudent(student3);

        // Display all students
        management.displayStudents();

        // Remove a student by ID
        management.removeStudentById(3);

        // Display students after removal
        management.displayStudents();
    }
}