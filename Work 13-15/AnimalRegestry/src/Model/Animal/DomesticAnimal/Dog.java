package Model.Animal.DomesticAnimal;

import Model.Animal.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Dog extends DomesticAnimal {
    public Dog(int id, String name, LocalDate birthDate, List<String> commands) {
        super("Dog", id, name, birthDate, commands);
    }

    // Дополнительные методы и свойства, специфичные для собак
}
