package annabeth.sswplus;

import annabeth.sswplus.blocks.SSWPBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SSWPlusMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		SSWPBlocks.registerBlocks(e.getRegistry());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		SSWPBlocks.registerBlockItems(e.getRegistry());
	}
}