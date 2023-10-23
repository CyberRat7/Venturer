package net.venture.cyber2000.core.util.log;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class LoggingRegistry {
    public static void register(DeferredRegister<?> registry, IEventBus eventBus) {
        registry.register(eventBus);
        new InfoLoggable(registry.getRegistryName().getNamespace()).log();
    }
}