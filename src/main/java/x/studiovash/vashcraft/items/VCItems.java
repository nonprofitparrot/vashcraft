package x.studiovash.vashcraft.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import x.studiovash.vashcraft.main.Vashcraft;

public class VCItems {

	public static Item bananabell;
	
	public static void createItems() { 
		
		bananabell = new Bananabell();
		
		GameRegistry.registerItem(bananabell, bananabell.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerItemRenderers() {
		
		reg(bananabell);
		
	}
	
	private static void reg(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(Vashcraft.MOD_ID+":"+i.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
