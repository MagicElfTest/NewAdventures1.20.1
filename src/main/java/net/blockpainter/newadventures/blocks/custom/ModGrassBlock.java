package net.blockpainter.newadventures.blocks.custom;

import net.blockpainter.newadventures.blocks.ModBlocks;
import net.blockpainter.newadventures.util.ModHoeHandlers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;
import net.minecraft.world.phys.BlockHitResult;

public class ModGrassBlock extends SpreadingSnowyDirtBlock {
    public ModGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!canBeGrass(state, level, pos)) {
            level.setBlockAndUpdate(pos, ModBlocks.YIRA_DIRT.get().defaultBlockState());
        }
    }

    private static boolean canBeGrass(BlockState state, LevelReader world, BlockPos pos) {
        BlockPos above = pos.above();
        BlockState aboveState = world.getBlockState(above);

        int light = LightEngine.getLightBlockInto(world, state, pos, aboveState, above, Direction.UP, aboveState.getLightBlock(world, above));
        return light < world.getMaxLightLevel();
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        return ModHoeHandlers.useHoe(new UseOnContext(player, hand, hit));
    }

}
