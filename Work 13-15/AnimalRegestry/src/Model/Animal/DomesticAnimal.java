package Model.Animal;

import Model.Animal.Pets.DomesticAnimalTypes;

import java.time.LocalDate;
import java.util.List;

public class DomesticAnimal extends Animal {

    public DomesticAnimal(String typeOfAnimal, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Домашнее животное", typeOfAnimal, id, name, birthDate, commands);

        if (DomesticAnimalTypes.listOfDomesticAnimal.contains(typeOfAnimal)) {
            setKindOfAnimal("Домашнее животное");
        }
    }
}


