package com.kingjacob.mcalt.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class TextureListener {
    @Entrypoint.Namespace
    private static final Namespace MOD_ID = Null.get();

    public static int ashen_planks;
    public static int ashen_log_side;
    public static int ashen_log_top;

    @EventListener
    public static void registerTextures(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getTerrain();
        
        BlockListener.AshenPlanks.textureId = terrain.addTexture(MOD_ID.id("block/ashen_planks")).index;
        ashen_log_side = terrain.addTexture(MOD_ID.id("block/ashen_log_side")).index;
        ashen_log_top = terrain.addTexture(MOD_ID.id("block/ashen_log_top")).index;
    }
}
