package com.averystraumann.crystalcraft.Items;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    RUBY(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    }),
    SAPPHIRE(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ModItems.SAPPHIRE.get());
    }),
    AMETHYST(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ModItems.AMETHYST.get());
    }),
    CITRINE(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ModItems.CITRINE.get());
    }),
    WHITE_OPAL(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ModItems.WHITE_OPAL.get());
    }),;

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;







    ModItemTier(int level, int durability, float miningSpeed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }


    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
