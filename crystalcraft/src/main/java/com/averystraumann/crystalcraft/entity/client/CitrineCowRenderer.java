package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.CitrineCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CitrineCowRenderer extends MobRenderer<CitrineCowEntity, CitrineCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/citrine_cow.png");
    public CitrineCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new CitrineCowModel(p_174304_.bakeLayer(CitrineCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CitrineCowEntity p_114482_) {
        return TEXTURE;
    }
}