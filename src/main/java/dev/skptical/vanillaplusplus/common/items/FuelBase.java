package dev.skptical.vanillaplusplus.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelBase extends ItemBase {

    int burnTime;

    public FuelBase(String name, int burnTime) {
        super(name);
        this.burnTime = burnTime;

    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return this.burnTime;
    }
}



