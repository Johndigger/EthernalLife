package ethernallife.one.item;

import ethernallife.one.lib.Reference;
import net.minecraft.item.Item;

public class ItemPileOfCables extends Item {

    public ItemPileOfCables(int id) {
        super(id);
        setMaxStackSize(64);
        setTextureName(Reference.MOD_ID.toLowerCase()+":pileofcables");
    }

}
