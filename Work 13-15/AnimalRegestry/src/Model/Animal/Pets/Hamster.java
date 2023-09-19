package Model.Animal.Pets;

import Model.Animal.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Hamster extends DomesticAnimal {
    public Hamster(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Хомяк", id, name, birthDate, commands);
        this.setName(name);
    }

}
