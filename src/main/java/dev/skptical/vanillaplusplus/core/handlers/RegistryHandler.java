package dev.skptical.vanillaplusplus.core.handlers;

import dev.skptical.vanillaplusplus.VanillaPlusPlus;
import dev.skptical.vanillaplusplus.core.init.BlockInit;
import dev.skptical.vanillaplusplus.core.init.ItemInit;
import dev.skptical.vanillaplusplus.core.recipes.CraftingRecipes;
import dev.skptical.vanillaplusplus.core.recipes.SmeltingRecipes;
import dev.skptical.vanillaplusplus.core.worldgen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Block block: BlockInit.BLOCKS){
            VanillaPlusPlus.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
        for(Item item : ItemInit.ITEMS){
            VanillaPlusPlus.proxy.registerItemRenderer(item, 0, "inventory");
        }


    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    public static void preInitRegistries(){

        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);

    }

    public static void postInitRegistries(){

    }

    public static void initRegistries(){

        CraftingRecipes.init();
        SmeltingRecipes.init();
        VanillaPlusPlus.proxy.render();

    }

    public static void serverRegistries(){

    }




}
