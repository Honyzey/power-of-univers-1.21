package honyzey.powerofunivers;

import honyzey.powerofunivers.block.ModBlocks;
import honyzey.powerofunivers.item.ModItemGroups;
import honyzey.powerofunivers.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerOfUnivers implements ModInitializer {
	public static final String MOD_ID = "powerofunivers";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();
		ModBlocks.registerModBlocks();
	}
}