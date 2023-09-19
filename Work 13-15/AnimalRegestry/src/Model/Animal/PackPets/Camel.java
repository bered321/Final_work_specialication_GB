package Model.Animal.PackPets;

import Model.Animal.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimal {
    public Camel(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Верблюд", id, name, birthDate, commands);
        this.setName(name);
    }

}
