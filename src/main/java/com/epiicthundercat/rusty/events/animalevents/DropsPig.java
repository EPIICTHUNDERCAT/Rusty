package com.epiicthundercat.rusty.events.animalevents;

import com.epiicthundercat.rusty.init.RustyItems;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DropsPig {
	public static double rand;

	public int random;
	
    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event){

        if (event.getSource().getDamageType().equals("player")) {

            rand = Math.random();
            if ((event.getEntityLiving() instanceof EntityPig)) {

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

