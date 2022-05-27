package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.item.Item;


public class NItemBase extends Item implements IHasModel {
    public NItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
        NItemRegister.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        nyakorisrabbitdoll.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
