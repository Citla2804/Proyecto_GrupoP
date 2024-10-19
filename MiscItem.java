package rpg.inventory.items;

import rpg.enums.ItemType;

public class MiscItem extends Item {
    public MiscItem(String name, int value) {
        super(name, value); // Llama al constructor de la clase base Item
    }

    @Override
    public ItemType getType() {
        return ItemType.MISC; // Retorna el tipo de ítem
    }
}
