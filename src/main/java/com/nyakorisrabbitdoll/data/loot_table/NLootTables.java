package com.nyakorisrabbitdoll.data.loot_table;

import com.google.common.collect.Sets;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.LootTableManager;

import java.io.File;
import java.util.Collections;
import java.util.Set;

public class NLootTables {
    public static final ResourceLocation YURI = LootTableList.register(StringUtil.resPrefix("entities/yuri"));
    public static final ResourceLocation TOY_BEAR = LootTableList.register(StringUtil.resPrefix("entities/toy_bear"));
}
