package com.ctih.bors.item;

import com.ctih.bors.Bors;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class ModItems {
	
	
	
	
	public static final Item PIECE_OF_PLASTIC = registerItem("piece_of_plastic",
			new Item(new Item.Settings()),
			ItemGroups.INGREDIENTS);
	
	public static final Item PLASTIC = registerItem("plastic",
			new Item(new Item.Settings()),
			ItemGroups.INGREDIENTS);
	
	
	private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(Bors.MOD_ID, name), item);
}

	
	public static void registerModItems() {
		System.out.println("Registering Mod Items " + Bors.MOD_ID);
		Bors.LOGGER.debug("Registering Mod Items " + Bors.MOD_ID);
	}

}
