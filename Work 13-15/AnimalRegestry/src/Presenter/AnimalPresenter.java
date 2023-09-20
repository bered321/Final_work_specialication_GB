package Presenter;

import Model.Animal.Animal;
import Model.AnimalRegistry;

import java.time.LocalDate;
import java.util.List;

public class AnimalPresenter {
    private AnimalRegistry animalRegistry;

    public AnimalPresenter(AnimalRegistry animalRegistry) {
        this.animalRegistry = animalRegistry;
    }

    public Animal createAnimal(String type, String name, LocalDate birthDate, List<String> commands) {
        try {
            Animal animal = animalRegistry.createAnimal(type, name, birthDate, commands);
            if (animal != null) {
                System.out.println("Успешно создано новое животное!");
            } else {
                System.err.println("Ошибка при создании животного.");
            }
            return animal;
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return null;
        }
    }

    public boolean addCommandsToAnimal(int animalId, List<String> commands) {
        try {
            boolean success = animalRegistry.addCommandsToAnimal(animalId, commands);
            System.out.println("Команды успешно добавлены к животному.");
            return success;
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return false;
        }
    }

    public List<String> getCommandsByAnimalId(int animalId) {
        List<String> commands = animalRegistry.getCommandsByAnimalId(animalId);
        if (commands != null) {
            System.out.println("Список команд животного с ID " + animalId + ":");
            for (String command : commands) {
                System.out.println(command);
            }
        } else {
            System.err.println("Животное с указанным ID не найдено.");
        }
        return commands;
    }


    public List<Animal> filterAnimalsByType(String type) {
        List<Animal> filteredAnimals = animalRegistry.filterAnimalsByType(type);
        if (!filteredAnimals.isEmpty()) {
            System.out.println("Список животных типа " + type + ":");
            for (Animal animal : filteredAnimals) {
                System.out.println(animal.toString());
            }
        } else {
            System.err.println("Животные указанного типа не найдены.");
        }
        return filteredAnimals;
    }

    public List<Animal> filterAnimalsByBirthDate(LocalDate startDate, LocalDate endDate) {
        List<Animal> filteredAnimals = animalRegistry.filterAnimalsByBirthDate(startDate, endDate);
        if (!filteredAnimals.isEmpty()) {
            System.out.println("Список животных, родившихся с " + startDate + " по " + endDate + ":");
            for (Animal animal : filteredAnimals) {
                System.out.println(animal.toString());
            }
        } else {
            System.err.println("Животные, родившиеся в указанный период, не найдены.");
        }
        return filteredAnimals;
    }

    public List<Animal> getAllAnimals() {
        List<Animal> allAnimals = animalRegistry.getAllAnimals();
        if (!allAnimals.isEmpty()) {
            System.out.println("Список всех животных:");
            for (Animal animal : allAnimals) {
                System.out.println(animal.toString());
            }
        } else {
            System.err.println("Животные не найдены.");
        }
        return allAnimals;
    }

}

