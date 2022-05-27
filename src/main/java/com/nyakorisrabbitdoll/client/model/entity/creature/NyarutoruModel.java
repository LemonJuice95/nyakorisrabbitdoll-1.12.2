package com.nyakorisrabbitdoll.client.model.entity.creature;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

import com.nyakorisrabbitdoll.common.entity.creature.NyarutoruEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.math.MathHelper;

public class NyarutoruModel extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Body;
	private final ModelRenderer Skirt;
	private final ModelRenderer Bow;
	private final ModelRenderer Bow5_r1;
	private final ModelRenderer Bow4_r1;
	private final ModelRenderer Bow3_r1;
	private final ModelRenderer Bow2_r1;
	private final ModelRenderer Backpack;
	private final ModelRenderer Backpack8_r1;
	private final ModelRenderer Backpack7_r1;
	private final ModelRenderer Backpack6_r1;
	private final ModelRenderer Backpack5_r1;
	private final ModelRenderer Backpack4_r1;
	private final ModelRenderer Backpack2_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Arm_r1;
	private final ModelRenderer Arm_r2;
	private final ModelRenderer Head;
	private final ModelRenderer Hair;
	private final ModelRenderer LeftBow;
	private final ModelRenderer Bow5_r2;
	private final ModelRenderer Bow4_r2;
	private final ModelRenderer RightBow;
	private final ModelRenderer Bow5_r3;
	private final ModelRenderer Bow4_r3;
	private final ModelRenderer LeftEar;
	private final ModelRenderer RightEar;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2_r1;
	private final ModelRenderer Tail1_r1;
	public int state = 0;

	public NyarutoruModel() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 18.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -1.0F, -2.0F, -1.5F, 3, 8, 3, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 18.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.0F, -2.0F, -1.5F, 3, 8, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 40, 47, -3.5F, -6.0F, -2.5F, 7, 10, 5, 0.0F, false));

		Skirt = new ModelRenderer(this);
		Skirt.setRotationPoint(0.0F, 13.0F, 0.0F);
		Body.addChild(Skirt);
		Skirt.cubeList.add(new ModelBox(Skirt, 0, 53, -6.0F, -8.0F, -4.5F, 12, 2, 9, 0.0F, false));
		Skirt.cubeList.add(new ModelBox(Skirt, 0, 44, -5.0F, -10.0F, -3.5F, 10, 2, 7, 0.0F, false));

		Bow = new ModelRenderer(this);
		Bow.setRotationPoint(0.0F, 13.0F, 0.0F);
		Body.addChild(Bow);
		Bow.cubeList.add(new ModelBox(Bow, 0, 60, -0.5F, -17.5F, 2.5F, 1, 1, 1, 0.0F, false));

		Bow5_r1 = new ModelRenderer(this);
		Bow5_r1.setRotationPoint(1.0F, -16.0F, 3.0F);
		Bow.addChild(Bow5_r1);
		setRotationAngle(Bow5_r1, 0.0F, 0.0F, 0.4363F);
		Bow5_r1.cubeList.add(new ModelBox(Bow5_r1, 23, 54, -2.25F, -0.25F, -0.51F, 1, 3, 1, 0.0F, false));

		Bow4_r1 = new ModelRenderer(this);
		Bow4_r1.setRotationPoint(1.0F, -16.0F, 3.0F);
		Bow.addChild(Bow4_r1);
		setRotationAngle(Bow4_r1, 0.0F, 0.0F, -0.4363F);
		Bow4_r1.cubeList.add(new ModelBox(Bow4_r1, 23, 54, -0.5F, -1.0F, -0.51F, 1, 3, 1, 0.0F, false));

		Bow3_r1 = new ModelRenderer(this);
		Bow3_r1.setRotationPoint(1.0F, -17.0F, 3.0F);
		Bow.addChild(Bow3_r1);
		setRotationAngle(Bow3_r1, 0.0F, 0.0F, 0.4363F);
		Bow3_r1.cubeList.add(new ModelBox(Bow3_r1, 0, 57, -0.5F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));

		Bow2_r1 = new ModelRenderer(this);
		Bow2_r1.setRotationPoint(-1.0F, -17.0F, 0.0F);
		Bow.addChild(Bow2_r1);
		setRotationAngle(Bow2_r1, -0.0054F, 0.0197F, -0.434F);
		Bow2_r1.cubeList.add(new ModelBox(Bow2_r1, 0, 54, -1.5F, -1.5F, 2.5F, 2, 2, 1, 0.0F, false));

		Backpack = new ModelRenderer(this);
		Backpack.setRotationPoint(0.0F, 13.0F, 0.0F);
		Body.addChild(Backpack);
		Backpack.cubeList.add(new ModelBox(Backpack, 10, 34, -2.0F, -18.0F, -4.51F, 4, 7, 2, 0.0F, false));

		Backpack8_r1 = new ModelRenderer(this);
		Backpack8_r1.setRotationPoint(0.0F, -21.0F, -6.0F);
		Backpack.addChild(Backpack8_r1);
		setRotationAngle(Backpack8_r1, 0.8351F, 0.2577F, -0.5625F);
		Backpack8_r1.cubeList.add(new ModelBox(Backpack8_r1, 14, 35, -1.5F, -3.9195F, -0.6263F, 1, 4, 1, 0.0F, false));

		Backpack7_r1 = new ModelRenderer(this);
		Backpack7_r1.setRotationPoint(0.0F, -21.0F, -6.0F);
		Backpack.addChild(Backpack7_r1);
		setRotationAngle(Backpack7_r1, 0.9326F, -0.3446F, 0.4024F);
		Backpack7_r1.cubeList.add(new ModelBox(Backpack7_r1, 14, 35, 0.5F, -3.9195F, -0.6263F, 1, 4, 1, 0.0F, false));

		Backpack6_r1 = new ModelRenderer(this);
		Backpack6_r1.setRotationPoint(0.0F, -19.0F, -3.0F);
		Backpack.addChild(Backpack6_r1);
		setRotationAngle(Backpack6_r1, 0.4363F, 0.0F, 0.0F);
		Backpack6_r1.cubeList.add(new ModelBox(Backpack6_r1, 10, 34, -2.0F, -3.0F, -2.5F, 4, 4, 4, 0.0F, false));

		Backpack5_r1 = new ModelRenderer(this);
		Backpack5_r1.setRotationPoint(-1.0F, -11.0F, -4.0F);
		Backpack.addChild(Backpack5_r1);
		setRotationAngle(Backpack5_r1, -0.4001F, 0.103F, 0.2357F);
		Backpack5_r1.cubeList.add(new ModelBox(Backpack5_r1, 12, 36, -3.0F, -6.0F, -2.5F, 1, 6, 1, 0.0F, false));

		Backpack4_r1 = new ModelRenderer(this);
		Backpack4_r1.setRotationPoint(-1.0F, -11.0F, -4.0F);
		Backpack.addChild(Backpack4_r1);
		setRotationAngle(Backpack4_r1, -0.3315F, -0.225F, -0.2464F);
		Backpack4_r1.cubeList.add(new ModelBox(Backpack4_r1, 12, 36, 4.0F, -5.3F, -2.5F, 1, 6, 1, 0.0F, false));
		Backpack4_r1.cubeList.add(new ModelBox(Backpack4_r1, 12, 36, 1.0F, -0.3F, -0.5F, 1, 6, 1, 0.0F, false));

		Backpack2_r1 = new ModelRenderer(this);
		Backpack2_r1.setRotationPoint(-1.0F, -11.0F, -4.0F);
		Backpack.addChild(Backpack2_r1);
		setRotationAngle(Backpack2_r1, -0.3979F, -0.0176F, 0.2866F);
		Backpack2_r1.cubeList.add(new ModelBox(Backpack2_r1, 12, 36, 0.0F, -1.0F, -0.5F, 1, 6, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-4.0F, 5.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.1309F);


		Arm_r1 = new ModelRenderer(this);
		Arm_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		LeftArm.addChild(Arm_r1);
		setRotationAngle(Arm_r1, 0.0F, 0.0F, 0.0F);
		Arm_r1.cubeList.add(new ModelBox(Arm_r1, 0, 33, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(4.0F, 5.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 3.1416F, -0.1309F);


		Arm_r2 = new ModelRenderer(this);
		Arm_r2.setRotationPoint(2.0F, 1.0F, 0.0F);
		RightArm.addChild(Arm_r2);
		setRotationAngle(Arm_r2, 0.0F, 0.0F, 0.0F);
		Arm_r2.cubeList.add(new ModelBox(Arm_r2, 0, 33, -3.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 34, 32, -4.0F, -7.0F, -3.5F, 8, 7, 7, 0.0F, false));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 19.0F, 0.0F);
		Head.addChild(Hair);
		Hair.cubeList.add(new ModelBox(Hair, 40, 25, -4.0F, -27.0F, -1.5F, 8, 1, 4, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 5, -5.0F, -25.0F, -2.5F, 1, 10, 6, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 0, -5.0F, -15.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 0, -4.0F, -15.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 5, -5.0F, -26.0F, -3.0F, 1, 1, 6, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 5, 4.0F, -25.0F, -2.5F, 1, 10, 6, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 0, 4.0F, -15.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 50, 5, 4.0F, -26.0F, -2.5F, 1, 1, 5, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 28, 6, -4.0F, -25.0F, -4.5F, 8, 10, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 0, -4.0F, -15.0F, -4.0F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 60, 0, 3.0F, -15.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 28, -4.0F, -25.0F, 3.5F, 8, 2, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 18, 29, -3.0F, -26.0F, 3.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 33, 42, -3.0F, -27.0F, -3.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 46, 5, -3.0F, -26.0F, -4.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 25, 2.0F, -23.0F, 3.0F, 2, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 25, -4.0F, -23.0F, 3.0F, 2, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 11, -4.0F, -22.0F, 3.5F, 1, 3, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 11, 3.0F, -22.0F, 3.5F, 1, 3, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 5, 11, 0.0F, -23.0F, 3.5F, 1, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 22, -4.0F, -28.0F, -1.0F, 8, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 0, 20, -5.0F, -27.0F, -1.0F, 10, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 33, 42, -4.0F, -27.0F, -2.5F, 8, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 59, 7, -5.0F, -25.0F, -3.5F, 1, 11, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 43, 12, -3.0F, -27.0F, 2.5F, 6, 1, 1, 0.0F, false));
		Hair.cubeList.add(new ModelBox(Hair, 59, 7, 4.0F, -25.0F, -3.5F, 1, 11, 1, 0.0F, false));

		LeftBow = new ModelRenderer(this);
		LeftBow.setRotationPoint(0.0F, 19.0F, -1.0F);
		Head.addChild(LeftBow);
		LeftBow.cubeList.add(new ModelBox(LeftBow, 0, 60, 3.0F, -23.0F, 5.0F, 1, 1, 1, 0.0F, false));
		LeftBow.cubeList.add(new ModelBox(LeftBow, 1, 47, 2.0F, -23.5F, 5.0F, 1, 2, 1, 0.0F, false));
		LeftBow.cubeList.add(new ModelBox(LeftBow, 1, 47, 4.0F, -23.5F, 5.0F, 1, 2, 1, 0.0F, false));

		Bow5_r2 = new ModelRenderer(this);
		Bow5_r2.setRotationPoint(4.0F, -22.0F, 4.0F);
		LeftBow.addChild(Bow5_r2);
		setRotationAngle(Bow5_r2, 0.0F, 0.0F, 0.4363F);
		Bow5_r2.cubeList.add(new ModelBox(Bow5_r2, 1, 47, -1.0F, 0.2F, 1.0F, 1, 2, 1, 0.0F, false));

		Bow4_r2 = new ModelRenderer(this);
		Bow4_r2.setRotationPoint(4.0F, -22.0F, 4.0F);
		LeftBow.addChild(Bow4_r2);
		setRotationAngle(Bow4_r2, 0.0F, 0.0F, -0.3927F);
		Bow4_r2.cubeList.add(new ModelBox(Bow4_r2, 1, 47, -0.75F, -0.15F, 1.0F, 1, 2, 1, 0.0F, false));

		RightBow = new ModelRenderer(this);
		RightBow.setRotationPoint(-7.0F, 19.0F, 0.0F);
		Head.addChild(RightBow);
		RightBow.cubeList.add(new ModelBox(RightBow, 0, 60, 3.0F, -23.0F, 4.0F, 1, 1, 1, 0.0F, false));
		RightBow.cubeList.add(new ModelBox(RightBow, 1, 47, 2.0F, -23.5F, 4.0F, 1, 2, 1, 0.0F, false));
		RightBow.cubeList.add(new ModelBox(RightBow, 1, 47, 4.0F, -23.5F, 4.0F, 1, 2, 1, 0.0F, false));

		Bow5_r3 = new ModelRenderer(this);
		Bow5_r3.setRotationPoint(4.0F, -22.0F, 4.0F);
		RightBow.addChild(Bow5_r3);
		setRotationAngle(Bow5_r3, 0.0F, 0.0F, 0.4363F);
		Bow5_r3.cubeList.add(new ModelBox(Bow5_r3, 1, 47, -1.0F, 0.2F, 0.0F, 1, 2, 1, 0.0F, false));

		Bow4_r3 = new ModelRenderer(this);
		Bow4_r3.setRotationPoint(4.0F, -22.0F, 4.0F);
		RightBow.addChild(Bow4_r3);
		setRotationAngle(Bow4_r3, 0.0F, 0.0F, -0.3927F);
		Bow4_r3.cubeList.add(new ModelBox(Bow4_r3, 1, 47, -0.75F, -0.15F, 0.0F, 1, 2, 1, 0.0F, false));

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(4.0F, -6.0F, 4.0F);
		Head.addChild(LeftEar);
		setRotationAngle(LeftEar, -0.1413F, 0.283F, 0.26F);
		LeftEar.cubeList.add(new ModelBox(LeftEar, 17, 0, -1.0F, -1.5F, -1.49F, 1, 2, 1, 0.0F, false));
		LeftEar.cubeList.add(new ModelBox(LeftEar, 21, 0, 0.0F, -1.5F, -1.5F, 1, 2, 1, 0.0F, false));
		LeftEar.cubeList.add(new ModelBox(LeftEar, 25, 0, -2.0F, -1.5F, -1.5F, 1, 2, 1, 0.0F, false));
		LeftEar.cubeList.add(new ModelBox(LeftEar, 34, 0, -0.5F, -2.0F, -1.5F, 1, 1, 1, 0.0F, false));
		LeftEar.cubeList.add(new ModelBox(LeftEar, 34, 0, -1.5F, -2.0F, -1.5F, 1, 1, 1, 0.0F, false));
		LeftEar.cubeList.add(new ModelBox(LeftEar, 34, 0, -1.0F, -2.5F, -1.5F, 1, 1, 1, 0.0F, false));

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-3.0F, -7.0F, 6.0F);
		Head.addChild(RightEar);
		setRotationAngle(RightEar, 0.1052F, -0.3379F, -0.4866F);
		RightEar.cubeList.add(new ModelBox(RightEar, 17, 0, -2.0F, -1.0F, -2.59F, 1, 2, 1, 0.0F, false));
		RightEar.cubeList.add(new ModelBox(RightEar, 21, 0, -1.0F, -1.0F, -2.6F, 1, 2, 1, 0.0F, false));
		RightEar.cubeList.add(new ModelBox(RightEar, 25, 0, -3.0F, -1.0F, -2.6F, 1, 2, 1, 0.0F, false));
		RightEar.cubeList.add(new ModelBox(RightEar, 34, 0, -1.5F, -1.5F, -2.6F, 1, 1, 1, 0.0F, false));
		RightEar.cubeList.add(new ModelBox(RightEar, 34, 0, -2.5F, -1.5F, -2.6F, 1, 1, 1, 0.0F, false));
		RightEar.cubeList.add(new ModelBox(RightEar, 34, 0, -2.0F, -2.0F, -2.6F, 1, 1, 1, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 15.0F, 0.0F);
		setRotationAngle(Tail, 0.0F, 3.1416F, 0.0F);
		

		Tail2_r1 = new ModelRenderer(this);
		Tail2_r1.setRotationPoint(0.0F, 1.0F, -4.0F);
		Tail.addChild(Tail2_r1);
		setRotationAngle(Tail2_r1, -0.829F, 0.0F, 0.0F);
		Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 40, 53, -0.5F, 4.95F, -7.5F, 1, 1, 7, 0.0F, false));

		Tail1_r1 = new ModelRenderer(this);
		Tail1_r1.setRotationPoint(0.0F, 1.0F, -4.0F);
		Tail.addChild(Tail1_r1);
		setRotationAngle(Tail1_r1, 0.5236F, 0.0F, 0.0F);
		Tail1_r1.cubeList.add(new ModelBox(Tail1_r1, 40, 53, -0.5F, 0.0F, -6.0F, 1, 1, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftLeg.render(f5);
		RightLeg.render(f5);
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
		Head.render(f5);
		Tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.Head.rotateAngleX = - headPitch * 0.017453292F;
		this.Head.rotateAngleY = 3.1416F + netHeadYaw * 0.017453292F;
		if(this.state != 1) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
			this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
			this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
		}
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
		NyarutoruEntity nyarutoru = (NyarutoruEntity) entitylivingbaseIn;
		if(nyarutoru.isSitting()) {
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