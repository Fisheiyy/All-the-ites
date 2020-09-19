
package net.mcreator.alltheites.item;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetheriteIngot extends ElementsAlltheitesMod.ModElement {

	@GameRegistry.ObjectHolder("alltheites:netherite_ingot")
	public static final Item block = null;

	public ItemNetheriteIngot(ElementsAlltheitesMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_ingot", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("netherite_ingot");
			setRegistryName("netherite_ingot");
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
