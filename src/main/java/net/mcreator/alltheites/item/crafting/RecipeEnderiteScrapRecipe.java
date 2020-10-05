
package net.mcreator.alltheites.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alltheites.item.ItemEnderiteScrap;
import net.mcreator.alltheites.block.BlockMilleniaDebris;
import net.mcreator.alltheites.ElementsAlltheitesMod;

@ElementsAlltheitesMod.ModElement.Tag
public class RecipeEnderiteScrapRecipe extends ElementsAlltheitesMod.ModElement {
	public RecipeEnderiteScrapRecipe(ElementsAlltheitesMod instance) {
		super(instance, 26);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMilleniaDebris.block, (int) (1)), new ItemStack(ItemEnderiteScrap.block, (int) (1)), 3F);
	}
}
