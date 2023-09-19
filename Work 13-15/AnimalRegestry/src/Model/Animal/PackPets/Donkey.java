package Model.Animal.PackPets;

import Model.Animal.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimal {
    public Donkey(String type, int id, String name, LocalDate birthDate, List<String> commands) {
        super("Обезьяна", id, name, birthDate, commands);
        this.setName(name);
    }

}
