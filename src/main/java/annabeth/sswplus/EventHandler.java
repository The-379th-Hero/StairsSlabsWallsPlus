package annabeth.sswplus;

import java.util.Map;

import com.google.common.collect.Maps;

import annabeth.sswplus.blocks.SSWPBlocks;
import annabeth.sswplus.tags.SSWPTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SSWPlusMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
	public static final Map<Block, Block> STRIPPING_MAP = Maps.newHashMap();
	
	public static void setupBlockStripping() {
		STRIPPING_MAP.put(SSWPBlocks.OAK_WOOD_SLAB, SSWPBlocks.STRIPPED_OAK_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.OAK_WOOD_STAIRS, SSWPBlocks.STRIPPED_OAK_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.OAK_WOOD_WALL, SSWPBlocks.STRIPPED_OAK_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.SPRUCE_WOOD_SLAB, SSWPBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.SPRUCE_WOOD_STAIRS, SSWPBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.SPRUCE_WOOD_WALL, SSWPBlocks.STRIPPED_SPRUCE_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.BIRCH_WOOD_SLAB, SSWPBlocks.STRIPPED_BIRCH_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.BIRCH_WOOD_STAIRS, SSWPBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.BIRCH_WOOD_WALL, SSWPBlocks.STRIPPED_BIRCH_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.JUNGLE_WOOD_SLAB, SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.JUNGLE_WOOD_STAIRS, SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.JUNGLE_WOOD_WALL, SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.ACACIA_WOOD_SLAB, SSWPBlocks.STRIPPED_ACACIA_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.ACACIA_WOOD_STAIRS, SSWPBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.ACACIA_WOOD_WALL, SSWPBlocks.STRIPPED_ACACIA_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.DARK_OAK_WOOD_SLAB, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.DARK_OAK_WOOD_STAIRS, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.DARK_OAK_WOOD_WALL, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_WALL);
		STRIPPING_MAP.put(SSWPBlocks.CRIMSON_HYPHAE_SLAB, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.CRIMSON_HYPHAE_STAIRS, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.CRIMSON_HYPHAE_WALL, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);
		STRIPPING_MAP.put(SSWPBlocks.WARPED_HYPHAE_SLAB, SSWPBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
		STRIPPING_MAP.put(SSWPBlocks.WARPED_HYPHAE_STAIRS, SSWPBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
		STRIPPING_MAP.put(SSWPBlocks.WARPED_HYPHAE_WALL, SSWPBlocks.STRIPPED_WARPED_HYPHAE_WALL);
	}
	
	@SubscribeEvent
	public static void rightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		BlockState state = world.getBlockState(pos);
		ItemStack stack = event.getItemStack();
		PlayerEntity player = event.getPlayer();
		
		Block input = state.getBlock();
		Block result = STRIPPING_MAP.get(input);
		
		if (result != null && stack.getHarvestLevel(ToolType.AXE, player, state) != -1) {
			if (!world.isClientSide) {
				if (input instanceof SlabBlock) {
					world.setBlock(pos, result.defaultBlockState().setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)).setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)), 11);
				} else if (input instanceof StairsBlock) {
					world.setBlock(pos, result.defaultBlockState().setValue(StairsBlock.FACING, state.getValue(StairsBlock.FACING)).setValue(StairsBlock.HALF, state.getValue(StairsBlock.HALF)).setValue(StairsBlock.SHAPE, state.getValue(StairsBlock.SHAPE)).setValue(StairsBlock.WATERLOGGED, state.getValue(StairsBlock.WATERLOGGED)), 11);
				} else if (input instanceof WallBlock) {
					world.setBlock(pos, result.defaultBlockState().setValue(WallBlock.UP, state.getValue(WallBlock.UP)).setValue(WallBlock.EAST_WALL, state.getValue(WallBlock.EAST_WALL)).setValue(WallBlock.NORTH_WALL, state.getValue(WallBlock.NORTH_WALL)).setValue(WallBlock.SOUTH_WALL, state.getValue(WallBlock.SOUTH_WALL)).setValue(WallBlock.WEST_WALL, state.getValue(WallBlock.WEST_WALL)).setValue(WallBlock.WATERLOGGED, state.getValue(WallBlock.WATERLOGGED)), 11);
				} else {
					world.setBlock(pos, result.defaultBlockState(), 11);
				}
				
				if (player != null) {
					stack.hurtAndBreak(1, player, (p) -> {
						p.broadcastBreakEvent(event.getHand());
					});
				}
			}
			world.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
			event.setCancellationResult(ActionResultType.sidedSuccess(world.isClientSide));
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public static void setFurnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
		ItemStack stack = event.getItemStack();
		
		if (SSWPTags.ItemTagList.WOODEN_WALLS.contains(stack.getItem()) && !ItemTags.NON_FLAMMABLE_WOOD.contains(stack.getItem())) {
			event.setBurnTime(300);
		}
	}
}