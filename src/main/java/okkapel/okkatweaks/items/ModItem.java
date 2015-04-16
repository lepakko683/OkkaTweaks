package okkapel.okkatweaks.items;

import okkapel.okkatweaks.OkkaTweaks;
import okkapel.okkatweaks.Ref;
import net.minecraft.item.Item;

public class ModItem extends Item {
	
	public final String id_name;
	
	public ModItem(String itemId) {
		id_name = itemId;
		setCreativeTab(OkkaTweaks.creativeTab);
		setUnlocalizedName(itemId);
		setTextureName(Ref.MODID + ":" + itemId);
	}
	
	
}
