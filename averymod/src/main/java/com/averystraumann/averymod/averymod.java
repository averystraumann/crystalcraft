package com.averystraumann.averymod;

import com.averystraumann.averymod.Blocks.ModBlocks;
import com.averystraumann.averymod.Items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(averymod.MODID)
public class averymod
{
    public static final String MODID = "averymod";
    private static final Logger LOGGER = LogUtils.getLogger();


    public averymod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
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
            }

        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.CITRINE_ORE);
            event.accept(ModBlocks.AMETHYST_ORE);
            event.accept(ModBlocks.WHITE_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_CITRINE_ORE);
            event.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE);
            event.accept(ModBlocks.DEEPSLATE_WHITE_OPAL_ORE);
        }
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.CITRINE_BLOCK);
            event.accept(ModBlocks.AMETHYST_BLOCK);
            event.accept(ModBlocks.WHITE_OPAL_BLOCK);
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
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
