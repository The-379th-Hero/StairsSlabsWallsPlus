package annabeth.sswplus.blocks;

import annabeth.coremod.blocks.ModStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraftforge.common.ToolType;

public class ObsidianStairs extends ModStairsBlock {
	public ObsidianStairs(Block block) {
		super(block, ToolType.PICKAXE, 3);
	}
	
	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}