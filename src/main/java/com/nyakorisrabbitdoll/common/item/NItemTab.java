package com.nyakorisrabbitdoll.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NItemTab {
    public static final CreativeTabs NYAKORIS_RABBIT_DOLL = new CreativeTabs(12, "nyakoris_rabbit_doll") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(NItemRegister.RABBIT_DOLL);
        }
    };
}
