package com.kingjacob.mcalt.events.init;

import com.kingjacob.mcalt.item.ObsidianSword;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class MCAltItems {
    @Entrypoint.Namespace
    private static final Namespace NAMESPACE = Null.get();

    public static Item ObsidianSword;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        ObsidianSword = new ObsidianSword(NAMESPACE.id("obsidian_sword")).setTranslationKey(NAMESPACE, "obsidian_sword");
    }
}
