package rpg.inventory;

import rpg.inventory.items.Item;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("Tu inventario está vacío.");
        } else {
            System.out.println("Tu inventario:");
            for (Item item : items) {
                System.out.println("- " + item.getName() + " (" + item.getType() + ")");
            }
        }
    }
}
