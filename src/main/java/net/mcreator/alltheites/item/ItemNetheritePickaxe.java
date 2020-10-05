
package net.mcreator.alltheites.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.alltheites.ElementsAlltheitesMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetheritePickaxe extends ElementsAlltheitesMod.ModElement {
	@GameRegistry.ObjectHolder("alltheites:netherite_pickaxe")
	public static final Item block = null;
	public ItemNetheritePickaxe(ElementsAlltheitesMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("NETHERITE_PICKAXE", 4, 2031, 10f, 2f, 12)) {
			{
				this.attackSpeed = -2.7999999999999998f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("netherite_pickaxe").setRegistryName("netherite_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_pickaxe", "inventory"));
	}
}
