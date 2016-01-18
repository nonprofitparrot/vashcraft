package x.studiovash.vashcraft.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import x.studiovash.vashcraft.items.CreativeTabVashcraft;

@Mod(modid = Vashcraft.MOD_ID, name = Vashcraft.MOD_NAME, version = Vashcraft.MOD_VER)
public class Vashcraft {

	public static final String MOD_ID = "vashcraft";
	public static final String MOD_NAME = "Vashcraft";
	public static final String MOD_VER = "0.0.0";
	
	public static CreativeTabs tabVashcraft = new CreativeTabVashcraft(CreativeTabs.getNextID(), "tabVashcraft");
	
	@SidedProxy(clientSide = "x.studiovash.vashcraft.main.ClientProxy", serverSide = "x.studiovash.vashcraft.main.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance(value = Vashcraft.MOD_ID)
	public static Vashcraft instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
}
