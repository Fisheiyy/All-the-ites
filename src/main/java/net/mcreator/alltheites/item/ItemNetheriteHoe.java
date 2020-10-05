
package net.mcreator.alltheites.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.alltheites.ElementsAlltheitesMod;

import java.util.Set;
import java.util.HashMap;

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
