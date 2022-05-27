package com.nyakorisrabbitdoll.client.render.entity.monster;

import com.nyakorisrabbitdoll.common.entity.monster.ToyBearEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class ToyBearRender extends RenderLiving<ToyBearEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/toy_bear.png");

    public ToyBearRender(RenderManager manager) {
        super(manager, new ModelZombie(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(ToyBearEntity entity) {
         return TEXTURE;
    }
}
