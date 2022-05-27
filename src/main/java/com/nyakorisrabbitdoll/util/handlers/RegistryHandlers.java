package com.nyakorisrabbitdoll.util.handlers;

import com.nyakorisrabbitdoll.common.block.NBlockRegister;
import com.nyakorisrabbitdoll.common.entity.NEntityRegister;
import com.nyakorisrabbitdoll.common.item.NItemRegister;
import com.nyakorisrabbitdoll.common.tileentity.NTileEntityRegister;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandlers {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> ev){
        ev.getRegistry().registerAll(NItemRegister.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> ev) {
        NTileEntityRegister.registerTileEntities();
        ev.getRegistry().registerAll(NBlockRegister.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent ev){
        for(Item item : NItemRegister.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : NBlockRegister.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void preInitRegistries(){
        NEntityRegister.registerEntities();
        RenderHandler.registerEntityRenders();
    }

    public static void postInitRegistries(){

    }
}
