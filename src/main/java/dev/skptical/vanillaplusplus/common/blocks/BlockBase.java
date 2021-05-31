package dev.skptical.vanillaplusplus.common.blocks;

import dev.skptical.vanillaplusplus.VanillaPlusPlus;
import dev.skptical.vanillaplusplus.core.init.BlockInit;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    public BlockBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setCreativeTab(VanillaPlusPlus.VANILLA_PLUS_PLUS_TAB);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }


}
