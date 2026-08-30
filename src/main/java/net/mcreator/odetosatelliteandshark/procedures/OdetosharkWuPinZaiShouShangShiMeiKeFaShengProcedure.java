package net.mcreator.odetosatelliteandshark.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.component.DataComponents;

import net.mcreator.odetosatelliteandshark.init.OdeToSatelliteAndSharkModItems;

public class OdetosharkWuPinZaiShouShangShiMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double level = 0;
		double add = 0;
		if (OdeToSatelliteAndSharkModItems.ODETOSHARK.get() == itemstack.getItem()) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("shark_level") <= 36) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(1));
				} else {
					entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
				}
				add = 0.05 + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("shark_add");
				if (36 * Math.pow(add / 12, 0.7) >= 1) {
					level = Math.floor(36 * Math.pow(add / 12, 0.7));
				}
				{
					final String _tagName = "shark_add";
					final double _tagValue = add;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("shark_level") != level) {
					{
						final String _tagName = "shark_level";
						final double _tagValue = level;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_max_health";
						final double _tagValue = (level * 0.02);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_attack_damage";
						final double _tagValue = (level * 0.015);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_movement_speed";
						final double _tagValue = (level * 0.015);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_mining_efficiency";
						final double _tagValue = (level * 0.02);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_luck";
						final double _tagValue = (level * 0.01);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_armor";
						final double _tagValue = (level * 0.01);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "shark_sttack_speed";
						final double _tagValue = (level * 0.01);
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
			} else {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) 0.1);
			}
		}
	}
}