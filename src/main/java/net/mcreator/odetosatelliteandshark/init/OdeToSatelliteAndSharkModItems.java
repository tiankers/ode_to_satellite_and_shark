/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odetosatelliteandshark.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.odetosatelliteandshark.item.SharkitemItem;
import net.mcreator.odetosatelliteandshark.item.ShardoftheScarletSatelliteItem;
import net.mcreator.odetosatelliteandshark.item.ScarletgemItem;
import net.mcreator.odetosatelliteandshark.item.OdetosharkItem;
import net.mcreator.odetosatelliteandshark.item.CaisharkfinItem;
import net.mcreator.odetosatelliteandshark.OdeToSatelliteAndSharkMod;

public class OdeToSatelliteAndSharkModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OdeToSatelliteAndSharkMod.MODID);
	public static final DeferredItem<Item> SHARKITEM;
	public static final DeferredItem<Item> CAISHARK_SPAWN_EGG;
	public static final DeferredItem<Item> CAISHARKFIN;
	public static final DeferredItem<Item> ODETOSHARK;
	public static final DeferredItem<Item> SHARDOFTHE_SCARLET_SATELLITE;
	public static final DeferredItem<Item> SCARLETGEM;
	static {
		SHARKITEM = REGISTRY.register("sharkitem", SharkitemItem::new);
		CAISHARK_SPAWN_EGG = REGISTRY.register("caishark_spawn_egg", () -> new DeferredSpawnEggItem(OdeToSatelliteAndSharkModEntities.CAISHARK, -16764058, -16737793, new Item.Properties()));
		CAISHARKFIN = REGISTRY.register("caisharkfin", CaisharkfinItem::new);
		ODETOSHARK = REGISTRY.register("odetoshark", OdetosharkItem::new);
		SHARDOFTHE_SCARLET_SATELLITE = REGISTRY.register("shardofthe_scarlet_satellite", ShardoftheScarletSatelliteItem::new);
		SCARLETGEM = REGISTRY.register("scarletgem", ScarletgemItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}