package com.averystraumann.crystalcraft;

import com.averystraumann.crystalcraft.Blocks.ModBlocks;
import com.averystraumann.crystalcraft.Items.ModItems;
import com.averystraumann.crystalcraft.effect.ModEffects;
import com.averystraumann.crystalcraft.entity.ModEntities;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.GenericEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(com.averystraumann.crystalcraft.crystalcraft.MODID)
public class crystalcraft
{
    public static final String MODID = "crystalcraft";
    private static final Logger LOGGER = LogUtils.getLogger();


    public crystalcraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEffects.register(modEventBus);
        ModEntities.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.AMETHYST);
            event.accept(ModItems.CITRINE);
            event.accept(ModItems.WHITE_OPAL);
            event.accept(ModItems.PERIDOT);
            }

        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.CITRINE_ORE);
            event.accept(ModBlocks.AMETHYST_ORE);
            event.accept(ModBlocks.WHITE_OPAL_ORE);
            event.accept(ModBlocks.PERIDOT_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_CITRINE_ORE);
            event.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE);
            event.accept(ModBlocks.DEEPSLATE_WHITE_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE);
        }
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.CITRINE_BLOCK);
            event.accept(ModBlocks.AMETHYST_BLOCK);
            event.accept(ModBlocks.WHITE_OPAL_BLOCK);
            event.accept(ModBlocks.PERIDOT_BLOCK);
        }

        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.AMETHYST_HELMET);
            event.accept(ModItems.AMETHYST_CHESTPLATE);
            event.accept(ModItems.AMETHYST_LEGGINGS);
            event.accept(ModItems.AMETHYST_BOOTS);
            event.accept(ModItems.CITRINE_HELMET);
            event.accept(ModItems.CITRINE_CHESTPLATE);
            event.accept(ModItems.CITRINE_LEGGINGS);
            event.accept(ModItems.CITRINE_BOOTS);
            event.accept(ModItems.WHITE_OPAL_HELMET);
            event.accept(ModItems.WHITE_OPAL_CHESTPLATE);
            event.accept(ModItems.WHITE_OPAL_LEGGINGS);
            event.accept(ModItems.WHITE_OPAL_BOOTS);
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.AMETHYST_SWORD);
            event.accept(ModItems.CITRINE_SWORD);
            event.accept(ModItems.WHITE_OPAL_SWORD);
            event.accept(ModItems.PERIDOT_HELMET);
            event.accept(ModItems.PERIDOT_CHESTPLATE);
            event.accept(ModItems.PERIDOT_LEGGINGS);
            event.accept(ModItems.PERIDOT_BOOTS);
            event.accept(ModItems.PERIDOT_SWORD);
        }

        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.AMETHYST_PICKAXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.AMETHYST_SHOVEL);
            event.accept(ModItems.AMETHYST_HOE);
            event.accept(ModItems.CITRINE_PICKAXE);
            event.accept(ModItems.CITRINE_AXE);
            event.accept(ModItems.CITRINE_SHOVEL);
            event.accept(ModItems.CITRINE_HOE);
            event.accept(ModItems.WHITE_OPAL_PICKAXE);
            event.accept(ModItems.WHITE_OPAL_AXE);
            event.accept(ModItems.WHITE_OPAL_SHOVEL);
            event.accept(ModItems.WHITE_OPAL_HOE);
            event.accept(ModItems.PERIDOT_PICKAXE);
            event.accept(ModItems.PERIDOT_AXE);
            event.accept(ModItems.PERIDOT_SHOVEL);
            event.accept(ModItems.PERIDOT_HOE);
        }

        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RUBY_MILK);
            event.accept(ModItems.SAPPHIRE_MILK);
            event.accept(ModItems.AMETHYST_MILK);
            event.accept(ModItems.CITRINE_MILK);
            event.accept(ModItems.WHITE_OPAL_MILK);
            event.accept(ModItems.PERIDOT_MILK);
        }

        if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.RUBY_COW_SPAWN_EGG);
            event.accept(ModItems.AMETHYST_COW_SPAWN_EGG);
            event.accept(ModItems.SAPPHIRE_COW_SPAWN_EGG);
            event.accept(ModItems.CITRINE_COW_SPAWN_EGG);
            event.accept(ModItems.WHITE_OPAL_COW_SPAWN_EGG);
            event.accept(ModItems.PERIDOT_COW_SPAWN_EGG);
        }

    }


    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }



    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }



    }
}
