package com.ctih.bors;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctih.bors.block.ModBlocks;
import com.ctih.bors.item.ModItems;

public class Bors implements ModInitializer {
	public static final String MOD_ID = "bors";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
    	ModBlocks.registerModBlocks();
    	ModItems.registerModItems();
    }
}