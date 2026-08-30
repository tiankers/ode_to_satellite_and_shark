// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcai_shark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cai_shark"), "main");
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart torso;
	private final ModelPart dorsalfin;
	private final ModelPart rightfin;
	private final ModelPart leftfin;
	private final ModelPart pelvicfin;
	private final ModelPart tail;
	private final ModelPart tailfin;

	public Modelcai_shark(ModelPart root) {
		this.head = root.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.torso = root.getChild("torso");
		this.dorsalfin = this.torso.getChild("dorsalfin");
		this.rightfin = this.torso.getChild("rightfin");
		this.leftfin = this.torso.getChild("leftfin");
		this.pelvicfin = this.torso.getChild("pelvicfin");
		this.tail = root.getChild("tail");
		this.tailfin = this.tail.getChild("tailfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-2.5F, -1.0F, -4.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 29)
						.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 34)
						.addBox(2.5F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-3.5F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 54)
						.addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 19.0F, -6.5F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(3, 52).addBox(-2.5F, 0.0F,
				-3.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -2.0F, -5.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 19.0F, -1.5F));

		PartDefinition dorsalfin = torso.addOrReplaceChild("dorsalfin",
				CubeListBuilder.create().texOffs(14, 26)
						.addBox(-5.5F, -9.0F, 3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 30)
						.addBox(-5.5F, -10.0F, 4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(-5.5F, -11.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -4.5F));

		PartDefinition rightfin = torso.addOrReplaceChild("rightfin",
				CubeListBuilder.create().texOffs(25, 50)
						.addBox(-9.5F, -3.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(39, 50)
						.addBox(-10.5F, -3.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 33)
						.addBox(-11.5F, -3.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 18)
						.addBox(-12.5F, -3.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 34)
						.addBox(-9.5F, -4.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -4.5F));

		PartDefinition leftfin = torso.addOrReplaceChild("leftfin",
				CubeListBuilder.create().texOffs(26, 26)
						.addBox(-1.5F, -3.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-0.5F, -3.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(0.5F, -3.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 5)
						.addBox(1.5F, -3.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 34)
						.addBox(-1.5F, -4.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -4.5F));

		PartDefinition pelvicfin = torso.addOrReplaceChild("pelvicfin",
				CubeListBuilder.create().texOffs(14, 35)
						.addBox(-3.5F, -2.0F, 6.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-7.5F, -2.0F, 6.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
						.addBox(-3.5F, -1.0F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
						.addBox(-7.5F, -1.0F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -4.5F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(18, 18)
						.addBox(-2.5F, -1.0F, 0.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 19.0F, 2.5F));

		PartDefinition tailfin = tail.addOrReplaceChild("tailfin",
				CubeListBuilder.create().texOffs(8, 31)
						.addBox(-5.5F, -7.0F, 14.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-5.5F, -8.0F, 15.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 35)
						.addBox(-5.5F, -9.0F, 16.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 2)
						.addBox(-5.5F, -3.0F, 16.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 36)
						.addBox(-5.5F, -4.0F, 12.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 48)
						.addBox(-5.5F, -7.0F, 13.5F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(-5.5F, -8.0F, 12.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -8.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}