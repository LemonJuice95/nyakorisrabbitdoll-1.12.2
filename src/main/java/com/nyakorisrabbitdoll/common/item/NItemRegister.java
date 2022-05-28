package com.nyakorisrabbitdoll.common.item;

import com.nyakorisrabbitdoll.common.block.PedestalBlock;
import com.nyakorisrabbitdoll.common.item.spawners.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class NItemRegister {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item PEDESTAL = new PedestalBlockItem();
    public static final Item CABBAGE = new ItemCabbage().setUnlocalizedName("cabbage").setRegistryName("cabbage").setCreativeTab(NItemTab.NYAKORIS_RABBIT_DOLL);
    public static final Item SHREDDED_CABBAGE = new ItemShreddedCabbage(6,3.0F).setUnlocalizedName("shredded_cabbage").setRegistryName("shredded_cabbage");
    public static final Item RABBIT_DOLL = new NItemBase("rabbit_doll");
    public static final Item SILVER_KNIFE = new ItemSilverKnife().setUnlocalizedName("silver_knife").setRegistryName("silver_knife").setMaxStackSize(1);
    public static final Item CABBAGE_SEEDS = new CabbageSeedsItem();
    public static final Item DOLL_EYES = new NItemBase("doll_eyes");
    public static final Item CAT_EARS = new NItemBase("cat_ears");
    public static final Item CAT_TAIL = new NItemBase("cat_tail");
    public static final Item BOWKNOT = new NItemBase("bowknot");
    public static final Item HIGH_HAT = new NItemBase("high_hat");
    public static final Item WHITE_BOWKNOT = new NItemBase("white_bowknot");
    public static final Item MAGICAL_BOWKNOT = new ItemMagicalBowknot();
    public static final Item CAT_BOWKNOT = new ItemCatBowknot();
    public static final Item MAGICAL_HIGH_HAT = new ItemMagicalHighHat();
    public static final Item MAGICAL_WHITE_BOWKNOT = new ItemMagicalWhiteBowknot();
    public static final Item CAT_WHITE_BOWKNOT = new ItemCatWhiteBowknot();
    public static final Item ENTRUSTMENT = new ItemEntrustment();
}