package net.lumynity.lib;

import net.minecraft.resources.ResourceLocation;

public class ModHookContext {
    private final String registeredId;

    public ModHookContext(String modId) {
        registeredId = modId;
    }

    public ResourceLocation asResource(String path) {
        if (registeredId == null) return LumynAPI.asMcResource(path);
        return new ResourceLocation(registeredId, path);
    }
}