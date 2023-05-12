package com.averystraumann.crystalcraft.datagen;

import com.averystraumann.crystalcraft.Blocks.ModBlocks;
import com.averystraumann.crystalcraft.crystalcraft;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, crystalcraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //generates block states json files as well as block and item model json files
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.AMETHYST_ORE);
        blockWithItem(ModBlocks.CITRINE_ORE);
        blockWithItem(ModBlocks.WHITE_OPAL_ORE);

        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CITRINE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_WHITE_OPAL_ORE);

        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.AMETHYST_BLOCK);
        blockWithItem(ModBlocks.CITRINE_BLOCK);
        blockWithItem(ModBlocks.WHITE_OPAL_BLOCK);

    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }





}
