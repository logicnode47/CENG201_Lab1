package game.inventory;

public class Inventory {
    private Item[] items;
    private int count;

    //Creates an inventory with space for 10 items
    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    //Adds a new item to the inventory
    public void addItem(Item item) {
        items[count] = item;
        count++;
    }

    //Displays the information of all items
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for(int i = 0; i < count; i++){
            System.out.println(items[i].getName() + " | " + items[i].getGenre() + "Stock: " + items[i].getStockCount());
        }
    }

    //Displays the name and serial code of all items
    public void auditSerialCodes() {
        System.out.println("--- Inventory Listing ---");

        for (int i = 0; i < count; i++) {
            System.out.println(items[i].getName() + " | " + items[i].getGenre() + " | Stock: " + items[i].getStockCount());
        }
    }
}
