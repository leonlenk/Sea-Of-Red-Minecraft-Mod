package com.dairyyy.metalmod.entity.model;

import com.dairyyy.metalmod.entity.ElephantShrewEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

import java.util.Timer;

public class ElephantShrewModel<T extends ElephantShrewEntity> extends EntityModel<T>
{
        private final ModelRenderer shrew;
        private final ModelRenderer body;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer head;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer uppersnout;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer lowersnout;
        private final ModelRenderer cube_r9;
        private final ModelRenderer frontleftleg;
        private final ModelRenderer cube_r10;
        private final ModelRenderer backleftleg;
        private final ModelRenderer cube_r11;
        private final ModelRenderer frontrightleg;
        private final ModelRenderer cube_r12;
        private final ModelRenderer backrightleg;
        private final ModelRenderer cube_r13;
        private final ModelRenderer tail;
        private final ModelRenderer cube_r14;
        private final ModelRenderer cube_r15;
        private final ModelRenderer cube_r16;
        private final ModelRenderer cube_r17;
        private final ModelRenderer cube_r18;


        public ElephantShrewModel() {
            textureWidth = 64;
            textureHeight = 64;

            shrew = new ModelRenderer(this);
            shrew.setRotationPoint(0.0F, 24.0F, 0.0F);


            body = new ModelRenderer(this);
            body.setRotationPoint(1.0F, -5.78F, -1.5F);
            shrew.addChild(body);
            setRotationAngle(body, 0.0F, -1.5708F, 0.0F);


            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(4.8175F, 3.6142F, 0.5929F);
            body.addChild(cube_r1);
            setRotationAngle(cube_r1, 1.5708F, 0.0F, -3.1416F);
            cube_r1.setTextureOffset(0, 6).addBox(1.1825F, -2.7071F, -1.8342F, 6.0F, 3.0F, 3.0F, -0.6F, false);
            cube_r1.setTextureOffset(15, 3).addBox(1.1825F, -1.4071F, -1.8342F, 6.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(4.8175F, 3.6142F, 0.5929F);
            body.addChild(cube_r2);
            setRotationAngle(cube_r2, -1.5708F, 0.0F, 3.1416F);
            cube_r2.setTextureOffset(0, 0).addBox(1.1825F, -2.9929F, -1.1658F, 6.0F, 3.0F, 3.0F, -0.6F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(4.8175F, 3.6142F, 0.5929F);
            body.addChild(cube_r3);
            setRotationAngle(cube_r3, 3.1416F, 0.0F, 3.1416F);
            cube_r3.setTextureOffset(0, 12).addBox(1.1825F, -3.1342F, -1.5929F, 6.0F, 3.0F, 3.0F, -0.6F, false);

            head = new ModelRenderer(this);
            head.setRotationPoint(0.2F, -2.3F, -4.0F);
            shrew.addChild(head);


            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(0.2071F, 0.1342F, -0.6825F);
            head.addChild(cube_r4);
            setRotationAngle(cube_r4, -2.3126F, 0.0F, -3.098F);
            cube_r4.setTextureOffset(7, 25).addBox(-2.3071F, -3.2342F, 0.2825F, 2.0F, 2.0F, 1.0F, -0.2F, false);

            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(0.2071F, 0.1342F, -0.6825F);
            head.addChild(cube_r5);
            setRotationAngle(cube_r5, -2.3998F, 0.0F, 3.1416F);
            cube_r5.setTextureOffset(20, 25).addBox(0.2929F, -3.2342F, 0.1825F, 2.0F, 2.0F, 1.0F, -0.2F, false);

            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(0.2071F, 0.1342F, -0.6825F);
            head.addChild(cube_r6);
            setRotationAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
            cube_r6.setTextureOffset(16, 10).addBox(-1.4071F, -1.8342F, -1.3175F, 3.0F, 3.0F, 2.0F, -0.2F, false);

            uppersnout = new ModelRenderer(this);
            uppersnout.setRotationPoint(0.2F, -0.6278F, -1.0061F);
            head.addChild(uppersnout);


            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(0.0071F, 0.762F, 0.3236F);
            uppersnout.addChild(cube_r7);
            setRotationAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
            cube_r7.setTextureOffset(16, 16).addBox(-1.4071F, -1.2342F, -0.3175F, 3.0F, 2.0F, 2.0F, -0.3F, false);
            cube_r7.setTextureOffset(0, 22).addBox(-0.9071F, -1.1342F, 0.6825F, 2.0F, 2.0F, 2.0F, -0.4F, false);
            cube_r7.setTextureOffset(14, 20).addBox(-0.9071F, -0.9342F, 1.6825F, 2.0F, 2.0F, 2.0F, -0.6F, false);

            cube_r8 = new ModelRenderer(this);
            cube_r8.setRotationPoint(0.0071F, 0.762F, 0.3236F);
            uppersnout.addChild(cube_r8);
            setRotationAngle(cube_r8, 2.7925F, 0.0F, -3.1416F);
            cube_r8.setTextureOffset(8, 18).addBox(-0.9071F, -2.2037F, 2.0171F, 2.0F, 2.0F, 2.0F, -0.8F, false);
            cube_r8.setTextureOffset(0, 18).addBox(-0.9071F, -2.3037F, 2.3171F, 2.0F, 2.0F, 2.0F, -0.9F, false);

            lowersnout = new ModelRenderer(this);
            lowersnout.setRotationPoint(0.1F, 0.9F, -0.9F);
            head.addChild(lowersnout);


            cube_r9 = new ModelRenderer(this);
            cube_r9.setRotationPoint(0.1071F, -0.7658F, 0.2175F);
            lowersnout.addChild(cube_r9);
            setRotationAngle(cube_r9, -3.1416F, 0.0F, 3.1416F);
            cube_r9.setTextureOffset(8, 22).addBox(-0.9071F, 0.0658F, 1.6825F, 2.0F, 1.0F, 2.0F, -0.6F, false);
            cube_r9.setTextureOffset(20, 22).addBox(-0.9071F, 0.0658F, 0.6825F, 2.0F, 1.0F, 2.0F, -0.4F, false);
            cube_r9.setTextureOffset(15, 0).addBox(-1.4071F, 0.1658F, -0.3175F, 3.0F, 1.0F, 2.0F, -0.3F, false);

            frontleftleg = new ModelRenderer(this);
            frontleftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
            shrew.addChild(frontleftleg);


            cube_r10 = new ModelRenderer(this);
            cube_r10.setRotationPoint(0.4071F, -2.1658F, -4.6825F);
            frontleftleg.addChild(cube_r10);
            setRotationAngle(cube_r10, -3.1416F, 0.0F, 3.1416F);
            cube_r10.setTextureOffset(23, 0).addBox(-1.8071F, 1.1658F, -1.8175F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            backleftleg = new ModelRenderer(this);
            backleftleg.setRotationPoint(1.4F, -0.8F, 1.7F);
            shrew.addChild(backleftleg);


            cube_r11 = new ModelRenderer(this);
            cube_r11.setRotationPoint(-0.9929F, -1.3658F, -1.3825F);
            backleftleg.addChild(cube_r11);
            setRotationAngle(cube_r11, -3.1416F, 0.0F, 3.1416F);
            cube_r11.setTextureOffset(6, 18).addBox(-1.8071F, 1.1658F, -1.8175F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            frontrightleg = new ModelRenderer(this);
            frontrightleg.setRotationPoint(-1.0F, -0.8F, -3.4F);
            shrew.addChild(frontrightleg);


            cube_r12 = new ModelRenderer(this);
            cube_r12.setRotationPoint(1.4071F, -1.3658F, -1.2825F);
            frontrightleg.addChild(cube_r12);
            setRotationAngle(cube_r12, -3.1416F, 0.0F, 3.1416F);
            cube_r12.setTextureOffset(6, 22).addBox(1.0929F, 1.1658F, -1.8175F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            backrightleg = new ModelRenderer(this);
            backrightleg.setRotationPoint(-1.0F, -0.8F, -3.4F);
            shrew.addChild(backrightleg);


            cube_r13 = new ModelRenderer(this);
            cube_r13.setRotationPoint(0.1071F, -0.0658F, 4.9175F);
            backrightleg.addChild(cube_r13);
            setRotationAngle(cube_r13, -3.1416F, 0.0F, 3.1416F);
            cube_r13.setTextureOffset(20, 20).addBox(-0.2071F, -0.1342F, -0.5175F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            tail = new ModelRenderer(this);
            tail.setRotationPoint(0.0F, -0.2F, -0.8F);
            shrew.addChild(tail);
            setRotationAngle(tail, -0.1745F, 0.0F, 0.0F);


            cube_r14 = new ModelRenderer(this);
            cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r14);
            setRotationAngle(cube_r14, -0.4363F, 0.0F, 0.0F);
            cube_r14.setTextureOffset(24, 9).addBox(-0.2F, -5.7F, 5.8F, 1.0F, 1.0F, 2.0F, -0.4F, false);

            cube_r15 = new ModelRenderer(this);
            cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r15);
            setRotationAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
            cube_r15.setTextureOffset(24, 13).addBox(-0.2F, -5.1F, 5.1F, 1.0F, 1.0F, 2.0F, -0.3F, false);

            cube_r16 = new ModelRenderer(this);
            cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r16);
            setRotationAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
            cube_r16.setTextureOffset(14, 24).addBox(-0.2F, -4.6F, 4.2F, 1.0F, 1.0F, 2.0F, -0.2F, false);

            cube_r17 = new ModelRenderer(this);
            cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r17);
            setRotationAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
            cube_r17.setTextureOffset(24, 18).addBox(-0.2F, -4.2F, 3.1F, 1.0F, 1.0F, 2.0F, -0.1F, false);

            cube_r18 = new ModelRenderer(this);
            cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r18);
            setRotationAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
            cube_r18.setTextureOffset(25, 0).addBox(-0.2F, -3.9F, 1.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
            this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            this.backrightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.backleftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.frontrightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.frontleftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            if(entity.getShouldBeDead() == true)
            {
                this.lowersnout.rotateAngleX = .9f;}
            if(entity.getShouldBeDead() == false){
                this.lowersnout.rotateAngleX = 0f;}

        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            shrew.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}