package fr.darkmilou.philosopherstone.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.darkmilou.philosopherstone.events.DropEvent;
import fr.darkmilou.philosopherstone.items.BasicItem;
import fr.darkmilou.philosopherstone.items.MiniumStoneItem;
import fr.darkmilou.philosopherstone.items.PhilosopherStoneItem;
import fr.darkmilou.philosopherstone.recipe.RecipeManager;

@Mod(modid = "philosopherstone", name="Philosopher's Stone", version="1.0.0")

public class Main {
	@Instance("philosopherstone")
	public static Main instance;
	
	public static final String MODID = "philosopherstone";
	
	@SidedProxy(clientSide = "fr.darkmilou.philosopherstone.client.ClientProxy", serverSide = "fr.darkmilou.philosopherstone.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs psCreativeTabs = new CustomCreativeTabs("philosopher_creative_tabs");
	
	public static Item itemMiniumShard;
	public static Item itemInertStone;
	public static Item itemMiniumStone;
	public static Item itemPhilosopherStone;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		itemMiniumShard = new BasicItem().setUnlocalizedName("MiniumShard").setTextureName(this.MODID + ":Minium_Shard");
		itemInertStone = new BasicItem().setUnlocalizedName("InertStone").setTextureName(this.MODID + ":Inert_Stone");
		itemMiniumStone = new MiniumStoneItem().setUnlocalizedName("MiniumStone").setTextureName(this.MODID + ":Minium_Stone");
		itemPhilosopherStone = new PhilosopherStoneItem().setUnlocalizedName("PhilosopherStone").setTextureName(this.MODID + ":Philosopher's_Stone");
		
		GameRegistry.registerItem(itemMiniumShard, "item_miniumshard");
		GameRegistry.registerItem(itemInertStone, "item_inertstone");
		GameRegistry.registerItem(itemMiniumStone, "item_miniumstone");
		GameRegistry.registerItem(itemPhilosopherStone, "item_philosopherstone");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRender();
		MinecraftForge.EVENT_BUS.register(new DropEvent());
		RecipeManager.addCraftingRecipe();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
