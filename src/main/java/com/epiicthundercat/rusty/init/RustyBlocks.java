package com.epiicthundercat.rusty.init;

import java.util.ArrayList;
import java.util.List;

import com.epiicthundercat.rusty.blocks.block.BlockBarrel;
import com.epiicthundercat.rusty.handler.RustyHarvestLevel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RustyBlocks {

	
	  public static final List<Block> BLOCKS = new ArrayList<Block>();
	  
	  
	  
	  //Containers
	  public static Block BARREL = new BlockBarrel("barrel", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F), RustyHarvestLevel.rye);
	  
	  
	  
	  //Ore
	  
	  
	  
	  
	  
	  //Nether Ore
	  
	  
	  
	  
	  
	  //Bushes, Crops, Logs
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	   
}
