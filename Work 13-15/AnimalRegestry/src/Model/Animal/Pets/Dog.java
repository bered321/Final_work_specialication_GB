package Model.Animal.Pets;

import Model.Animal.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Dog extends DomesticAnimal {
    public Dog(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Собака", id, name, birthDate, commands);
        this.setName(name);
    }

}
