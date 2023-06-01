package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.SapphireCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SapphireCowRenderer extends MobRenderer<SapphireCowEntity, SapphireCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/sapphire_cow.png");
    public SapphireCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new SapphireCowModel(p_174304_.bakeLayer(SapphireCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SapphireCowEntity p_114482_) {
        return TEXTURE;
    }
}