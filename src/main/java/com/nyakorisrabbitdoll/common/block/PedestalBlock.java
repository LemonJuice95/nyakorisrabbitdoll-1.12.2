package com.nyakorisrabbitdoll.common.block;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.nyakorisrabbitdoll.common.item.NItemTab;
import com.nyakorisrabbitdoll.common.tileentity.PedestalTileEntity;
import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
public class PedestalBlock extends Block  implements IHasModel {
    public static final PropertyEnum<JadePlateBlock.JadePlateType> VARIANT = PropertyEnum.<JadePlateBlock.JadePlateType>create("variant", JadePlateBlock.JadePlateType.class, new Predicate<JadePlateBlock.JadePlateType>()
    {
        public boolean apply(@Nullable JadePlateBlock.JadePlateType p_apply_1_)
        {
            return p_apply_1_.getMetadata() <= 1;
        }
    });
    public static final PropertyBool POWERED = PropertyBool.create("powered");
    public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 3);
    public static AxisAlignedBB base = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);
    public static AxisAlignedBB level1 = new AxisAlignedBB(0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.125D, 0.9375D);
    public static AxisAlignedBB level2 = new AxisAlignedBB(0.125D, 0.125D, 0.125D, 0.875D, 0.1875D, 0.875D);
    public static AxisAlignedBB body = new AxisAlignedBB(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.8125D, 0.8125D);
    public static AxisAlignedBB level4 = new AxisAlignedBB(0.125D, 0.8125D, 0.125D, 0.875D, 0.875D, 0.875D);
    public static AxisAlignedBB level5 = new AxisAlignedBB(0.0625D, 0.875D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
    public static AxisAlignedBB top = new AxisAlignedBB(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
    public static AxisAlignedBB bodyWithUp = new AxisAlignedBB(0.1875D, 0.1875D, 0.1875D, 0.8125D, 1.0D, 0.8125D);
    public static AxisAlignedBB bodyWithDown = new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.8125D, 0.8125D);
    public static AxisAlignedBB bodyWithUpAndDown = new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 1.0D, 0.8125D);

    public PedestalBlock() {
        super(Material.ROCK);
//        this.setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
        this.setDefaultState(this.blockState.getBaseState()
                .withProperty(POWERED, false)
                .withProperty(STATE, 0)
                .withProperty(VARIANT, JadePlateBlock.JadePlateType.OCEAN));
        this.setUnlocalizedName("pedestal");
        this.setRegistryName("pedestal");
        NBlockRegister.BLOCKS.add(this);
    }

    @Override
    public void registerModels(){
        nyakorisrabbitdoll.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    public JadePlateBlock.JadePlateType getJadePlateType(int meta) {
        return JadePlateBlock.JadePlateType.byMetadata((meta & 1) % 2);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, this.getJadePlateType(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return (state.getValue(VARIANT)).getMetadata();
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        if (!isActualState) {
            state = this.getActualState(state, worldIn, pos);
        }

        for (AxisAlignedBB axisalignedbb : getCollisionBoxList(state)) {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, axisalignedbb);
        }
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {VARIANT, STATE, POWERED});
    }

    private static java.util.List<AxisAlignedBB> getCollisionBoxList(IBlockState bstate) {
        List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();
        switch(bstate.getValue(STATE)) {
            case 0:
                list.addAll(ImmutableList.of(base, level1, level2, body, level4, level5, top));
                break;
            case 1:
                list.addAll(ImmutableList.of(base, level1, level2, bodyWithUp));
                break;
            case 2:
                list.addAll(ImmutableList.of(bodyWithDown, level4, level5));
                break;
            case 3:
                list.add(bodyWithUpAndDown);
                break;
        }
        return list;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        IBlockState up = worldIn.getBlockState(pos.up());
        IBlockState down = worldIn.getBlockState(pos.down());
        if(up.getBlock() == this && this.getMetaFromState(up) == this.getMetaFromState(state)) {
            if(down.getBlock() == this && this.getMetaFromState(down) == this.getMetaFromState(state)) {
                IBlockState state1 = state;
                while(state1.getValue(STATE) != 3) {
                    state1 = state1.cycleProperty(STATE);
                }
                worldIn.setBlockState(pos, state1);
            } else {
                IBlockState state1 = state;
                while(state1.getValue(STATE) != 1) {
                    state1 = state1.cycleProperty(STATE);
                }
                worldIn.setBlockState(pos, state1);
            }
        } else {
            if(down.getBlock() == this && this.getMetaFromState(down) == this.getMetaFromState(state)) {
                IBlockState state1 = state;
                while(state1.getValue(STATE) != 2) {
                    state1 = state1.cycleProperty(STATE);
                }
                worldIn.setBlockState(pos, state1);
            } else {
                IBlockState state1 = state;
                while(state1.getValue(STATE) != 1) {
                    state1 = state1.cycleProperty(STATE);
                }
                worldIn.setBlockState(pos, state1);
            }
        }
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new PedestalTileEntity();
    }
}
