package dev.skptical.vanillaplusplus.common.items.tools;

import dev.skptical.vanillaplusplus.VanillaPlusPlus;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade {

    public ToolShovel(String name, ToolMaterial material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(VanillaPlusPlus.VANILLA_PLUS_PLUS_TAB);
        ItemInit.ITEMS.add(this);
    }
}
