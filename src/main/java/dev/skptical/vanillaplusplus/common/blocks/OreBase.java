package dev.skptical.vanillaplusplus.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class OreBase extends BlockBase{

    public Item DROPPED_ITEM;
    public int MIN_DROP;
    public int MAX_DROP;


    public OreBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool, Item droppedItem, int minDrop, int maxDrop) {
        super(name, material, hardness, resistance, miningLevel, tool);
        this.DROPPED_ITEM = droppedItem;
        this.MIN_DROP = minDrop;
        this.MAX_DROP = maxDrop;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.DROPPED_ITEM;
    }

    @Override
    public int quantityDropped(Random random) {
        if(this.MIN_DROP > this.MAX_DROP) {
            int i = this.MIN_DROP;
            this.MIN_DROP= this.MAX_DROP;
            this.MAX_DROP=i;
        }
        return this.MIN_DROP + random.nextInt(this.MAX_DROP - this.MIN_DROP + 1);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
        {
            int i = random.nextInt(fortune + 3) - 1;
            if (i < 0)
            {
                i = 0;
            }
            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }

}
