package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ChooseAnimalController {
    public Button backBtn;
    public Button cartBtn;
    public VBox vBox;

    private Logic logic = new Logic();
    private FXMLLoader fxmlLoader = new FXMLLoader();

    void init() {
        //load class
        int i = 0;
        Gui gui = Gui.getInstance();
        gui.getAllSplitPanes().clear();

        for (Animal animal : AnimalList.getChosenAnimals()) {
            animal.setId(i);
            gui.createAnimalGUI(animal, vBox, "choose");
            gui.addSplitPane();

            i++;
        }
    }

    //opens cart window and closes this window.
    public void goToCart() throws IOException {
        logic.switchScene("fxml/CartFxml.fxml", cartBtn, fxmlLoader);
        ((CartController) fxmlLoader.getController()).init();
    }

    //Opens species choosing window and closes this window.
    public void goBack() throws IOException {
        logic.switchScene("fxml/ChooseSpeciesFxml.fxml", backBtn, fxmlLoader);
        ((ChooseSpeciesController) fxmlLoader.getController()).init();
    }
}
