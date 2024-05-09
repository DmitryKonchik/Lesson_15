import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeBedStudents() {
        for (int i = students.size() - 1; i >= 0; i--) {
            double averageScore = 0;
            int countOfMarks = 0;
            for (int m : students.get(i).getMarks()) {
                averageScore += m;
                countOfMarks++;
            }
            averageScore = averageScore / countOfMarks;
            if (averageScore < 3) {
                students.remove(students.get(i));
            } else {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }
    }

    public void printStudent(int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }

    public void printStudent() {
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
