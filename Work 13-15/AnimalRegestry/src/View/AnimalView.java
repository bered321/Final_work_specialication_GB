package View;

import Presenter.AnimalPresenter;

import java.util.List;
import java.util.Scanner;

public class AnimalView {
    private AnimalPresenter presenter;

    public AnimalView(AnimalPresenter presenter) {
        this.presenter = presenter;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewAnimal(scanner);
                    break;
                case 2:
                    displayCommands();
                    break;
                case 3:
                    addNewCommands(scanner);
                    break;
                case 4:
                    displayAllAnimals();
                    break;
                case 5:
                    handleFilterMenu(scanner);
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    private void displayMainMenu() {
        System.out.println("Главное меню:");
        System.out.println("1. Добавить новое животное");
        System.out.println("2. Посмотреть список команд");
        System.out.println("3. Добавить новые команды");
        System.out.println("4. Показать всех животных");
        System.out.println("5. Поиск");
        System.out.println("6. Выход");
        System.out.print("Выберите действие: ");
    }

    private void addNewAnimal(Scanner scanner) {
        // Логика для добавления нового животного
    }

    private void displayCommands() {
        // Логика для вывода списка команд
    }

    private void addNewCommands(Scanner scanner) {
        // Логика для добавления новых команд
    }

    private void displayAllAnimals() {
        // Логика для вывода всех животных
    }

    private void handleFilterMenu(Scanner scanner) {
        boolean isFilterMenuRunning = true;

        while (isFilterMenuRunning) {
            displayFilterMenu();
            int filterChoice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (filterChoice) {
                case 1:
                    filterByAnimalType(scanner);
                    break;
                case 2:
                    filterByBirthDate(scanner);
                    break;
                case 3:
                    isFilterMenuRunning = false;
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private void displayFilterMenu() {
        System.out.println("Меню фильтрации:");
        System.out.println("1. Поиск по типу животного");
        System.out.println("2. Поиск по дате рождения");
        System.out.println("3. Вернуться в главное меню");
        System.out.print("Выберите действие: ");
    }

    private void filterByAnimalType(Scanner scanner) {
        // Логика для фильтрации по типу животного
    }

    private void filterByBirthDate(Scanner scanner) {
        // Логика для фильтрации по дате рождения
    }

    // Другие методы...
}

