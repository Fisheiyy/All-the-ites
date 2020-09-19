
package net.mcreator.alltheites.item;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetheriteHoe extends ElementsAlltheitesMod.ModElement {

	@GameRegistry.ObjectHolder("alltheites:netherite_hoe")
	public static final Item block = null;

	public ItemNetheriteHoe(ElementsAlltheitesMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("NETHERITE_HOE", 4, 2031, 10f, 3f, 12)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}

		}.setUnlocalizedName("netherite_hoe").setRegistryName("netherite_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_hoe", "inventory"));
	}

}
