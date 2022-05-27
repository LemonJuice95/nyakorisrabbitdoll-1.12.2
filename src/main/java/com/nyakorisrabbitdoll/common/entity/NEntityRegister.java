package com.nyakorisrabbitdoll.common.entity;

import com.nyakorisrabbitdoll.common.entity.creature.*;
import com.nyakorisrabbitdoll.common.entity.monster.ToyBearEntity;
import com.nyakorisrabbitdoll.nyakorisrabbitdoll;
import com.nyakorisrabbitdoll.util.Reference;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class NEntityRegister {
    public static void registerEntities() {
        registerEntity("nyarutoru", NyarutoruEntity.class, 120, 50, 16316671, 16738740);
        registerEntity("yuri", YuriEntity.class, 121, 50, 6908265, 16777215);
        registerEntity("yuro", YuroEntity.class, 122, 50, 16316671, 16738740);
        registerEntity("nyakori", NyakoriEntity.class, 123, 50, 16776960, 16747520);
        registerEntity("nyakori_the_black_cat", NyakoriTheBlackCatEntity.class, 124, 50, 16776960, 16747520);
        registerEntity("toy_bear", ToyBearEntity.class, 125, 50, 9127187, 13789470);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int eggPrimary, int eggSecondary) {
        EntityRegistry.registerModEntity(StringUtil.resPrefix(name), entity, name, id, nyakorisrabbitdoll.instance, range, 1, true, eggPrimary, eggSecondary);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
        EntityRegistry.registerModEntity(StringUtil.resPrefix(name), entity, name, id, nyakorisrabbitdoll.instance, range, 1, true);
    }
}