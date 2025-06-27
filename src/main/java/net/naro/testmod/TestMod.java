package net.naro.testmod;

import net.fabricmc.api.ModInitializer;

import net.naro.testmod.block.ModBlocks;
import net.naro.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//I'm happy my 1st import finaly work !

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}