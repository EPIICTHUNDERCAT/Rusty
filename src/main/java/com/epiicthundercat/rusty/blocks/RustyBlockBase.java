package com.epiicthundercat.rusty.blocks;

import com.epiicthundercat.rusty.RustyReference;
import com.epiicthundercat.rusty.handler.RustyHarvestLevel;
import com.epiicthundercat.rusty.init.RustyBlocks;
import com.epiicthundercat.rusty.init.RustyItems;
import com.epiicthundercat.rusty.other.RustyCreative;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.ToolType;

public class RustyBlockBase extends Block {

	public final RustyHarvestLevel resource;

	public RustyBlockBase(String name, Properties builder, RustyHarvestLevel resource) {
		super(builder);

		this.resource = resource;
		this.setRegistryName(RustyReference.MODID, name);

		RustyBlocks.BLOCKS.add(this);
		RustyItems.ITEMS.add(new ItemBlock(this, new Item.Properties().group(RustyCreative.tabRusty))
				.setRegistryName(this.getRegistryName()));
	}

	@Override
	public ToolType getHarvestTool(IBlockState state) {
		return ToolType.PICKAXE;
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		return resource.harvestLevel;
	}
}
