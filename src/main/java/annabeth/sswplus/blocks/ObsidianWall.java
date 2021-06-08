package annabeth.sswplus.blocks;

import annabeth.coremod.blocks.ModWallBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraftforge.common.ToolType;

public class ObsidianWall extends ModWallBlock {
	public ObsidianWall(Block block) {
		super(block, ToolType.PICKAXE, 3);
	}
	
	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}