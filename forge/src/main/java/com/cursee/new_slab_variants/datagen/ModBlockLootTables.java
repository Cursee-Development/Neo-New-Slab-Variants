package com.cursee.new_slab_variants.datagen;

import com.cursee.new_slab_variants.core.common.registry.RegistryForge;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//        getKnownBlocks().forEach(this::dropSelf);
//        dropSelf(ModBlocksForge.DIRT_SLAB.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegistryForge.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
