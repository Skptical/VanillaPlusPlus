package dev.skptical.vanillaplusplus.core.init;

import dev.skptical.vanillaplusplus.common.blocks.BlockBase;
import dev.skptical.vanillaplusplus.common.blocks.BlockWorkStation;
import dev.skptical.vanillaplusplus.common.blocks.OreBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ADVANCED_WORK_STATION = new BlockWorkStation("advanced_work_station");


    public static final Block BLUESTONE_BLOCK = new BlockBase("bluestone_block", Material.IRON, 3.0f, 16.0f, 2, "pickaxe");

    public static final Block BLUESTONE_ORE = new OreBase("bluestone_ore", Material.ROCK, 3.0f, 8.0f, 2, "pickaxe", ItemInit.BLUESTONE, 2, 5);


}
