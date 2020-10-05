
package net.mcreator.alltheites.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.alltheites.ElementsAlltheitesMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemEnderiteShovel extends ElementsAlltheitesMod.ModElement {
	@GameRegistry.ObjectHolder("alltheites:enderite_shovel")
	public static final Item block = null;
	public ItemEnderiteShovel(ElementsAlltheitesMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ENDERITE_SHOVEL", 5, 4062, 11.5f, 1f, 14)) {
			{
				this.attackSpeed = -2.5999999999999999f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("enderite_shovel").setRegistryName("enderite_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:enderite_shovel", "inventory"));
	}
}
