package com.alexpavlyuk.types;

import com.alexpavlyuk.HeavenlyBody;

public class DwarfPlanet extends HeavenlyBody {
	public DwarfPlanet(String name, double orbitalPeriod) {
		super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
	}
}
