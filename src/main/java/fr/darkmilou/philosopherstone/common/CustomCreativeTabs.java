package fr.darkmilou.philosopherstone.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomCreativeTabs extends CreativeTabs {

	public CustomCreativeTabs(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Main.itemMiniumShard;
	}

}
