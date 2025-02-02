package com.kingjacob.mcalt.block;

import com.kingjacob.mcalt.events.init.MCAltTextures;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class AshenLog extends TemplateBlock {
    public AshenLog(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public int getTexture(int side) {
        if (side == 0 || side == 1) {
            return MCAltTextures.ashen_log_top;
        } else {
            return MCAltTextures.ashen_log_side;
        }
    }
}
