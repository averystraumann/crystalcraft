package com.averystraumann.crystalcraft.event;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.ModEntities;
import com.averystraumann.crystalcraft.entity.client.*;
import com.averystraumann.crystalcraft.entity.custom.*;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = crystalcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RUBY_COW.get(), RubyCowEntity.getRubyCowAttributes().build());
        event.put(ModEntities.SAPPHIRE_COW.get(), SapphireCowEntity.getSapphireCowAttributes().build());
        event.put(ModEntities.AMETHYST_COW.get(), AmethystCowEntity.getAmethystCowAttributes().build());
        event.put(ModEntities.CITRINE_COW.get(), CitrineCowEntity.getCitrineCowAttributes().build());
        event.put(ModEntities.WHITE_OPAL_COW.get(), WhiteOpalCowEntity.getWhiteOpalCowAttributes().build());
    }
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RUBY_COW.get(), RubyCowRenderer::new);
        event.registerEntityRenderer(ModEntities.SAPPHIRE_COW.get(), SapphireCowRenderer::new);
        event.registerEntityRenderer(ModEntities.AMETHYST_COW.get(), AmethystCowRenderer::new);
        event.registerEntityRenderer(ModEntities.CITRINE_COW.get(), CitrineCowRenderer::new);
        event.registerEntityRenderer(ModEntities.WHITE_OPAL_COW.get(), WhiteOpalCowRenderer::new);

    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RubyCowModel.LAYER_LOCATION, RubyCowModel::createBodyLayer);
        event.registerLayerDefinition(SapphireCowModel.LAYER_LOCATION, SapphireCowModel::createBodyLayer);
        event.registerLayerDefinition(AmethystCowModel.LAYER_LOCATION, AmethystCowModel::createBodyLayer);
        event.registerLayerDefinition(CitrineCowModel.LAYER_LOCATION, CitrineCowModel::createBodyLayer);
        event.registerLayerDefinition(WhiteOpalCowModel.LAYER_LOCATION, WhiteOpalCowModel::createBodyLayer);

    }


}
