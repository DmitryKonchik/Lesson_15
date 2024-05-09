import java.util.*;

public class Main {
    public static void main(String[] args) {

//        First task
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbers = line.split(",");
        Set<String> listOfNumber = new HashSet<>();

        for (String s : numbers) {
            listOfNumber.add(s.replaceAll("\\s*",""));
        }
        System.out.println(listOfNumber);

    }
}