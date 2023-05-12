package com.averystraumann.crystalcraft.Items.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RubyArmorItem  extends ArmorItem {
    public RubyArmorItem(ArmorMaterial material, EquipmentSlot type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION));
        }
    }
}
