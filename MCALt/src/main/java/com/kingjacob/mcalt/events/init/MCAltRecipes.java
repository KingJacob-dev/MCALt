package com.kingjacob.mcalt.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;

public class MCAltRecipes {
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        RecipeRegisterEvent.Vanilla type = RecipeRegisterEvent.Vanilla.fromType(event.recipeId);

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED) {
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(Item.STICK, 4),
                    "o", "o",
                    'o', new ItemStack(MCAltBlocks.AshenPlanks)
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(Block.CRAFTING_TABLE, 1),
                    "oo", "oo",
                    'o', new ItemStack(MCAltBlocks.AshenPlanks)
            );

            CraftingRegistry.addShapedRecipe(
                    new ItemStack(MCAltItems.ObsidianSword, 1),
                    " o ", " o ", " d ",
                    'o', new ItemStack(Block.OBSIDIAN),
                    'd', new ItemStack(Item.DIAMOND_SWORD)
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(MCAltItems.ObsidianPickaxe, 1),
                    "ooo", " d ", " o ",
                    'o', new ItemStack(Block.OBSIDIAN),
                    'd', new ItemStack(Item.DIAMOND_PICKAXE)
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(MCAltItems.ObsidianAxe, 1),
                    "oo ", "od ", " o ",
                    'o', new ItemStack(Block.OBSIDIAN),
                    'd', new ItemStack(Item.DIAMOND_AXE)
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(MCAltItems.ObsidianShovel, 1),
                    " o ", " d ", " o ",
                    'o', new ItemStack(Block.OBSIDIAN),
                    'd', new ItemStack(Item.DIAMOND_SHOVEL)
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(MCAltItems.ObsidianHoe, 1),
                    "oo ", " d ", " o ",
                    'o', new ItemStack(Block.OBSIDIAN),
                    'd', new ItemStack(Item.DIAMOND_HOE)
            );

        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS) {
            CraftingRegistry.addShapelessRecipe(
                    new ItemStack(MCAltBlocks.AshenPlanks, 4),
                    MCAltBlocks.AshenLog
            );
        }

        if (type == RecipeRegisterEvent.Vanilla.SMELTING) {

        }
    }
}
