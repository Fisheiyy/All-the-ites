
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
public class ItemNetheriteShovel extends ElementsAlltheitesMod.ModElement {
	@GameRegistry.ObjectHolder("alltheites:netherite_shovel")
	public static final Item block = null;
	public ItemNetheriteShovel(ElementsAlltheitesMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("NETHERITE_SHOVEL", 4, 2031, 10f, 0f, 12)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("netherite_shovel").setRegistryName("netherite_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:netherite_shovel", "inventory"));
	}
}
