package Model.Animal;

import java.time.LocalDate;
import java.util.List;

public class DomesticAnimal extends Animal {

    public DomesticAnimal(String typeOfAnimal, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Domestic animal", typeOfAnimal, id, name, birthDate, commands);

        if (DomesticAnimalTypes.listOfDomesticAnimal.contains(typeOfAnimal)) {
            setKindOfAnimal("Domestic animal");
        }
    }
}


