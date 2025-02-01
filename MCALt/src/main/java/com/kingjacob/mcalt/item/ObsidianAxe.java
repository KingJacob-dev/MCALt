package com.kingjacob.mcalt.item;

import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.template.item.TemplateAxeItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class ObsidianAxe extends TemplateAxeItem {
    public ObsidianAxe(Identifier identifier, ToolMaterial material) {
        super(identifier, material);
        this.setMaxDamage(ToolMaterial.DIAMOND.getDurability() * 4);
    }
}
