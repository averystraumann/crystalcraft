package com.averystraumann.crystalcraft.datagen;

import com.averystraumann.crystalcraft.Items.ModItems;
import com.averystraumann.crystalcraft.crystalcraft;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, crystalcraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.CITRINE);
        simpleItem(ModItems.AMETHYST);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.WHITE_OPAL);
        simpleItem(ModItems.RUBY_HELMET);
        simpleItem(ModItems.RUBY_CHESTPLATE);
        simpleItem(ModItems.RUBY_LEGGINGS);
        simpleItem(ModItems.RUBY_BOOTS);
        simpleItem(ModItems.SAPPHIRE_HELMET);
        simpleItem(ModItems.SAPPHIRE_CHESTPLATE);
        simpleItem(ModItems.SAPPHIRE_LEGGINGS);
        simpleItem(ModItems.SAPPHIRE_BOOTS);
        simpleItem(ModItems.AMETHYST_HELMET);
        simpleItem(ModItems.AMETHYST_CHESTPLATE);
        simpleItem(ModItems.AMETHYST_LEGGINGS);
        simpleItem(ModItems.AMETHYST_BOOTS);
        simpleItem(ModItems.CITRINE_HELMET);
        simpleItem(ModItems.CITRINE_CHESTPLATE);
        simpleItem(ModItems.CITRINE_LEGGINGS);
        simpleItem(ModItems.CITRINE_BOOTS);
        simpleItem(ModItems.WHITE_OPAL_HELMET);
        simpleItem(ModItems.WHITE_OPAL_CHESTPLATE);
        simpleItem(ModItems.WHITE_OPAL_LEGGINGS);
        simpleItem(ModItems.WHITE_OPAL_BOOTS);
        simpleItem(ModItems.RUBY_SWORD);
        simpleItem(ModItems.RUBY_PICKAXE);
        simpleItem(ModItems.RUBY_AXE);
        simpleItem(ModItems.RUBY_SHOVEL);
        simpleItem(ModItems.RUBY_HOE);
        simpleItem(ModItems.SAPPHIRE_SWORD);
        simpleItem(ModItems.SAPPHIRE_PICKAXE);
        simpleItem(ModItems.SAPPHIRE_AXE);
        simpleItem(ModItems.SAPPHIRE_SHOVEL);
        simpleItem(ModItems.SAPPHIRE_HOE);
        simpleItem(ModItems.AMETHYST_SWORD);
        simpleItem(ModItems.AMETHYST_PICKAXE);
        simpleItem(ModItems.AMETHYST_AXE);
        simpleItem(ModItems.AMETHYST_SHOVEL);
        simpleItem(ModItems.AMETHYST_HOE);
        simpleItem(ModItems.CITRINE_SWORD);
        simpleItem(ModItems.CITRINE_PICKAXE);
        simpleItem(ModItems.CITRINE_AXE);
        simpleItem(ModItems.CITRINE_SHOVEL);
        simpleItem(ModItems.CITRINE_HOE);
        simpleItem(ModItems.WHITE_OPAL_SWORD);
        simpleItem(ModItems.WHITE_OPAL_PICKAXE);
        simpleItem(ModItems.WHITE_OPAL_AXE);
        simpleItem(ModItems.WHITE_OPAL_SHOVEL);
        simpleItem(ModItems.WHITE_OPAL_HOE);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(com.averystraumann.crystalcraft.crystalcraft.MODID, "item/"+item.getId().getPath()));

    }



    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(com.averystraumann.crystalcraft.crystalcraft.MODID, "item/"+item.getId().getPath()));
    }




}
