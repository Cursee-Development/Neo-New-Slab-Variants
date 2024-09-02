package com.cursee.new_slab_variants.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> finishedRecipe) {

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocksForge.DIRT_SLAB.get())
//                .pattern("BBB")
//                .pattern("BBB")
//                .define('B', Blocks.DIRT)
//                .unlockedBy("has_dirt", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIRT).build()))
//                .save(finishedRecipe);

        // slab(finishedRecipe, RecipeCategory.MISC, ModBlocksForge.DIRT_SLAB.get(), Blocks.DIRT);
    }
}
