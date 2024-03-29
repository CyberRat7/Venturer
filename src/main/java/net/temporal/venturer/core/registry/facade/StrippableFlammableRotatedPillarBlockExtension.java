package net.temporal.venturer.core.registry.facade;

import com.temporal.api.common.block.StrippableFlammableRotatedPillarBlock;
import com.temporal.api.core.registry.factory.common.BlockFactory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface StrippableFlammableRotatedPillarBlockExtension {
    default RegistryObject<StrippableFlammableRotatedPillarBlock> createStrippableFlammableRotatedPillar(String name, BlockBehaviour.Properties properties, Block strippedBlock) {
        return (RegistryObject<StrippableFlammableRotatedPillarBlock>) BlockFactory.getInstance().createTyped(name, () -> new StrippableFlammableRotatedPillarBlock(strippedBlock, properties));
    }

    default RegistryObject<? extends StrippableFlammableRotatedPillarBlock> createStrippableFlammableRotatedPillar(String name, Supplier<? extends StrippableFlammableRotatedPillarBlock> tTypedSupplier) {
        return (RegistryObject<? extends StrippableFlammableRotatedPillarBlock>) BlockFactory.getInstance().createTyped(name, tTypedSupplier);
    }
}
