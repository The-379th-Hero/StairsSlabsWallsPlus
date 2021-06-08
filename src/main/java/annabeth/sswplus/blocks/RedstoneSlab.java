package annabeth.sswplus.blocks;

import annabeth.coremod.blocks.ModSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class RedstoneSlab extends ModSlabBlock {
	public RedstoneSlab() {
		super(Blocks.REDSTONE_BLOCK);
	}
	
	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}
	
	@Override
	public int getSignal(BlockState state, IBlockReader world, BlockPos pos, Direction direction) {
		return 15;
	}
}