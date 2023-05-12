package com.averystraumann.crystalcraft.datagen;

import com.averystraumann.crystalcraft.Blocks.ModBlocks;
import com.averystraumann.crystalcraft.Items.ModItems;
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
        //gen loot tables for all blocks
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        add(ModBlocks.RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));

        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        add(ModBlocks.SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));


        dropSelf(ModBlocks.AMETHYST_BLOCK.get());
        add(ModBlocks.AMETHYST_ORE.get(), (block) -> createOreDrop(ModBlocks.AMETHYST_ORE.get(), ModItems.AMETHYST.get()));
        add(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), ModItems.AMETHYST.get()));


        dropSelf(ModBlocks.CITRINE_BLOCK.get());
        add(ModBlocks.CITRINE_ORE.get(), (block) -> createOreDrop(ModBlocks.CITRINE_ORE.get(), ModItems.CITRINE.get()));
        add(ModBlocks.DEEPSLATE_CITRINE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_CITRINE_ORE.get(), ModItems.CITRINE.get()));


        dropSelf(ModBlocks.WHITE_OPAL_BLOCK.get());
        add(ModBlocks.WHITE_OPAL_ORE.get(), (block) -> createOreDrop(ModBlocks.WHITE_OPAL_ORE.get(), ModItems.WHITE_OPAL.get()));
        add(ModBlocks.DEEPSLATE_WHITE_OPAL_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_WHITE_OPAL_ORE.get(), ModItems.WHITE_OPAL.get()));




    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        //get every block for which a block loot table can be created
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }


}
