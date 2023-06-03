package com.averystraumann.crystalcraft.Items;

import com.averystraumann.crystalcraft.Items.custom.*;
import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.ModEntities;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.BUCKET;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, crystalcraft.MODID);

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
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new SapphireArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new CitrineArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_OPAL_HELMET = ITEMS.register("white_opal_helmet",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_CHESTPLATE = ITEMS.register("white_opal_chestplate",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_LEGGINGS = ITEMS.register("white_opal_leggings",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_BOOTS = ITEMS.register("white_opal_boots",
            () -> new WhiteOpalArmorItem(ModArmorMaterials.WHITE_OPAL, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new RubySwordItem(ModItemTier.RUBY, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -3, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SapphireSwordItem(ModItemTier.SAPPHIRE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModItemTier.SAPPHIRE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModItemTier.SAPPHIRE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModItemTier.SAPPHIRE, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModItemTier.SAPPHIRE, -3, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new AmethystSwordItem(ModItemTier.AMETHYST, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModItemTier.AMETHYST, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMETHYST, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModItemTier.AMETHYST, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModItemTier.AMETHYST, -3, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new CitrineSwordItem(ModItemTier.CITRINE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModItemTier.CITRINE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModItemTier.CITRINE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModItemTier.CITRINE, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModItemTier.CITRINE, -3, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> WHITE_OPAL_SWORD = ITEMS.register("white_opal_sword",
            () -> new WhiteOpalSwordItem(ModItemTier.WHITE_OPAL, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_SHOVEL = ITEMS.register("white_opal_shovel",
            () -> new ShovelItem(ModItemTier.WHITE_OPAL, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_PICKAXE = ITEMS.register("white_opal_pickaxe",
            () -> new PickaxeItem(ModItemTier.WHITE_OPAL, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_AXE = ITEMS.register("white_opal_axe",
            () -> new AxeItem(ModItemTier.WHITE_OPAL, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_OPAL_HOE = ITEMS.register("white_opal_hoe",
            () -> new HoeItem(ModItemTier.WHITE_OPAL, -3, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> RUBY_MILK = ITEMS.register("ruby_milk",
            () -> new RubyMilkItem(new Item.Properties().craftRemainder(BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_MILK = ITEMS.register("sapphire_milk",
            () -> new SapphireMilkItem(new Item.Properties().craftRemainder(BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> AMETHYST_MILK = ITEMS.register("amethyst_milk",
            () -> new AmethystMilkItem(new Item.Properties().craftRemainder(BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> CITRINE_MILK = ITEMS.register("citrine_milk",
            () -> new CitrineMilkItem(new Item.Properties().craftRemainder(BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> WHITE_OPAL_MILK = ITEMS.register("white_opal_milk",
            () -> new WhiteOpalMilkItem(new Item.Properties().craftRemainder(BUCKET).stacksTo(1)));


    public static final RegistryObject<ForgeSpawnEggItem> RUBY_COW_SPAWN_EGG = ITEMS.register("ruby_cow_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RUBY_COW, 0xc40642, 0xffa3b1, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> SAPPHIRE_COW_SPAWN_EGG = ITEMS.register("sapphire_cow_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SAPPHIRE_COW, 0x1a1f80, 0x558ae0, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> AMETHYST_COW_SPAWN_EGG = ITEMS.register("amethyst_cow_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.AMETHYST_COW, 0x351b47, 0x6d3096, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> CITRINE_COW_SPAWN_EGG = ITEMS.register("citrine_cow_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CITRINE_COW, 0xff7c24, 0xffc107, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> WHITE_OPAL_COW_SPAWN_EGG = ITEMS.register("white_opal_cow_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WHITE_OPAL_COW, 0xdbf7cf, 0xffe0fd, new Item.Properties().stacksTo(16)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
