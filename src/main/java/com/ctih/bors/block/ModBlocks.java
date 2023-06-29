package com.ctih.bors.block;

import com.ctih.bors.Bors;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {
	
	public static final Block PLASTIC_BLOCK = registerBlock("plastic_block", 
			new Block(FabricBlockSettings.create().strength(4f)),ItemGroups.BUILDING_BLOCKS);
	
	
	private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tag) {
		registerBlockItem(name,block,tag);
		return Registry.register(Registries.BLOCK, new Identifier(Bors.MOD_ID,name),block);
		
	}
	
	private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> buildingBlocks) {
		return Registry.register(Registries.ITEM, new Identifier(Bors.MOD_ID,name), new BlockItem(block, new FabricItemSettings()));
	}
	

	public static void registerModBlocks() {
		System.out.println("Registering Mod Blocks " + Bors.MOD_ID);
		Bors.LOGGER.debug("Registering Blocks " + Bors.MOD_ID);
	}

}
