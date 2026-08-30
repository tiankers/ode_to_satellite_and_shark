package net.mcreator.odetosatelliteandshark.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.component.DataComponents;

public class ScarletgemShengWuBeiCiWuPinJiZhongProcedure {
	public static void execute(ItemStack itemstack) {
		double Probability = 0;
		Probability = Mth.nextDouble(RandomSource.create(), 0, 20) * Mth.nextDouble(RandomSource.create(), 0, 10) * Mth.nextDouble(RandomSource.create(), 0, 1) * Mth.nextDouble(RandomSource.create(), 0, 1) * 1 * 1;
		{
			final String _tagName = "s_ad";
			final double _tagValue = (Probability / 100);
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
		Probability = Mth.nextDouble(RandomSource.create(), 0, 20) * Mth.nextDouble(RandomSource.create(), 0, 1);
		{
			final String _tagName = "s_sf";
			final double _tagValue = Probability;
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
	}
}