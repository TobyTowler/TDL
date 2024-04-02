package toby.tdl;

public class ListItem {
    private String item;
    private char status;

    public ListItem(String item) {
        this.item = item;
        this.status = 'i';
    }

    public ListItem(char status, String item) {
        this.status = status;
        this.item = item;
    }

    public void setWorking() {
        this.status = 'w';
    }

    public void setComplete() {
        this.status = 'c';
    }

    public void setIncomplete() {
        this.status = 'i';
    }

    public String getItem() {
        return this.item;
    }

    public char getStatus() {
        return this.status;
    }

}
