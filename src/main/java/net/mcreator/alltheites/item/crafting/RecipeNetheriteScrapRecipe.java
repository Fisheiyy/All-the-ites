
package net.mcreator.alltheites.item.crafting;

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
