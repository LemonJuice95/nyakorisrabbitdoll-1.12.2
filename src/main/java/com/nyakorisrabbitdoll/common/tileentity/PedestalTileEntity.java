package com.nyakorisrabbitdoll.common.tileentity;

import com.nyakorisrabbitdoll.common.block.NBlockRegister;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class PedestalTileEntity extends TileEntity implements ITickable {
    public static PropertyBool POWERED = PropertyBool.create("powered");

    @Override
    public void update() {
        if(this.tileEntityInvalid) {
            if(!this.world.isRemote) {
                if(world.getBlockState(pos.up()).getBlock() == NBlockRegister.JADE_PLATE_PEDESTAL
                        && world.getBlockState(pos.up()).getValue(POWERED)
                        ) {
                    IBlockState state = world.getBlockState(pos);
                    if(!state.getValue(POWERED)) {
                        state = state.cycleProperty(POWERED);
                        world.setBlockState(pos, state);
                    }
                } else {
                    IBlockState state = world.getBlockState(pos);
                    if (state.getValue(POWERED)) {
                        state = state.cycleProperty(POWERED);
                        world.setBlockState(pos, state);
                    }
                }
            }
        }
    }
}
