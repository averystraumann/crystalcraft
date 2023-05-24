package com.averystraumann.crystalcraft.worldgen;

import com.averystraumann.crystalcraft.Blocks.ModBlocks;
import com.averystraumann.crystalcraft.crystalcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_RUBY_ORE_KEY = registerKey("large_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_RUBY_ORE_KEY = registerKey("buried_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_RUBY_ORE_KEY = registerKey("deepslate_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_DEEPSLATE_RUBY_ORE_KEY = registerKey("large_deepslate_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_DEEPSLATE_RUBY_ORE_KEY = registerKey("buried_deepslate_ruby_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_SAPPHIRE_ORE_KEY = registerKey("large_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_SAPPHIRE_ORE_KEY = registerKey("buried_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_SAPPHIRE_ORE_KEY = registerKey("deepslate_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_DEEPSLATE_SAPPHIRE_ORE_KEY = registerKey("large_deepslate_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_DEEPSLATE_SAPPHIRE_ORE_KEY = registerKey("buried_deepslate_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> AMETHYST_ORE_KEY = registerKey("amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_AMETHYST_ORE_KEY = registerKey("large_amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_AMETHYST_ORE_KEY = registerKey("buried_amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_AMETHYST_ORE_KEY = registerKey("deepslate_amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_DEEPSLATE_AMETHYST_ORE_KEY = registerKey("large_deepslate_amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_DEEPSLATE_AMETHYST_ORE_KEY = registerKey("buried_deepslate_amethyst_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> CITRINE_ORE_KEY = registerKey("citrine_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_CITRINE_ORE_KEY = registerKey("large_citrine_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_CITRINE_ORE_KEY = registerKey("buried_citrine_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_CITRINE_ORE_KEY = registerKey("deepslate_citrine_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_DEEPSLATE_CITRINE_ORE_KEY = registerKey("large_deepslate_citrine_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_DEEPSLATE_CITRINE_ORE_KEY = registerKey("buried_deepslate_citrine_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> WHITE_OPAL_ORE_KEY = registerKey("white_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_WHITE_OPAL_ORE_KEY = registerKey("large_white_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_WHITE_OPAL_ORE_KEY = registerKey("buried_white_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_WHITE_OPAL_ORE_KEY = registerKey("deepslate_white_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> LARGE_DEEPSLATE_WHITE_OPAL_ORE_KEY = registerKey("large_deepslate_white_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> BURIED_DEEPSLATE_WHITE_OPAL_ORE_KEY = registerKey("buried_deepslate_white_opal_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES); //know which blocks we can replace w custom ores
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> rubyOres = List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> sapphireOres = List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> amethystOres = List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> citrineOres = List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.CITRINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> whiteopalOres = List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.WHITE_OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_WHITE_OPAL_ORE.get().defaultBlockState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 3, 0.6f));
        register(context, LARGE_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 8, 0.7f));
        register(context, BURIED_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 5, 1.0f));
        register(context, DEEPSLATE_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 3, 0.6f));
        register(context, LARGE_DEEPSLATE_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 8, 0.7f));
        register(context, BURIED_DEEPSLATE_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 5, 1.0f));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 3, 0.6f));
        register(context, LARGE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 8, 0.7f));
        register(context, BURIED_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 5, 1.0f));
        register(context, DEEPSLATE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 3, 0.6f));
        register(context, LARGE_DEEPSLATE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 8, 0.7f));
        register(context, BURIED_DEEPSLATE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 5, 1.0f));

        register(context, AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 3, 0.6f));
        register(context, LARGE_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 8, 0.7f));
        register(context, BURIED_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 5, 1.0f));
        register(context, DEEPSLATE_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 3, 0.6f));
        register(context, LARGE_DEEPSLATE_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 8, 0.7f));
        register(context, BURIED_DEEPSLATE_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(amethystOres, 5, 1.0f));

        register(context, CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 3, 0.6f));
        register(context, LARGE_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 8, 0.7f));
        register(context, BURIED_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 5, 1.0f));
        register(context, DEEPSLATE_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 3, 0.6f));
        register(context, LARGE_DEEPSLATE_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 8, 0.7f));
        register(context, BURIED_DEEPSLATE_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(citrineOres, 5, 1.0f));

        register(context, WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 3, 0.6f));
        register(context, LARGE_WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 8, 0.7f));
        register(context, BURIED_WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 5, 1.0f));
        register(context, DEEPSLATE_WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 3, 0.6f));
        register(context, LARGE_DEEPSLATE_WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 8, 0.7f));
        register(context, BURIED_DEEPSLATE_WHITE_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(whiteopalOres, 5, 1.0f));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(crystalcraft.MODID, name));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
