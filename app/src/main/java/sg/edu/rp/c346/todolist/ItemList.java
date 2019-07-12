package sg.edu.rp.c346.todolist;

public class ItemList {
    private String name;
    private String Items;

    public ItemList(String name, String items) {
        this.name = name;
        Items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String items) {
        Items = items;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                 Items + '\''
                ;
    }
}
