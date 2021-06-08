package annabeth.sswplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import annabeth.sswplus.blocks.SSWPBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SSWPlusMain.MODID)
public class SSWPlusMain {
	public static final String MODID = "sswplus";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public SSWPlusMain() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}
	
	private void setup(FMLCommonSetupEvent e) {
		SSWPBlocks.createBlocks();
		EventHandler.setupBlockStripping();
	}
	
	private void clientSetup(FMLClientSetupEvent e) {
		SSWPBlocks.setRenderLayers();
	}
}