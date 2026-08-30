/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odetosatelliteandshark.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.odetosatelliteandshark.OdeToSatelliteAndSharkMod;

@EventBusSubscriber
public class OdeToSatelliteAndSharkModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, OdeToSatelliteAndSharkMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> SHARKCURIOSLEVEL = REGISTRY.register("sharkcurioslevel", () -> new RangedAttribute("attribute.ode_to_satellite_and_shark.sharkcurioslevel", 1d, 0d, 100d).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> SCARLETFIRE = REGISTRY.register("scarletfire",
			() -> new RangedAttribute("attribute.ode_to_satellite_and_shark.scarletfire", 0d, 0d, 20d).setSyncable(true).setSentiment(Attribute.Sentiment.NEGATIVE));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, SHARKCURIOSLEVEL);
		event.getTypes().forEach(entity -> event.add(entity, SCARLETFIRE));
	}
}