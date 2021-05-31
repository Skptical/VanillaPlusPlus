package dev.skptical.vanillaplusplus.common.items;

import dev.skptical.vanillaplusplus.VanillaPlusPlus;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(VanillaPlusPlus.VANILLA_PLUS_PLUS_TAB);
        ItemInit.ITEMS.add(this);

    }


}
