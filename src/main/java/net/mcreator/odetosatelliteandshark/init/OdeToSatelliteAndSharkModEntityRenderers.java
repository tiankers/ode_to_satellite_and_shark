/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odetosatelliteandshark.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.odetosatelliteandshark.client.renderer.CaisharkRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class OdeToSatelliteAndSharkModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OdeToSatelliteAndSharkModEntities.CAISHARK.get(), CaisharkRenderer::new);
	}
}