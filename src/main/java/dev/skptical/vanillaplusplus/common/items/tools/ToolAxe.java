package dev.skptical.vanillaplusplus.common.items.tools;

import com.google.common.collect.Sets;
import dev.skptical.vanillaplusplus.VanillaPlusPlus;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ToolAxe extends ItemTool {

    public static final Set<Block> EFFECTIVE = Sets.newHashSet(Blocks.PLANKS,  Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB);

    public ToolAxe(String name, ToolMaterial material){
        super(material, EFFECTIVE);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(VanillaPlusPlus.VANILLA_PLUS_PLUS_TAB);
        ItemInit.ITEMS.add(this);
    }


    public float getStrVsBlock(ItemStack stack, IBlockState state){

        Material mat = state.getMaterial();
        return mat != Material.WOOD && mat != Material.PLANTS && mat != Material.VINE ? super.getDestroySpeed(stack, state) : efficiency;

    }
}
