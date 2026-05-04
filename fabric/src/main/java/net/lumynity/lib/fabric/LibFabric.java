package net.lumynity.lib.fabric;

import net.fabricmc.api.ModInitializer;

import net.lumynity.lib.LumynAPI;

public final class LibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LumynAPI.init();
    }
}
