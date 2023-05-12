package com.averystraumann.averymod.worldgen;

import com.averystraumann.averymod.averymod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = createKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_RUBY_ORE_PLACED_KEY = createKey("large_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_RUBY_ORE_PLACED_KEY = createKey("buried_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED_KEY = createKey("deepslate_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DEEPSLATE_RUBY_ORE_PLACED_KEY = createKey("large_deepslate_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DEEPSLATE_RUBY_ORE_PLACED_KEY = createKey("buried_deepslate_ruby_ore_placed");

    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = createKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_SAPPHIRE_ORE_PLACED_KEY = createKey("large_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_SAPPHIRE_ORE_PLACED_KEY = createKey("buried_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY = createKey("deepslate_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY = createKey("large_deepslate_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY = createKey("buried_deepslate_sapphire_ore_placed");

    public static final ResourceKey<PlacedFeature> AMETHYST_ORE_PLACED_KEY = createKey("amethyst_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_AMETHYST_ORE_PLACED_KEY = createKey("large_amethyst_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_AMETHYST_ORE_PLACED_KEY = createKey("buried_amethyst_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_AMETHYST_ORE_PLACED_KEY = createKey("deepslate_amethyst_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DEEPSLATE_AMETHYST_ORE_PLACED_KEY = createKey("large_deepslate_amethyst_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DEEPSLATE_AMETHYST_ORE_PLACED_KEY = createKey("buried_deepslate_amethyst_ore_placed");

    public static final ResourceKey<PlacedFeature> CITRINE_ORE_PLACED_KEY = createKey("citrine_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_CITRINE_ORE_PLACED_KEY = createKey("large_citrine_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_CITRINE_ORE_PLACED_KEY = createKey("buried_citrine_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CITRINE_ORE_PLACED_KEY = createKey("deepslate_citrine_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DEEPSLATE_CITRINE_ORE_PLACED_KEY = createKey("large_deepslate_citrine_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DEEPSLATE_CITRINE_ORE_PLACED_KEY = createKey("buried_deepslate_citrine_ore_placed");

    public static final ResourceKey<PlacedFeature> WHITE_OPAL_ORE_PLACED_KEY = createKey("white_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_WHITE_OPAL_ORE_PLACED_KEY = createKey("large_white_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_WHITE_OPAL_ORE_PLACED_KEY = createKey("buried_white_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY = createKey("deepslate_white_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> LARGE_DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY = createKey("large_deepslate_white_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> BURIED_DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY = createKey("buried_deepslate_white_opal_ore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE); //allows us to also reference configured features

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))); //vert anchors give y levels
        register(context, LARGE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_RUBY_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_RUBY_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, DEEPSLATE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DEEPSLATE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_DEEPSLATE_RUBY_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DEEPSLATE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_DEEPSLATE_RUBY_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_SAPPHIRE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_SAPPHIRE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_DEEPSLATE_SAPPHIRE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_DEEPSLATE_SAPPHIRE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AMETHYST_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_AMETHYST_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_AMETHYST_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, DEEPSLATE_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_AMETHYST_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DEEPSLATE_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_DEEPSLATE_AMETHYST_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DEEPSLATE_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_DEEPSLATE_AMETHYST_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRINE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_CITRINE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_CITRINE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, DEEPSLATE_CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_CITRINE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DEEPSLATE_CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_DEEPSLATE_CITRINE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DEEPSLATE_CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_DEEPSLATE_CITRINE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_OPAL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_WHITE_OPAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_WHITE_OPAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_WHITE_OPAL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, LARGE_DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_DEEPSLATE_WHITE_OPAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, BURIED_DEEPSLATE_WHITE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BURIED_DEEPSLATE_WHITE_OPAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(averymod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}