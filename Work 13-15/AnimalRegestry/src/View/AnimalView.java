package View;

import Presenter.AnimalPresenter;
import Model.Animal.Animal;

import java.time.LocalDate;
import java.util.Arrays;
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
        System.out.print("Введите тип животного: ");
        String type = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите дату рождения (гггг-мм-дд): ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        List<String> commands = getUserInputForCommands(scanner);

        presenter.createAnimal(type, name, birthDate, commands);
    }

    private List<String> getUserInputForCommands(Scanner scanner) {
        System.out.print("Введите команды через запятую: ");
        String commandsInput = scanner.nextLine();
        return Arrays.asList(commandsInput.split(","));
    }

    private void displayCommands() {
        System.out.print("Введите ID животного: ");
        int animalId = new Scanner(System.in).nextInt();
        presenter.getCommandsByAnimalId(animalId);
    }

    private void addNewCommands(Scanner scanner) {
        System.out.print("Введите ID животного: ");
        int animalId = scanner.nextInt();
        scanner.nextLine();

        List<String> newCommands = getUserInputForCommands(scanner);

        presenter.addCommandsToAnimal(animalId, newCommands);
    }

    private void displayAllAnimals() {
        presenter.getAllAnimals();
    }

    private void handleFilterMenu(Scanner scanner) {
        boolean isFilterMenuRunning = true;

        while (isFilterMenuRunning) {
            displayFilterMenu();
            int filterChoice = scanner.nextInt();
            scanner.nextLine();

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
        System.out.print("Введите тип животного: ");
        String type = scanner.nextLine();
        presenter.filterAnimalsByType(type);
    }

    private void filterByBirthDate(Scanner scanner) {
        System.out.print("Введите начальную дату (гггг-мм-дд): ");
        String startDateStr = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateStr);

        System.out.print("Введите конечную дату (гггг-мм-дд): ");
        String endDateStr = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateStr);

        presenter.filterAnimalsByBirthDate(startDate, endDate);
    }
}
