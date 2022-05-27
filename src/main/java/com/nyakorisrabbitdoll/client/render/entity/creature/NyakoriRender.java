package com.nyakorisrabbitdoll.client.render.entity.creature;

import com.nyakorisrabbitdoll.client.model.entity.creature.NyakoriModel;
import com.nyakorisrabbitdoll.client.model.entity.creature.NyarutoruModel;
import com.nyakorisrabbitdoll.common.entity.creature.NyakoriEntity;
import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class NyakoriRender extends RenderLiving<NyakoriEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/nyakori.png");

    public NyakoriRender(RenderManager manager) {
        super(manager, new NyakoriModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(NyakoriEntity entity) {
        return TEXTURE;
    }
}
