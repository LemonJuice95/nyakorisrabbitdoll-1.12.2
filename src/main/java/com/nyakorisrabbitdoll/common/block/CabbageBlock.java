package com.nyakorisrabbitdoll.common.block;

import com.nyakorisrabbitdoll.common.item.NItemBase;
import com.nyakorisrabbitdoll.common.item.NItemRegister;
import com.nyakorisrabbitdoll.common.item.NItemTab;
import com.nyakorisrabbitdoll.util.IHasModel;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class CabbageBlock extends BlockCrops {
    public static final PropertyInteger CABBAGE_AGE = PropertyInteger.create("age", 0, 3);
    private static final AxisAlignedBB[] SHAPES_BY_AGE = new AxisAlignedBB[]{
        new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D),
        new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
        new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D),
        new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D)
    };

    public CabbageBlock() {
        this.setUnlocalizedName("cabbage");
        this.setRegistryName("cabbage");
        this.setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
        NBlockRegister.BLOCKS.add(this);
//        NItemRegister.ITEMS.add(new ItemBlock(this).setRegistryName("cabbage_seed").setUnlocalizedName("cabbage_seed"));
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected PropertyInteger getAgeProperty() {
        return CABBAGE_AGE;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SHAPES_BY_AGE[state.getValue(this.getAgeProperty())];
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {CABBAGE_AGE});
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (rand.nextInt(3) == 0) {
            this.checkAndDropBlock(worldIn, pos, state);
        }
        else {
            super.updateTick(worldIn, pos, state, rand);
        }
    }

    @Override
    protected Item getSeed() {
        return NItemRegister.CABBAGE_SEEDS;
    }

    @Override
    protected Item getCrop() {
        return NItemRegister.CABBAGE;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return super.getBonemealAgeIncrease(worldIn) / 3;
    }
}
