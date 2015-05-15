package fr.darkmilou.philosopherstone.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.darkmilou.philosopherstone.common.Main;

public class RecipeManager {

	public static void addCraftingRecipe(){
		//Inert Stone
		GameRegistry.addRecipe(new ItemStack(Main.itemInertStone), new Object[]{"SIS","IGI","SIS", 'S', Blocks.stone, 'I', Items.iron_ingot, 'G', Items.gold_ingot});
		//Minium Stone
		GameRegistry.addRecipe(new ItemStack(Main.itemMiniumStone), new Object[]{"SSS","SIS","SSS", 'S', Main.itemMiniumShard, 'I', Main.itemInertStone});
		//Philosopher's Stone
		GameRegistry.addRecipe(new ItemStack(Main.itemPhilosopherStone), new Object[]{"NDN","DID","NDN", 'N', Items.nether_star, 'I', Main.itemMiniumStone, 'D', Blocks.diamond_block});
		//Transmutation Minium
		GameRegistry.addRecipe(new ItemStack(Items.flint), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.flint});
		GameRegistry.addRecipe(new ItemStack(Blocks.gravel), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.sandstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.log), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.sandstone});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.flint});
		GameRegistry.addRecipe(new ItemStack(Blocks.gravel, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.clay_ball});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.log});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.log2});
		GameRegistry.addRecipe(new ItemStack(Blocks.log, 2), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.clay});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot), new Object[]{"MXX","XXX","XXX", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 8), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block), new Object[]{"MXX","XXX","XXX", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_block, 8), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.diamond_block});
		GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.ender_pearl});
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.sand});
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.grass), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.grass});
		GameRegistry.addRecipe(new ItemStack(Blocks.red_mushroom), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.brown_mushroom});
		GameRegistry.addRecipe(new ItemStack(Blocks.brown_mushroom), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.red_mushroom});
		GameRegistry.addRecipe(new ItemStack(Items.pumpkin_seeds), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.melon_seeds});
		GameRegistry.addRecipe(new ItemStack(Items.melon_seeds), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.pumpkin_seeds});
		GameRegistry.addRecipe(new ItemStack(Blocks.pumpkin), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.melon_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.melon_block), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.pumpkin});
		GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.glowstone});
		GameRegistry.addRecipe(new ItemStack(Items.brick), new Object[]{"XM ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Blocks.brick_block});
		GameRegistry.addRecipe(new ItemStack(Items.reeds, 3), new Object[]{"MX ","XX ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.paper});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod), new Object[]{"MX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.blaze_powder});
		
		//Transmutation Philosopher
		GameRegistry.addRecipe(new ItemStack(Items.flint), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.flint});
		GameRegistry.addRecipe(new ItemStack(Blocks.gravel), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.sandstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.log), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.sandstone});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.flint});
		GameRegistry.addRecipe(new ItemStack(Blocks.gravel, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.clay_ball});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.log});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{"MX ","X   ","   ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.log2});
		GameRegistry.addRecipe(new ItemStack(Blocks.log, 2), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.clay});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot), new Object[]{"MXX","XXX","XXX", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 8), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemMiniumStone, 1, Short.MAX_VALUE), 'X', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.diamond_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block), new Object[]{"MXX","XXX","XXX", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_block, 8), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), new Object[]{"MX ","XX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 4), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.ender_pearl});
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.sand});
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.grass), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.grass});
		GameRegistry.addRecipe(new ItemStack(Blocks.red_mushroom), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.brown_mushroom});
		GameRegistry.addRecipe(new ItemStack(Blocks.brown_mushroom), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.red_mushroom});
		GameRegistry.addRecipe(new ItemStack(Items.pumpkin_seeds), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.melon_seeds});
		GameRegistry.addRecipe(new ItemStack(Items.melon_seeds), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.pumpkin_seeds});
		GameRegistry.addRecipe(new ItemStack(Blocks.pumpkin), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.melon_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.melon_block), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.pumpkin});
		GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.glowstone});
		GameRegistry.addRecipe(new ItemStack(Items.brick), new Object[]{"XM ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Blocks.brick_block});
		GameRegistry.addRecipe(new ItemStack(Items.reeds, 3), new Object[]{"MX ","XX ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.paper});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod), new Object[]{"MX ","X  ", 'M', new ItemStack(Main.itemPhilosopherStone, 1, Short.MAX_VALUE), 'X', Items.blaze_powder});
		
	}
}
