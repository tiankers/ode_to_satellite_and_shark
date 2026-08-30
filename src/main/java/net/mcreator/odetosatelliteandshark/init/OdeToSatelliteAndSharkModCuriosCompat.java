package net.mcreator.odetosatelliteandshark.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.odetosatelliteandshark.procedures.ScarletfireaaaProcedure;

public class OdeToSatelliteAndSharkModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public com.google.common.collect.Multimap<net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute>, net.minecraft.world.entity.ai.attributes.AttributeModifier> getAttributeModifiers(SlotContext slotContext,
					net.minecraft.resources.ResourceLocation id) {
				applyDefaultNbt(stack);
				com.google.common.collect.Multimap<net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute>, net.minecraft.world.entity.ai.attributes.AttributeModifier> map0 = com.google.common.collect.LinkedHashMultimap
						.create();
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_0 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.max_health")).orElse(null);
				if (attr0_0 != null) {
					map0.put(attr0_0,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_0").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_max_health")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_1 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.attack_damage")).orElse(null);
				if (attr0_1 != null) {
					map0.put(attr0_1,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_1").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_attack_damage")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_2 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.movement_speed")).orElse(null);
				if (attr0_2 != null) {
					map0.put(attr0_2,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_2").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_movement_speed")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_3 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:player.mining_efficiency")).orElse(null);
				if (attr0_3 != null) {
					map0.put(attr0_3,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_3").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_mining_efficiency")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_4 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.luck"))
						.orElse(null);
				if (attr0_4 != null) {
					map0.put(attr0_4,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_4").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_luck")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_5 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.armor"))
						.orElse(null);
				if (attr0_5 != null) {
					map0.put(attr0_5,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_5").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_armor")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_6 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.attack_speed")).orElse(null);
				if (attr0_6 != null) {
					map0.put(attr0_6,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_6").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_sttack_speed")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr0_7 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("ode_to_satellite_and_shark:sharkcurioslevel")).orElse(null);
				if (attr0_7 != null) {
					map0.put(attr0_7,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Odetoshark" + "_7").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("shark_level")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE));
				}
				return map0;
			}

			@Override
			public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan) {
				return true;
			}

			@Override
			public boolean makesPiglinsNeutral(SlotContext slotContext) {
				return true;
			}

			@Override
			public boolean canWalkOnPowderedSnow(SlotContext slotContext) {
				return true;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.cave_vines.step")).value(), 1, 1);
			}

			@Override
			public void onEquip(SlotContext slotContext, ItemStack prevStack) {
				applyDefaultNbt(stack);
			}
		}, OdeToSatelliteAndSharkModItems.ODETOSHARK.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public com.google.common.collect.Multimap<net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute>, net.minecraft.world.entity.ai.attributes.AttributeModifier> getAttributeModifiers(SlotContext slotContext,
					net.minecraft.resources.ResourceLocation id) {
				applyDefaultNbt(stack);
				com.google.common.collect.Multimap<net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute>, net.minecraft.world.entity.ai.attributes.AttributeModifier> map1 = com.google.common.collect.LinkedHashMultimap
						.create();
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr1_0 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("minecraft:generic.attack_damage")).orElse(null);
				if (attr1_0 != null) {
					map1.put(attr1_0,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Scarletgem" + "_0").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("s_ad")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
				}
				net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attr1_1 = net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
						.getHolder(net.minecraft.resources.ResourceLocation.parse("ode_to_satellite_and_shark:scarletfire")).orElse(null);
				if (attr1_1 != null) {
					map1.put(attr1_1,
							new net.minecraft.world.entity.ai.attributes.AttributeModifier(net.minecraft.resources.ResourceLocation.parse(("ode_to_satellite_and_shark:" + "Scarletgem" + "_1").toLowerCase(java.util.Locale.ENGLISH)),
									(double) (stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag().getDouble("s_sf")),
									net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE));
				}
				return map1;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				ScarletfireaaaProcedure.execute(slotContext.entity().level(), slotContext.entity(), stack);
			}

			@Override
			public void onEquip(SlotContext slotContext, ItemStack prevStack) {
				applyDefaultNbt(stack);
			}
		}, OdeToSatelliteAndSharkModItems.SCARLETGEM.get());
	}

	public static void applyDefaultNbt(ItemStack stack) {
		if (stack.is(OdeToSatelliteAndSharkModItems.ODETOSHARK.get())) {
			net.minecraft.world.item.component.CustomData data0 = stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY);
			net.minecraft.nbt.CompoundTag tag0 = data0.copyTag();
			boolean changed0 = false;
			if (!tag0.contains("shark_level")) {
				tag0.putDouble("shark_level", 1);
				changed0 = true;
			}
			if (!tag0.contains("shark_max_health")) {
				tag0.putDouble("shark_max_health", 0.02);
				changed0 = true;
			}
			if (!tag0.contains("shark_attack_damage")) {
				tag0.putDouble("shark_attack_damage", 0.015);
				changed0 = true;
			}
			if (!tag0.contains("shark_movement_speed")) {
				tag0.putDouble("shark_movement_speed", 0.015);
				changed0 = true;
			}
			if (!tag0.contains("shark_mining_efficiency")) {
				tag0.putDouble("shark_mining_efficiency", 0.02);
				changed0 = true;
			}
			if (!tag0.contains("shark_luck")) {
				tag0.putDouble("shark_luck", 0.01);
				changed0 = true;
			}
			if (!tag0.contains("shark_armor")) {
				tag0.putDouble("shark_armor", 0.01);
				changed0 = true;
			}
			if (!tag0.contains("shark_sttack_speed")) {
				tag0.putDouble("shark_sttack_speed", 0.01);
				changed0 = true;
			}
			if (!tag0.contains("shark_add")) {
				tag0.putDouble("shark_add", 0);
				changed0 = true;
			}
			if (changed0)
				stack.set(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.of(tag0));
		}
		if (stack.is(OdeToSatelliteAndSharkModItems.SCARLETGEM.get())) {
			net.minecraft.world.item.component.CustomData data1 = stack.getOrDefault(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY);
			net.minecraft.nbt.CompoundTag tag1 = data1.copyTag();
			boolean changed1 = false;
			if (!tag1.contains("s_ad")) {
				tag1.putDouble("s_ad", 0);
				changed1 = true;
			}
			if (!tag1.contains("s_sf")) {
				tag1.putDouble("s_sf", 0);
				changed1 = true;
			}
			if (changed1)
				stack.set(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.of(tag1));
		}
	}
}