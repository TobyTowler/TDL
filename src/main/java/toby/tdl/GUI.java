package toby.tdl;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    private ArrayList<ListItem> completeList;
    private ArrayList<ListItem> incompleteList;
    private ArrayList<ListItem> workingList;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello!");

        stage.show();
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public static void main(String[] args) {
        launch();
    }


}

