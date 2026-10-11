import game.inventory.Item;
import game.inventory.Inventory;
public class GameShop {
    public static void main(String[] args) {

        //Creates the inventory for the game shop
        Inventory shop = new Inventory();
        // Creates three game items
        Item item1 = new Item("Galaxy Racer","Racing",12,"GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5,"SR-8873");
        Item item3 = new Item("Pixel Legends","Strategy", 3, "PL-0091");
        //Adds the games to the inventory
        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);
        //Displays the inventory before selling
        shop.displayAll();
        System.out.println();
        //Sells some copies of the games
        item1.sell(4);
        item2.sell(6);
        System.out.println();
        //Displays the inventory after selling
        shop.displayAll();
        System.out.println();
        //Displays serial codes for inventory auditing
        shop.auditSerialCodes();
    }
}