package com.nyakorisrabbitdoll.util;

import net.minecraft.util.ResourceLocation;

public class StringUtil {
    public static ResourceLocation resPrefix(String s) {
        return new ResourceLocation(Reference.MODID, s);
    }
}
