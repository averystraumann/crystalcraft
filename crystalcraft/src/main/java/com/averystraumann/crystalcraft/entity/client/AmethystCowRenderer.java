package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.AmethystCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AmethystCowRenderer extends MobRenderer<AmethystCowEntity, AmethystCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/amethyst_cow.png");
    public AmethystCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new AmethystCowModel(p_174304_.bakeLayer(AmethystCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(AmethystCowEntity p_114482_) {
        return TEXTURE;
    }
}