package x.studiovash.vashcraft.items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
		
		if (world.isRemote) {
            return is;
        }
        
        BlockPos bp = EntityPlayer.getBedSpawnLocation(world, player.getBedLocation(), false);
        if(bp != null) {
            ((EntityPlayerMP)player).playerNetServerHandler.setPlayerLocation((float)bp.getX() + 0.5F, (float)bp.getY(), (float)bp.getZ() + 0.5F, 0.0F, 0.0F);
        }
        
        is.stackSize--;
        
        return is;
	}
	
	
	
	
}
