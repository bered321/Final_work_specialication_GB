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
        // Логика для фильтрации животных по типу
        // Вызов методов модели, например animalRegistry.filterAnimalsByType(...)
        return null; // Замените на реальную реализацию
    }

    public List<Animal> filterAnimalsByBirthDate(LocalDate startDate, LocalDate endDate) {
        // Логика для фильтрации животных по дате рождения
        // Вызов методов модели, например animalRegistry.filterAnimalsByBirthDate(...)
        return null; // Замените на реальную реализацию
    }

    public List<Animal> getAllAnimals() {
        // Логика для получения списка всех животных
        // Вызов методов модели, например animalRegistry.getAllAnimals()
        return null; // Замените на реальную реализацию
    }

    // Другие методы для управления данными и бизнес-логикой...
}

