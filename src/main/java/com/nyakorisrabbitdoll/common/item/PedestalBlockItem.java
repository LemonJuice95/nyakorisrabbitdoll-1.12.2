package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.common.block.JadePlateBlock;
import com.nyakorisrabbitdoll.common.block.PedestalBlock;
import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class PedestalBlockItem extends ItemBlock implements IHasModel {
    private final PedestalBlock pedestal;

    public PedestalBlockItem(PedestalBlock block) {
        super(block);
        this.pedestal = block;
        this.setHasSubtypes(true);
        this.setRegistryName("pedestal");
        NItemRegister.ITEMS.add(this);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile.pedestal_" + JadePlateBlock.JadePlateType.byMetadata(this.getDamage(stack)).toString() + ".name";
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if(this.isInCreativeTab(tab)) {
            items.add(new ItemStack(this, 1, 0));
            items.add(new ItemStack(this, 1, 1));
        }
    }

    @Override
    public void registerModels(){
        nyakorisrabbitdoll.proxy.registerItemRenderer(this, 0, "inventory");
    }
}