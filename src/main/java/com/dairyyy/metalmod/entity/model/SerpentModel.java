package com.dairyyy.metalmod.entity.model;

import com.dairyyy.metalmod.entity.SerpentEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SerpentModel <T extends SerpentEntity> extends EntityModel<T>
{
    private final ModelRenderer serpent;
    private final ModelRenderer head;
    private final ModelRenderer lowersnout;
    private final ModelRenderer uppersnout;
    private final ModelRenderer horns;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer horns2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer mainbody;
    private final ModelRenderer bodysegment0;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer bodysegment1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer bodysegment2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer bodysegment3;
    private final ModelRenderer cube_r18;
    private final ModelRenderer bodysegment4;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer bodysegment5;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer bodysegment6;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer bodysegment7;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer bodysegment8;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer tail;
    private final ModelRenderer tailsegment1;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer tailsegment1_r1;
    private final ModelRenderer tailsegment2;
    private final ModelRenderer cube_r34;
    private final ModelRenderer tailsegment2_r1;
    private final ModelRenderer tailsegment3;
    private final ModelRenderer cube_r35;
    private final ModelRenderer tailsegment4;
    private final ModelRenderer cube_r36;
    private final ModelRenderer tailsegment4_r1;
    private final ModelRenderer fin;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;

    public SerpentModel() {
        textureWidth = 128;
        textureHeight = 128;

        serpent = new ModelRenderer(this);
        serpent.setRotationPoint(0.0F, 21.8F, -7.8F);


        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -20.0F, -24.1F);
        serpent.addChild(head);
        head.setTextureOffset(0, 75).addBox(-4.0F, -4.9F, -4.9F, 8.0F, 9.0F, 5.0F, 0.0F, false);

        lowersnout = new ModelRenderer(this);
        lowersnout.setRotationPoint(0.0F, 1.7F, -4.8F);
        head.addChild(lowersnout);
        lowersnout.setTextureOffset(78, 33).addBox(-4.0F, -0.3F, -5.6F, 8.0F, 3.0F, 6.0F, -0.4F, false);

        uppersnout = new ModelRenderer(this);
        uppersnout.setRotationPoint(0.0F, 1.8F, -5.5F);
        head.addChild(uppersnout);
        uppersnout.setTextureOffset(78, 16).addBox(-4.0F, -3.6F, -4.9F, 8.0F, 4.0F, 6.0F, -0.4F, false);

        horns = new ModelRenderer(this);
        horns.setRotationPoint(-8.5F, -4.2362F, -0.1054F);
        head.addChild(horns);
        setRotationAngle(horns, -0.0242F, -0.2694F, -1.4803F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(2.9447F, 4.1987F, 6.3F);
        horns.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0567F, -0.086F, -0.046F);
        cube_r1.setTextureOffset(0, 19).addBox(-0.6F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, -0.1F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(2.8806F, 4.3092F, 4.3937F);
        horns.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.057F, 0.1406F, -0.0331F);
        cube_r2.setTextureOffset(4, 20).addBox(-0.7F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, 0.1F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(2.1817F, 4.4686F, 2.0837F);
        horns.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0618F, 0.4193F, -0.0159F);
        cube_r3.setTextureOffset(0, 8).addBox(-0.8F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.2F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-0.5828F, 4.2F, -0.02F);
        horns.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0698F, 0.6283F, 0.0F);
        cube_r4.setTextureOffset(0, 12).addBox(0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 3.0F, 0.3F, false);

        horns2 = new ModelRenderer(this);
        horns2.setRotationPoint(8.5F, -4.2362F, -0.1054F);
        head.addChild(horns2);
        setRotationAngle(horns2, -0.0242F, 0.2694F, 1.4803F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-2.9447F, 4.1987F, 6.3F);
        horns2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0567F, 0.086F, 0.046F);
        cube_r5.setTextureOffset(0, 16).addBox(-0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, -0.1F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.8806F, 4.3092F, 4.3937F);
        horns2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.057F, -0.1406F, 0.0331F);
        cube_r6.setTextureOffset(4, 17).addBox(-0.3F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, 0.1F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-2.1817F, 4.4686F, 2.0837F);
        horns2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0618F, -0.4193F, 0.0159F);
        cube_r7.setTextureOffset(0, 0).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.2F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.5828F, 4.2F, -0.02F);
        horns2.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0698F, -0.6283F, 0.0F);
        cube_r8.setTextureOffset(0, 4).addBox(-1.5F, 0.0F, -1.3F, 1.0F, 1.0F, 3.0F, 0.3F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        serpent.addChild(body);


        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -18.7F, -23.9F);
        body.addChild(neck);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, 0.0F, 1.8F);
        neck.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.3316F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(26, 75).addBox(-3.5F, -3.0F, -3.8F, 7.0F, 6.0F, 6.0F, -0.3F, false);

        mainbody = new ModelRenderer(this);
        mainbody.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(mainbody);


        bodysegment0 = new ModelRenderer(this);
        bodysegment0.setRotationPoint(0.0F, -17.8601F, -22.4446F);
        mainbody.addChild(bodysegment0);
        setRotationAngle(bodysegment0, -0.7505F, 0.0F, 0.0F);
        bodysegment0.setTextureOffset(74, 0).addBox(-3.5F, -4.2553F, -0.749F, 7.0F, 7.0F, 9.0F, 0.1F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, -2.4043F, 2.4213F);
        bodysegment0.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(0, 30).addBox(0.0F, -5.7F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -4.3842F, 1.29F);
        bodysegment0.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(4, 31).addBox(0.0F, -2.9F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, -4.3842F, 1.5728F);
        bodysegment0.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(23, 31).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment1 = new ModelRenderer(this);
        bodysegment1.setRotationPoint(0.0F, -12.4017F, -16.2054F);
        mainbody.addChild(bodysegment1);
        setRotationAngle(bodysegment1, -1.3177F, 0.0F, 0.0F);
        bodysegment1.setTextureOffset(55, 66).addBox(-3.5F, -3.3837F, -2.1412F, 7.0F, 7.0F, 9.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, -0.1186F, -0.1022F);
        bodysegment1.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(23, 29).addBox(0.0F, -5.5F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, -3.5127F, 0.1806F);
        bodysegment1.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(27, 29).addBox(0.0F, -0.7F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment2 = new ModelRenderer(this);
        bodysegment2.setRotationPoint(0.0F, -4.3365F, -15.8072F);
        mainbody.addChild(bodysegment2);
        setRotationAngle(bodysegment2, -1.0297F, 0.0F, 0.0F);
        bodysegment2.setTextureOffset(32, 59).addBox(-3.5F, -5.4927F, -2.2644F, 7.0F, 7.0F, 9.0F, 0.1F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, -3.6418F, 0.9059F);
        bodysegment2.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(27, 27).addBox(0.0F, -5.7F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, -5.6217F, -0.2254F);
        bodysegment2.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(0, 28).addBox(0.0F, -2.9F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.0F, -5.6217F, 0.0574F);
        bodysegment2.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(4, 29).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment3 = new ModelRenderer(this);
        bodysegment3.setRotationPoint(-0.1F, -1.088F, -12.3905F);
        mainbody.addChild(bodysegment3);
        bodysegment3.setTextureOffset(0, 59).addBox(-3.4F, -3.5857F, -1.1424F, 7.0F, 7.0F, 9.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(0.1F, -3.7147F, 1.1794F);
        bodysegment3.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(27, 25).addBox(0.0F, -0.7F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment4 = new ModelRenderer(this);
        bodysegment4.setRotationPoint(0.0F, -0.1601F, -7.0446F);
        mainbody.addChild(bodysegment4);
        setRotationAngle(bodysegment4, 0.4712F, 0.0F, 0.0F);
        bodysegment4.setTextureOffset(55, 50).addBox(-3.5F, -3.8736F, 1.0761F, 7.0F, 7.0F, 9.0F, 0.1F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.0F, -4.0026F, 3.115F);
        bodysegment4.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(4, 27).addBox(0.0F, -2.9F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.0F, -4.0026F, 3.3979F);
        bodysegment4.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(23, 27).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment5 = new ModelRenderer(this);
        bodysegment5.setRotationPoint(0.0F, -3.9017F, 0.9946F);
        mainbody.addChild(bodysegment5);
        setRotationAngle(bodysegment5, 1.1432F, 0.0F, 0.0F);
        bodysegment5.setTextureOffset(55, 34).addBox(-3.5F, -3.9705F, -0.8852F, 7.0F, 7.0F, 9.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(0.0F, -0.7054F, 1.1537F);
        bodysegment5.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(23, 25).addBox(0.0F, -5.5F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(0.0F, -0.564F, 4.1235F);
        bodysegment5.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
        cube_r22.setTextureOffset(0, 26).addBox(0.0F, -5.7F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment6 = new ModelRenderer(this);
        bodysegment6.setRotationPoint(0.0F, -11.6601F, 4.2554F);
        mainbody.addChild(bodysegment6);
        setRotationAngle(bodysegment6, 1.0123F, 0.0F, 0.0F);
        bodysegment6.setTextureOffset(55, 17).addBox(-3.5F, -3.5534F, -0.69F, 7.0F, 7.0F, 9.0F, 0.1F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(0.0F, -1.7025F, 2.4803F);
        bodysegment6.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(4, 23).addBox(0.0F, -5.7F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(0.0F, -3.6824F, 1.3489F);
        bodysegment6.addChild(cube_r24);
        setRotationAngle(cube_r24, -0.7854F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(0, 24).addBox(0.0F, -2.9F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(0.0F, -3.6824F, 1.6318F);
        bodysegment6.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(4, 25).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment7 = new ModelRenderer(this);
        bodysegment7.setRotationPoint(0.0F, -17.6017F, 6.7946F);
        mainbody.addChild(bodysegment7);
        setRotationAngle(bodysegment7, -0.1309F, 0.0F, 0.0F);
        bodysegment7.setTextureOffset(32, 43).addBox(-3.5F, -2.9992F, -1.4841F, 7.0F, 7.0F, 9.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.0F, 0.2659F, 0.5548F);
        bodysegment7.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(0, 22).addBox(0.0F, -5.5F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.0F, 0.4073F, 3.5247F);
        bodysegment7.addChild(cube_r27);
        setRotationAngle(cube_r27, -0.7854F, 0.0F, 0.0F);
        cube_r27.setTextureOffset(8, 22).addBox(0.0F, -5.7F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.0F, -3.1282F, 0.8377F);
        bodysegment7.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.7854F, 0.0F, 0.0F);
        cube_r28.setTextureOffset(12, 22).addBox(0.0F, -0.7F, -1.7F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        bodysegment8 = new ModelRenderer(this);
        bodysegment8.setRotationPoint(0.0F, -17.1601F, 13.1554F);
        mainbody.addChild(bodysegment8);
        setRotationAngle(bodysegment8, -0.8029F, 0.0F, 0.0F);
        bodysegment8.setTextureOffset(0, 43).addBox(-3.5F, -2.6256F, -0.6041F, 7.0F, 7.0F, 9.0F, 0.1F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0F, -0.7747F, 2.5662F);
        bodysegment8.addChild(cube_r29);
        setRotationAngle(cube_r29, -0.7854F, 0.0F, 0.0F);
        cube_r29.setTextureOffset(10, 20).addBox(0.0F, -5.7F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.0F, -2.7546F, 1.4348F);
        bodysegment8.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.7854F, 0.0F, 0.0F);
        cube_r30.setTextureOffset(14, 20).addBox(0.0F, -2.9F, 0.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.0F, -2.7546F, 1.7177F);
        bodysegment8.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.7854F, 0.0F, 0.0F);
        cube_r31.setTextureOffset(4, 21).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(tail);


        tailsegment1 = new ModelRenderer(this);
        tailsegment1.setRotationPoint(0.0F, -10.0F, 18.3F);
        tail.addChild(tailsegment1);


        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.0F, -2.11F, 4.7204F);
        tailsegment1.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.4538F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(12, 18).addBox(0.0F, 2.5F, 0.6F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.0F, -2.1583F, 5.0777F);
        tailsegment1.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.4538F, 0.0F, 0.0F);
        cube_r33.setTextureOffset(0, 20).addBox(0.0F, 0.6F, -2.0F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        tailsegment1_r1 = new ModelRenderer(this);
        tailsegment1_r1.setRotationPoint(0.0F, 2.778F, 5.9467F);
        tailsegment1.addChild(tailsegment1_r1);
        setRotationAngle(tailsegment1_r1, -1.1345F, 0.0F, 0.0F);
        tailsegment1_r1.setTextureOffset(42, 1).addBox(-3.5F, 0.7F, -7.0F, 7.0F, 7.0F, 9.0F, -0.4F, false);

        tailsegment2 = new ModelRenderer(this);
        tailsegment2.setRotationPoint(0.0F, -3.7F, 20.6F);
        tail.addChild(tailsegment2);


        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0F, -2.0749F, 4.0034F);
        tailsegment2.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.0175F, 0.0F, 0.0F);
        cube_r34.setTextureOffset(5, 10).addBox(0.0F, 0.9F, 1.3F, 0.0F, 2.0F, 2.0F, 0.1F, false);
        cube_r34.setTextureOffset(8, 18).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        tailsegment2_r1 = new ModelRenderer(this);
        tailsegment2_r1.setRotationPoint(0.0F, -3.522F, 3.6467F);
        tailsegment2.addChild(tailsegment2_r1);
        setRotationAngle(tailsegment2_r1, -0.6283F, 0.0F, 0.0F);
        tailsegment2_r1.setTextureOffset(32, 27).addBox(-3.5F, 0.9F, -2.6F, 7.0F, 7.0F, 9.0F, -0.6F, false);

        tailsegment3 = new ModelRenderer(this);
        tailsegment3.setRotationPoint(0.0F, 0.0F, 25.7F);
        tail.addChild(tailsegment3);
        tailsegment3.setTextureOffset(0, 27).addBox(-3.5F, -4.122F, -2.2533F, 7.0F, 7.0F, 9.0F, -0.8F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(0.0F, -3.4845F, 4.0642F);
        tailsegment3.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.7679F, 0.0F, 0.0F);
        cube_r35.setTextureOffset(5, 6).addBox(0.0F, -1.2F, -1.0F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        tailsegment4 = new ModelRenderer(this);
        tailsegment4.setRotationPoint(0.0F, 0.0F, 30.8F);
        tail.addChild(tailsegment4);


        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(0.0F, -5.5039F, 0.7675F);
        tailsegment4.addChild(cube_r36);
        setRotationAngle(cube_r36, 1.3788F, 0.0F, 0.0F);
        cube_r36.setTextureOffset(5, 2).addBox(0.0F, 0.2F, -1.4F, 0.0F, 2.0F, 2.0F, 0.1F, false);

        tailsegment4_r1 = new ModelRenderer(this);
        tailsegment4_r1.setRotationPoint(0.0F, -0.622F, 2.2467F);
        tailsegment4.addChild(tailsegment4_r1);
        setRotationAngle(tailsegment4_r1, 0.5411F, 0.0F, 0.0F);
        tailsegment4_r1.setTextureOffset(19, 11).addBox(-3.5F, -4.6F, -3.9F, 7.0F, 7.0F, 9.0F, -1.0F, false);

        fin = new ModelRenderer(this);
        fin.setRotationPoint(-1.6341F, -4.1143F, 35.4822F);
        tail.addChild(fin);
        setRotationAngle(fin, 0.0873F, 0.0F, 0.0F);
        fin.setTextureOffset(42, 17).addBox(-3.2274F, -1.0508F, -0.2061F, 9.0F, 2.0F, 1.0F, 0.4F, false);
        fin.setTextureOffset(18, 0).addBox(-3.2274F, -0.0508F, 0.7939F, 9.0F, 0.0F, 10.0F, 0.6F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(11.0726F, 0.4492F, 0.2939F);
        fin.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, -0.925F, 0.0F);
        cube_r37.setTextureOffset(78, 50).addBox(-3.6F, -1.5F, 4.1F, 12.0F, 2.0F, 1.0F, 0.3F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-1.6659F, -0.0508F, 8.4695F);
        fin.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, -1.5708F, 0.0F);
        cube_r38.setTextureOffset(78, 56).addBox(-7.7F, -0.6F, -3.5F, 11.0F, 1.0F, 1.0F, 0.3F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-8.5274F, 0.4492F, 0.2939F);
        fin.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.925F, 0.0F);
        cube_r39.setTextureOffset(78, 53).addBox(-8.4F, -1.5F, 4.1F, 12.0F, 2.0F, 1.0F, 0.3F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-1.8274F, -0.0508F, 5.7939F);
        fin.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, -0.6632F, 0.0F);
        cube_r40.setTextureOffset(0, 0).addBox(-3.6F, 0.0F, -2.3F, 9.0F, 0.0F, 10.0F, 0.5F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(4.3726F, -0.0508F, 5.7939F);
        fin.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.6632F, 0.0F);
        cube_r41.setTextureOffset(0, 10).addBox(-5.4F, 0.0F, -2.3F, 9.0F, 0.0F, 10.0F, 0.5F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.fin.rotateAngleX = MathHelper.cos(limbSwing * 0.25F) * .7F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        serpent.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}