/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odetosatelliteandshark.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.odetosatelliteandshark.OdeToSatelliteAndSharkMod;

public class OdeToSatelliteAndSharkModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OdeToSatelliteAndSharkMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> OTSAS = REGISTRY.register("otsas",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ode_to_satellite_and_shark.otsas")).icon(() -> new ItemStack(OdeToSatelliteAndSharkModItems.SHARKITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OdeToSatelliteAndSharkModItems.SHARKITEM.get());
				tabData.accept(OdeToSatelliteAndSharkModItems.CAISHARK_SPAWN_EGG.get());
				tabData.accept(OdeToSatelliteAndSharkModItems.CAISHARKFIN.get());
				tabData.accept(OdeToSatelliteAndSharkModItems.ODETOSHARK.get());
				tabData.accept(OdeToSatelliteAndSharkModItems.SHARDOFTHE_SCARLET_SATELLITE.get());
				tabData.accept(OdeToSatelliteAndSharkModItems.SCARLETGEM.get());
			}).build());
}