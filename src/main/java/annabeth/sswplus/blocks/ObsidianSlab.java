package annabeth.sswplus.blocks;

import annabeth.coremod.blocks.ModSlabBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraftforge.common.ToolType;

public class ObsidianSlab extends ModSlabBlock {
	public ObsidianSlab(Block block) {
		super(block, ToolType.PICKAXE, 3);
	}
	
	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}