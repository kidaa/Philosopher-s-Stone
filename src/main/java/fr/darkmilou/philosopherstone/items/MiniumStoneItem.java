package fr.darkmilou.philosopherstone.items;

import fr.darkmilou.philosopherstone.common.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MiniumStoneItem extends Item{
	
	public MiniumStoneItem(){
		this.setCreativeTab(Main.psCreativeTabs);
		this.setMaxDamage(1000);
		this.setMaxStackSize(1);
		this.setContainerItem(this);
	}

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
	
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack copiedStack = itemStack.copy();

        copiedStack.setItemDamage(copiedStack.getItemDamage() + 1);
        copiedStack.stackSize = 1;

        return copiedStack;
    }
	
}
