package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.item.ItemFood;

public class ItemCabbage extends ItemFood implements IHasModel {
    public ItemCabbage(){
        super(2,0.6F,false);
        NItemRegister.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        nyakorisrabbitdoll.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
