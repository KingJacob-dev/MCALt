package com.kingjacob.mcalt.block;

import com.kingjacob.mcalt.events.init.MCAltTextures;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class AshenPlanks extends TemplateBlock {

    public AshenPlanks(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public int getTexture(int all) {
        return MCAltTextures.ashen_planks;
    }
}
