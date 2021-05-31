package dev.skptical.vanillaplusplus.core.recipes;

import dev.skptical.vanillaplusplus.core.init.BlockInit;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

    public static void init(){
        GameRegistry.addSmelting(new ItemStack(BlockInit.BLUESTONE_ORE), new ItemStack(ItemInit.BLUESTONE), 8.0f);
        GameRegistry.addSmelting(new ItemStack(ItemInit.IRON_ROD), new ItemStack(Items.IRON_INGOT, 2), 4.0f);
    }

}
