package Model.Animal;

import Model.Animal.PackPets.PackAnimalTypes;

import java.time.LocalDate;
import java.util.List;

public class PackAnimal extends Animal {
    public PackAnimal(String typeOfAnimal, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Вьючное животное", typeOfAnimal, id, name, birthDate, commands);

        if (PackAnimalTypes.listOfPackAnimal.contains(typeOfAnimal)) {
            setKindOfAnimal("Вьючное животное");
        }
    }
}

