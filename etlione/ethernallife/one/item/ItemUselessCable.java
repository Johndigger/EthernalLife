package ethernallife.one.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import ethernallife.one.EthernalLife;
import ethernallife.one.lib.Reference;
import ethernallife.one.lib.color.VanillaColors;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemUselessCable extends Item {

	public ItemUselessCable(int id){
		super(id);
		setHasSubtypes(true);
		setMaxDamage(0);
		setTextureName(Reference.MOD_ID.toLowerCase()+":uselesscable");
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return EthernalLife.colors.getList().get(itemstack.getItemDamage()).getColorName()+"UselessCable";
	}
	

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	
	
	@Override
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
	 return EthernalLife.colors.getList().get(par1ItemStack.getItemDamage()).getColorValue();
	}

	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {
		
		return "Useless "+EthernalLife.colors.getList().get(par1ItemStack.getItemDamage()).getColorName()+" Cable";
	}

	@Override
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int i = 0; i < EthernalLife.colors.getList().size(); i++) {
			String name = EthernalLife.colors.getList().get(i).getColorName()+"";
			 par3List.add(new ItemStack(this,1,i));
		}	 
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World,
			Entity par3Entity, int par4, boolean par5) {
		if(par1ItemStack.stackSize>ItemPileOfCables.minCablesInPile){
			par1ItemStack.setItemDamage(64-par1ItemStack.stackSize);
			par1ItemStack.stackSize=1;
			par1ItemStack.itemID=EthernalLife.itemPileOfCables.itemID;
			
		}
	}
	
	
	
	
	
	
	
}
