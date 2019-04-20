package com.epiicthundercat.rusty.init;

import java.util.ArrayList;
import java.util.List;

import com.epiicthundercat.rusty.items.RustyItemBase;
import com.epiicthundercat.rusty.other.RustyCreative;

import net.minecraft.item.Item;

public class RustyItems {

	
	   public static final List<Item> ITEMS = new ArrayList<>();
	   
	
	   
	   public static Item SCRAP = new RustyItemBase("scrap", new Item.Properties().group(RustyCreative.tabRusty));
	   public static Item ANIMAL_FAT = new RustyItemBase("animal_fat", new Item.Properties().group(RustyCreative.tabRusty));
	   public static Item CLOTH = new RustyItemBase("cloth", new Item.Properties().group(RustyCreative.tabRusty));
	   public static Item SEWING_KIT = new RustyItemBase("sewing_kit", new Item.Properties().group(RustyCreative.tabRusty));
	   public static Item SHEET_METAL = new RustyItemBase("sheet_metal", new Item.Properties().group(RustyCreative.tabRusty));
	   public static Item LOW_GRADE_FUEL = new RustyItemBase("low_grade_fuel", new Item.Properties().group(RustyCreative.tabRusty));
	   
}
