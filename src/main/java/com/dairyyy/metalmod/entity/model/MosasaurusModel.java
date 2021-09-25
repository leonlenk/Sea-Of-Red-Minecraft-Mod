package com.dairyyy.metalmod.entity.model;

import com.dairyyy.metalmod.entity.MosasaurusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MosasaurusModel <T extends MosasaurusEntity> extends EntityModel<T>
{
        private final ModelRenderer mosasaurus;
        private final ModelRenderer body;
        private final ModelRenderer center;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer head;
        private final ModelRenderer upperjaw;
        private final ModelRenderer teeth3;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer teeth4;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer lowerjaw;
        private final ModelRenderer teeth;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;
        private final ModelRenderer teeth2;
        private final ModelRenderer cube_r11;
        private final ModelRenderer cube_r12;
        private final ModelRenderer tail;
        private final ModelRenderer cube_r13;
        private final ModelRenderer fin;
        private final ModelRenderer cube_r14;
        private final ModelRenderer cube_r15;
        private final ModelRenderer frontleftfin;
        private final ModelRenderer frontrightfin;
        private final ModelRenderer backrightfin;
        private final ModelRenderer backleftfin;

        public MosasaurusModel() {
            textureWidth = 2048;
            textureHeight = 2048;

            mosasaurus = new ModelRenderer(this);
            mosasaurus.setRotationPoint(0.0F, 2.0F, 0.0F);


            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 0.0F, 0.0F);
            mosasaurus.addChild(body);


            center = new ModelRenderer(this);
            center.setRotationPoint(0.0F, 0.0F, 0.0F);
            body.addChild(center);
            center.setTextureOffset(0, 0).addBox(-40.0F, -80.0F, -116.0592F, 80.0F, 80.0F, 224.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(0.0F, -116.9772F, -8.9376F);
            center.addChild(cube_r1);
            setRotationAngle(cube_r1, 2.0508F, 0.0F, 0.0F);
            cube_r1.setTextureOffset(0, 128).addBox(-2.0F, 63.0F, -78.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r1.setTextureOffset(40, 128).addBox(-2.0F, 45.0F, -60.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r1.setTextureOffset(80, 128).addBox(-2.0F, 27.0F, -42.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r1.setTextureOffset(120, 128).addBox(-2.0F, 9.0F, -25.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r1.setTextureOffset(136, 16).addBox(-2.0F, -8.0F, -8.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(0.0F, -92.1023F, -79.6924F);
            center.addChild(cube_r2);
            setRotationAngle(cube_r2, 1.2654F, 0.0F, 0.0F);
            cube_r2.setTextureOffset(136, 48).addBox(-2.0F, 25.0F, 26.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r2.setTextureOffset(144, 144).addBox(-2.0F, 8.0F, 9.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r2.setTextureOffset(0, 160).addBox(-2.0F, -9.0F, -8.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(0.0F, -64.5499F, 28.6575F);
            center.addChild(cube_r3);
            setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
            cube_r3.setTextureOffset(0, 304).addBox(-40.0F, -39.0F, -70.0F, 80.0F, 80.0F, 142.0F, -2.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(0.0F, -169.0F, -52.0592F);
            center.addChild(cube_r4);
            setRotationAngle(cube_r4, 0.48F, 0.0F, 0.0F);
            cube_r4.setTextureOffset(384, 0).addBox(-40.0F, 55.0F, -93.0F, 80.0F, 80.0F, 96.0F, -1.0F, false);

            head = new ModelRenderer(this);
            head.setRotationPoint(8.0F, -37.0F, -125.0F);
            mosasaurus.addChild(head);


            upperjaw = new ModelRenderer(this);
            upperjaw.setRotationPoint(-8.0F, -16.0F, 24.0F);
            head.addChild(upperjaw);
            upperjaw.setTextureOffset(576, 560).addBox(-40.0F, -33.0F, -67.0592F, 80.0F, 48.0F, 64.0F, 3.0F, false);
            upperjaw.setTextureOffset(288, 560).addBox(-40.0F, -28.2F, -120.0592F, 80.0F, 48.0F, 64.0F, -2.0F, false);
            upperjaw.setTextureOffset(0, 526).addBox(-40.0F, -24.5F, -165.0592F, 80.0F, 48.0F, 64.0F, -6.0F, false);
            upperjaw.setTextureOffset(444, 448).addBox(-40.0F, -21.6F, -205.0592F, 80.0F, 48.0F, 64.0F, -9.0F, false);

            teeth3 = new ModelRenderer(this);
            teeth3.setRotationPoint(0.0F, -28.0F, 97.0F);
            upperjaw.addChild(teeth3);


            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(34.0F, 26.0F, -289.0F);
            teeth3.addChild(cube_r5);
            setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
            cube_r5.setTextureOffset(160, 0).addBox(4.0F, 123.0F, 96.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(160, 32).addBox(4.0F, 107.0F, 80.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(40, 160).addBox(1.0F, 92.0F, 64.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(72, 160).addBox(1.0F, 75.0F, 48.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(104, 160).addBox(-4.0F, 60.0F, 32.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(136, 160).addBox(-4.0F, 45.0F, 17.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(168, 128).addBox(-7.0F, 29.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r5.setTextureOffset(0, 176).addBox(-7.0F, 12.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(27.0F, 45.799F, -280.5147F);
            teeth3.addChild(cube_r6);
            setRotationAngle(cube_r6, 0.7854F, -1.5708F, 0.0F);
            cube_r6.setTextureOffset(168, 160).addBox(-10.0F, 1.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            teeth4 = new ModelRenderer(this);
            teeth4.setRotationPoint(0.0F, -28.0F, 97.0F);
            upperjaw.addChild(teeth4);


            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(-34.0F, 26.0F, -289.0F);
            teeth4.addChild(cube_r7);
            setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
            cube_r7.setTextureOffset(48, 0).addBox(-4.0F, 123.0F, 96.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(48, 32).addBox(-4.0F, 107.0F, 80.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(24, 112).addBox(-1.0F, 92.0F, 64.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(64, 112).addBox(-1.0F, 75.0F, 48.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(104, 112).addBox(4.0F, 60.0F, 32.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(24, 144).addBox(4.0F, 45.0F, 17.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(56, 144).addBox(7.0F, 29.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r7.setTextureOffset(144, 112).addBox(7.0F, 12.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this);
            cube_r8.setRotationPoint(-27.0F, 45.799F, -280.5147F);
            teeth4.addChild(cube_r8);
            setRotationAngle(cube_r8, 0.7854F, 1.5708F, 0.0F);
            cube_r8.setTextureOffset(88, 144).addBox(10.0F, 1.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            lowerjaw = new ModelRenderer(this);
            lowerjaw.setRotationPoint(-8.0F, 29.0F, 24.0F);
            head.addChild(lowerjaw);
            lowerjaw.setTextureOffset(800, 480).addBox(-40.0F, -24.0F, -67.0592F, 80.0F, 32.0F, 64.0F, 3.0F, false);
            lowerjaw.setTextureOffset(772, 704).addBox(-40.0F, -28.8F, -120.0592F, 80.0F, 32.0F, 64.0F, -2.0F, false);
            lowerjaw.setTextureOffset(484, 768).addBox(-40.0F, -32.5F, -165.0592F, 80.0F, 32.0F, 64.0F, -6.0F, false);
            lowerjaw.setTextureOffset(196, 768).addBox(-40.0F, -35.4F, -205.0592F, 80.0F, 32.0F, 64.0F, -9.0F, false);

            teeth = new ModelRenderer(this);
            teeth.setRotationPoint(0.0F, -72.0F, 97.0F);
            lowerjaw.addChild(teeth);


            cube_r9 = new ModelRenderer(this);
            cube_r9.setRotationPoint(34.0F, 26.0F, -289.0F);
            teeth.addChild(cube_r9);
            setRotationAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
            cube_r9.setTextureOffset(192, 0).addBox(4.0F, 123.0F, 96.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(32, 192).addBox(4.0F, 107.0F, 80.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(192, 32).addBox(1.0F, 92.0F, 64.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(64, 192).addBox(1.0F, 75.0F, 48.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(192, 64).addBox(-4.0F, 60.0F, 32.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(192, 80).addBox(-4.0F, 45.0F, 17.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(96, 192).addBox(-7.0F, 29.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r9.setTextureOffset(192, 96).addBox(-7.0F, 12.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r10 = new ModelRenderer(this);
            cube_r10.setRotationPoint(27.0F, 45.799F, -280.5147F);
            teeth.addChild(cube_r10);
            setRotationAngle(cube_r10, 0.7854F, -1.5708F, 0.0F);
            cube_r10.setTextureOffset(0, 192).addBox(-10.0F, 1.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            teeth2 = new ModelRenderer(this);
            teeth2.setRotationPoint(0.0F, -72.0F, 97.0F);
            lowerjaw.addChild(teeth2);


            cube_r11 = new ModelRenderer(this);
            cube_r11.setRotationPoint(-34.0F, 26.0F, -289.0F);
            teeth2.addChild(cube_r11);
            setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
            cube_r11.setTextureOffset(176, 16).addBox(-4.0F, 123.0F, 96.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(32, 176).addBox(-4.0F, 107.0F, 80.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(176, 48).addBox(-1.0F, 92.0F, 64.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(64, 176).addBox(-1.0F, 75.0F, 48.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(96, 176).addBox(4.0F, 60.0F, 32.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(176, 112).addBox(4.0F, 45.0F, 17.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(128, 176).addBox(7.0F, 29.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r11.setTextureOffset(184, 144).addBox(7.0F, 12.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            cube_r12 = new ModelRenderer(this);
            cube_r12.setRotationPoint(-27.0F, 45.799F, -280.5147F);
            teeth2.addChild(cube_r12);
            setRotationAngle(cube_r12, 0.7854F, 1.5708F, 0.0F);
            cube_r12.setTextureOffset(160, 176).addBox(10.0F, 1.0F, 1.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

            tail = new ModelRenderer(this);
            tail.setRotationPoint(3.0F, -46.0F, 105.0F);
            mosasaurus.addChild(tail);
            tail.setTextureOffset(444, 304).addBox(-35.0F, -18.6F, -1.0592F, 64.0F, 64.0F, 80.0F, 0.0F, false);
            tail.setTextureOffset(0, 638).addBox(-28.0F, -11.7F, 58.9408F, 50.0F, 56.0F, 80.0F, 0.0F, false);
            tail.setTextureOffset(0, 784).addBox(-24.5F, -4.4F, 130.9408F, 43.0F, 48.0F, 80.0F, 0.0F, false);

            cube_r13 = new ModelRenderer(this);
            cube_r13.setRotationPoint(-3.0F, -23.87F, 12.304F);
            tail.addChild(cube_r13);
            setRotationAngle(cube_r13, 2.3126F, 0.0F, 0.0F);
            cube_r13.setTextureOffset(0, 0).addBox(-2.0F, 84.0F, -116.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r13.setTextureOffset(24, 16).addBox(-2.0F, 62.0F, -85.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r13.setTextureOffset(0, 32).addBox(-2.0F, 44.0F, -68.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r13.setTextureOffset(24, 48).addBox(-2.0F, 29.0F, -47.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r13.setTextureOffset(112, 0).addBox(-2.0F, 11.0F, -30.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);
            cube_r13.setTextureOffset(112, 32).addBox(-2.0F, -8.0F, -12.0F, 4.0F, 16.0F, 16.0F, 0.0F, false);

            fin = new ModelRenderer(this);
            fin.setRotationPoint(19.0F, 37.0F, -28.0F);
            tail.addChild(fin);


            cube_r14 = new ModelRenderer(this);
            cube_r14.setRotationPoint(-22.0F, -41.4F, 241.9408F);
            fin.addChild(cube_r14);
            setRotationAngle(cube_r14, 0.6981F, 0.0F, 0.0F);
            cube_r14.setTextureOffset(0, 0).addBox(-8.0F, -24.0F, -33.0F, 16.0F, 48.0F, 80.0F, -1.0F, false);

            cube_r15 = new ModelRenderer(this);
            cube_r15.setRotationPoint(-22.0F, -41.4F, 241.9408F);
            fin.addChild(cube_r15);
            setRotationAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
            cube_r15.setTextureOffset(846, 888).addBox(-8.0F, 26.0F, 36.0F, 16.0F, 32.0F, 80.0F, -1.0F, false);
            cube_r15.setTextureOffset(654, 872).addBox(-8.0F, 13.0F, -13.0F, 16.0F, 48.0F, 80.0F, 0.0F, false);

            frontleftfin = new ModelRenderer(this);
            frontleftfin.setRotationPoint(7.3333F, 1.0667F, -60.0F);
            mosasaurus.addChild(frontleftfin);
            setRotationAngle(frontleftfin, 0.0F, 0.0F, 0.1745F);
            frontleftfin.setTextureOffset(548, 672).addBox(22.7524F, -41.9463F, -36.0592F, 80.0F, 32.0F, 64.0F, 0.0F, false);
            frontleftfin.setTextureOffset(260, 672).addBox(88.7524F, -37.7463F, -36.0592F, 80.0F, 32.0F, 64.0F, -5.0F, false);
            frontleftfin.setTextureOffset(668, 384).addBox(140.7524F, -33.9463F, -36.0592F, 80.0F, 32.0F, 64.0F, -9.0F, false);

            frontrightfin = new ModelRenderer(this);
            frontrightfin.setRotationPoint(-18.3333F, 1.0667F, -60.0F);
            mosasaurus.addChild(frontrightfin);
            setRotationAngle(frontrightfin, 0.0F, 0.0F, -0.1745F);
            frontrightfin.setTextureOffset(652, 272).addBox(-91.9196F, -40.0362F, -36.0592F, 80.0F, 32.0F, 64.0F, 0.0F, false);
            frontrightfin.setTextureOffset(640, 0).addBox(-157.9196F, -35.8362F, -36.0592F, 80.0F, 32.0F, 64.0F, -5.0F, false);
            frontrightfin.setTextureOffset(608, 176).addBox(-209.9196F, -32.0362F, -36.0592F, 80.0F, 32.0F, 64.0F, -9.0F, false);

            backrightfin = new ModelRenderer(this);
            backrightfin.setRotationPoint(0.6667F, 1.0667F, 64.0F);
            mosasaurus.addChild(backrightfin);
            setRotationAngle(backrightfin, 0.0F, 0.0F, -0.1745F);
            backrightfin.setTextureOffset(876, 216).addBox(-110.6309F, -43.3355F, -22.0592F, 80.0F, 32.0F, 56.0F, 0.0F, false);
            backrightfin.setTextureOffset(462, 864).addBox(-176.6309F, -39.1355F, -22.0592F, 80.0F, 32.0F, 56.0F, -5.0F, false);
            backrightfin.setTextureOffset(190, 864).addBox(-228.6309F, -35.3355F, -22.0592F, 80.0F, 32.0F, 56.0F, -9.0F, false);

            backleftfin = new ModelRenderer(this);
            backleftfin.setRotationPoint(34.3333F, -2.9333F, 82.0F);
            mosasaurus.addChild(backleftfin);
            setRotationAngle(backleftfin, 0.0F, 0.0F, 0.1745F);
            backleftfin.setTextureOffset(832, 96).addBox(-3.1428F, -33.3186F, -40.0592F, 80.0F, 32.0F, 56.0F, 0.0F, false);
            backleftfin.setTextureOffset(808, 616).addBox(62.8572F, -29.1186F, -40.0592F, 80.0F, 32.0F, 56.0F, -5.0F, false);
            backleftfin.setTextureOffset(772, 800).addBox(114.8572F, -25.3186F, -40.0592F, 80.0F, 32.0F, 56.0F, -9.0F, false);
        }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.backrightfin.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.backleftfin.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.frontrightfin.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.frontleftfin.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.upperjaw.rotateAngleX = MathHelper.cos(MathHelper.abs(limbSwing) * 0.5F) * .7F * limbSwingAmount;
    }


    @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            mosasaurus.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}

