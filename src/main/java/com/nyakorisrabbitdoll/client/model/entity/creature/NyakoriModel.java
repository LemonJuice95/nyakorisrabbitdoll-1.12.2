package com.nyakorisrabbitdoll.client.model.entity.creature;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import com.nyakorisrabbitdoll.common.entity.creature.NyakoriEntity;
import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import com.nyakorisrabbitdoll.common.entity.creature.YuriEntity;
import com.nyakorisrabbitdoll.common.entity.creature.YuroEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class NyakoriModel extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Body;
	private final ModelRenderer Dress;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Arm_r1;
	private final ModelRenderer Arm_r2;
	private final ModelRenderer Head;
	private final ModelRenderer RightBow;
	private final ModelRenderer Bow5_r1;
	private final ModelRenderer Bow4_r1;
	private final ModelRenderer LeftBow;
	private final ModelRenderer Bow5_r2;
	private final ModelRenderer Bow4_r2;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair22_r1;
	private final ModelRenderer Hair20_r1;
	public int state = 0;

	public NyakoriModel() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 17.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -1.0F, -1.0F, -1.5F, 3, 8, 3, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 17.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.0F, -1.0F, -1.5F, 3, 8, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 13, -3.5F, -7.5F, -2.5F, 7, 8, 5, 0.0F, false));

		Dress = new ModelRenderer(this);
		Dress.setRotationPoint(0.0F, 13.0F, 0.0F);
		Body.addChild(Dress);
		Dress.cubeList.add(new ModelBox(Dress, 16, 0, -7.0F, -8.0F, -5.0F, 14, 3, 10, 0.0F, false));
		Dress.cubeList.add(new ModelBox(Dress, 24, 13, -6.0F, -10.5F, -4.0F, 12, 3, 8, 0.0F, false));
		Dress.cubeList.add(new ModelBox(Dress, 32, 24, -5.0F, -13.0F, -3.0F, 10, 3, 6, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-4.0F, 5.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.1309F);


		Arm_r1 = new ModelRenderer(this);
		Arm_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		LeftArm.addChild(Arm_r1);
		setRotationAngle(Arm_r1, 0.0F, 0.0F, 0.0F);
		Arm_r1.cubeList.add(new ModelBox(Arm_r1, 55, 34, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(4.0F, 5.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 3.1416F, -0.1309F);


		Arm_r2 = new ModelRenderer(this);
		Arm_r2.setRotationPoint(2.0F, 1.0F, 0.0F);
		RightArm.addChild(Arm_r2);
		setRotationAngle(Arm_r2, 0.0F, 0.0F, 0.0F);
		Arm_r2.cubeList.add(new ModelBox(Arm_r2, 55, 34, -3.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 2, 27, -4.0F, -7.5F, -3.5F, 8, 7, 7, 0.0F, false));

		RightBow = new ModelRenderer(this);
		RightBow.setRotationPoint(11.0F, 0.0F, 0.0F);
		Head.addChild(RightBow);
		RightBow.cubeList.add(new ModelBox(RightBow, 15, 0, -6.0F, -7.0F, -1.5F, 1, 1, 1, 0.0F, false));
		RightBow.cubeList.add(new ModelBox(RightBow, 15, 6, -6.0F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
		RightBow.cubeList.add(new ModelBox(RightBow, 15, 6, -6.0F, -7.5F, -2.5F, 1, 2, 1, 0.0F, false));

		Bow5_r1 = new ModelRenderer(this);
		Bow5_r1.setRotationPoint(-6.0F, -6.0F, -1.0F);
		RightBow.addChild(Bow5_r1);
		setRotationAngle(Bow5_r1, 0.3927F, 0.0F, 0.0F);
		Bow5_r1.cubeList.add(new ModelBox(Bow5_r1, 15, 6, 0.0F, 0.0F, -0.2F, 1, 2, 1, 0.0F, false));

		Bow4_r1 = new ModelRenderer(this);
		Bow4_r1.setRotationPoint(-6.0F, -6.0F, -1.0F);
		RightBow.addChild(Bow4_r1);
		setRotationAngle(Bow4_r1, -0.3927F, 0.0F, 0.0F);
		Bow4_r1.cubeList.add(new ModelBox(Bow4_r1, 15, 6, 0.0F, 0.0F, -0.8F, 1, 2, 1, 0.0F, false));

		LeftBow = new ModelRenderer(this);
		LeftBow.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(LeftBow);
		LeftBow.cubeList.add(new ModelBox(LeftBow, 15, 0, -6.0F, -7.0F, -1.5F, 1, 1, 1, 0.0F, false));
		LeftBow.cubeList.add(new ModelBox(LeftBow, 15, 6, -6.0F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
		LeftBow.cubeList.add(new ModelBox(LeftBow, 15, 6, -6.0F, -7.5F, -2.5F, 1, 2, 1, 0.0F, false));

		Bow5_r2 = new ModelRenderer(this);
		Bow5_r2.setRotationPoint(-6.0F, -6.0F, -1.0F);
		LeftBow.addChild(Bow5_r2);
		setRotationAngle(Bow5_r2, 0.3927F, 0.0F, 0.0F);
		Bow5_r2.cubeList.add(new ModelBox(Bow5_r2, 15, 6, 0.0F, 0.0F, -0.2F, 1, 2, 1, 0.0F, false));

		Bow4_r2 = new ModelRenderer(this);
		Bow4_r2.setRotationPoint(-6.0F, -6.0F, -1.0F);
		LeftBow.addChild(Bow4_r2);
		setRotationAngle(Bow4_r2, -0.3927F, 0.0F, 0.0F);
		Bow4_r2.cubeList.add(new ModelBox(Bow4_r2, 15, 6, 0.0F, 0.0F, -0.8F, 1, 2, 1, 0.0F, false));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 20.0F, 0.0F);
		Head.addChild(Hair);
		Hair.cubeList.add(new ModelBox(Hair, 29, 37, -4.0F, -28.5F, -2.5F, 8, 1, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 46, -3.0F, -28.5F, 2.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 46, -3.0F, -28.5F, -3.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 49, -3.0F, -27.5F, 3.5F, 6, 3, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 44, 57, 3.0F, -26.5F, 3.5F, 1, 6, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 53, -4.0F, -26.5F, 3.5F, 1, 6, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 40, 62, 2.0F, -24.5F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 54, 53, 0.0F, -24.5F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 54, 53, -3.0F, -24.5F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 51, 4.0F, -27.5F, -2.5F, 1, 8, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 51, -5.0F, -27.5F, -2.5F, 1, 8, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 55, 55, 4.0F, -26.5F, 2.5F, 1, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 55, 55, 4.0F, -26.5F, -3.5F, 1, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 55, 55, -5.0F, -26.5F, -3.5F, 1, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 55, 55, -5.0F, -26.5F, 2.5F, 1, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 15, 55, -3.0F, -27.5F, -4.5F, 6, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 2, 44, -4.0F, -26.5F, -4.5F, 1, 8, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 2, 44, 3.0F, -26.5F, -4.5F, 1, 8, 1, 0.0F, false));

		Hair22_r1 = new ModelRenderer(this);
		Hair22_r1.setRotationPoint(-5.0F, -26.0F, 0.0F);
		Hair.addChild(Hair22_r1);
		setRotationAngle(Hair22_r1, 0.0F, 0.0F, 0.1745F);
		Hair22_r1.cubeList.add(new ModelBox(Hair22_r1, 51, 60, 1.0F, 13.0882F, -1.5F, 1, 1, 1, 0.0F, false));
		Hair22_r1.cubeList.add(new ModelBox(Hair22_r1, 33, 45, 0.0F, 0.0882F, -1.5F, 2, 13, 1, 0.0F, false));

		Hair20_r1 = new ModelRenderer(this);
		Hair20_r1.setRotationPoint(5.0F, -26.0F, 0.0F);
		Hair.addChild(Hair20_r1);
		setRotationAngle(Hair20_r1, 0.0F, 0.0F, -0.2618F);
		Hair20_r1.cubeList.add(new ModelBox(Hair20_r1, 51, 60, -2.0F, 13.5F, -1.5F, 1, 1, 1, 0.0F, false));
		Hair20_r1.cubeList.add(new ModelBox(Hair20_r1, 33, 45, -2.0F, 0.5F, -1.5F, 2, 13, 1, 0.0F, false));
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
		this.Head.rotateAngleX = -headPitch * 0.017453292F;
		this.Head.rotateAngleY = 3.1416F + netHeadYaw * 0.017453292F;
		if(this.state != 1) {
			this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
			this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
		}
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
		NyakoriEntity nyakori = (NyakoriEntity) entitylivingbaseIn;
		if(nyakori.isSitting()) {
			setRotationAngle(Arm_r1, 1.0239F, -0.9732F, -0.3568F);
			setRotationAngle(Arm_r2, 0.4812F, 0.6593F, -0.3503F);
			this.state = 1;
		} else {
			setRotationAngle(Arm_r1, 0.0F, 0.0F, 0.0F);
			setRotationAngle(Arm_r2, 0.0F, 0.0F, 0.0F);
			this.state = 0;
		}
	}
}