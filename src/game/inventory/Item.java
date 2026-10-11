package game.inventory;

public class Item {
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;
    //Creates an item with its information
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;

    }
    //Returns the name of the item
    public String getName() {
        return name;
    }
    //Returns the genre of the item
    public String getGenre() {
        return genre;
    }
    //Returns the stock count
    public int getStockCount() {
        return stockCount;
    }
    //Returns the serial code for classes in the same package
    String getSerialCode() {
        return serialCode;
    }
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }
    //Sells the item if there is enough stock
    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount = stockCount - quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }

}
