package com.kingjacob.mcalt.events.init;

import com.kingjacob.mcalt.item.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class MCAltItems {
    @Entrypoint.Namespace
    private static final Namespace NAMESPACE = Null.get();

    public static Item ObsidianSword;
    public static Item ObsidianPickaxe;
    public static Item ObsidianAxe;
    public static Item ObsidianShovel;
    public static Item ObsidianHoe;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        ObsidianSword = new ObsidianSword(NAMESPACE.id("obsidian_sword")).setTranslationKey(NAMESPACE, "obsidian_sword");
        ObsidianPickaxe = new ObsidianPickaxe(NAMESPACE.id("obsidian_pickaxe"),ToolMaterial.DIAMOND).setTranslationKey(NAMESPACE, "obsidian_pickaxe");
        ObsidianAxe = new ObsidianAxe(NAMESPACE.id("obsidian_axe"),ToolMaterial.DIAMOND).setTranslationKey(NAMESPACE, "obsidian_axe");
        ObsidianShovel = new ObsidianShovel(NAMESPACE.id("obsidian_shovel"),ToolMaterial.DIAMOND).setTranslationKey(NAMESPACE, "obsidian_shovel");
        ObsidianHoe = new ObsidianHoe(NAMESPACE.id("obsidian_hoe"),ToolMaterial.DIAMOND).setTranslationKey(NAMESPACE, "obsidian_hoe");
    }
}
