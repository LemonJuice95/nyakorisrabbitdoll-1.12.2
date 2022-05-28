package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.common.block.JadePlateBlock;
import com.nyakorisrabbitdoll.common.block.PedestalBlock;
import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class PedestalBlockItem extends ItemBlock implements IHasModel {
    private final PedestalBlock pedestal;

    public PedestalBlockItem(PedestalBlock block) {
        super(block);
        this.pedestal = block;
        this.setHasSubtypes(true);
        this.setRegistryName("pedestal");
        this.setUnlocalizedName("pedestal");
        this.setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
        NItemRegister.ITEMS.add(this);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile.pedestal_" + JadePlateBlock.JadePlateType.byMetadata(this.getDamage(stack)).toString();
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

    @Override
    public CreativeTabs getCreativeTab() {
        return NItemTab.NYAKORIS_RABBIT_DOLL;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
    }
}