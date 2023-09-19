package Model.Animal.Pets;

import Model.Animal.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Cat extends DomesticAnimal {
    public Cat(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Кот", id, name, birthDate, commands);
        this.setName(name);
    }

}
