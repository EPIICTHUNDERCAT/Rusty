package com.epiicthundercat.rusty.other;

import net.minecraft.init.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RustyCreative {

	
	 public static ItemGroup tabRusty = new ItemGroup(ItemGroup.getGroupCountSafe(), "Rusty") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(Items.APPLE);
	        }
	    };
	
	
}
