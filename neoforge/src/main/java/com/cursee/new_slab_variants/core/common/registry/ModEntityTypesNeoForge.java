package com.cursee.new_slab_variants.core.common.registry;

import com.cursee.new_slab_variants.core.common.entity.PrimedTNTSlab;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypesNeoForge {

    public static void register() {}

    public static final RegistryObject<EntityType<PrimedTNTSlab>> PRIMED_TNT_SLAB = RegistryNeoForge.registerEntityType("primed_tnt_slab", () ->
            EntityType.Builder.<PrimedTNTSlab>of(PrimedTNTSlab::new, MobCategory.MISC)
                    .fireImmune()
                    .sized(0.98f, 0.49f)
                    .clientTrackingRange(10)
                    .updateInterval(10)
                    .build("primed_tnt_slab"));
}
