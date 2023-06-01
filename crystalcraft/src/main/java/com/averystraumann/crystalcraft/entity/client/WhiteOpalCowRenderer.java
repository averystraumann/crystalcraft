package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.WhiteOpalCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WhiteOpalCowRenderer extends MobRenderer<WhiteOpalCowEntity, WhiteOpalCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/citrine_cow.png");
    public WhiteOpalCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new WhiteOpalCowModel(p_174304_.bakeLayer(WhiteOpalCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(WhiteOpalCowEntity p_114482_) {
        return TEXTURE;
    }
}