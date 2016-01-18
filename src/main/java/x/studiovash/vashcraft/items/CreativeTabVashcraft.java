package x.studiovash.vashcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabVashcraft extends CreativeTabs {

	public CreativeTabVashcraft(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return VCItems.bananabell;
	}
}
