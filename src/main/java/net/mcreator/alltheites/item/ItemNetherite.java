
package net.mcreator.alltheites.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.alltheites.ElementsAlltheitesMod;

@ElementsAlltheitesMod.ModElement.Tag
public class ItemNetherite extends ElementsAlltheitesMod.ModElement {
	@GameRegistry.ObjectHolder("alltheites:netheritehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("alltheites:netheritebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("alltheites:netheritelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("alltheites:netheriteboots")
	public static final Item boots = null;
	public ItemNetherite(ElementsAlltheitesMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("NETHERITE", "alltheites:netherite_", 37, new int[]{3, 6, 8, 3}, 11,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("netheritehelmet")
				.setRegistryName("netheritehelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("netheritebody")
				.setRegistryName("netheritebody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("netheritelegs")
				.setRegistryName("netheritelegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("netheriteboots")
				.setRegistryName("netheriteboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("alltheites:netheritehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("alltheites:netheritebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("alltheites:netheritelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("alltheites:netheriteboots", "inventory"));
	}
}
