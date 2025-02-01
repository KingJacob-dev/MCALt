package com.kingjacob.mcalt.item;

import net.minecraft.entity.Entity;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class ObsidianSword extends TemplateItem {
    public final int weaponDamage;
    public ObsidianSword(Identifier identifier) {
        super(identifier);
        this.setMaxDamage(MCAltToolMaterials.OBSIDIAN.getDurability());
        this.weaponDamage = MCAltToolMaterials.OBSIDIAN.getAttackDamage() + 5;
        this.maxCount = 1;
    }

    @Override
    public int getAttackDamage(Entity attackedEntity) {
        return weaponDamage;
    }

    public boolean isHandheld() {
        return true;
    }
}
