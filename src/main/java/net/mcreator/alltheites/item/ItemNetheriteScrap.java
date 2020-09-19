
package net.mcreator.alltheites.item;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetheriteScrap extends ElementsAlltheitesMod.ModElement {

	@GameRegistry.ObjectHolder("alltheites:netherite_scrap")
	public static final Item block = null;

	public ItemNetheriteScrap(ElementsAlltheitesMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_scrap", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("netherite_scrap");
			setRegistryName("netherite_scrap");
			setCreativeTab(CreativeTabs.MATERIALS);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
