package Model.Animal;

import java.time.LocalDate;
import java.util.List;

public class PackAnimal extends Animal {
    public PackAnimal(String typeOfAnimal, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Pack animal", typeOfAnimal, id, name, birthDate, commands);

        if (PackAnimalTypes.listOfPackAnimal.contains(typeOfAnimal)) {
            setKindOfAnimal("Pack animal");
        }
    }
}

