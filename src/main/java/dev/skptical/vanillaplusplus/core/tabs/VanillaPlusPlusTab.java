package dev.skptical.vanillaplusplus.core.tabs;

import dev.skptical.vanillaplusplus.core.init.BlockInit;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class VanillaPlusPlusTab extends CreativeTabs {

    public VanillaPlusPlusTab(String label) {
        super("Vanilla++");
        this.setBackgroundImageName("vanillaplusplus.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockInit.ADVANCED_WORK_STATION);
    }


    @Override
    public boolean hasSearchBar() {
        return true;
    }




}