package com.epiicthundercat.rusty.handler;

import com.epiicthundercat.rusty.init.RustyArmor;
import com.epiicthundercat.rusty.init.RustyBlocks;
import com.epiicthundercat.rusty.init.RustyFood;
import com.epiicthundercat.rusty.init.RustyItems;
import com.epiicthundercat.rusty.init.RustyTools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	
	
	 @SubscribeEvent
	    public static void onItemRegister(final RegistryEvent.Register<Item> event) {
	    //Registers Items in Classes and arrays
	        event.getRegistry().registerAll(RustyArmor.ARMORS.toArray(new Item[0]));
	        event.getRegistry().registerAll(RustyFood.FOODS.toArray(new Item[0]));
	        event.getRegistry().registerAll(RustyItems.ITEMS.toArray(new Item[0]));
	        event.getRegistry().registerAll(RustyTools.TOOLS.toArray(new Item[0]));

	    }
	
	 
	 
	 @SubscribeEvent
	    public static void onBlockregister(final RegistryEvent.Register<Block> blockRegistryEvent) {
	        //Registers new blocks from array
	        blockRegistryEvent.getRegistry().registerAll(RustyBlocks.BLOCKS.toArray(new Block[0]));

	    }

	   
	
	
	
	
	
	
}
