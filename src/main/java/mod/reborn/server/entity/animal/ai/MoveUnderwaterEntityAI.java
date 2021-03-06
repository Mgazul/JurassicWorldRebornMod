package mod.reborn.server.entity.animal.ai;

import mod.reborn.server.entity.DinosaurEntity;
import mod.reborn.server.entity.ai.Mutex;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class MoveUnderwaterEntityAI extends EntityAIBase {
    private EntityCreature swimmingEntity;
    private double xPosition;
    private double yPosition;
    private double zPosition;

    public MoveUnderwaterEntityAI(EntityCreature entity) {
        this.swimmingEntity = entity;
        this.setMutexBits(Mutex.MOVEMENT);
    }

    @Override
    public boolean shouldExecute() {
        if (this.swimmingEntity.getRNG().nextFloat() < 0.50) {
            return false;
        }
        Vec3d target = RandomPositionGenerator.findRandomTarget(this.swimmingEntity, 6, 2);
        if (target == null) {
            return false;
        } else {
            this.xPosition = target.x;
            this.yPosition = target.y;
            this.zPosition = target.z;
            return true;
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        return !this.swimmingEntity.getNavigator().noPath();
    }

    @Override
    public void startExecuting() {
        this.swimmingEntity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, 1.0D);
    }
}
