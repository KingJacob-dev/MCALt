package com.kingjacob.mcalt.events.init;

import com.kingjacob.mcalt.block.AshenLog;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class BlockListener {
    @Entrypoint.Namespace
    private static final Namespace MOD_ID = Null.get();

    public static Block AshenPlanks;
    public static Block AshenLog;

    @EventListener
    public static void registerBlocks(BlockRegistryEvent evemt) {
        AshenPlanks = new TemplateBlock(MOD_ID.id("ashen_planks"), Material.WOOD)
                .setTranslationKey(MOD_ID.id("ashen_planks"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2F)
                .setResistance(3F);
        AshenLog = new AshenLog(MOD_ID.id("ashen_log"), Material.WOOD)
                .setTranslationKey(MOD_ID.id("ashen_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2F)
                .setResistance(2F);
    }
}
