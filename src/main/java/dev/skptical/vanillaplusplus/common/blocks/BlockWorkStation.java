package dev.skptical.vanillaplusplus.common.blocks;

import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.world.World;

import java.awt.*;

public class BlockWorkStation extends BlockBase{

    public BlockWorkStation(String name){
        super(name, Material.ANVIL, 6.0f, 10.0f, 4, "pickaxe");
        setSoundType(SoundType.ANVIL);

    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }


    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        playerIn.addItemStackToInventory(new ItemStack(ItemInit.IRON_ROD, 21));
    }
}


