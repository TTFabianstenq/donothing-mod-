package com.example.donothing;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoNothingMod implements ModInitializer {

    public static final String MOD_ID = "donothing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("drlzasmp.net not hacks\uD83E\uDD2B loaded. Totally not hacks.");
    }
}
