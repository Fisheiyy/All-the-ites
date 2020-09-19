
package net.mcreator.alltheites.item;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetheriteAxe extends ElementsAlltheitesMod.ModElement {

	@GameRegistry.ObjectHolder("alltheites:netherite_axe")
	public static final Item block = null;

	public ItemNetheriteAxe(ElementsAlltheitesMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {

		}.setUnlocalizedName("netherite_axe").setRegistryName("netherite_axe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_axe", "inventory"));
	}

	private static class ItemToolCustom extends ItemTool {

		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("NETHERITE_AXE", 4, 2031, 10f, 6f, 14), effective_items_set);
			this.attackDamage = 6f;

			this.attackSpeed = -3f;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}

	}

}