package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEntityTypesForge {

    public static void register() {}

    public static final DeferredHolder<EntityType<?>, EntityType<PrimedTNTSlab>> PRIMED_TNT_SLAB = RegistryForge.registerEntityType("primed_tnt_slab", () ->
            EntityType.Builder.<PrimedTNTSlab>of(PrimedTNTSlab::new, MobCategory.MISC)
                    .fireImmune()
                    .sized(0.98f, 0.49f)
                    .clientTrackingRange(10)
                    .updateInterval(10)
                    .build("primed_tnt_slab"));
}