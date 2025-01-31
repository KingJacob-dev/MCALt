package com.kingjacob.mcalt.item;

import net.modificationstation.stationapi.api.item.tool.StationToolMaterial;

public enum MCAltToolMaterials implements StationToolMaterial {
    OBSIDIAN(4, 6244, 7.0F, 4);


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final int attackDamage;

    MCAltToolMaterials(int miningLevel, int itemDurability, float miningSpeed, int attackDamage) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }
}
