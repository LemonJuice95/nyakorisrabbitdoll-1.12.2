package com.nyakorisrabbitdoll.client.render.entity.creature;

import com.nyakorisrabbitdoll.client.model.entity.creature.NyarutoruModel;
import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class NyarutoruRender extends RenderLiving<NyarutoruEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/nyarutoru.png");

    public NyarutoruRender(RenderManager manager) {
        super(manager, new NyarutoruModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(NyarutoruEntity entity) {
        return TEXTURE;
    }
}
