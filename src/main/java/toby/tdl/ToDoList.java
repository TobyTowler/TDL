package toby.tdl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private String name;
    private ArrayList<ListItem> workingList;
    private ArrayList<ListItem> completedList;
    public ArrayList<ListItem> incompleteList;

    public ToDoList(String name) {
        this.name = name;
        this.workingList = new ArrayList<>();
        this.completedList = new ArrayList<>();
        this.incompleteList = new ArrayList<>();
    }

    public void saveList() {
        try (PrintWriter write = new PrintWriter("lists/" + this.name + ".txt")) {
            for (ListItem l : workingList) {
                write.println(l.getStatus() + "-" + l.getItem());
            }
            for (ListItem l : completedList) {
                write.println(l.getStatus() + "-" + l.getItem());
            }
            for (ListItem l : incompleteList) {
                write.println(l.getStatus() + "-" + l.getItem());
            }

            write.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void readList(String name) {
        try {
            File myObj = new File("lists/" + name + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split("-");
                ListItem item = new ListItem(parts[0].charAt(0), parts[1]);
                this.addItem(item);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void setItemWorking(ListItem item) {
        incompleteList.remove(item);
        workingList.add(item);
    }

    public void addItem(ListItem item) {
        switch (item.getStatus()) {
            case 'c':
                this.completedList.add(item);
                break;
            case 'w':
                this.workingList.add(item);
                break;
            case 'i':
                this.incompleteList.add(item);
                break;

        }
    }
}