package com.cursee.new_slab_variants.core.common.entity;

import com.cursee.new_slab_variants.platform.Services;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.jetbrains.annotations.Nullable;

public class PrimedTNTSlab extends Entity implements TraceableEntity {

    private static final EntityDataAccessor<Integer> DATA_FUSE_ID = SynchedEntityData.defineId(PrimedTNTSlab.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<String> SLAB_TYPE_ID = SynchedEntityData.defineId(PrimedTNTSlab.class, EntityDataSerializers.STRING);

    private static final int DEFAULT_FUSE_TIME = 80;
    private @Nullable LivingEntity owner;

    public PrimedTNTSlab(EntityType<? extends PrimedTNTSlab> $$0, Level $$1) {
        super($$0, $$1);
        this.blocksBuilding = true;
    }

    public <T extends Comparable<T>> PrimedTNTSlab(Level $$0, double $$1, double $$2, double $$3, @Nullable LivingEntity $$4, T value) {
        this(Services.PLATFORM.getPrimedTNTSlabEntityType(), $$0);

        // bottom double top
        this.setSlabType(((SlabType) value).toString());

        this.setPos($$1, $$2, $$3);
        double $$5 = $$0.random.nextDouble() * 6.2831854820251465;
        this.setDeltaMovement(-Math.sin($$5) * 0.02, 0.20000000298023224, -Math.cos($$5) * 0.02);
        this.setFuse(DEFAULT_FUSE_TIME);
        this.xo = $$1;
        this.yo = $$2;
        this.zo = $$3;
        this.owner = $$4;
    }

//    public <T extends Comparable<T>> PrimedTNTSlab(Level $$0, double v, double y, double v1, LivingEntity $$2, T value) {
//        super();
//    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(DATA_FUSE_ID, 80);
        this.entityData.define(SLAB_TYPE_ID, "bottom");
    }

    protected MovementEmission getMovementEmission() {
        return MovementEmission.NONE;
    }

    public boolean isPickable() {
        return !this.isRemoved();
    }

    public void tick() {
        if (!this.isNoGravity()) {
            this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.04, 0.0));
        }

        this.move(MoverType.SELF, this.getDeltaMovement());
        this.setDeltaMovement(this.getDeltaMovement().scale(0.98));
        if (this.onGround()) {
            this.setDeltaMovement(this.getDeltaMovement().multiply(0.7, -0.5, 0.7));
        }

        int $$0 = this.getFuse() - 1;
        this.setFuse($$0);
        if ($$0 <= 0) {
            this.discard();
            if (!this.level().isClientSide) {
                this.explode();
            }
        } else {
            this.updateInWaterStateAndDoFluidPushing();
            if (this.level().isClientSide) {
                this.level().addParticle(ParticleTypes.SMOKE, this.getX(), this.getY() + 0.5, this.getZ(), 0.0, 0.0, 0.0);
            }
        }

    }

    private void explode() {
        float $$0 = 4.0F;
        this.level().explode(this, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
    }

    protected void addAdditionalSaveData(CompoundTag $$0) {
        $$0.putShort("Fuse", (short)this.getFuse());
        $$0.putString("SlabType", (String)this.getSlabType());
    }

    protected void readAdditionalSaveData(CompoundTag $$0) {
        this.setFuse($$0.getShort("Fuse"));
        this.setSlabType($$0.getString("SlabType"));
    }

    @javax.annotation.Nullable
    public LivingEntity getOwner() {
        return this.owner;
    }

    protected float getEyeHeight(Pose $$0, EntityDimensions $$1) {
        return 0.15F;
    }

    public void setFuse(int $$0) {
        this.entityData.set(DATA_FUSE_ID, $$0);
    }

    public void setSlabType(String $$0) {
        this.entityData.set(SLAB_TYPE_ID, $$0);
    }

    public int getFuse() {
        return (Integer)this.entityData.get(DATA_FUSE_ID);
    }

    public String getSlabType() {
        return (String)this.entityData.get(SLAB_TYPE_ID);
    }
}
