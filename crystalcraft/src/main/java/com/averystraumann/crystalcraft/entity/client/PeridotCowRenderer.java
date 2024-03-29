package com.averystraumann.crystalcraft.entity.client;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.AmethystCowEntity;
import com.averystraumann.crystalcraft.entity.custom.PeridotCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PeridotCowRenderer extends MobRenderer<PeridotCowEntity, PeridotCowModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(crystalcraft.MODID, "textures/entity/peridot_cow.png");
    public PeridotCowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new PeridotCowModel(p_174304_.bakeLayer(PeridotCowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PeridotCowEntity p_114482_) {
        return TEXTURE;
    }
}