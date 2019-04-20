package com.epiicthundercat.rusty.items;

import net.minecraft.item.ItemStack;

public class RustyContainerItem extends RustyItemBase {
	public RustyContainerItem(Properties properties, String name) {
		super(name, properties);
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		return stack.copy();
	}

}
