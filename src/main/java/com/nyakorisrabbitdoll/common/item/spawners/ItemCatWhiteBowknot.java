package com.nyakorisrabbitdoll.common.item.spawners;

import com.nyakorisrabbitdoll.common.entity.creature.NyakoriTheBlackCatEntity;
import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.common.item.NItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCatWhiteBowknot extends NItemBase {
    public ItemCatWhiteBowknot() {
        super("cat_white_bowknot");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);
        if(!worldIn.isRemote) {
            NyakoriTheBlackCatEntity entity = new NyakoriTheBlackCatEntity(worldIn);
            if (!itemstack.isEmpty() && player.canPlayerEdit(pos, facing, itemstack)) {
                entity.setPosition((double) ((float) pos.getX() + hitX), (double) ((float) pos.getY() + hitY), (double) ((float) pos.getZ() + hitZ));
                worldIn.spawnEntity(entity);
                if (!player.isCreative()) {
                    itemstack.shrink(1);
                    player.setHeldItem(hand, itemstack);
                }
                return EnumActionResult.SUCCESS;
            } else {
                return EnumActionResult.FAIL;
            }
        } else if (!itemstack.isEmpty() && player.canPlayerEdit(pos, facing, itemstack)) {
            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.FAIL;
        }
    }
}
