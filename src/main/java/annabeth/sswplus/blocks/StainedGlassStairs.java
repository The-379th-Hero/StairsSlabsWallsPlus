package annabeth.sswplus.blocks;

import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.item.DyeColor;

public class StainedGlassStairs extends AbstractGlassStairs implements IBeaconBeamColorProvider {
	private final DyeColor color;
	
	public StainedGlassStairs(DyeColor color) {
		super(SSWPBlocks.GLASS_MAP.get(color));
		this.color = color;
	}
	
	@Override
	public DyeColor getColor() {
		return this.color;
	}
}