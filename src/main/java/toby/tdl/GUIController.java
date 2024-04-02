package toby.tdl;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIController extends Application {

    @FXML
    public ListView<ListItem> completedBox;
    @FXML
    private ListView<ListItem> workingBox;
    @FXML
    private ListView<ListItem> incompleteBox;

    private ContextMenu completedList = new ContextMenu();
    private ContextMenu workingList = new ContextMenu();
    private ContextMenu incompletedList = new ContextMenu();
    private MenuItem moveToWorking = new MenuItem("Move to working");
    private MenuItem moveToCompleted = new MenuItem("Move to Complete");
    private MenuItem moveToIncompleted = new MenuItem("Move to incomplete");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI1.fxml"));
        Parent root = loader.load();

        GUIController controller = loader.getController();

        setContextMenus();

        primaryStage.setTitle("JavaFX Application");
        controller.setLists();
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }

    public void setLists() {

    }

    private void setContextMenus() {
        completedList.getItems().add(moveToWorking);
        completedList.getItems().add(moveToIncompleted);

        workingList.getItems().add(moveToCompleted);
        workingList.getItems().add(moveToIncompleted);

        incompletedList.getItems().add(moveToWorking);
        incompletedList.getItems().add(moveToCompleted);

       // completedBox.setContextMenu(completedList);

    }

    @FXML
    public void RCCompleted() {

    }

}
