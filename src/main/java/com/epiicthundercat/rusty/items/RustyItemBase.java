package com.epiicthundercat.rusty.items;

import com.epiicthundercat.rusty.RustyReference;
import com.epiicthundercat.rusty.init.RustyItems;

import net.minecraft.item.Item;

public class RustyItemBase extends Item{

	public RustyItemBase(String name, Properties properties) {
		 super(properties);

	        this.setRegistryName(RustyReference.MODID, name);
	        RustyItems.ITEMS.add(this);
	}

}
