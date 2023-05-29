package com.averystraumann.crystalcraft.event;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.ModEntities;
import com.averystraumann.crystalcraft.entity.client.RubyCowModel;
import com.averystraumann.crystalcraft.entity.client.RubyCowRenderer;
import com.averystraumann.crystalcraft.entity.custom.RubyCowEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = crystalcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RUBY_COW.get(), RubyCowEntity.getRubyCowAttributes().build());
    }
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RUBY_COW.get(), RubyCowRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RubyCowModel.LAYER_LOCATION, RubyCowModel::createBodyLayer);
    }


}
