package com.nyakorisrabbitdoll.common.tileentity;

import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NTileEntityRegister {
    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(PedestalTileEntity.class, StringUtil.resPrefix("jade_plate_pedestal"));
    }
}
