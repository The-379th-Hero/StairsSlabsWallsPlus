package annabeth.sswplus.blocks;

import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.item.DyeColor;

public class StainedGlassSlab extends AbstractGlassSlab implements IBeaconBeamColorProvider {
	private final DyeColor color;
	
	public StainedGlassSlab(DyeColor color) {
		super(SSWPBlocks.GLASS_MAP.get(color));
		this.color = color;
	}
	
	@Override
	public DyeColor getColor() {
		return this.color;
	}
}