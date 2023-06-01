package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.RubyCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RubyCowRenderer extends MobRenderer<RubyCowEntity, RubyCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/ruby_cow.png");
    public RubyCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new RubyCowModel(p_174304_.bakeLayer(RubyCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(RubyCowEntity p_114482_) {
        return TEXTURE;
    }
}