package Model.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private int id;
    private String name;

    private String kindOfAnimal;
    private String typeOfAnimal;
    private List<String> commands;
    private LocalDate birthDate;

    public Animal(String kindOfAnimal, String typeOfAnimal, int id, String name, LocalDate birthDate, List<String> commands) {
        this.id = id;
        this.kindOfAnimal = kindOfAnimal;
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void addCommands(List<String> commands) {
        this.commands.addAll(commands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Тип животного: ").append(kindOfAnimal).append("\n");
        sb.append("Животное: ").append(typeOfAnimal).append("\n");
        sb.append("Id: ").append(id).append("\n");
        sb.append("Кличка: ").append(name).append("\n");
        sb.append("Дата рождения: ").append(birthDate).append("\n");
        sb.append("Команды: ").append(commands).append("\n");
        return sb.toString();
    }
}

