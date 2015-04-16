package okkapel.okkatweaks;

import okkapel.okkatweaks.items.ModItem;
import okkapel.okkatweaks.proxy.Proxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Ref.MODID, version=Ref.VERSION, name=Ref.MODNAME)
public class OkkaTweaks {
	
	@SidedProxy(clientSide = Ref.PROXY_CLASS_CLIENT, serverSide = Ref.PROXY_CLASS_SERVER)
	public static Proxy proxy;
	
	@Mod.Instance(Ref.MODID)
	public static OkkaTweaks INSTANCE;
	
	public static CreativeTabs creativeTab = new CreativeTabs(Ref.MODID) {
		@Override
		public Item getTabIconItem() {
			return Items.flint;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		initItems();
		// items, blocks, ents
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		// renderer, evhandlers
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {}
	
	///////////////
	// Mod specific stuff ///////////////////////
	///////////////
	
	public static class MItems {
		public static ModItem sharpFlint = new ModItem("sharpFlint");
		
	}
	
	public static class MBlocks {
		
		
	}
	
	private void initItems() {
		GameRegistry.registerItem(MItems.sharpFlint, MItems.sharpFlint.id_name);
	}
	
	private void initBlocks() {}
	
	private void initRecipes() {
		//GameRegistry.
	}
	
}