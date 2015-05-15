package fr.darkmilou.philosopherstone.events;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.darkmilou.philosopherstone.common.Main;

public class DropEvent {
	
	public final Random rand = new Random();
	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent event){
        if(event.entity instanceof EntityMob )
       {
        	int i = rand.nextInt(10);
        	System.out.println(i);
        	if(i < 2){
	            EntityItem newdrop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,
	                    new ItemStack(Main.itemMiniumShard, 1));
	                    event.drops.add(newdrop); 
        	}
       }
	}

}
