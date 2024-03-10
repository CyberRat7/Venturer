package net.temporal.venturer.core.tags;

import com.temporal.api.core.util.tag.factory.ItemTagFactory;
import com.temporal.api.core.util.tag.factory.TagFactory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class VenturerTags {
	public static final TagFactory ITEM_TAG_FACTORY = ItemTagFactory.getInstance();
	
	public static class Items {
		public static final TagKey<Item> MEATS = (TagKey<Item>) ITEM_TAG_FACTORY.createTag("meats");
		public static final TagKey<Item> EDIBLE = (TagKey<Item>) ITEM_TAG_FACTORY.createTag("edible");
	}
}
