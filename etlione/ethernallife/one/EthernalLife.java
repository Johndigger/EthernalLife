package ethernallife.one;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ethernallife.one.block.BlockVirtualBeddleStation;
import ethernallife.one.item.ItemPileOfCables;
import ethernallife.one.item.ItemUselessCable;
import ethernallife.one.item.ItemVirtualBeddleStation;
import ethernallife.one.lib.Reference;
import ethernallife.one.lib.color.AllColors;
import ethernallife.one.lib.color.ColorList;
import ethernallife.one.lib.color.ColorMapping;
import ethernallife.one.lib.color.VanillaColors;

@Mod( modid=Reference.MOD_ID, name=Reference.MOD_NAME,version=Reference.VERSION)
public class EthernalLife {
    
     public static CreativeTabs tabEthernalLife = new CreativeTabs("tabEthernalLife"){
         public ItemStack getIconItemStack(){
             return new ItemStack(itemPileOfCables, 1, 0);
         };
     };
     

    public final static ColorList colors=new VanillaColors();
    public final static Item itemPileOfCables = new ItemPileOfCables(6767).setCreativeTab(tabEthernalLife).setUnlocalizedName("pileOfCables");
    public final static Item itemVirtualBeddleStation = new ItemVirtualBeddleStation(6768).setCreativeTab(tabEthernalLife).setUnlocalizedName("virtualBeddleStation");
    public final static Item itemUselessCable = new ItemUselessCable(6769).setUnlocalizedName("uselessCable").setCreativeTab(tabEthernalLife);
    public final static Block blockVirtualBeddleStation = new BlockVirtualBeddleStation(Material.cloth).setUnlocalizedName("virtualBeddleStation").setHardness(0.2F);
    
    
    
    
    @Instance(value= "EthernalLifeOne")
    public static EthernalLife instance;
    
//    @SidedProxy(clientSide="ethernallife.client.ClientProxy", serverSide="ethernallife.CommonProxy")
//    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
     
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){    	    	
    	for (int i = 0; i < colors.getList().size(); i++) {
			ItemStack uselessCableStack = new ItemStack(itemUselessCable,1 ,i);
			LanguageRegistry.addName(uselessCableStack, "Useless "+colors.getList().get(uselessCableStack.getItemDamage()).getColorName()+" Cables");
		}
    	
    	
        LanguageRegistry.addName(itemPileOfCables, "Pile of Cables");
        LanguageRegistry.addName(itemVirtualBeddleStation, "Virtual Beddle Station");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabEthernalLife", "en_US", "Ethernal Life One");

//        LanguageRegistry.addName(blockVirtualBeddleStation, "Virtual Beddle Station");
        GameRegistry.registerBlock(blockVirtualBeddleStation, "Virtual Beddle Station");
        GameRegistry.addShapelessRecipe(new ItemStack(itemVirtualBeddleStation),new ItemStack(Item.bed),new ItemStack(itemPileOfCables));
    }
    
    @EventHandler
    public void posInit(FMLPostInitializationEvent event){
        
    }
    
}
