import java.util.*;

public class Main {
    public static void main(String[] args) {

//        First task
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbers = line.split(",");
        Set<String> listOfNumber = new HashSet<>();

        for (String s : numbers) {
            listOfNumber.add(s.replaceAll("\\s*", ""));
        }
        System.out.println(listOfNumber);

//        Second Task
        AnimalNameList animalNameList = new AnimalNameList();

        animalNameList.addAnimalName("1");
        animalNameList.addAnimalName("2");
        animalNameList.addAnimalName("3");
        animalNameList.addAnimalName("4");
        animalNameList.addAnimalName("5");
        animalNameList.removeAnimalName();
        animalNameList.removeAnimalName();
        animalNameList.removeAnimalName();
        animalNameList.printAnimalName();


//        Third task

        Student student1 = new Student("Bob", "c2", 2, new int[]{3, 5, 6, 7});
        Student student2 = new Student("Bob1", "c3", 1, new int[]{3, 5, 6, 7});
        Student student3 = new Student("Bob2", "c3", 4, new int[]{1, 2, 1, 1});
        Student student4 = new Student("Bob3", "c4", 5, new int[]{3, 5, 4, 7});
        Student student5 = new Student("Bob4", "c4", 3, new int[]{3, 2, 2, 1});
        Student student6 = new Student("Bob5", "c6", 3, new int[]{1, 2, 2, 1});

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.printStudent();
        university.removeBedStudents();
        System.out.println();
        university.printStudent();
    }
}