package net.mcreator.odetosatelliteandshark.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.odetosatelliteandshark.entity.CaisharkEntity;
import net.mcreator.odetosatelliteandshark.client.model.animations.cai_sharkAnimation;
import net.mcreator.odetosatelliteandshark.client.model.Modelcai_shark;

import com.mojang.blaze3d.vertex.PoseStack;

public class CaisharkRenderer extends MobRenderer<CaisharkEntity, Modelcai_shark<CaisharkEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("ode_to_satellite_and_shark:textures/entities/cai_shark.png");

	public CaisharkRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcai_shark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(CaisharkEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(CaisharkEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelcai_shark<CaisharkEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CaisharkEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CaisharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(cai_sharkAnimation.swimone, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, cai_sharkAnimation.swimtwo, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CaisharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}