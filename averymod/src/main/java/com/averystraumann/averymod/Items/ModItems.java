package com.averystraumann.averymod.Items;

import com.averystraumann.averymod.Items.custom.*;
import com.averystraumann.averymod.averymod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, averymod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL = ITEMS.register("white_opal",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_OPAL_HELMET = ITEMS.register("white_opal_helmet",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_CHESTPLATE = ITEMS.register("white_opal_chestplate",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_LEGGINGS = ITEMS.register("white_opal_leggings",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_BOOTS = ITEMS.register("white_opal_boots",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, EquipmentSlot.FEET, new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
