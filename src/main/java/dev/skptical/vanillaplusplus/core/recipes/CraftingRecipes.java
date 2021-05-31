package dev.skptical.vanillaplusplus.core.recipes;

import dev.skptical.vanillaplusplus.core.init.BlockInit;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.IngredientNBT;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {

    public static void init(){
        ItemStack bluestone_block = new ItemStack(BlockInit.BLUESTONE_BLOCK);
        ItemStack bluestone = new ItemStack(ItemInit.BLUESTONE, 9);
        ItemStack iron_rod = new ItemStack(ItemInit.IRON_ROD, 2);
        ItemStack iron = new ItemStack(Items.IRON_INGOT, 3);

        GameRegistry.addShapelessRecipe(new ResourceLocation("bluestone_block"), null, bluestone_block, Ingredient.fromStacks(bluestone));
        GameRegistry.addShapelessRecipe(new ResourceLocation("bluestone"), null, bluestone, Ingredient.fromStacks(bluestone_block));
        GameRegistry.addShapedRecipe(new ResourceLocation("advanced_crafting_station"), null, new ItemStack(BlockInit.ADVANCED_WORK_STATION),
                new String[] {"xxx", "bab", "zzz"}, 'x', ItemInit.BLUESTONE, 'b', Items.DIAMOND, 'a', Blocks.CRAFTING_TABLE, 'z', Blocks.QUARTZ_BLOCK);


    }

}
