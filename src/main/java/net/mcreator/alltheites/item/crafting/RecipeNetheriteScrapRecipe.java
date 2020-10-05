
package net.mcreator.alltheites.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alltheites.item.ItemNetheriteScrap;
import net.mcreator.alltheites.block.BlockAncientDebris;
import net.mcreator.alltheites.ElementsAlltheitesMod;

@ElementsAlltheitesMod.ModElement.Tag
public class RecipeNetheriteScrapRecipe extends ElementsAlltheitesMod.ModElement {
	public RecipeNetheriteScrapRecipe(ElementsAlltheitesMod instance) {
		super(instance, 5);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAncientDebris.block, (int) (1)), new ItemStack(ItemNetheriteScrap.block, (int) (1)), 3F);
	}
}
