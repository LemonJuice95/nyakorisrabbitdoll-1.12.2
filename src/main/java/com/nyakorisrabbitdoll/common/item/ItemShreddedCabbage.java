package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShreddedCabbage extends ItemFood implements IHasModel {
    public ItemShreddedCabbage(int p_i45330_1_, float p_i45330_2_) {
        super(p_i45330_1_, p_i45330_2_, false);
        this.setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
        this.setMaxStackSize(1);
        NItemRegister.ITEMS.add(this);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack p_77654_1_, World p_77654_2_, EntityLivingBase p_77654_3_) {
        super.onItemUseFinish(p_77654_1_, p_77654_2_, p_77654_3_);
        return new ItemStack(Items.BOWL);
    }

    @Override
    public void registerModels(){
        nyakorisrabbitdoll.proxy.registerItemRenderer(this, 0, "inventory");
    }
}