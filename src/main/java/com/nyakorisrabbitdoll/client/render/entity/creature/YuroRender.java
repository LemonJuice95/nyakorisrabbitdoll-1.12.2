package com.nyakorisrabbitdoll.client.render.entity.creature;

import com.nyakorisrabbitdoll.client.model.entity.creature.YuroModel;
import com.nyakorisrabbitdoll.common.entity.creature.YuroEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class YuroRender extends RenderLiving<YuroEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/yuro.png");

    public YuroRender(RenderManager manager) {
        super(manager, new YuroModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(YuroEntity entity) {
        return TEXTURE;
    }
}
