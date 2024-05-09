import java.util.LinkedList;
import java.util.List;

public class AnimalNameList {

    private List<String> animalName = new LinkedList<>();

    public void addAnimalName(String name) {
        animalName.add(0, name);
    }

    public void removeAnimalName() {
        animalName.remove(animalName.size() - 1);
    }

    public void printAnimalName() {
        System.out.println(animalName);
    }
}
