package com.nyakorisrabbitdoll.util.handlers;

import com.nyakorisrabbitdoll.client.render.entity.creature.*;
import com.nyakorisrabbitdoll.client.render.entity.monster.ToyBearRender;
import com.nyakorisrabbitdoll.common.entity.creature.*;
import com.nyakorisrabbitdoll.common.entity.monster.ToyBearEntity;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(NyarutoruEntity.class, NyarutoruRender::new);
        RenderingRegistry.registerEntityRenderingHandler(YuriEntity.class, YuriRender::new);
        RenderingRegistry.registerEntityRenderingHandler(YuroEntity.class, YuroRender::new);
        RenderingRegistry.registerEntityRenderingHandler(NyakoriEntity.class, NyakoriRender::new);
        RenderingRegistry.registerEntityRenderingHandler(NyakoriTheBlackCatEntity.class, NyakoriTheBlackCatRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ToyBearEntity.class, ToyBearRender::new);
    }
}