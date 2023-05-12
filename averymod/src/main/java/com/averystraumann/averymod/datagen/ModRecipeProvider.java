package com.averystraumann.averymod.datagen;

import com.averystraumann.averymod.Blocks.ModBlocks;
import com.averystraumann.averymod.Items.ModItems;
import com.averystraumann.averymod.averymod;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_, RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_, String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_)).save(p_250423_, new ResourceLocation(averymod.MODID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_).unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(averymod.MODID,p_250475_));
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(),
                RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(),
                RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get());

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.AMETHYST.get(),
                RecipeCategory.MISC, ModBlocks.AMETHYST_BLOCK.get());

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE.get(),
                RecipeCategory.MISC, ModBlocks.CITRINE_BLOCK.get());

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.WHITE_OPAL.get(),
                RecipeCategory.MISC, ModBlocks.WHITE_OPAL_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET.get())
                 .define('#', ModItems.RUBY.get())
                 .pattern("###")
                 .pattern("# #")
                 .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ModItems.RUBY.get()).build()))
                 .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE.get())
                .define('#', ModItems.RUBY.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS.get())
                .define('#', ModItems.RUBY.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS.get())
                .define('#', ModItems.RUBY.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_HELMET.get())
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_CHESTPLATE.get())
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_LEGGINGS.get())
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_BOOTS.get())
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET.get())
                .define('#', ModItems.AMETHYST.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_amethyst", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.AMETHYST.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE.get())
                .define('#', ModItems.AMETHYST.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_amethyst", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.AMETHYST.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS.get())
                .define('#', ModItems.AMETHYST.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_amethyst", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.AMETHYST.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS.get())
                .define('#', ModItems.AMETHYST.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_amethyst", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.AMETHYST.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CITRINE_HELMET.get())
                .define('#', ModItems.CITRINE.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_citrine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CITRINE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CITRINE_CHESTPLATE.get())
                .define('#', ModItems.CITRINE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_citrine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CITRINE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CITRINE_LEGGINGS.get())
                .define('#', ModItems.CITRINE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_citrine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CITRINE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CITRINE_BOOTS.get())
                .define('#', ModItems.CITRINE.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_citrine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CITRINE.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WHITE_OPAL_HELMET.get())
                .define('#', ModItems.WHITE_OPAL.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_white_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WHITE_OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WHITE_OPAL_CHESTPLATE.get())
                .define('#', ModItems.WHITE_OPAL.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_white_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WHITE_OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WHITE_OPAL_LEGGINGS.get())
                .define('#', ModItems.WHITE_OPAL.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_white_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WHITE_OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WHITE_OPAL_BOOTS.get())
                .define('#', ModItems.WHITE_OPAL.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_white_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WHITE_OPAL.get()).build()))
                .save(consumer);
    }
}
