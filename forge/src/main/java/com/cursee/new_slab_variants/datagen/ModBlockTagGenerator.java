package com.cursee.new_slab_variants.datagen;

import com.cursee.new_slab_variants.Constants;
import com.cursee.new_slab_variants.core.common.registry.RegistryForge;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        // this.tag(BlockTags.SLABS).add(ModBlocksForge.DIRT_SLAB.get());

        for (RegistryObject<Block> block :  RegistryForge.BLOCKS.getEntries()) {
            this.tag(BlockTags.SLABS).add(block.get());
            this.tag(BlockTags.NEEDS_STONE_TOOL).add(block.get());
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
        }

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
