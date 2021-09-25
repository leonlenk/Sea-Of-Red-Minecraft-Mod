package com.dairyyy.metalmod.entity.model;

import com.dairyyy.metalmod.entity.PossumEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class PossumModel<T extends PossumEntity> extends EntityModel<T>
{
    private final ModelRenderer possum;
    private final ModelRenderer main;
    private final ModelRenderer head;
    private final ModelRenderer uppersnout;
    private final ModelRenderer backsnoutupper;
    private final ModelRenderer foresnoutupper;
    private final ModelRenderer lowersnout;
    private final ModelRenderer backsnoutlower;
    private final ModelRenderer foresnoutlower;
    private final ModelRenderer ears;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer backhump;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r4;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontrightfoot;
    private final ModelRenderer backrightleg;
    private final ModelRenderer cube_r6;
    private final ModelRenderer backrightfoot;
    private final ModelRenderer tail;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail5;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer cube_r10;
    private final ModelRenderer frontleftfoot;
    private final ModelRenderer backleftleg;
    private final ModelRenderer cube_r11;
    private final ModelRenderer frontleftfoot2;

    public PossumModel() {
        textureWidth = 64;
        textureHeight = 64;

        possum = new ModelRenderer(this);
        possum.setRotationPoint(-8.0F, 16.0F, 8.0F);


        main = new ModelRenderer(this);
        main.setRotationPoint(0.0F, 0.0F, 0.0F);
        possum.addChild(main);


        head = new ModelRenderer(this);
        head.setRotationPoint(8.0F, 0.6F, -13.8F);
        main.addChild(head);
        head.setTextureOffset(21, 23).addBox(-1.9918F, -1.8616F, -2.9176F, 4.0F, 4.0F, 3.0F, 0.2F, false);

        uppersnout = new ModelRenderer(this);
        uppersnout.setRotationPoint(-0.1F, 0.9F, -3.1F);
        head.addChild(uppersnout);


        backsnoutupper = new ModelRenderer(this);
        backsnoutupper.setRotationPoint(-7.9F, -1.5F, 16.9F);
        uppersnout.addChild(backsnoutupper);
        backsnoutupper.setTextureOffset(20, 30).addBox(6.5082F, 0.7384F, -18.7176F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        foresnoutupper = new ModelRenderer(this);
        foresnoutupper.setRotationPoint(-7.9F, -1.5F, 16.9F);
        uppersnout.addChild(foresnoutupper);
        foresnoutupper.setTextureOffset(30, 12).addBox(6.5082F, 0.9884F, -20.7176F, 3.0F, 1.0F, 3.0F, -0.2F, false);

        lowersnout = new ModelRenderer(this);
        lowersnout.setRotationPoint(-8.0F, -0.6F, 13.8F);
        head.addChild(lowersnout);


        backsnoutlower = new ModelRenderer(this);
        backsnoutlower.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowersnout.addChild(backsnoutlower);
        backsnoutlower.setTextureOffset(30, 19).addBox(6.5082F, 1.7384F, -18.7176F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        foresnoutlower = new ModelRenderer(this);
        foresnoutlower.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowersnout.addChild(foresnoutlower);
        foresnoutlower.setTextureOffset(30, 8).addBox(6.5082F, 1.5884F, -20.7176F, 3.0F, 1.0F, 3.0F, -0.2F, false);
        foresnoutlower.setTextureOffset(11, 29).addBox(6.5082F, 1.8884F, -20.7176F, 3.0F, 1.0F, 3.0F, -0.225F, false);

        ears = new ModelRenderer(this);
        ears.setRotationPoint(-8.0F, -0.6F, 13.8F);
        head.addChild(ears);
        ears.setTextureOffset(0, 1).addBox(8.7707F, -2.3029F, -15.6296F, 1.0F, 1.0F, 0.0F, 0.2F, false);
        ears.setTextureOffset(0, 0).addBox(6.1707F, -2.3029F, -15.6296F, 1.0F, 1.0F, 0.0F, 0.2F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(7.9916F, 4.7247F, -6.1041F);
        main.addChild(body);
        body.setTextureOffset(0, 0).addBox(-2.5334F, -4.7276F, -6.0255F, 5.0F, 5.0F, 10.0F, 0.2F, false);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.0334F, -2.2276F, -1.0255F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(20, 0).addBox(-1.95F, -4.0955F, 3.8429F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        backhump = new ModelRenderer(this);
        backhump.setRotationPoint(-7.9916F, -4.7247F, 6.1041F);
        body.addChild(backhump);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(7.9582F, 2.4971F, -7.1296F);
        backhump.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(17, 15).addBox(-2.5F, -2.091F, -5.1517F, 5.0F, 4.0F, 3.0F, 0.1F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(7.9582F, 2.4971F, -7.1296F);
        backhump.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 15).addBox(-2.5F, -4.0262F, -3.9793F, 5.0F, 4.0F, 7.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(-17.9916F, -4.7247F, 6.1041F);
        body.addChild(neck);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(17.9582F, 2.4971F, -7.1296F);
        neck.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(0, 26).addBox(-1.95F, -0.1597F, -7.471F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        frontrightleg = new ModelRenderer(this);
        frontrightleg.setRotationPoint(5.4F, 3.9F, -11.2F);
        possum.addChild(frontrightleg);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(2.5582F, 0.5971F, 0.0704F);
        frontrightleg.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(8, 33).addBox(-2.9875F, -0.3087F, -0.5381F, 1.0F, 3.0F, 2.0F, 0.2F, false);

        frontrightfoot = new ModelRenderer(this);
        frontrightfoot.setRotationPoint(-5.4F, -3.9F, 11.2F);
        frontrightleg.addChild(frontrightfoot);
        frontrightfoot.setTextureOffset(0, 4).addBox(4.9707F, 6.9971F, -12.1296F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        backrightleg = new ModelRenderer(this);
        backrightleg.setRotationPoint(4.7F, 4.0F, -3.8F);
        possum.addChild(backrightleg);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(1.2582F, 0.4971F, -0.3296F);
        backrightleg.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(0, 15).addBox(-0.9875F, -0.3087F, -0.5381F, 1.0F, 3.0F, 2.0F, 0.2F, false);

        backrightfoot = new ModelRenderer(this);
        backrightfoot.setRotationPoint(-4.7F, -4.0F, 3.8F);
        backrightleg.addChild(backrightfoot);
        backrightfoot.setTextureOffset(0, 0).addBox(4.9707F, 6.9971F, -5.1296F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        possum.addChild(tail);


        tail1 = new ModelRenderer(this);
        tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail1);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(7.9582F, 2.4971F, -7.1296F);
        tail1.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(33, 28).addBox(-0.3875F, -2.6756F, 7.9651F, 1.0F, 1.0F, 2.0F, 0.25F, false);

        tail2 = new ModelRenderer(this);
        tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail2);
        tail2.setTextureOffset(33, 16).addBox(7.5707F, 3.9781F, 2.9661F, 1.0F, 1.0F, 2.0F, 0.15F, false);

        tail3 = new ModelRenderer(this);
        tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail3);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(7.9582F, 2.4971F, -7.1296F);
        tail3.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(32, 23).addBox(-0.3875F, -3.206F, 11.8585F, 1.0F, 1.0F, 2.0F, 0.05F, false);

        tail4 = new ModelRenderer(this);
        tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail4);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(7.9582F, 2.4971F, -7.1296F);
        tail4.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(32, 0).addBox(-0.3875F, -3.1715F, 13.6046F, 1.0F, 1.0F, 2.0F, -0.05F, false);

        tail5 = new ModelRenderer(this);
        tail5.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail5);
        tail5.setTextureOffset(11, 26).addBox(7.5707F, 5.5281F, 7.8661F, 1.0F, 1.0F, 2.0F, -0.15F, false);

        frontleftleg = new ModelRenderer(this);
        frontleftleg.setRotationPoint(9.7F, 4.1F, -10.7F);
        possum.addChild(frontleftleg);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-1.7418F, 0.3971F, -0.4296F);
        frontleftleg.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(20, 34).addBox(2.0125F, -0.3087F, -0.5381F, 1.0F, 3.0F, 2.0F, 0.2F, false);

        frontleftfoot = new ModelRenderer(this);
        frontleftfoot.setRotationPoint(-9.7F, -4.1F, 10.7F);
        frontleftleg.addChild(frontleftfoot);
        frontleftfoot.setTextureOffset(0, 32).addBox(9.9707F, 6.9971F, -12.1296F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        backleftleg = new ModelRenderer(this);
        backleftleg.setRotationPoint(10.1F, 4.0F, -3.3F);
        possum.addChild(backleftleg);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.6082F, -0.1029F, -0.5796F);
        backleftleg.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(14, 33).addBox(-0.7375F, 0.15F, -0.9986F, 1.0F, 3.0F, 2.0F, 0.2F, false);

        frontleftfoot2 = new ModelRenderer(this);
        frontleftfoot2.setRotationPoint(-10.1F, -4.0F, 3.3F);
        backleftleg.addChild(frontleftfoot2);
        frontleftfoot2.setTextureOffset(29, 31).addBox(9.9707F, 6.9971F, -5.1296F, 1.0F, 1.0F, 3.0F, 0.0F, false);
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
            this.uppersnout.rotateAngleX = -.9f;}
        if(entity.getShouldBeDead() == false){
            this.uppersnout.rotateAngleX = 0f;}
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        possum.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}