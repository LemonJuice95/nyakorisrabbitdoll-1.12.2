package com.nyakorisrabbitdoll.client.render.entity.creature;

import com.nyakorisrabbitdoll.client.model.entity.creature.NyakoriTheBlackCatModel;
import com.nyakorisrabbitdoll.common.entity.creature.NyakoriTheBlackCatEntity;
import com.nyakorisrabbitdoll.util.StringUtil;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class NyakoriTheBlackCatRender extends RenderLiving<NyakoriTheBlackCatEntity> {
    public static final ResourceLocation TEXTURE = StringUtil.resPrefix("textures/entity/nyakori_the_black_cat.png");

    public NyakoriTheBlackCatRender(RenderManager manager) {
        super(manager, new NyakoriTheBlackCatModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(NyakoriTheBlackCatEntity entity) {
        return TEXTURE;
    }
}
