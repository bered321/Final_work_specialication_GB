import Model.AnimalRegistry;
import Presenter.AnimalPresenter;
import View.AnimalView;


public class Main {
    public static void main(String[] args) {
        AnimalRegistry animalRegistry = new AnimalRegistry(); // Здесь создайте экземпляр вашей реализации AnimalRegistry
        AnimalPresenter animalPresenter = new AnimalPresenter(animalRegistry);
        AnimalView animalView = new AnimalView(animalPresenter);

        animalView.start();
    }
}

