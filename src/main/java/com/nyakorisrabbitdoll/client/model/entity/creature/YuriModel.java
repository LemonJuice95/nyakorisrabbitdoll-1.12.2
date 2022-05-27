package com.nyakorisrabbitdoll.client.model.entity.creature;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.common.entity.creature.YuriEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class YuriModel extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Body;
	private final ModelRenderer Chest_r1;
	private final ModelRenderer Dress;
	private final ModelRenderer Deco1_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Head;
	private final ModelRenderer Hat;
	private final ModelRenderer Hat2_r1;
	private final ModelRenderer Hair;
	public int state;

	public YuriModel() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, 16.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -2.0F, 0.0F, -1.5F, 3, 8, 3, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-3.0F, 16.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -1.0F, 0.0F, -1.5F, 3, 8, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 12.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 40, 34, -3.5F, -8.0F, -2.5F, 7, 7, 5, 0.0F, false));

		Chest_r1 = new ModelRenderer(this);
		Chest_r1.setRotationPoint(0.0F, -7.0F, -2.0F);
		Body.addChild(Chest_r1);
		setRotationAngle(Chest_r1, -0.3491F, 0.0F, 0.0F);
		Chest_r1.cubeList.add(new ModelBox(Chest_r1, 34, 4, -3.5F, 0.5F, -0.3F, 7, 2, 1, 0.0F, false));

		Dress = new ModelRenderer(this);
		Dress.setRotationPoint(0.0F, 12.0F, 0.0F);
		Body.addChild(Dress);
		Dress.cubeList.add(new ModelBox(Dress, 16, 1, -7.0F, -8.0F, -5.0F, 14, 3, 10, 0.0F, false));
		Dress.cubeList.add(new ModelBox(Dress, 24, 15, -6.0F, -10.5F, -4.0F, 12, 3, 8, 0.0F, false));
		Dress.cubeList.add(new ModelBox(Dress, 32, 25, -5.0F, -13.0F, -3.0F, 10, 3, 6, 0.0F, false));

		Deco1_r1 = new ModelRenderer(this);
		Deco1_r1.setRotationPoint(0.0F, -19.0F, -2.0F);
		Dress.addChild(Deco1_r1);
		setRotationAngle(Deco1_r1, -0.3491F, 0.0F, 0.0F);
		Deco1_r1.cubeList.add(new ModelBox(Deco1_r1, 54, 48, -2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-3.0F, 4.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, 0.1309F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 13, -2.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(3.0F, 4.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 0.0F, -0.1309F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 13, -0.0171F, -0.0389F, -1.0F, 2, 9, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 4.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 26, -4.0F, -7.0F, -3.5F, 8, 7, 7, 0.0F, false));

		Hat = new ModelRenderer(this);
		Hat.setRotationPoint(0.0F, 20.0F, 0.0F);
		Head.addChild(Hat);
		

		Hat2_r1 = new ModelRenderer(this);
		Hat2_r1.setRotationPoint(-4.0F, -28.0F, 0.0F);
		Hat.addChild(Hat2_r1);
		setRotationAngle(Hat2_r1, 0.0F, 0.0F, -0.3927F);
		Hat2_r1.cubeList.add(new ModelBox(Hat2_r1, 12, 56, -1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F, false));
		Hat2_r1.cubeList.add(new ModelBox(Hat2_r1, 47, 16, -2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 20.0F, 0.0F);
		Head.addChild(Hair);
		Hair.cubeList.add(new ModelBox(Hair, 0, 41, -4.0F, -28.0F, -2.5F, 8, 1, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 49, -3.0F, -28.0F, -3.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 49, -3.0F, -28.0F, 2.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 16, 41, -3.0F, -27.0F, -4.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 52, -4.0F, -26.0F, -4.5F, 8, 2, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 52, -4.0F, -24.0F, -4.5F, 1, 4, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 52, 3.0F, -24.0F, -4.5F, 1, 4, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 13, 49, 2.0F, -24.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 52, -1.0F, -24.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 52, -3.0F, -24.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 18, 48, 4.0F, -27.0F, -2.5F, 1, 1, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 30, 47, 4.0F, -26.0F, -2.5F, 1, 11, 6, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 30, 47, -5.0F, -26.0F, -2.5F, 1, 11, 6, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 16, 41, -3.0F, -27.0F, 3.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 46, 52, -4.0F, -26.0F, 3.5F, 8, 11, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 59, -5.0F, -15.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 59, -4.0F, -15.0F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 59, 3.0F, -15.0F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 1, 59, 4.0F, -15.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 32, 39, 4.0F, -26.0F, -3.5F, 1, 12, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 32, 39, -5.0F, -26.0F, -3.5F, 1, 12, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 18, 48, -5.0F, -27.0F, -2.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftLeg.render(f5);
		RightLeg.render(f5);
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.Head.rotateAngleX = headPitch * 0.017453292F;
		this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
		if(this.state != 1) {
			this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
			this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
		}
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
		YuriEntity yuri = (YuriEntity) entitylivingbaseIn;
		if(yuri.isSitting()) {
			setRotationAngle(LeftArm, -0.7157F, -0.9631F, 0.1997F);
			setRotationAngle(RightArm, -0.6159F, 0.3526F, 0.3231F);
			this.state = 1;
		} else {
			setRotationAngle(LeftArm, 0.0F, 0.0F, 0.1309F);
			setRotationAngle(RightArm, 0.0F, 0.0F, -0.1309F);
			this.state = 0;
		}
	}
}