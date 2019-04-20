package com.epiicthundercat.rusty;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = RustyReference.MODID)
public class Rusty {

	public static Random random = new Random();

	public static Rusty instance;

	private static final Logger LOGGER = LogManager.getLogger();

	public Rusty() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dispatchIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSideSet);
		MinecraftForge.EVENT_BUS.register(this);

	}

	private void setup(final FMLCommonSetupEvent event) {
		// Pre Init Code (Register events, etc.)

	}

	private void clientSideSet(final FMLClientSetupEvent event) {
		// Client Side only
	}

	private void dispatchIMC(final InterModEnqueueEvent event) {
		// IMC dispatch > OMod
	}

	private void processIMC(final InterModProcessEvent event) {
		// Rec and Proc Mod Coms

	}

	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		// Active when server start

	}

}
