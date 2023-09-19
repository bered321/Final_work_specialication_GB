package Model.Animal.PackPets;

import Model.Animal.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Horse extends PackAnimal {
    public Horse(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Лошадь", id, name, birthDate, commands);
        this.setName(name);
    }

}
