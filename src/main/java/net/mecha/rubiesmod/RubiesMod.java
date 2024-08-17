package net.mecha.rubiesmod;

import net.fabricmc.api.ModInitializer;

import net.mecha.rubiesmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//MOD ID STRING
public class RubiesMod implements ModInitializer {
	public static final String MOD_ID = "rubies-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}