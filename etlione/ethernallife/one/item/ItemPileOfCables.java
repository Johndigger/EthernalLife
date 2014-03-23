package ethernallife.one.item;

import java.util.Random;

import ethernallife.one.EthernalLife;
import ethernallife.one.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPileOfCables extends Item {
	public static int minCablesInPile = 10;
    public ItemPileOfCables(int id) {
        super(id);
        setMaxStackSize(1);
        setTextureName(Reference.MOD_ID.toLowerCase()+":pileofcables");
        setMaxDamage(64);
        setHasSubtypes(true);
        setNoRepair();
        
    }

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		ItemStack is=new ItemStack(EthernalLife.itemUselessCable);
		if(par1ItemStack.getItemDamage()<64-minCablesInPile+1){		
		is.setItemDamage(new Random().nextInt(EthernalLife.colors.getList().size()));
		par3EntityPlayer.inventory.addItemStackToInventory(is);
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
		}else{
			for (int i = 0; i < minCablesInPile; i++) {
				is=new ItemStack(EthernalLife.itemUselessCable);
				is.setItemDamage(new Random().nextInt(EthernalLife.colors.getList().size()));
				par3EntityPlayer.inventory.addItemStackToInventory(is);
			}
			par1ItemStack.stackSize=0;
		}
	 return par1ItemStack;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.eat;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 32;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
	    par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
	}

	@Override
	public int getDamage(ItemStack stack) {
		// TODO Auto-generated method stub
		return super.getDamage(stack);
	}

	@Override
	public int getDisplayDamage(ItemStack stack) {
		// TODO Auto-generated method stub
		return super.getDisplayDamage(stack);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) {
		return "Pile of "+ (64-par1ItemStack.getItemDamage())+ " Cables";
	}
    
	
	
    

}
