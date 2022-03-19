package net.immortaldevs.strawberry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strawberry implements ModInitializer {
	public static final String MOD_ID = "strawberry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}

	/**
	 * Creates a new {@link Identifier} based on the passed location.
	 * <p>
	 * If the location contains a colon `:` it will be split and handled like normal, otherwise it will use the default
	 * namespace contained in {@link #MOD_ID} instead of the default "minecraft" namespace.
	 *
	 * @param location The location to use
	 * @return The new {@link Identifier} instance
	 */
	public static Identifier locate(String location) {
		if (location.contains(":")) {
			return new Identifier(location);
		} else {
			return new Identifier(MOD_ID, location);
		}
	}
}
