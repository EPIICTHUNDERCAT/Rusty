package com.epiicthundercat.rusty.events.animalevents;

import com.epiicthundercat.rusty.init.RustyItems;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DropsHorse {
	public static double rand;

	public int random;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {

		if (event.getSource().getDamageType().equals("player")) {

			rand = Math.random();
			if ((event.getEntityLiving() instanceof EntityHorse)) {

				if (rand < 5.5D) {
					event.getEntityLiving().entityDropItem(Items.LEATHER, 1);

				}
				if (rand < 4.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
				if (rand < 3.5D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
				if (rand < 2.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
				if (rand < 1.5D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
				if (rand < 0.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
			}
			
			if ((event.getEntityLiving() instanceof EntityMule)) {

				if (rand < 0.5D) {
					event.getEntityLiving().entityDropItem(Items.LEATHER, 1);

				}
				if (rand < 0.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1);
				}
			}
		}
	}
}
