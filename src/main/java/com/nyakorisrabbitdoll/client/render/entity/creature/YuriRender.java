package com.nyakorisrabbitdoll.client.render.entity.creature;

import com.nyakorisrabbitdoll.client.model.entity.creature.YuriModel;
import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.common.entity.creature.YuriEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class YuriRender extends RenderLiving<YuriEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/yuri.png");

    public YuriRender(RenderManager manager) {
        super(manager, new YuriModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(YuriEntity entity) {
        return TEXTURE;
    }
}
