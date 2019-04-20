package com.epiicthundercat.rusty.handler;

public enum RustyHarvestLevel {

	rye("rye", 1);

	public final int harvestLevel;
	public final String name;

	RustyHarvestLevel(String name, int harvestLevel) {
		this.harvestLevel = harvestLevel;
		this.name = name();
	}
}
