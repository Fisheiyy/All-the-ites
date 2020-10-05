
package net.mcreator.alltheites.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.alltheites.ElementsAlltheitesMod;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemEnderiteShears extends ElementsAlltheitesMod.ModElement {
	@GameRegistry.ObjectHolder("alltheites:enderite_shears")
	public static final Item block = null;
	public ItemEnderiteShears(ElementsAlltheitesMod instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemShears() {
			{
				setMaxDamage(1040);
			}
			@Override
			public int getItemEnchantability() {
				return 14;
			}

			@Override
			public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
				return 11.5f;
			}
		}.setUnlocalizedName("enderite_shears").setRegistryName("enderite_shears").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("alltheites:enderite_shears", "inventory"));
	}
}
