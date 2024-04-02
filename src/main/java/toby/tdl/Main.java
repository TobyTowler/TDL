package toby.tdl;

import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) throws Exception {

        ListItem food = new ListItem("buy food");
        ListItem car = new ListItem("Wash car");

        ToDoList list = new ToDoList("list");


        list.saveList();

        ToDoList newList = new ToDoList("new");
        newList.readList("list");

        System.out.println(newList.incompleteList.size());

        GUI frame = new GUI();
        frame.start(new Stage());

    }
}
