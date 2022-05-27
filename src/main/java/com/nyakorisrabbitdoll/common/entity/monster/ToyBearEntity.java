package com.nyakorisrabbitdoll.common.entity.monster;

import com.nyakorisrabbitdoll.common.entity.ai.EntityAIToyBearAttack;
import com.nyakorisrabbitdoll.common.entity.creature.*;
import com.nyakorisrabbitdoll.data.loot_table.NLootTables;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ToyBearEntity extends EntityMob {
    private static final DataParameter<Boolean> ARMS_RAISED = EntityDataManager.<Boolean>createKey(ToyBearEntity.class, DataSerializers.BOOLEAN);

    public ToyBearEntity(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.95F);
    }

    public void setArmsRaised(boolean armsRaised) {
        this.getDataManager().set(ARMS_RAISED, Boolean.valueOf(armsRaised));
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIToyBearAttack(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    @SuppressWarnings("unchecked")
    protected void applyEntityAI() {
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, NyarutoruEntity.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, YuriEntity.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, YuroEntity.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, NyakoriEntity.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, NyakoriTheBlackCatEntity.class, false));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.getDataManager().register(ARMS_RAISED, Boolean.valueOf(false));
    }

    @SideOnly(Side.CLIENT)
    public boolean isArmsRaised() {
        return ((Boolean)this.getDataManager().get(ARMS_RAISED)).booleanValue();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (super.attackEntityFrom(source, amount))
        {
            EntityLivingBase entitylivingbase = this.getAttackTarget();

            if (entitylivingbase == null && source.getTrueSource() instanceof EntityLivingBase)
            {
                entitylivingbase = (EntityLivingBase)source.getTrueSource();
            }

            int i = MathHelper.floor(this.posX);
            int j = MathHelper.floor(this.posY);
            int k = MathHelper.floor(this.posZ);
            ToyBearEntity entity;
            entity = new ToyBearEntity(this.world);

            for (int l = 0; l < 50; ++l) {
                int i1 = i + MathHelper.getInt(this.rand, 7, 40) * MathHelper.getInt(this.rand, -1, 1);
                int j1 = j + MathHelper.getInt(this.rand, 7, 40) * MathHelper.getInt(this.rand, -1, 1);
                int k1 = k + MathHelper.getInt(this.rand, 7, 40) * MathHelper.getInt(this.rand, -1, 1);

                if (this.world.getBlockState(new BlockPos(i1, j1 - 1, k1)).isSideSolid(this.world, new BlockPos(i1, j1 - 1, k1), net.minecraft.util.EnumFacing.UP) && this.world.getLightFromNeighbors(new BlockPos(i1, j1, k1)) < 10) {
                    entity.setPosition((double) i1, (double) j1, (double) k1);

                    if (!this.world.isAnyPlayerWithinRangeAt((double) i1, (double) j1, (double) k1, 7.0D) && this.world.checkNoEntityCollision(entity.getEntityBoundingBox(), entity) && this.world.getCollisionBoxes(entity, entity.getEntityBoundingBox()).isEmpty() && !this.world.containsAnyLiquid(entity.getEntityBoundingBox())) {
                        this.world.spawnEntity(entity);
                        if (entitylivingbase != null) entity.setAttackTarget(entitylivingbase);
                        entity.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos(entity)), (IEntityLivingData) null);
                        break;
                    }
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return NLootTables.TOY_BEAR;
    }

}
