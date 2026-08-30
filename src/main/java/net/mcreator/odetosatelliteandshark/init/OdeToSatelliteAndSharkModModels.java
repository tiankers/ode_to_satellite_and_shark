/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odetosatelliteandshark.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.odetosatelliteandshark.client.model.Modelcai_shark;

@EventBusSubscriber(Dist.CLIENT)
public class OdeToSatelliteAndSharkModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcai_shark.LAYER_LOCATION, Modelcai_shark::createBodyLayer);
	}
}