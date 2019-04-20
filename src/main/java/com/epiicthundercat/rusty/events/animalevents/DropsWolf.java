package com.epiicthundercat.rusty.events.animalevents;

import java.util.Random;

import com.epiicthundercat.rusty.init.RustyItems;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DropsWolf {
	protected Random rand1;
	public static double rand;
	public int random;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {

		if (event.getSource().getDamageType().equals("player")) {

			rand = Math.random();
			if ((event.getEntityLiving() instanceof EntityWolf)) {

				if (rand < 5.5D) {
					event.getEntityLiving().entityDropItem(Items.LEATHER, 1 + rand1.nextInt(8));
				}
				if (rand < 4.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1 + rand1.nextInt(10));
				}
				if (rand < 3.5D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1 + rand1.nextInt(8));
				}
				if (rand < 2.25D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1 + rand1.nextInt(10));
				}
				if (rand < 1.5D) {
					event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1 + rand1.nextInt(32));

					if (rand < 0.25D) {
						event.getEntityLiving().entityDropItem(RustyItems.ANIMAL_FAT, 1 + rand1.nextInt(43));
					}
				}

			}
		}
	}
}
