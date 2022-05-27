package com.nyakorisrabbitdoll.common.entity.ai;

import com.nyakorisrabbitdoll.common.entity.monster.ToyBearEntity;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIToyBearAttack extends EntityAIAttackMelee {
    private final ToyBearEntity toyBear;
    private int raiseArmTicks;

    public EntityAIToyBearAttack(ToyBearEntity toyBear, double speed, boolean longMemory) {
        super(toyBear, speed, longMemory);
        this.toyBear = toyBear;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    @Override
    public void resetTask() {
        super.resetTask();
        this.toyBear.setArmsRaised(false);
    }

    public void updateTask()
    {
        super.updateTask();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10)
        {
            this.toyBear.setArmsRaised(true);
        }
        else
        {
            this.toyBear.setArmsRaised(false);
        }
    }
}
