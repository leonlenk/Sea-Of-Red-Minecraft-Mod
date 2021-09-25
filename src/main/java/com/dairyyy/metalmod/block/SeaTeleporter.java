package com.dairyyy.metalmod.block;


import com.dairyyy.metalmod.world.dimension.EndlessSeaTeleporter;
import com.dairyyy.metalmod.world.dimension.ModDimensions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.common.Mod;

public class SeaTeleporter extends Block
{
    public SeaTeleporter(Properties properties) { super(properties); }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos,
                                             PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(!worldIn.isRemote())
        {
            if(!player.isCrouching())
            {
                MinecraftServer server = worldIn.getServer();

                if(server != null)
                {
                    if(worldIn.getDimensionKey() == ModDimensions.EndlessSeaDim)
                    {
                        ServerWorld overWorld = server.getWorld(World.OVERWORLD);
                        if(overWorld != null)
                        {
                            player.changeDimension(overWorld, new EndlessSeaTeleporter(pos, false));
                        }
                    }
                    else
                    {
                        ServerWorld EndlessSeaDim = server.getWorld(ModDimensions.EndlessSeaDim);
                        if(EndlessSeaDim != null)
                        {
                            player.changeDimension(EndlessSeaDim, new EndlessSeaTeleporter(pos, true));
                        }
                    }
                    return ActionResultType.SUCCESS;
                }
            }
        }
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
