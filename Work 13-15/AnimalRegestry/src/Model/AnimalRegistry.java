package Model;

import Model.Animal.Animal;
import Model.Animal.PackPets.Camel;
import Model.Animal.PackPets.Donkey;
import Model.Animal.PackPets.Horse;
import Model.Animal.Pets.Cat;
import Model.Animal.Pets.Dog;
import Model.Animal.Pets.Hamster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animalList;

    private int nextId = 1;
    private int getNextId() {
        int id = nextId;
        nextId++;
        return id;
    }

    public AnimalRegistry() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public Animal createAnimal(String type, String name, LocalDate birthDate, List<String> commands) {
        Animal animal = null;

        if (type.equalsIgnoreCase("Кот")) {
            animal = new Cat(type, getNextId(), name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Собака")) {
            animal = new Dog(type, getNextId(), name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Хомяк")) {
            animal = new Hamster(type, getNextId(), name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Верблюд")) {
            animal = new Camel(type, getNextId(), name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Лошадь")) {
            animal = new Horse(type, getNextId(), name, birthDate, commands);
        } else if (type.equalsIgnoreCase("Обезьяна")) {
            animal = new Donkey(type, getNextId(), name, birthDate, commands);
        }

        if (animal != null) {
            addAnimal(animal);
        }

        return animal;
    }

    public boolean addCommandsToAnimal(int animalId, List<String> commands) {
        for (Animal animal : animalList) {
            if (animal.getId() == animalId) {
                animal.addCommands(commands);
                return true;
            }
        }
        return false;
    }

    public List<String> getCommandsByAnimalId(int animalId) {
        for (Animal animal : animalList) {
            if (animal.getId() == animalId) {
                return animal.getCommands();
            }
        }
        return null;
    }

    public List<Animal> filterAnimalsByType(String type) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal.getTypeOfAnimal().equalsIgnoreCase(type)) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public List<Animal> filterAnimalsByBirthDate(LocalDate startDate, LocalDate endDate) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            LocalDate birthDate = animal.getBirthDate();
            if (birthDate.isEqual(startDate) || (birthDate.isAfter(startDate) && birthDate.isBefore(endDate))) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public List<Animal> getAllAnimals() {
        return animalList;
    }
}
