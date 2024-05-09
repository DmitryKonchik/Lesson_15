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
    }
}