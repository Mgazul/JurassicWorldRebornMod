package mod.reborn.server.dinosaur;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.PteranodonEntity;
import mod.reborn.server.entity.dinosaur.QuetzalEntity;
import mod.reborn.server.period.TimePeriod;

public class QuetzalDinosaur extends Dinosaur
{
    public static final double SPEED = 0.4F;
    public QuetzalDinosaur()
    {
        super();

        this.setName("Quetzalcoatlus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(QuetzalEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x57504C, 0x24383F);
        this.setEggColorFemale(0x535F65, 0x56312C);
        this.setHealth(10, 20);
        this.setStrength(5, 20);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setMaximumAge(fromDays(40));
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.9F, 4.5F);
        this.setSizeY(1.5F, 5.0F);
        this.setStorage(27);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setBones("skull", "ribcage", "leg_bones", "neck_vertebrae", "pelvis", "tail_vertebrae", "wing_bones");
        this.setHeadCubeName("Head");
        this.setScale(2.4F, 0.35F);
        this.setAttackBias(1200);
        this.shouldDefendOffspring();
        this.setStorage(12);
        this.setBreeding(false, 1, 6, 20, false, true);
    }
}