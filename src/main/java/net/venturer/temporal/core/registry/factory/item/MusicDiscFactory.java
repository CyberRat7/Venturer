package net.venturer.temporal.core.registry.factory.item;

import net.venturer.temporal.core.registry.factory.ItemFactory;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public interface MusicDiscFactory extends ItemFactory {
    static RegistryObject<RecordItem> create(String name, Supplier<SoundEvent> sound, int comparatorValue, int lengthInTicks) {
        return ItemFactory.createTyped(name, () -> new RecordItem(comparatorValue, sound, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), lengthInTicks));
    }
}
