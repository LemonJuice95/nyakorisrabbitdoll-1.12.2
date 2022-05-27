package com.nyakorisrabbitdoll.common.block;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

public class JadePlateBlock {

    public enum JadePlateType implements IStringSerializable {
        OCEAN(0, "ocean", MapColor.WATER),
        PALE(1, "pale", MapColor.IRON);

        private static final JadePlateType[] META_LOOKUP = new JadePlateType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;
        private final MapColor mapColor;

        private JadePlateType(int metaIn, String nameIn, MapColor mapColorIn) {
            this(metaIn, nameIn, nameIn, mapColorIn);
        }

        private JadePlateType(int metaIn, String nameIn, String unlocalizedNameIn, MapColor mapColorIn) {
            this.meta = metaIn;
            this.name = nameIn;
            this.unlocalizedName = unlocalizedNameIn;
            this.mapColor = mapColorIn;
        }

        public int getMetadata() {
            return this.meta;
        }

        public MapColor getMapColor() {
            return this.mapColor;
        }

        public String toString() {
            return this.name;
        }

        public static JadePlateType byMetadata(int meta) {
            if (meta < 0 || meta >= META_LOOKUP.length) {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName() {
            return this.name;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        static {
            for (JadePlateType jadePlateType : values()) {
                META_LOOKUP[jadePlateType.getMetadata()] = jadePlateType;
            }
        }
    }
}
