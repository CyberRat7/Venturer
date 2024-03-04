package net.temporal.venturer.core.gen.worldgen;

import com.temporal.api.core.util.feature.ConfiguredFeatureUtils;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.temporal.venturer.core.registry.object.VenturerBlocks;

public class VenturerConfiguredFeatures {
    protected static final ConfiguredFeatureUtils CONFIGURED_FEATURE_UTILS = ConfiguredFeatureUtils.getInstance();
    public static final ResourceKey<ConfiguredFeature<?, ?>> STINGING_NETTLE_KEY = CONFIGURED_FEATURE_UTILS.createKey("stinging_nettle");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        CONFIGURED_FEATURE_UTILS.register(context, STINGING_NETTLE_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(8, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VenturerBlocks.STINGING_NETTLE.get())))));
    }
}