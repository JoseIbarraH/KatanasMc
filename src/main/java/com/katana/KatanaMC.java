package com.katana;

import com.katana.block.KatanaBlock;
import com.katana.item.Katanas;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KatanaMC implements ModInitializer {

	public static final String MOD_ID = "katanamc";
	public static final Logger LOGGER = LogManager.getLogger("katanamc");

	@Override
	public void onInitialize() {
		KatanaBlock.registerBlock();
		Katanas.registerItem();

		LOGGER.info("Esto sirve!");
	}
}

