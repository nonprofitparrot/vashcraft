package x.studiovash.vashcraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import x.studiovash.vashcraft.main.Vashcraft;

public class Bananabell extends Item {

	public final String UNLOCALIZED_NAME = "bananabell";
	
	public Bananabell() {
		
		setUnlocalizedName(UNLOCALIZED_NAME);
		setCreativeTab(Vashcraft.tabVashcraft);
		
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		
		BlockPos bp = playerIn.getBedLocation();
		
		playerIn.setPosition(bp.getX(), bp.getY(), bp.getZ());
		
		return itemStackIn;
	}
	
	
	
	
}
