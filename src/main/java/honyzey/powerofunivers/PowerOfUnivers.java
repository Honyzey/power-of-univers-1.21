package honyzey.powerofunivers;

import honyzey.powerofunivers.item.special.PowerOfTime;
import honyzey.powerofunivers.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.world.ServerWorld;

public class PowerOfUnivers implements ModInitializer {
	public static final String MOD_ID = "powerofunivers";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistry.registerAll();

		ServerTickEvents.END_SERVER_TICK.register(server -> {
			for (ServerWorld world : server.getWorlds()) {
				PowerOfTime.tickTimeStopZones(world);
			}
		});
	}
}