package com.kingjacob.mcalt.events.init;

import com.kingjacob.mcalt.MCAlt;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class MCAltTextures {
    @Entrypoint.Namespace
    private static final Namespace NAMESPACE = Null.get();

    public static int ashen_planks;
    public static int ashen_log_side;
    public static int ashen_log_top;

    @EventListener
    public static void registerTextures(TextureRegisterEvent event) {
        // ITEMS
        MCAltItems.ObsidianSword.setTexture(NAMESPACE.id("item/obsidian_sword"));
        MCAltItems.ObsidianPickaxe.setTexture(NAMESPACE.id("item/obsidian_pickaxe"));
        MCAltItems.ObsidianAxe.setTexture(NAMESPACE.id("item/obsidian_axe"));
        MCAltItems.ObsidianShovel.setTexture(NAMESPACE.id("item/obsidian_shovel"));
        MCAltItems.ObsidianHoe.setTexture(NAMESPACE.id("item/obsidian_hoe"));

        // BLOCKS
        ExpandableAtlas terrain = Atlases.getTerrain();
        
        MCAltBlocks.AshenPlanks.textureId = terrain.addTexture(NAMESPACE.id("block/ashen_planks")).index;
        ashen_log_side = terrain.addTexture(NAMESPACE.id("block/ashen_log_side")).index;
        ashen_log_top = terrain.addTexture(NAMESPACE.id("block/ashen_log_top")).index;
    }
}
