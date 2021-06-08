package annabeth.sswplus.blocks;

import java.util.Random;

import annabeth.coremod.blocks.ModStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MagmaStairs extends ModStairsBlock {
	public MagmaStairs() {
		super(Blocks.MAGMA_BLOCK);
	}
	
	@Override
	public void stepOn(World world, BlockPos pos, Entity entity) {
		if (!entity.fireImmune() && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entity)) {
			entity.hurt(DamageSource.HOT_FLOOR, 1.0f);
		}
		
		super.stepOn(world, pos, entity);
	}
	
	
	@Override
	public void tick(BlockState state, ServerWorld world , BlockPos pos, Random random) {
		BubbleColumnBlock.growColumn(world, pos.above(), true);
	}
	
	@Override
	public BlockState updateShape(BlockState state1, Direction dir, BlockState state2, IWorld world, BlockPos pos1, BlockPos pos2) {
		if (dir == Direction.UP && state2.is(Blocks.WATER)) {
			world.getBlockTicks().scheduleTick(pos1, this, 20);
		}
		
		return super.updateShape(state1, dir, state2, world, pos1, pos2);
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		BlockPos pos1 = pos.above();
		if (world.getFluidState(pos).is(FluidTags.WATER)) {
			world.playSound((PlayerEntity) null, pos, SoundEvents.FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (world.random.nextFloat() - world.random.nextFloat()) * 0.8F);
			world.sendParticles(ParticleTypes.LARGE_SMOKE, (double) pos1.getX() + 0.5D, (double)pos1.getY() + 0.25D, (double)pos1.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
		}
	}
	
	@Override
	public void onPlace(BlockState state1, World world, BlockPos pos, BlockState state, boolean flag) {
		world.getBlockTicks().scheduleTick(pos, this, 20);
	}
}