package com.kingjacob.mcalt.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.template.item.TemplatePickaxeItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class ObsidianPickaxe extends TemplatePickaxeItem {
    public ObsidianPickaxe(Identifier identifier, ToolMaterial material) {
        super(identifier, material);
        this.setMaxDamage(ToolMaterial.DIAMOND.getDurability() * 4);
    }
}
