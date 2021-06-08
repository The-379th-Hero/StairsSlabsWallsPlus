package annabeth.sswplus.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public abstract class AbstractGlassSlab extends SlabBlock {
	public AbstractGlassSlab(Block block) {
		super(AbstractBlock.Properties.copy(block).isValidSpawn(SSWPBlocks::never).noOcclusion().isRedstoneConductor(SSWPBlocks::never).isSuffocating(SSWPBlocks::never).isViewBlocking(SSWPBlocks::never));
	}
	
	public VoxelShape getVisualShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.empty();
	}
	
	@OnlyIn(Dist.CLIENT)
	public float getShadeBrightness(BlockState state, IBlockReader world, BlockPos pos) {
		return 1.0F;
	}
	
	public boolean propagatesSkylightDown(BlockState state, IBlockReader world, BlockPos pos) {
		return !state.getValue(WATERLOGGED);
	}
	
	@OnlyIn(Dist.CLIENT)
	public boolean skipRendering(BlockState state1, BlockState state2, Direction dir) {
		return state2.is(this) ? true : super.skipRendering(state1, state2, dir);
	}
}