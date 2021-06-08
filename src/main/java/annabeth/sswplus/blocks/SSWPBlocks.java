package annabeth.sswplus.blocks;

import java.util.Map;

import com.google.common.collect.Maps;

import annabeth.coremod.blocks.ModFenceBlock;
import annabeth.coremod.blocks.ModSlabBlock;
import annabeth.coremod.blocks.ModStairsBlock;
import annabeth.coremod.blocks.ModWallBlock;
import annabeth.sswplus.SSWPlusMain;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SilverfishBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.IForgeRegistry;

public class SSWPBlocks {
	public static final Map<DyeColor, Block> GLASS_MAP = Maps.newHashMap();
	public static final Map<DyeColor, Block> TERRACOTTA_MAP = Maps.newHashMap();
	public static final Map<DyeColor, Block> CONCRETE_MAP = Maps.newHashMap();
	
	static {
		GLASS_MAP.put(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.LIME, Blocks.LIME_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.PINK, Blocks.PINK_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.RED, Blocks.RED_STAINED_GLASS);
		GLASS_MAP.put(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS);
		
		TERRACOTTA_MAP.put(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.RED, Blocks.RED_TERRACOTTA);
		TERRACOTTA_MAP.put(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
		
		CONCRETE_MAP.put(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
		CONCRETE_MAP.put(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
		CONCRETE_MAP.put(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
		CONCRETE_MAP.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
		CONCRETE_MAP.put(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
		CONCRETE_MAP.put(DyeColor.LIME, Blocks.LIME_CONCRETE);
		CONCRETE_MAP.put(DyeColor.PINK, Blocks.PINK_CONCRETE);
		CONCRETE_MAP.put(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
		CONCRETE_MAP.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
		CONCRETE_MAP.put(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
		CONCRETE_MAP.put(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
		CONCRETE_MAP.put(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
		CONCRETE_MAP.put(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
		CONCRETE_MAP.put(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
		CONCRETE_MAP.put(DyeColor.RED, Blocks.RED_CONCRETE);
		CONCRETE_MAP.put(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
	}
	
	public static Block OAK_WOOD_SLAB;
	public static Block OAK_WOOD_STAIRS;
	public static Block OAK_WOOD_WALL;
	public static Block SPRUCE_WOOD_SLAB;
	public static Block SPRUCE_WOOD_STAIRS;
	public static Block SPRUCE_WOOD_WALL;
	public static Block BIRCH_WOOD_SLAB;
	public static Block BIRCH_WOOD_STAIRS;
	public static Block BIRCH_WOOD_WALL;
	public static Block JUNGLE_WOOD_SLAB;
	public static Block JUNGLE_WOOD_STAIRS;
	public static Block JUNGLE_WOOD_WALL;
	public static Block ACACIA_WOOD_SLAB;
	public static Block ACACIA_WOOD_STAIRS;
	public static Block ACACIA_WOOD_WALL;
	public static Block DARK_OAK_WOOD_SLAB;
	public static Block DARK_OAK_WOOD_STAIRS;
	public static Block DARK_OAK_WOOD_WALL;
	public static Block CRIMSON_HYPHAE_SLAB;
	public static Block CRIMSON_HYPHAE_STAIRS;
	public static Block CRIMSON_HYPHAE_WALL;
	public static Block WARPED_HYPHAE_SLAB;
	public static Block WARPED_HYPHAE_STAIRS;
	public static Block WARPED_HYPHAE_WALL;
	
	public static Block STRIPPED_OAK_WOOD_SLAB;
	public static Block STRIPPED_OAK_WOOD_STAIRS;
	public static Block STRIPPED_OAK_WOOD_WALL;
	public static Block STRIPPED_SPRUCE_WOOD_SLAB;
	public static Block STRIPPED_SPRUCE_WOOD_STAIRS;
	public static Block STRIPPED_SPRUCE_WOOD_WALL;
	public static Block STRIPPED_BIRCH_WOOD_SLAB;
	public static Block STRIPPED_BIRCH_WOOD_STAIRS;
	public static Block STRIPPED_BIRCH_WOOD_WALL;
	public static Block STRIPPED_JUNGLE_WOOD_SLAB;
	public static Block STRIPPED_JUNGLE_WOOD_STAIRS;
	public static Block STRIPPED_JUNGLE_WOOD_WALL;
	public static Block STRIPPED_ACACIA_WOOD_SLAB;
	public static Block STRIPPED_ACACIA_WOOD_STAIRS;
	public static Block STRIPPED_ACACIA_WOOD_WALL;
	public static Block STRIPPED_DARK_OAK_WOOD_SLAB;
	public static Block STRIPPED_DARK_OAK_WOOD_STAIRS;
	public static Block STRIPPED_DARK_OAK_WOOD_WALL;
	public static Block STRIPPED_CRIMSON_HYPHAE_SLAB;
	public static Block STRIPPED_CRIMSON_HYPHAE_STAIRS;
	public static Block STRIPPED_CRIMSON_HYPHAE_WALL;
	public static Block STRIPPED_WARPED_HYPHAE_SLAB;
	public static Block STRIPPED_WARPED_HYPHAE_STAIRS;
	public static Block STRIPPED_WARPED_HYPHAE_WALL;
	
	public static Block STONE_WALL;
	public static Block MOSSY_STONE;
	public static Block MOSSY_STONE_SLAB;
	public static Block MOSSY_STONE_STAIRS;
	public static Block MOSSY_STONE_WALL;
	
	public static Block SMOOTH_STONE_STAIRS;
	public static Block SMOOTH_STONE_WALL;
	
	public static Block MOSSY_CHISELED_STONE_BRICKS;
	public static Block CRACKED_STONE_BRICK_SLAB;
	public static Block CRACKED_STONE_BRICK_STAIRS;
	public static Block CRACKED_STONE_BRICK_WALL;
	public static Block CRACKED_CHISELED_STONE_BRICKS;
	public static Block CRACKED_MOSSY_STONE_BRICKS;
	public static Block CRACKED_MOSSY_STONE_BRICK_SLAB;
	public static Block CRACKED_MOSSY_STONE_BRICK_STAIRS;
	public static Block CRACKED_MOSSY_STONE_BRICK_WALL;
	public static Block CRACKED_MOSSY_CHISELED_STONE_BRICKS;
	
	public static Block POLISHED_GRANITE_WALL;
	public static Block GRANITE_BRICKS;
	public static Block GRANITE_BRICK_SLAB;
	public static Block GRANITE_BRICK_STAIRS;
	public static Block GRANITE_BRICK_WALL;
	public static Block CRACKED_GRANITE_BRICKS;
	public static Block CRACKED_GRANITE_BRICK_SLAB;
	public static Block CRACKED_GRANITE_BRICK_STAIRS;
	public static Block CRACKED_GRANITE_BRICK_WALL;
	
	public static Block POLISHED_DIORITE_WALL;
	public static Block DIORITE_BRICKS;
	public static Block DIORITE_BRICK_SLAB;
	public static Block DIORITE_BRICK_STAIRS;
	public static Block DIORITE_BRICK_WALL;
	public static Block CRACKED_DIORITE_BRICKS;
	public static Block CRACKED_DIORITE_BRICK_SLAB;
	public static Block CRACKED_DIORITE_BRICK_STAIRS;
	public static Block CRACKED_DIORITE_BRICK_WALL;
	
	public static Block POLISHED_ANDESITE_WALL;
	public static Block ANDESITE_BRICKS;
	public static Block ANDESITE_BRICK_SLAB;
	public static Block ANDESITE_BRICK_STAIRS;
	public static Block ANDESITE_BRICK_WALL;
	public static Block CRACKED_ANDESITE_BRICKS;
	public static Block CRACKED_ANDESITE_BRICK_SLAB;
	public static Block CRACKED_ANDESITE_BRICK_STAIRS;
	public static Block CRACKED_ANDESITE_BRICK_WALL;
	
	public static Block PRISMARINE_BRICK_WALL;
	public static Block CRACKED_PRISMARINE_BRICKS;
	public static Block CRACKED_PRISMARINE_BRICK_SLAB;
	public static Block CRACKED_PRISMARINE_BRICK_STAIRS;
	public static Block CRACKED_PRISMARINE_BRICK_WALL;
	public static Block DARK_PRISMARINE_WALL;
	
	public static Block OBSIDIAN_SLAB;
	public static Block OBSIDIAN_STAIRS;
	public static Block OBSIDIAN_WALL;
	
	public static Block CRYING_OBSIDIAN_SLAB;
	public static Block CRYING_OBSIDIAN_STAIRS;
	public static Block CRYING_OBSIDIAN_WALL;
	
	public static Block COAL_SLAB;
	public static Block COAL_STAIRS;
	public static Block COAL_WALL;
	
	public static Block IRON_SLAB;
	public static Block IRON_STAIRS;
	public static Block IRON_WALL;
	
	public static Block GOLD_SLAB;
	public static Block GOLD_STAIRS;
	public static Block GOLD_WALL;
	
	public static Block DIAMOND_SLAB;
	public static Block DIAMOND_STAIRS;
	public static Block DIAMOND_WALL;
	
	public static Block EMERALD_SLAB;
	public static Block EMERALD_STAIRS;
	public static Block EMERALD_WALL;
	
	public static Block REDSTONE_SLAB;
	public static Block REDSTONE_STAIRS;
	public static Block REDSTONE_WALL;
	
	public static Block LAPIS_LAZULI_SLAB;
	public static Block LAPIS_LAZULI_STAIRS;
	public static Block LAPIS_LAZULI_WALL;
	
	public static Block NETHERITE_SLAB;
	public static Block NETHERITE_STAIRS;
	public static Block NETHERITE_WALL;
	
	public static Block QUARTZ_WALL;
	public static Block SMOOTH_QUARTZ_WALL;
	public static Block QUARTZ_BRICK_SLAB;
	public static Block QUARTZ_BRICK_STAIRS;
	public static Block QUARTZ_BRICK_WALL;
	public static Block CRACKED_QUARTZ_BRICKS;
	public static Block CRACKED_QUARTZ_BRICK_SLAB;
	public static Block CRACKED_QUARTZ_BRICK_STAIRS;
	public static Block CRACKED_QUARTZ_BRICK_WALL;
	
	public static Block CUT_SANDSTONE_STAIRS;
	public static Block CUT_SANDSTONE_WALL;
	public static Block SMOOTH_SANDSTONE_WALL;
	public static Block SANDSTONE_BRICKS;
	public static Block SANDSTONE_BRICK_SLAB;
	public static Block SANDSTONE_BRICK_STAIRS;
	public static Block SANDSTONE_BRICK_WALL;
	public static Block CRACKED_SANDSTONE_BRICKS;
	public static Block CRACKED_SANDSTONE_BRICK_SLAB;
	public static Block CRACKED_SANDSTONE_BRICK_STAIRS;
	public static Block CRACKED_SANDSTONE_BRICK_WALL;
	
	public static Block CUT_RED_SANDSTONE_STAIRS;
	public static Block CUT_RED_SANDSTONE_WALL;
	public static Block SMOOTH_RED_SANDSTONE_WALL;
	public static Block RED_SANDSTONE_BRICKS;
	public static Block RED_SANDSTONE_BRICK_SLAB;
	public static Block RED_SANDSTONE_BRICK_STAIRS;
	public static Block RED_SANDSTONE_BRICK_WALL;
	public static Block CRACKED_RED_SANDSTONE_BRICKS;
	public static Block CRACKED_RED_SANDSTONE_BRICK_SLAB;
	public static Block CRACKED_RED_SANDSTONE_BRICK_STAIRS;
	public static Block CRACKED_RED_SANDSTONE_BRICK_WALL;
	
	public static Block GLASS_SLAB;
	public static Block GLASS_STAIRS;
	public static Block GLASS_WALL;

	public static Block WHITE_GLASS_SLAB;
	public static Block WHITE_GLASS_STAIRS;
	public static Block WHITE_GLASS_WALL;
	public static Block ORANGE_GLASS_SLAB;
	public static Block ORANGE_GLASS_STAIRS;
	public static Block ORANGE_GLASS_WALL;
	public static Block MAGENTA_GLASS_SLAB;
	public static Block MAGENTA_GLASS_STAIRS;
	public static Block MAGENTA_GLASS_WALL;
	public static Block LIGHT_BLUE_GLASS_SLAB;
	public static Block LIGHT_BLUE_GLASS_STAIRS;
	public static Block LIGHT_BLUE_GLASS_WALL;
	public static Block YELLOW_GLASS_SLAB;
	public static Block YELLOW_GLASS_STAIRS;
	public static Block YELLOW_GLASS_WALL;
	public static Block LIME_GLASS_SLAB;
	public static Block LIME_GLASS_STAIRS;
	public static Block LIME_GLASS_WALL;
	public static Block PINK_GLASS_SLAB;
	public static Block PINK_GLASS_STAIRS;
	public static Block PINK_GLASS_WALL;
	public static Block GRAY_GLASS_SLAB;
	public static Block GRAY_GLASS_STAIRS;
	public static Block GRAY_GLASS_WALL;
	public static Block LIGHT_GRAY_GLASS_SLAB;
	public static Block LIGHT_GRAY_GLASS_STAIRS;
	public static Block LIGHT_GRAY_GLASS_WALL;
	public static Block CYAN_GLASS_SLAB;
	public static Block CYAN_GLASS_STAIRS;
	public static Block CYAN_GLASS_WALL;
	public static Block PURPLE_GLASS_SLAB;
	public static Block PURPLE_GLASS_STAIRS;
	public static Block PURPLE_GLASS_WALL;
	public static Block BLUE_GLASS_SLAB;
	public static Block BLUE_GLASS_STAIRS;
	public static Block BLUE_GLASS_WALL;
	public static Block BROWN_GLASS_SLAB;
	public static Block BROWN_GLASS_STAIRS;
	public static Block BROWN_GLASS_WALL;
	public static Block GREEN_GLASS_SLAB;
	public static Block GREEN_GLASS_STAIRS;
	public static Block GREEN_GLASS_WALL;
	public static Block RED_GLASS_SLAB;
	public static Block RED_GLASS_STAIRS;
	public static Block RED_GLASS_WALL;
	public static Block BLACK_GLASS_SLAB;
	public static Block BLACK_GLASS_STAIRS;
	public static Block BLACK_GLASS_WALL;
	
	public static Block TERRACOTTA_SLAB;
	public static Block TERRACOTTA_STAIRS;
	public static Block TERRACOTTA_WALL;

	public static Block WHITE_TERRACOTTA_SLAB;
	public static Block WHITE_TERRACOTTA_STAIRS;
	public static Block WHITE_TERRACOTTA_WALL;
	public static Block ORANGE_TERRACOTTA_SLAB;
	public static Block ORANGE_TERRACOTTA_STAIRS;
	public static Block ORANGE_TERRACOTTA_WALL;
	public static Block MAGENTA_TERRACOTTA_SLAB;
	public static Block MAGENTA_TERRACOTTA_STAIRS;
	public static Block MAGENTA_TERRACOTTA_WALL;
	public static Block LIGHT_BLUE_TERRACOTTA_SLAB;
	public static Block LIGHT_BLUE_TERRACOTTA_STAIRS;
	public static Block LIGHT_BLUE_TERRACOTTA_WALL;
	public static Block YELLOW_TERRACOTTA_SLAB;
	public static Block YELLOW_TERRACOTTA_STAIRS;
	public static Block YELLOW_TERRACOTTA_WALL;
	public static Block LIME_TERRACOTTA_SLAB;
	public static Block LIME_TERRACOTTA_STAIRS;
	public static Block LIME_TERRACOTTA_WALL;
	public static Block PINK_TERRACOTTA_SLAB;
	public static Block PINK_TERRACOTTA_STAIRS;
	public static Block PINK_TERRACOTTA_WALL;
	public static Block GRAY_TERRACOTTA_SLAB;
	public static Block GRAY_TERRACOTTA_STAIRS;
	public static Block GRAY_TERRACOTTA_WALL;
	public static Block LIGHT_GRAY_TERRACOTTA_SLAB;
	public static Block LIGHT_GRAY_TERRACOTTA_STAIRS;
	public static Block LIGHT_GRAY_TERRACOTTA_WALL;
	public static Block CYAN_TERRACOTTA_SLAB;
	public static Block CYAN_TERRACOTTA_STAIRS;
	public static Block CYAN_TERRACOTTA_WALL;
	public static Block PURPLE_TERRACOTTA_SLAB;
	public static Block PURPLE_TERRACOTTA_STAIRS;
	public static Block PURPLE_TERRACOTTA_WALL;
	public static Block BLUE_TERRACOTTA_SLAB;
	public static Block BLUE_TERRACOTTA_STAIRS;
	public static Block BLUE_TERRACOTTA_WALL;
	public static Block BROWN_TERRACOTTA_SLAB;
	public static Block BROWN_TERRACOTTA_STAIRS;
	public static Block BROWN_TERRACOTTA_WALL;
	public static Block GREEN_TERRACOTTA_SLAB;
	public static Block GREEN_TERRACOTTA_STAIRS;
	public static Block GREEN_TERRACOTTA_WALL;
	public static Block RED_TERRACOTTA_SLAB;
	public static Block RED_TERRACOTTA_STAIRS;
	public static Block RED_TERRACOTTA_WALL;
	public static Block BLACK_TERRACOTTA_SLAB;
	public static Block BLACK_TERRACOTTA_STAIRS;
	public static Block BLACK_TERRACOTTA_WALL;

	public static Block WHITE_CONCRETE_SLAB;
	public static Block WHITE_CONCRETE_STAIRS;
	public static Block WHITE_CONCRETE_WALL;
	public static Block ORANGE_CONCRETE_SLAB;
	public static Block ORANGE_CONCRETE_STAIRS;
	public static Block ORANGE_CONCRETE_WALL;
	public static Block MAGENTA_CONCRETE_SLAB;
	public static Block MAGENTA_CONCRETE_STAIRS;
	public static Block MAGENTA_CONCRETE_WALL;
	public static Block LIGHT_BLUE_CONCRETE_SLAB;
	public static Block LIGHT_BLUE_CONCRETE_STAIRS;
	public static Block LIGHT_BLUE_CONCRETE_WALL;
	public static Block YELLOW_CONCRETE_SLAB;
	public static Block YELLOW_CONCRETE_STAIRS;
	public static Block YELLOW_CONCRETE_WALL;
	public static Block LIME_CONCRETE_SLAB;
	public static Block LIME_CONCRETE_STAIRS;
	public static Block LIME_CONCRETE_WALL;
	public static Block PINK_CONCRETE_SLAB;
	public static Block PINK_CONCRETE_STAIRS;
	public static Block PINK_CONCRETE_WALL;
	public static Block GRAY_CONCRETE_SLAB;
	public static Block GRAY_CONCRETE_STAIRS;
	public static Block GRAY_CONCRETE_WALL;
	public static Block LIGHT_GRAY_CONCRETE_SLAB;
	public static Block LIGHT_GRAY_CONCRETE_STAIRS;
	public static Block LIGHT_GRAY_CONCRETE_WALL;
	public static Block CYAN_CONCRETE_SLAB;
	public static Block CYAN_CONCRETE_STAIRS;
	public static Block CYAN_CONCRETE_WALL;
	public static Block PURPLE_CONCRETE_SLAB;
	public static Block PURPLE_CONCRETE_STAIRS;
	public static Block PURPLE_CONCRETE_WALL;
	public static Block BLUE_CONCRETE_SLAB;
	public static Block BLUE_CONCRETE_STAIRS;
	public static Block BLUE_CONCRETE_WALL;
	public static Block BROWN_CONCRETE_SLAB;
	public static Block BROWN_CONCRETE_STAIRS;
	public static Block BROWN_CONCRETE_WALL;
	public static Block GREEN_CONCRETE_SLAB;
	public static Block GREEN_CONCRETE_STAIRS;
	public static Block GREEN_CONCRETE_WALL;
	public static Block RED_CONCRETE_SLAB;
	public static Block RED_CONCRETE_STAIRS;
	public static Block RED_CONCRETE_WALL;
	public static Block BLACK_CONCRETE_SLAB;
	public static Block BLACK_CONCRETE_STAIRS;
	public static Block BLACK_CONCRETE_WALL;
	
	public static Block CRACKED_BRICKS;
	public static Block CRACKED_BRICK_SLAB;
	public static Block CRACKED_BRICK_STAIRS;
	public static Block CRACKED_BRICK_WALL;
	
	public static Block END_STONE_SLAB;
	public static Block END_STONE_STAIRS;
	public static Block END_STONE_WALL;
	public static Block CRACKED_END_STONE_BRICKS;
	public static Block CRACKED_END_STONE_BRICK_SLAB;
	public static Block CRACKED_END_STONE_BRICK_STAIRS;
	public static Block CRACKED_END_STONE_BRICK_WALL;
	
	public static Block PURPUR_WALL;
	
	public static Block NETHERRACK_SLAB;
	public static Block NETHERRACK_STAIRS;
	public static Block NETHERRACK_WALL;
	
	public static Block MAGMA_SLAB;
	public static Block MAGMA_STAIRS;
	public static Block MAGMA_WALL;
	
	public static Block GLOWSTONE_SLAB;
	public static Block GLOWSTONE_STAIRS;
	public static Block GLOWSTONE_WALL;
	
	public static Block BASALT_SLAB;
	public static Block BASALT_STAIRS;
	public static Block BASALT_WALL;
	public static Block POLISHED_BASALT_SLAB;
	public static Block POLISHED_BASALT_STAIRS;
	public static Block POLISHED_BASALT_WALL;
	
	public static Block CRACKED_NETHER_BRICK_SLAB;
	public static Block CRACKED_NETHER_BRICK_STAIRS;
	public static Block CRACKED_NETHER_BRICK_WALL;
	public static Block CRACKED_NETHER_BRICK_FENCE;
	public static Block CRACKED_CHISELED_NETHER_BRICKS;
	
	public static Block RED_NETHER_BRICK_FENCE;
	public static Block CRACKED_RED_NETHER_BRICKS;
	public static Block CRACKED_RED_NETHER_BRICK_SLAB;
	public static Block CRACKED_RED_NETHER_BRICK_STAIRS;
	public static Block CRACKED_RED_NETHER_BRICK_WALL;
	public static Block CRACKED_RED_NETHER_BRICK_FENCE;
	public static Block CHISELED_RED_NETHER_BRICKS;
	public static Block CRACKED_CHISELED_RED_NETHER_BRICKS;
	
	public static Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB;
	public static Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS;
	public static Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL;
	public static Block GILDED_BLACKSTONE_SLAB;
	public static Block GILDED_BLACKSTONE_STAIRS;
	public static Block GILDED_BLACKSTONE_WALL;
	
	public static Block INFESTED_MOSSY_STONE;
	public static Block INFESTED_MOSSY_COBBLESTONE;
	public static Block INFESTED_MOSSY_CHISELED_STONE_BRICKS;
	public static Block INFESTED_CRACKED_CHISELED_STONE_BRICKS;
	public static Block INFESTED_CRACKED_MOSSY_STONE_BRICKS;
	public static Block INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS;
	public static Block INFESTED_SMOOTH_STONE;
	
	private static boolean isCreated = false;
	
	public static void createBlocks() {
		if (isCreated) {
			return;
		}
		
		OAK_WOOD_SLAB = new ModSlabBlock(Blocks.OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "oak_wood_slab");
		OAK_WOOD_STAIRS = new ModStairsBlock(Blocks.OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "oak_wood_stairs");
		OAK_WOOD_WALL = new ModWallBlock(Blocks.OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "oak_wood_wall");
		SPRUCE_WOOD_SLAB = new ModSlabBlock(Blocks.SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "spruce_wood_slab");
		SPRUCE_WOOD_STAIRS = new ModStairsBlock(Blocks.SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "spruce_wood_stairs");
		SPRUCE_WOOD_WALL = new ModWallBlock(Blocks.SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "spruce_wood_wall");
		BIRCH_WOOD_SLAB = new ModSlabBlock(Blocks.BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "birch_wood_slab");
		BIRCH_WOOD_STAIRS = new ModStairsBlock(Blocks.BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "birch_wood_stairs");
		BIRCH_WOOD_WALL = new ModWallBlock(Blocks.BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "birch_wood_wall");
		JUNGLE_WOOD_SLAB = new ModSlabBlock(Blocks.JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "jungle_wood_slab");
		JUNGLE_WOOD_STAIRS = new ModStairsBlock(Blocks.JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "jungle_wood_stairs");
		JUNGLE_WOOD_WALL = new ModWallBlock(Blocks.JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "jungle_wood_wall");
		ACACIA_WOOD_SLAB = new ModSlabBlock(Blocks.ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "acacia_wood_slab");
		ACACIA_WOOD_STAIRS = new ModStairsBlock(Blocks.ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "acacia_wood_stairs");
		ACACIA_WOOD_WALL = new ModWallBlock(Blocks.ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "acacia_wood_wall");
		DARK_OAK_WOOD_SLAB = new ModSlabBlock(Blocks.DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "dark_oak_wood_slab");
		DARK_OAK_WOOD_STAIRS = new ModStairsBlock(Blocks.DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "dark_oak_wood_stairs");
		DARK_OAK_WOOD_WALL = new ModWallBlock(Blocks.DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "dark_oak_wood_wall");
		CRIMSON_HYPHAE_SLAB = new ModSlabBlock(Blocks.CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "crimson_hyphae_slab");
		CRIMSON_HYPHAE_STAIRS = new ModStairsBlock(Blocks.CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "crimson_hyphae_stairs");
		CRIMSON_HYPHAE_WALL = new ModWallBlock(Blocks.CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "crimson_hyphae_wall");
		WARPED_HYPHAE_SLAB = new ModSlabBlock(Blocks.WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "warped_hyphae_slab");
		WARPED_HYPHAE_STAIRS = new ModStairsBlock(Blocks.WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "warped_hyphae_stairs");
		WARPED_HYPHAE_WALL = new ModWallBlock(Blocks.WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "warped_hyphae_wall");
		STRIPPED_OAK_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_oak_wood_slab");
		STRIPPED_OAK_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_oak_wood_stairs");
		STRIPPED_OAK_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_oak_wood_wall");
		STRIPPED_SPRUCE_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_spruce_wood_slab");
		STRIPPED_SPRUCE_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_spruce_wood_stairs");
		STRIPPED_SPRUCE_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_SPRUCE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_spruce_wood_wall");
		STRIPPED_BIRCH_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_birch_wood_slab");
		STRIPPED_BIRCH_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_birch_wood_stairs");
		STRIPPED_BIRCH_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_BIRCH_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_birch_wood_wall");
		STRIPPED_JUNGLE_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_jungle_wood_slab");
		STRIPPED_JUNGLE_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_jungle_wood_stairs");
		STRIPPED_JUNGLE_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_JUNGLE_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_jungle_wood_wall");
		STRIPPED_ACACIA_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_acacia_wood_slab");
		STRIPPED_ACACIA_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_acacia_wood_stairs");
		STRIPPED_ACACIA_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_ACACIA_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_acacia_wood_wall");
		STRIPPED_DARK_OAK_WOOD_SLAB = new ModSlabBlock(Blocks.STRIPPED_DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_dark_oak_wood_slab");
		STRIPPED_DARK_OAK_WOOD_STAIRS = new ModStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_dark_oak_wood_stairs");
		STRIPPED_DARK_OAK_WOOD_WALL = new ModWallBlock(Blocks.STRIPPED_DARK_OAK_WOOD).setRegistryName(SSWPlusMain.MODID, "stripped_dark_oak_wood_wall");
		STRIPPED_CRIMSON_HYPHAE_SLAB = new ModSlabBlock(Blocks.STRIPPED_CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_crimson_hyphae_slab");
		STRIPPED_CRIMSON_HYPHAE_STAIRS = new ModStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_crimson_hyphae_stairs");
		STRIPPED_CRIMSON_HYPHAE_WALL = new ModWallBlock(Blocks.STRIPPED_CRIMSON_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_crimson_hyphae_wall");
		STRIPPED_WARPED_HYPHAE_SLAB = new ModSlabBlock(Blocks.STRIPPED_WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_warped_hyphae_slab");
		STRIPPED_WARPED_HYPHAE_STAIRS = new ModStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_warped_hyphae_stairs");
		STRIPPED_WARPED_HYPHAE_WALL = new ModWallBlock(Blocks.STRIPPED_WARPED_HYPHAE).setRegistryName(SSWPlusMain.MODID, "stripped_warped_hyphae_wall");
		
		STONE_WALL = new ModWallBlock(Blocks.STONE).setRegistryName(SSWPlusMain.MODID, "stone_wall");
		MOSSY_STONE = new Block(AbstractBlock.Properties.copy(Blocks.STONE)).setRegistryName(SSWPlusMain.MODID, "mossy_stone");
		MOSSY_STONE_SLAB = new ModSlabBlock(MOSSY_STONE).setRegistryName(SSWPlusMain.MODID, "mossy_stone_slab");
		MOSSY_STONE_STAIRS = new ModStairsBlock(MOSSY_STONE).setRegistryName(SSWPlusMain.MODID, "mossy_stone_stairs");
		MOSSY_STONE_WALL = new ModWallBlock(MOSSY_STONE).setRegistryName(SSWPlusMain.MODID, "mossy_stone_wall");
		
		SMOOTH_STONE_STAIRS = new ModStairsBlock(Blocks.SMOOTH_STONE).setRegistryName(SSWPlusMain.MODID, "smooth_stone_stairs");
		SMOOTH_STONE_WALL = new ModWallBlock(Blocks.SMOOTH_STONE).setRegistryName(SSWPlusMain.MODID, "smooth_stone_wall");
		
		MOSSY_CHISELED_STONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.MOSSY_STONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "mossy_chiseled_stone_bricks");
		CRACKED_STONE_BRICK_SLAB = new ModSlabBlock(Blocks.CRACKED_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_stone_brick_slab");
		CRACKED_STONE_BRICK_STAIRS = new ModStairsBlock(Blocks.CRACKED_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_stone_brick_stairs");
		CRACKED_STONE_BRICK_WALL = new ModWallBlock(Blocks.CRACKED_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_stone_brick_wall");
		CRACKED_CHISELED_STONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.CRACKED_STONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_chiseled_stone_bricks");
		CRACKED_MOSSY_STONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_mossy_stone_bricks");
		CRACKED_MOSSY_STONE_BRICK_SLAB = new ModSlabBlock(CRACKED_MOSSY_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_mossy_stone_brick_slab");
		CRACKED_MOSSY_STONE_BRICK_STAIRS = new ModStairsBlock(CRACKED_MOSSY_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_mossy_stone_brick_stairs");
		CRACKED_MOSSY_STONE_BRICK_WALL = new ModWallBlock(CRACKED_MOSSY_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_mossy_stone_brick_wall");
		CRACKED_MOSSY_CHISELED_STONE_BRICKS = new Block(AbstractBlock.Properties.copy(CRACKED_MOSSY_STONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_mossy_chiseled_stone_bricks");
		
		POLISHED_GRANITE_WALL = new ModWallBlock(Blocks.POLISHED_GRANITE).setRegistryName(SSWPlusMain.MODID, "polished_granite_wall");
		GRANITE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.GRANITE)).setRegistryName(SSWPlusMain.MODID, "granite_bricks");
		GRANITE_BRICK_SLAB = new ModSlabBlock(GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "granite_brick_slab");
		GRANITE_BRICK_STAIRS = new ModStairsBlock(GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "granite_brick_stairs");
		GRANITE_BRICK_WALL = new ModWallBlock(GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "granite_brick_wall");
		CRACKED_GRANITE_BRICKS = new Block(AbstractBlock.Properties.copy(GRANITE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_granite_bricks");
		CRACKED_GRANITE_BRICK_SLAB = new ModSlabBlock(CRACKED_GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_granite_brick_slab");
		CRACKED_GRANITE_BRICK_STAIRS = new ModStairsBlock(CRACKED_GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_granite_brick_stairs");
		CRACKED_GRANITE_BRICK_WALL = new ModWallBlock(CRACKED_GRANITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_granite_brick_wall");
		
		POLISHED_DIORITE_WALL = new ModWallBlock(Blocks.POLISHED_DIORITE).setRegistryName(SSWPlusMain.MODID, "polished_diorite_wall");
		DIORITE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.DIORITE)).setRegistryName(SSWPlusMain.MODID, "diorite_bricks");
		DIORITE_BRICK_SLAB = new ModSlabBlock(DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "diorite_brick_slab");
		DIORITE_BRICK_STAIRS = new ModStairsBlock(DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "diorite_brick_stairs");
		DIORITE_BRICK_WALL = new ModWallBlock(DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "diorite_brick_wall");
		CRACKED_DIORITE_BRICKS = new Block(AbstractBlock.Properties.copy(DIORITE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_diorite_bricks");
		CRACKED_DIORITE_BRICK_SLAB = new ModSlabBlock(CRACKED_DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_diorite_brick_slab");
		CRACKED_DIORITE_BRICK_STAIRS = new ModStairsBlock(CRACKED_DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_diorite_brick_stairs");
		CRACKED_DIORITE_BRICK_WALL = new ModWallBlock(CRACKED_DIORITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_diorite_brick_wall");
		
		POLISHED_ANDESITE_WALL = new ModWallBlock(Blocks.POLISHED_ANDESITE).setRegistryName(SSWPlusMain.MODID, "polished_andesite_wall");
		ANDESITE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.ANDESITE)).setRegistryName(SSWPlusMain.MODID, "andesite_bricks");
		ANDESITE_BRICK_SLAB = new ModSlabBlock(ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "andesite_brick_slab");
		ANDESITE_BRICK_STAIRS = new ModStairsBlock(ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "andesite_brick_stairs");
		ANDESITE_BRICK_WALL = new ModWallBlock(ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "andesite_brick_wall");
		CRACKED_ANDESITE_BRICKS = new Block(AbstractBlock.Properties.copy(ANDESITE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_andesite_bricks");
		CRACKED_ANDESITE_BRICK_SLAB = new ModSlabBlock(CRACKED_ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_andesite_brick_slab");
		CRACKED_ANDESITE_BRICK_STAIRS = new ModStairsBlock(CRACKED_ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_andesite_brick_stairs");
		CRACKED_ANDESITE_BRICK_WALL = new ModWallBlock(CRACKED_ANDESITE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_andesite_brick_wall");
		
		PRISMARINE_BRICK_WALL = new ModWallBlock(Blocks.PRISMARINE_BRICKS).setRegistryName(SSWPlusMain.MODID, "prismarine_brick_wall");
		CRACKED_PRISMARINE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.PRISMARINE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_prismarine_bricks");
		CRACKED_PRISMARINE_BRICK_SLAB = new ModSlabBlock(CRACKED_PRISMARINE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_prismarine_brick_slab");
		CRACKED_PRISMARINE_BRICK_STAIRS = new ModStairsBlock(CRACKED_PRISMARINE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_prismarine_brick_stairs");
		CRACKED_PRISMARINE_BRICK_WALL = new ModWallBlock(CRACKED_PRISMARINE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_prismarine_brick_wall");
		DARK_PRISMARINE_WALL = new ModWallBlock(Blocks.DARK_PRISMARINE).setRegistryName(SSWPlusMain.MODID, "dark_prismarine_wall");
		
		OBSIDIAN_SLAB = new ObsidianSlab(Blocks.OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "obsidian_slab");
		OBSIDIAN_STAIRS = new ObsidianStairs(Blocks.OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "obsidian_stairs");
		OBSIDIAN_WALL = new ObsidianWall(Blocks.OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "obsidian_wall");
		
		CRYING_OBSIDIAN_SLAB = new ObsidianSlab(Blocks.CRYING_OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "crying_obsidian_slab");
		CRYING_OBSIDIAN_STAIRS = new ObsidianStairs(Blocks.CRYING_OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "crying_obsidian_stairs");
		CRYING_OBSIDIAN_WALL = new ObsidianWall(Blocks.CRYING_OBSIDIAN).setRegistryName(SSWPlusMain.MODID, "crying_obsidian_wall");
		
		COAL_SLAB = new ModSlabBlock(Blocks.COAL_BLOCK).setRegistryName(SSWPlusMain.MODID, "coal_slab");
		COAL_STAIRS = new ModStairsBlock(Blocks.COAL_BLOCK).setRegistryName(SSWPlusMain.MODID, "coal_stairs");
		COAL_WALL = new ModWallBlock(Blocks.COAL_BLOCK).setRegistryName(SSWPlusMain.MODID, "coal_wall");
		
		IRON_SLAB = new ModSlabBlock(Blocks.IRON_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "iron_slab");
		IRON_STAIRS = new ModStairsBlock(Blocks.IRON_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "iron_stairs");
		IRON_WALL = new ModWallBlock(Blocks.IRON_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "iron_wall");
		
		GOLD_SLAB = new ModSlabBlock(Blocks.GOLD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "gold_slab");
		GOLD_STAIRS = new ModStairsBlock(Blocks.GOLD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "gold_stairs");
		GOLD_WALL = new ModWallBlock(Blocks.GOLD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "gold_wall");
		
		DIAMOND_SLAB = new ModSlabBlock(Blocks.DIAMOND_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "diamond_slab");
		DIAMOND_STAIRS = new ModStairsBlock(Blocks.DIAMOND_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "diamond_stairs");
		DIAMOND_WALL = new ModWallBlock(Blocks.DIAMOND_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "diamond_wall");
		
		EMERALD_SLAB = new ModSlabBlock(Blocks.EMERALD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "emerald_slab");
		EMERALD_STAIRS = new ModStairsBlock(Blocks.EMERALD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "emerald_stairs");
		EMERALD_WALL = new ModWallBlock(Blocks.EMERALD_BLOCK, ToolType.PICKAXE, 3).setRegistryName(SSWPlusMain.MODID, "emerald_wall");
		
		REDSTONE_SLAB = new RedstoneSlab().setRegistryName(SSWPlusMain.MODID, "redstone_slab");
		REDSTONE_STAIRS = new RedstoneStairs().setRegistryName(SSWPlusMain.MODID, "redstone_stairs");
		REDSTONE_WALL = new RedstoneWall().setRegistryName(SSWPlusMain.MODID, "redstone_wall");
		
		LAPIS_LAZULI_SLAB = new ModSlabBlock(Blocks.LAPIS_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "lapis_lazuli_slab");
		LAPIS_LAZULI_STAIRS = new ModStairsBlock(Blocks.LAPIS_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "lapis_lazuli_stairs");
		LAPIS_LAZULI_WALL = new ModWallBlock(Blocks.LAPIS_BLOCK, ToolType.PICKAXE, 2).setRegistryName(SSWPlusMain.MODID, "lapis_lazuli_wall");
		
		NETHERITE_SLAB = new ModSlabBlock(Blocks.NETHERITE_BLOCK, ToolType.PICKAXE, 4).setRegistryName(SSWPlusMain.MODID, "netherite_slab");
		NETHERITE_STAIRS = new ModStairsBlock(Blocks.NETHERITE_BLOCK, ToolType.PICKAXE, 4).setRegistryName(SSWPlusMain.MODID, "netherite_stairs");
		NETHERITE_WALL = new ModWallBlock(Blocks.NETHERITE_BLOCK, ToolType.PICKAXE, 4).setRegistryName(SSWPlusMain.MODID, "netherite_wall");
		
		QUARTZ_WALL = new ModWallBlock(Blocks.QUARTZ_BLOCK).setRegistryName(SSWPlusMain.MODID, "quartz_wall");
		SMOOTH_QUARTZ_WALL = new ModWallBlock(Blocks.SMOOTH_QUARTZ).setRegistryName(SSWPlusMain.MODID, "smooth_quartz_wall");
		QUARTZ_BRICK_SLAB = new ModSlabBlock(Blocks.QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "quartz_brick_slab");
		QUARTZ_BRICK_STAIRS = new ModSlabBlock(Blocks.QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "quartz_brick_stairs");
		QUARTZ_BRICK_WALL = new ModSlabBlock(Blocks.QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "quartz_brick_wall");
		CRACKED_QUARTZ_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.QUARTZ_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_quartz_bricks");
		CRACKED_QUARTZ_BRICK_SLAB = new ModSlabBlock(CRACKED_QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_quartz_brick_slab");
		CRACKED_QUARTZ_BRICK_STAIRS = new ModSlabBlock(CRACKED_QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_quartz_brick_stairs");
		CRACKED_QUARTZ_BRICK_WALL = new ModSlabBlock(CRACKED_QUARTZ_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_quartz_brick_wall");
		
		CUT_SANDSTONE_STAIRS = new ModStairsBlock(Blocks.CUT_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "cut_sandstone_stairs");
		CUT_SANDSTONE_WALL = new ModWallBlock(Blocks.CUT_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "cut_sandstone_wall");
		SMOOTH_SANDSTONE_WALL = new ModWallBlock(Blocks.SMOOTH_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "smooth_sandstone_wall");
		SANDSTONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.SANDSTONE)).setRegistryName(SSWPlusMain.MODID, "sandstone_bricks");
		SANDSTONE_BRICK_SLAB = new ModSlabBlock(SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "sandstone_brick_slab");
		SANDSTONE_BRICK_STAIRS = new ModStairsBlock(SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "sandstone_brick_stairs");
		SANDSTONE_BRICK_WALL = new ModWallBlock(SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "sandstone_brick_wall");
		CRACKED_SANDSTONE_BRICKS = new Block(AbstractBlock.Properties.copy(SANDSTONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_sandstone_bricks");
		CRACKED_SANDSTONE_BRICK_SLAB = new ModSlabBlock(CRACKED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_sandstone_brick_slab");
		CRACKED_SANDSTONE_BRICK_STAIRS = new ModStairsBlock(CRACKED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_sandstone_brick_stairs");
		CRACKED_SANDSTONE_BRICK_WALL = new ModWallBlock(CRACKED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_sandstone_brick_wall");
		
		CUT_RED_SANDSTONE_STAIRS = new ModStairsBlock(Blocks.CUT_RED_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "cut_red_sandstone_stairs");
		CUT_RED_SANDSTONE_WALL = new ModWallBlock(Blocks.CUT_RED_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "cut_red_sandstone_wall");
		SMOOTH_RED_SANDSTONE_WALL = new ModWallBlock(Blocks.SMOOTH_RED_SANDSTONE).setRegistryName(SSWPlusMain.MODID, "smooth_red_sandstone_wall");
		RED_SANDSTONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.RED_SANDSTONE)).setRegistryName(SSWPlusMain.MODID, "red_sandstone_bricks");
		RED_SANDSTONE_BRICK_SLAB = new ModSlabBlock(RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "red_sandstone_brick_slab");
		RED_SANDSTONE_BRICK_STAIRS = new ModStairsBlock(RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "red_sandstone_brick_stairs");
		RED_SANDSTONE_BRICK_WALL = new ModWallBlock(RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "red_sandstone_brick_wall");
		CRACKED_RED_SANDSTONE_BRICKS = new Block(AbstractBlock.Properties.copy(RED_SANDSTONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_red_sandstone_bricks");
		CRACKED_RED_SANDSTONE_BRICK_SLAB = new ModSlabBlock(CRACKED_RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_sandstone_brick_slab");
		CRACKED_RED_SANDSTONE_BRICK_STAIRS = new ModStairsBlock(CRACKED_RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_sandstone_brick_stairs");
		CRACKED_RED_SANDSTONE_BRICK_WALL = new ModWallBlock(CRACKED_RED_SANDSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_sandstone_brick_wall");
		
		GLASS_SLAB = new GlassSlab().setRegistryName(SSWPlusMain.MODID, "glass_slab");
		GLASS_STAIRS = new GlassStairs().setRegistryName(SSWPlusMain.MODID, "glass_stairs");
		GLASS_WALL = new GlassWall().setRegistryName(SSWPlusMain.MODID, "glass_wall");
		
		WHITE_GLASS_SLAB = new StainedGlassSlab(DyeColor.WHITE).setRegistryName(SSWPlusMain.MODID, "white_glass_slab");
		WHITE_GLASS_STAIRS = new StainedGlassStairs(DyeColor.WHITE).setRegistryName(SSWPlusMain.MODID, "white_glass_stairs");
		WHITE_GLASS_WALL = new StainedGlassWall(DyeColor.WHITE).setRegistryName(SSWPlusMain.MODID, "white_glass_wall");
		ORANGE_GLASS_SLAB = new StainedGlassSlab(DyeColor.ORANGE).setRegistryName(SSWPlusMain.MODID, "orange_glass_slab");
		ORANGE_GLASS_STAIRS = new StainedGlassStairs(DyeColor.ORANGE).setRegistryName(SSWPlusMain.MODID, "orange_glass_stairs");
		ORANGE_GLASS_WALL = new StainedGlassWall(DyeColor.ORANGE).setRegistryName(SSWPlusMain.MODID, "orange_glass_wall");
		MAGENTA_GLASS_SLAB = new StainedGlassSlab(DyeColor.MAGENTA).setRegistryName(SSWPlusMain.MODID, "magenta_glass_slab");
		MAGENTA_GLASS_STAIRS = new StainedGlassStairs(DyeColor.MAGENTA).setRegistryName(SSWPlusMain.MODID, "magenta_glass_stairs");
		MAGENTA_GLASS_WALL = new StainedGlassWall(DyeColor.MAGENTA).setRegistryName(SSWPlusMain.MODID, "magenta_glass_wall");
		LIGHT_BLUE_GLASS_SLAB = new StainedGlassSlab(DyeColor.LIGHT_BLUE).setRegistryName(SSWPlusMain.MODID, "light_blue_glass_slab");
		LIGHT_BLUE_GLASS_STAIRS = new StainedGlassStairs(DyeColor.LIGHT_BLUE).setRegistryName(SSWPlusMain.MODID, "light_blue_glass_stairs");
		LIGHT_BLUE_GLASS_WALL = new StainedGlassWall(DyeColor.LIGHT_BLUE).setRegistryName(SSWPlusMain.MODID, "light_blue_glass_wall");
		YELLOW_GLASS_SLAB = new StainedGlassSlab(DyeColor.YELLOW).setRegistryName(SSWPlusMain.MODID, "yellow_glass_slab");
		YELLOW_GLASS_STAIRS = new StainedGlassStairs(DyeColor.YELLOW).setRegistryName(SSWPlusMain.MODID, "yellow_glass_stairs");
		YELLOW_GLASS_WALL = new StainedGlassWall(DyeColor.YELLOW).setRegistryName(SSWPlusMain.MODID, "yellow_glass_wall");
		LIME_GLASS_SLAB = new StainedGlassSlab(DyeColor.LIME).setRegistryName(SSWPlusMain.MODID, "lime_glass_slab");
		LIME_GLASS_STAIRS = new StainedGlassStairs(DyeColor.LIME).setRegistryName(SSWPlusMain.MODID, "lime_glass_stairs");
		LIME_GLASS_WALL = new StainedGlassWall(DyeColor.LIME).setRegistryName(SSWPlusMain.MODID, "lime_glass_wall");
		PINK_GLASS_SLAB = new StainedGlassSlab(DyeColor.PINK).setRegistryName(SSWPlusMain.MODID, "pink_glass_slab");
		PINK_GLASS_STAIRS = new StainedGlassStairs(DyeColor.PINK).setRegistryName(SSWPlusMain.MODID, "pink_glass_stairs");
		PINK_GLASS_WALL = new StainedGlassWall(DyeColor.PINK).setRegistryName(SSWPlusMain.MODID, "pink_glass_wall");
		GRAY_GLASS_SLAB = new StainedGlassSlab(DyeColor.GRAY).setRegistryName(SSWPlusMain.MODID, "gray_glass_slab");
		GRAY_GLASS_STAIRS = new StainedGlassStairs(DyeColor.GRAY).setRegistryName(SSWPlusMain.MODID, "gray_glass_stairs");
		GRAY_GLASS_WALL = new StainedGlassWall(DyeColor.GRAY).setRegistryName(SSWPlusMain.MODID, "gray_glass_wall");
		LIGHT_GRAY_GLASS_SLAB = new StainedGlassSlab(DyeColor.LIGHT_GRAY).setRegistryName(SSWPlusMain.MODID, "light_gray_glass_slab");
		LIGHT_GRAY_GLASS_STAIRS = new StainedGlassStairs(DyeColor.LIGHT_GRAY).setRegistryName(SSWPlusMain.MODID, "light_gray_glass_stairs");
		LIGHT_GRAY_GLASS_WALL = new StainedGlassWall(DyeColor.LIGHT_GRAY).setRegistryName(SSWPlusMain.MODID, "light_gray_glass_wall");
		CYAN_GLASS_SLAB = new StainedGlassSlab(DyeColor.CYAN).setRegistryName(SSWPlusMain.MODID, "cyan_glass_slab");
		CYAN_GLASS_STAIRS = new StainedGlassStairs(DyeColor.CYAN).setRegistryName(SSWPlusMain.MODID, "cyan_glass_stairs");
		CYAN_GLASS_WALL = new StainedGlassWall(DyeColor.CYAN).setRegistryName(SSWPlusMain.MODID, "cyan_glass_wall");
		PURPLE_GLASS_SLAB = new StainedGlassSlab(DyeColor.PURPLE).setRegistryName(SSWPlusMain.MODID, "purple_glass_slab");
		PURPLE_GLASS_STAIRS = new StainedGlassStairs(DyeColor.PURPLE).setRegistryName(SSWPlusMain.MODID, "purple_glass_stairs");
		PURPLE_GLASS_WALL = new StainedGlassWall(DyeColor.PURPLE).setRegistryName(SSWPlusMain.MODID, "purple_glass_wall");
		BLUE_GLASS_SLAB = new StainedGlassSlab(DyeColor.BLUE).setRegistryName(SSWPlusMain.MODID, "blue_glass_slab");
		BLUE_GLASS_STAIRS = new StainedGlassStairs(DyeColor.BLUE).setRegistryName(SSWPlusMain.MODID, "blue_glass_stairs");
		BLUE_GLASS_WALL = new StainedGlassWall(DyeColor.BLUE).setRegistryName(SSWPlusMain.MODID, "blue_glass_wall");
		BROWN_GLASS_SLAB = new StainedGlassSlab(DyeColor.BROWN).setRegistryName(SSWPlusMain.MODID, "brown_glass_slab");
		BROWN_GLASS_STAIRS = new StainedGlassStairs(DyeColor.BROWN).setRegistryName(SSWPlusMain.MODID, "brown_glass_stairs");
		BROWN_GLASS_WALL = new StainedGlassWall(DyeColor.BROWN).setRegistryName(SSWPlusMain.MODID, "brown_glass_wall");
		GREEN_GLASS_SLAB = new StainedGlassSlab(DyeColor.GREEN).setRegistryName(SSWPlusMain.MODID, "green_glass_slab");
		GREEN_GLASS_STAIRS = new StainedGlassStairs(DyeColor.GREEN).setRegistryName(SSWPlusMain.MODID, "green_glass_stairs");
		GREEN_GLASS_WALL = new StainedGlassWall(DyeColor.GREEN).setRegistryName(SSWPlusMain.MODID, "green_glass_wall");
		RED_GLASS_SLAB = new StainedGlassSlab(DyeColor.RED).setRegistryName(SSWPlusMain.MODID, "red_glass_slab");
		RED_GLASS_STAIRS = new StainedGlassStairs(DyeColor.RED).setRegistryName(SSWPlusMain.MODID, "red_glass_stairs");
		RED_GLASS_WALL = new StainedGlassWall(DyeColor.RED).setRegistryName(SSWPlusMain.MODID, "red_glass_wall");
		BLACK_GLASS_SLAB = new StainedGlassSlab(DyeColor.BLACK).setRegistryName(SSWPlusMain.MODID, "black_glass_slab");
		BLACK_GLASS_STAIRS = new StainedGlassStairs(DyeColor.BLACK).setRegistryName(SSWPlusMain.MODID, "black_glass_stairs");
		BLACK_GLASS_WALL = new StainedGlassWall(DyeColor.BLACK).setRegistryName(SSWPlusMain.MODID, "black_glass_wall");
		
		TERRACOTTA_SLAB = new ModSlabBlock(Blocks.TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "terracotta_slab");
		TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "terracotta_stairs");
		TERRACOTTA_WALL = new ModWallBlock(Blocks.TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "terracotta_wall");
		
		WHITE_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.WHITE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "white_terracotta_slab");
		WHITE_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.WHITE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "white_terracotta_stairs");
		WHITE_TERRACOTTA_WALL = new ModWallBlock(Blocks.WHITE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "white_terracotta_wall");
		ORANGE_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.ORANGE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "orange_terracotta_slab");
		ORANGE_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.ORANGE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "orange_terracotta_stairs");
		ORANGE_TERRACOTTA_WALL = new ModWallBlock(Blocks.ORANGE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "orange_terracotta_wall");
		MAGENTA_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.MAGENTA_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "magenta_terracotta_slab");
		MAGENTA_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.MAGENTA_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "magenta_terracotta_stairs");
		MAGENTA_TERRACOTTA_WALL = new ModWallBlock(Blocks.MAGENTA_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "magenta_terracotta_wall");
		LIGHT_BLUE_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.LIGHT_BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_blue_terracotta_slab");
		LIGHT_BLUE_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_blue_terracotta_stairs");
		LIGHT_BLUE_TERRACOTTA_WALL = new ModWallBlock(Blocks.LIGHT_BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_blue_terracotta_wall");
		YELLOW_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.YELLOW_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "yellow_terracotta_slab");
		YELLOW_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.YELLOW_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "yellow_terracotta_stairs");
		YELLOW_TERRACOTTA_WALL = new ModWallBlock(Blocks.YELLOW_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "yellow_terracotta_wall");
		LIME_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.LIME_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "lime_terracotta_slab");
		LIME_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.LIME_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "lime_terracotta_stairs");
		LIME_TERRACOTTA_WALL = new ModWallBlock(Blocks.LIME_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "lime_terracotta_wall");
		PINK_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.PINK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "pink_terracotta_slab");
		PINK_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.PINK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "pink_terracotta_stairs");
		PINK_TERRACOTTA_WALL = new ModWallBlock(Blocks.PINK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "pink_terracotta_wall");
		GRAY_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "gray_terracotta_slab");
		GRAY_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "gray_terracotta_stairs");
		GRAY_TERRACOTTA_WALL = new ModWallBlock(Blocks.GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "gray_terracotta_wall");
		LIGHT_GRAY_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.LIGHT_GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_gray_terracotta_slab");
		LIGHT_GRAY_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_gray_terracotta_stairs");
		LIGHT_GRAY_TERRACOTTA_WALL = new ModWallBlock(Blocks.LIGHT_GRAY_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "light_gray_terracotta_wall");
		CYAN_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.CYAN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "cyan_terracotta_slab");
		CYAN_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.CYAN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "cyan_terracotta_stairs");
		CYAN_TERRACOTTA_WALL = new ModWallBlock(Blocks.CYAN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "cyan_terracotta_wall");
		PURPLE_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.PURPLE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "purple_terracotta_slab");
		PURPLE_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.PURPLE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "purple_terracotta_stairs");
		PURPLE_TERRACOTTA_WALL = new ModWallBlock(Blocks.PURPLE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "purple_terracotta_wall");
		BLUE_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "blue_terracotta_slab");
		BLUE_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "blue_terracotta_stairs");
		BLUE_TERRACOTTA_WALL = new ModWallBlock(Blocks.BLUE_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "blue_terracotta_wall");
		BROWN_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.BROWN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "brown_terracotta_slab");
		BROWN_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.BROWN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "brown_terracotta_stairs");
		BROWN_TERRACOTTA_WALL = new ModWallBlock(Blocks.BROWN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "brown_terracotta_wall");
		GREEN_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.GREEN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "green_terracotta_slab");
		GREEN_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.GREEN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "green_terracotta_stairs");
		GREEN_TERRACOTTA_WALL = new ModWallBlock(Blocks.GREEN_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "green_terracotta_wall");
		RED_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.RED_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "red_terracotta_slab");
		RED_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.RED_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "red_terracotta_stairs");
		RED_TERRACOTTA_WALL = new ModWallBlock(Blocks.RED_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "red_terracotta_wall");
		BLACK_TERRACOTTA_SLAB = new ModSlabBlock(Blocks.BLACK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "black_terracotta_slab");
		BLACK_TERRACOTTA_STAIRS = new ModStairsBlock(Blocks.BLACK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "black_terracotta_stairs");
		BLACK_TERRACOTTA_WALL = new ModWallBlock(Blocks.BLACK_TERRACOTTA).setRegistryName(SSWPlusMain.MODID, "black_terracotta_wall");
		
		WHITE_CONCRETE_SLAB = new ModSlabBlock(Blocks.WHITE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "white_concrete_slab");
		WHITE_CONCRETE_STAIRS = new ModStairsBlock(Blocks.WHITE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "white_concrete_stairs");
		WHITE_CONCRETE_WALL = new ModWallBlock(Blocks.WHITE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "white_concrete_wall");
		ORANGE_CONCRETE_SLAB = new ModSlabBlock(Blocks.ORANGE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "orange_concrete_slab");
		ORANGE_CONCRETE_STAIRS = new ModStairsBlock(Blocks.ORANGE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "orange_concrete_stairs");
		ORANGE_CONCRETE_WALL = new ModWallBlock(Blocks.ORANGE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "orange_concrete_wall");
		MAGENTA_CONCRETE_SLAB = new ModSlabBlock(Blocks.MAGENTA_CONCRETE).setRegistryName(SSWPlusMain.MODID, "magenta_concrete_slab");
		MAGENTA_CONCRETE_STAIRS = new ModStairsBlock(Blocks.MAGENTA_CONCRETE).setRegistryName(SSWPlusMain.MODID, "magenta_concrete_stairs");
		MAGENTA_CONCRETE_WALL = new ModWallBlock(Blocks.MAGENTA_CONCRETE).setRegistryName(SSWPlusMain.MODID, "magenta_concrete_wall");
		LIGHT_BLUE_CONCRETE_SLAB = new ModSlabBlock(Blocks.LIGHT_BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_blue_concrete_slab");
		LIGHT_BLUE_CONCRETE_STAIRS = new ModStairsBlock(Blocks.LIGHT_BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_blue_concrete_stairs");
		LIGHT_BLUE_CONCRETE_WALL = new ModWallBlock(Blocks.LIGHT_BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_blue_concrete_wall");
		YELLOW_CONCRETE_SLAB = new ModSlabBlock(Blocks.YELLOW_CONCRETE).setRegistryName(SSWPlusMain.MODID, "yellow_concrete_slab");
		YELLOW_CONCRETE_STAIRS = new ModStairsBlock(Blocks.YELLOW_CONCRETE).setRegistryName(SSWPlusMain.MODID, "yellow_concrete_stairs");
		YELLOW_CONCRETE_WALL = new ModWallBlock(Blocks.YELLOW_CONCRETE).setRegistryName(SSWPlusMain.MODID, "yellow_concrete_wall");
		LIME_CONCRETE_SLAB = new ModSlabBlock(Blocks.LIME_CONCRETE).setRegistryName(SSWPlusMain.MODID, "lime_concrete_slab");
		LIME_CONCRETE_STAIRS = new ModStairsBlock(Blocks.LIME_CONCRETE).setRegistryName(SSWPlusMain.MODID, "lime_concrete_stairs");
		LIME_CONCRETE_WALL = new ModWallBlock(Blocks.LIME_CONCRETE).setRegistryName(SSWPlusMain.MODID, "lime_concrete_wall");
		PINK_CONCRETE_SLAB = new ModSlabBlock(Blocks.PINK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "pink_concrete_slab");
		PINK_CONCRETE_STAIRS = new ModStairsBlock(Blocks.PINK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "pink_concrete_stairs");
		PINK_CONCRETE_WALL = new ModWallBlock(Blocks.PINK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "pink_concrete_wall");
		GRAY_CONCRETE_SLAB = new ModSlabBlock(Blocks.GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "gray_concrete_slab");
		GRAY_CONCRETE_STAIRS = new ModStairsBlock(Blocks.GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "gray_concrete_stairs");
		GRAY_CONCRETE_WALL = new ModWallBlock(Blocks.GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "gray_concrete_wall");
		LIGHT_GRAY_CONCRETE_SLAB = new ModSlabBlock(Blocks.LIGHT_GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_gray_concrete_slab");
		LIGHT_GRAY_CONCRETE_STAIRS = new ModStairsBlock(Blocks.LIGHT_GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_gray_concrete_stairs");
		LIGHT_GRAY_CONCRETE_WALL = new ModWallBlock(Blocks.LIGHT_GRAY_CONCRETE).setRegistryName(SSWPlusMain.MODID, "light_gray_concrete_wall");
		CYAN_CONCRETE_SLAB = new ModSlabBlock(Blocks.CYAN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "cyan_concrete_slab");
		CYAN_CONCRETE_STAIRS = new ModStairsBlock(Blocks.CYAN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "cyan_concrete_stairs");
		CYAN_CONCRETE_WALL = new ModWallBlock(Blocks.CYAN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "cyan_concrete_wall");
		PURPLE_CONCRETE_SLAB = new ModSlabBlock(Blocks.PURPLE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "purple_concrete_slab");
		PURPLE_CONCRETE_STAIRS = new ModStairsBlock(Blocks.PURPLE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "purple_concrete_stairs");
		PURPLE_CONCRETE_WALL = new ModWallBlock(Blocks.PURPLE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "purple_concrete_wall");
		BLUE_CONCRETE_SLAB = new ModSlabBlock(Blocks.BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "blue_concrete_slab");
		BLUE_CONCRETE_STAIRS = new ModStairsBlock(Blocks.BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "blue_concrete_stairs");
		BLUE_CONCRETE_WALL = new ModWallBlock(Blocks.BLUE_CONCRETE).setRegistryName(SSWPlusMain.MODID, "blue_concrete_wall");
		BROWN_CONCRETE_SLAB = new ModSlabBlock(Blocks.BROWN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "brown_concrete_slab");
		BROWN_CONCRETE_STAIRS = new ModStairsBlock(Blocks.BROWN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "brown_concrete_stairs");
		BROWN_CONCRETE_WALL = new ModWallBlock(Blocks.BROWN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "brown_concrete_wall");
		GREEN_CONCRETE_SLAB = new ModSlabBlock(Blocks.GREEN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "green_concrete_slab");
		GREEN_CONCRETE_STAIRS = new ModStairsBlock(Blocks.GREEN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "green_concrete_stairs");
		GREEN_CONCRETE_WALL = new ModWallBlock(Blocks.GREEN_CONCRETE).setRegistryName(SSWPlusMain.MODID, "green_concrete_wall");
		RED_CONCRETE_SLAB = new ModSlabBlock(Blocks.RED_CONCRETE).setRegistryName(SSWPlusMain.MODID, "red_concrete_slab");
		RED_CONCRETE_STAIRS = new ModStairsBlock(Blocks.RED_CONCRETE).setRegistryName(SSWPlusMain.MODID, "red_concrete_stairs");
		RED_CONCRETE_WALL = new ModWallBlock(Blocks.RED_CONCRETE).setRegistryName(SSWPlusMain.MODID, "red_concrete_wall");
		BLACK_CONCRETE_SLAB = new ModSlabBlock(Blocks.BLACK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "black_concrete_slab");
		BLACK_CONCRETE_STAIRS = new ModStairsBlock(Blocks.BLACK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "black_concrete_stairs");
		BLACK_CONCRETE_WALL = new ModWallBlock(Blocks.BLACK_CONCRETE).setRegistryName(SSWPlusMain.MODID, "black_concrete_wall");
		
		CRACKED_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_bricks");
		CRACKED_BRICK_SLAB = new ModSlabBlock(CRACKED_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_brick_slab");
		CRACKED_BRICK_STAIRS = new ModStairsBlock(CRACKED_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_brick_stairs");
		CRACKED_BRICK_WALL = new ModWallBlock(CRACKED_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_brick_wall");
		
		END_STONE_SLAB = new ModSlabBlock(Blocks.END_STONE).setRegistryName(SSWPlusMain.MODID, "end_stone_slab");
		END_STONE_STAIRS = new ModStairsBlock(Blocks.END_STONE).setRegistryName(SSWPlusMain.MODID, "end_stone_stairs");
		END_STONE_WALL = new ModWallBlock(Blocks.END_STONE).setRegistryName(SSWPlusMain.MODID, "end_stone_wall");
		CRACKED_END_STONE_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.END_STONE_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_end_stone_bricks");
		CRACKED_END_STONE_BRICK_SLAB = new ModSlabBlock(CRACKED_END_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_end_stone_brick_slab");
		CRACKED_END_STONE_BRICK_STAIRS = new ModStairsBlock(CRACKED_END_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_end_stone_brick_stairs");
		CRACKED_END_STONE_BRICK_WALL = new ModWallBlock(CRACKED_END_STONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_end_stone_brick_wall");
		
		PURPUR_WALL = new ModWallBlock(Blocks.PURPUR_BLOCK).setRegistryName(SSWPlusMain.MODID, "purpur_wall");
		
		NETHERRACK_SLAB = new ModSlabBlock(Blocks.NETHERRACK).setRegistryName(SSWPlusMain.MODID, "netherrack_slab");
		NETHERRACK_STAIRS = new ModStairsBlock(Blocks.NETHERRACK).setRegistryName(SSWPlusMain.MODID, "netherrack_stairs");
		NETHERRACK_WALL = new ModWallBlock(Blocks.NETHERRACK).setRegistryName(SSWPlusMain.MODID, "netherrack_wall");
		
		MAGMA_SLAB = new MagmaSlab().setRegistryName(SSWPlusMain.MODID, "magma_slab");
		MAGMA_STAIRS = new MagmaStairs().setRegistryName(SSWPlusMain.MODID, "magma_stairs");
		MAGMA_WALL = new MagmaWall().setRegistryName(SSWPlusMain.MODID, "magma_wall");
		
		GLOWSTONE_SLAB = new ModSlabBlock(Blocks.GLOWSTONE).setRegistryName(SSWPlusMain.MODID, "glowstone_slab");
		GLOWSTONE_STAIRS = new ModStairsBlock(Blocks.GLOWSTONE).setRegistryName(SSWPlusMain.MODID, "glowstone_stairs");
		GLOWSTONE_WALL = new ModWallBlock(Blocks.GLOWSTONE).setRegistryName(SSWPlusMain.MODID, "glowstone_wall");
		
		BASALT_SLAB = new ModSlabBlock(Blocks.BASALT).setRegistryName(SSWPlusMain.MODID, "basalt_slab");
		BASALT_STAIRS = new ModStairsBlock(Blocks.BASALT).setRegistryName(SSWPlusMain.MODID, "basalt_stairs");
		BASALT_WALL = new ModWallBlock(Blocks.BASALT).setRegistryName(SSWPlusMain.MODID, "basalt_wall");
		
		POLISHED_BASALT_SLAB = new ModSlabBlock(Blocks.POLISHED_BASALT).setRegistryName(SSWPlusMain.MODID, "polished_basalt_slab");
		POLISHED_BASALT_STAIRS = new ModStairsBlock(Blocks.POLISHED_BASALT).setRegistryName(SSWPlusMain.MODID, "polished_basalt_stairs");
		POLISHED_BASALT_WALL = new ModWallBlock(Blocks.POLISHED_BASALT).setRegistryName(SSWPlusMain.MODID, "polished_basalt_wall");
		
		CRACKED_NETHER_BRICK_SLAB = new ModSlabBlock(Blocks.CRACKED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_nether_brick_slab");
		CRACKED_NETHER_BRICK_STAIRS = new ModStairsBlock(Blocks.CRACKED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_nether_brick_stairs");
		CRACKED_NETHER_BRICK_WALL = new ModWallBlock(Blocks.CRACKED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_nether_brick_wall");
		CRACKED_NETHER_BRICK_FENCE = new ModFenceBlock(Blocks.CRACKED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_nether_brick_fence");
		CRACKED_CHISELED_NETHER_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_chiseled_nether_bricks");
		
		RED_NETHER_BRICK_FENCE = new ModFenceBlock(Blocks.RED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "red_nether_brick_fence");
		CRACKED_RED_NETHER_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.RED_NETHER_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_red_nether_bricks");
		CRACKED_RED_NETHER_BRICK_SLAB = new ModSlabBlock(CRACKED_RED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_nether_brick_slab");
		CRACKED_RED_NETHER_BRICK_STAIRS = new ModStairsBlock(CRACKED_RED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_nether_brick_stairs");
		CRACKED_RED_NETHER_BRICK_WALL = new ModWallBlock(CRACKED_RED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_nether_brick_wall");
		CRACKED_RED_NETHER_BRICK_FENCE = new ModFenceBlock(CRACKED_RED_NETHER_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_red_nether_brick_fence");
		CHISELED_RED_NETHER_BRICKS = new Block(AbstractBlock.Properties.copy(Blocks.RED_NETHER_BRICKS)).setRegistryName(SSWPlusMain.MODID, "chiseled_red_nether_bricks");
		CRACKED_CHISELED_RED_NETHER_BRICKS = new Block(AbstractBlock.Properties.copy(CRACKED_RED_NETHER_BRICKS)).setRegistryName(SSWPlusMain.MODID, "cracked_chiseled_red_nether_bricks");
		
		CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = new ModSlabBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_polished_blackstone_brick_slab");
		CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = new ModStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_polished_blackstone_brick_stairs");
		CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = new ModWallBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).setRegistryName(SSWPlusMain.MODID, "cracked_polished_blackstone_brick_wall");
		GILDED_BLACKSTONE_SLAB = new ModSlabBlock(Blocks.GILDED_BLACKSTONE).setRegistryName(SSWPlusMain.MODID, "gilded_blackstone_slab");
		GILDED_BLACKSTONE_STAIRS = new ModStairsBlock(Blocks.GILDED_BLACKSTONE).setRegistryName(SSWPlusMain.MODID, "gilded_blackstone_stairs");
		GILDED_BLACKSTONE_WALL = new ModWallBlock(Blocks.GILDED_BLACKSTONE).setRegistryName(SSWPlusMain.MODID, "gilded_blackstone_wall");
		
		INFESTED_MOSSY_STONE = new SilverfishBlock(MOSSY_STONE, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_mossy_stone");
		INFESTED_MOSSY_COBBLESTONE = new SilverfishBlock(Blocks.MOSSY_COBBLESTONE, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_mossy_cobblestone");
		INFESTED_MOSSY_CHISELED_STONE_BRICKS = new SilverfishBlock(MOSSY_CHISELED_STONE_BRICKS, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_mossy_chiseled_stone_bricks");
		INFESTED_CRACKED_CHISELED_STONE_BRICKS = new SilverfishBlock(CRACKED_CHISELED_STONE_BRICKS, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_cracked_chiseled_stone_bricks");
		INFESTED_CRACKED_MOSSY_STONE_BRICKS = new SilverfishBlock(CRACKED_MOSSY_STONE_BRICKS, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_cracked_mossy_stone_bricks");
		INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS = new SilverfishBlock(CRACKED_MOSSY_CHISELED_STONE_BRICKS, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_cracked_mossy_chiseled_stone_bricks");
		INFESTED_SMOOTH_STONE = new SilverfishBlock(Blocks.SMOOTH_STONE, AbstractBlock.Properties.of(Material.CLAY).strength(0.0f, 0.75f)).setRegistryName(SSWPlusMain.MODID, "infested_smooth_stone");
		
		isCreated = true;
	}
	
	public static void registerBlocks(IForgeRegistry<Block> ifr) {
		createBlocks();
		
		ifr.register(OAK_WOOD_SLAB);
		ifr.register(OAK_WOOD_STAIRS);
		ifr.register(OAK_WOOD_WALL);
		ifr.register(SPRUCE_WOOD_SLAB);
		ifr.register(SPRUCE_WOOD_STAIRS);
		ifr.register(SPRUCE_WOOD_WALL);
		ifr.register(BIRCH_WOOD_SLAB);
		ifr.register(BIRCH_WOOD_STAIRS);
		ifr.register(BIRCH_WOOD_WALL);
		ifr.register(JUNGLE_WOOD_SLAB);
		ifr.register(JUNGLE_WOOD_STAIRS);
		ifr.register(JUNGLE_WOOD_WALL);
		ifr.register(ACACIA_WOOD_SLAB);
		ifr.register(ACACIA_WOOD_STAIRS);
		ifr.register(ACACIA_WOOD_WALL);
		ifr.register(DARK_OAK_WOOD_SLAB);
		ifr.register(DARK_OAK_WOOD_STAIRS);
		ifr.register(DARK_OAK_WOOD_WALL);
		ifr.register(CRIMSON_HYPHAE_SLAB);
		ifr.register(CRIMSON_HYPHAE_STAIRS);
		ifr.register(CRIMSON_HYPHAE_WALL);
		ifr.register(WARPED_HYPHAE_SLAB);
		ifr.register(WARPED_HYPHAE_STAIRS);
		ifr.register(WARPED_HYPHAE_WALL);
		ifr.register(STRIPPED_OAK_WOOD_SLAB);
		ifr.register(STRIPPED_OAK_WOOD_STAIRS);
		ifr.register(STRIPPED_OAK_WOOD_WALL);
		ifr.register(STRIPPED_SPRUCE_WOOD_SLAB);
		ifr.register(STRIPPED_SPRUCE_WOOD_STAIRS);
		ifr.register(STRIPPED_SPRUCE_WOOD_WALL);
		ifr.register(STRIPPED_BIRCH_WOOD_SLAB);
		ifr.register(STRIPPED_BIRCH_WOOD_STAIRS);
		ifr.register(STRIPPED_BIRCH_WOOD_WALL);
		ifr.register(STRIPPED_JUNGLE_WOOD_SLAB);
		ifr.register(STRIPPED_JUNGLE_WOOD_STAIRS);
		ifr.register(STRIPPED_JUNGLE_WOOD_WALL);
		ifr.register(STRIPPED_ACACIA_WOOD_SLAB);
		ifr.register(STRIPPED_ACACIA_WOOD_STAIRS);
		ifr.register(STRIPPED_ACACIA_WOOD_WALL);
		ifr.register(STRIPPED_DARK_OAK_WOOD_SLAB);
		ifr.register(STRIPPED_DARK_OAK_WOOD_STAIRS);
		ifr.register(STRIPPED_DARK_OAK_WOOD_WALL);
		ifr.register(STRIPPED_CRIMSON_HYPHAE_SLAB);
		ifr.register(STRIPPED_CRIMSON_HYPHAE_STAIRS);
		ifr.register(STRIPPED_CRIMSON_HYPHAE_WALL);
		ifr.register(STRIPPED_WARPED_HYPHAE_SLAB);
		ifr.register(STRIPPED_WARPED_HYPHAE_STAIRS);
		ifr.register(STRIPPED_WARPED_HYPHAE_WALL);
		
		ifr.register(STONE_WALL);
		ifr.register(MOSSY_STONE);
		ifr.register(MOSSY_STONE_SLAB);
		ifr.register(MOSSY_STONE_STAIRS);
		ifr.register(MOSSY_STONE_WALL);
		ifr.register(SMOOTH_STONE_STAIRS);
		ifr.register(SMOOTH_STONE_WALL);
		
		ifr.register(MOSSY_CHISELED_STONE_BRICKS);
		ifr.register(CRACKED_STONE_BRICK_SLAB);
		ifr.register(CRACKED_STONE_BRICK_STAIRS);
		ifr.register(CRACKED_STONE_BRICK_WALL);
		ifr.register(CRACKED_CHISELED_STONE_BRICKS);
		ifr.register(CRACKED_MOSSY_STONE_BRICKS);
		ifr.register(CRACKED_MOSSY_STONE_BRICK_SLAB);
		ifr.register(CRACKED_MOSSY_STONE_BRICK_STAIRS);
		ifr.register(CRACKED_MOSSY_STONE_BRICK_WALL);
		ifr.register(CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		
		ifr.register(POLISHED_GRANITE_WALL);
		ifr.register(GRANITE_BRICKS);
		ifr.register(GRANITE_BRICK_SLAB);
		ifr.register(GRANITE_BRICK_STAIRS);
		ifr.register(GRANITE_BRICK_WALL);
		ifr.register(CRACKED_GRANITE_BRICKS);
		ifr.register(CRACKED_GRANITE_BRICK_SLAB);
		ifr.register(CRACKED_GRANITE_BRICK_STAIRS);
		ifr.register(CRACKED_GRANITE_BRICK_WALL);
		
		ifr.register(POLISHED_DIORITE_WALL);
		ifr.register(DIORITE_BRICKS);
		ifr.register(DIORITE_BRICK_SLAB);
		ifr.register(DIORITE_BRICK_STAIRS);
		ifr.register(DIORITE_BRICK_WALL);
		ifr.register(CRACKED_DIORITE_BRICKS);
		ifr.register(CRACKED_DIORITE_BRICK_SLAB);
		ifr.register(CRACKED_DIORITE_BRICK_STAIRS);
		ifr.register(CRACKED_DIORITE_BRICK_WALL);
		
		ifr.register(POLISHED_ANDESITE_WALL);
		ifr.register(ANDESITE_BRICKS);
		ifr.register(ANDESITE_BRICK_SLAB);
		ifr.register(ANDESITE_BRICK_STAIRS);
		ifr.register(ANDESITE_BRICK_WALL);
		ifr.register(CRACKED_ANDESITE_BRICKS);
		ifr.register(CRACKED_ANDESITE_BRICK_SLAB);
		ifr.register(CRACKED_ANDESITE_BRICK_STAIRS);
		ifr.register(CRACKED_ANDESITE_BRICK_WALL);
		
		ifr.register(PRISMARINE_BRICK_WALL);
		ifr.register(CRACKED_PRISMARINE_BRICKS);
		ifr.register(CRACKED_PRISMARINE_BRICK_SLAB);
		ifr.register(CRACKED_PRISMARINE_BRICK_STAIRS);
		ifr.register(CRACKED_PRISMARINE_BRICK_WALL);
		ifr.register(DARK_PRISMARINE_WALL);
		
		ifr.register(OBSIDIAN_SLAB);
		ifr.register(OBSIDIAN_STAIRS);
		ifr.register(OBSIDIAN_WALL);
		ifr.register(CRYING_OBSIDIAN_SLAB);
		ifr.register(CRYING_OBSIDIAN_STAIRS);
		ifr.register(CRYING_OBSIDIAN_WALL);
		
		ifr.register(COAL_SLAB);
		ifr.register(COAL_STAIRS);
		ifr.register(COAL_WALL);
		
		ifr.register(IRON_SLAB);
		ifr.register(IRON_STAIRS);
		ifr.register(IRON_WALL);
		
		ifr.register(GOLD_SLAB);
		ifr.register(GOLD_STAIRS);
		ifr.register(GOLD_WALL);
		
		ifr.register(DIAMOND_SLAB);
		ifr.register(DIAMOND_STAIRS);
		ifr.register(DIAMOND_WALL);
		
		ifr.register(EMERALD_SLAB);
		ifr.register(EMERALD_STAIRS);
		ifr.register(EMERALD_WALL);
		
		ifr.register(REDSTONE_SLAB);
		ifr.register(REDSTONE_STAIRS);
		ifr.register(REDSTONE_WALL);
		
		ifr.register(LAPIS_LAZULI_SLAB);
		ifr.register(LAPIS_LAZULI_STAIRS);
		ifr.register(LAPIS_LAZULI_WALL);
		
		ifr.register(NETHERITE_SLAB);
		ifr.register(NETHERITE_STAIRS);
		ifr.register(NETHERITE_WALL);
		
		ifr.register(QUARTZ_WALL);
		ifr.register(SMOOTH_QUARTZ_WALL);
		ifr.register(QUARTZ_BRICK_SLAB);
		ifr.register(QUARTZ_BRICK_STAIRS);
		ifr.register(QUARTZ_BRICK_WALL);
		ifr.register(CRACKED_QUARTZ_BRICKS);
		ifr.register(CRACKED_QUARTZ_BRICK_SLAB);
		ifr.register(CRACKED_QUARTZ_BRICK_STAIRS);
		ifr.register(CRACKED_QUARTZ_BRICK_WALL);
		
		ifr.register(CUT_SANDSTONE_STAIRS);
		ifr.register(CUT_SANDSTONE_WALL);
		ifr.register(SMOOTH_SANDSTONE_WALL);
		ifr.register(SANDSTONE_BRICKS);
		ifr.register(SANDSTONE_BRICK_SLAB);
		ifr.register(SANDSTONE_BRICK_STAIRS);
		ifr.register(SANDSTONE_BRICK_WALL);
		ifr.register(CRACKED_SANDSTONE_BRICKS);
		ifr.register(CRACKED_SANDSTONE_BRICK_SLAB);
		ifr.register(CRACKED_SANDSTONE_BRICK_STAIRS);
		ifr.register(CRACKED_SANDSTONE_BRICK_WALL);
		
		ifr.register(CUT_RED_SANDSTONE_STAIRS);
		ifr.register(CUT_RED_SANDSTONE_WALL);
		ifr.register(SMOOTH_RED_SANDSTONE_WALL);
		ifr.register(RED_SANDSTONE_BRICKS);
		ifr.register(RED_SANDSTONE_BRICK_SLAB);
		ifr.register(RED_SANDSTONE_BRICK_STAIRS);
		ifr.register(RED_SANDSTONE_BRICK_WALL);
		ifr.register(CRACKED_RED_SANDSTONE_BRICKS);
		ifr.register(CRACKED_RED_SANDSTONE_BRICK_SLAB);
		ifr.register(CRACKED_RED_SANDSTONE_BRICK_STAIRS);
		ifr.register(CRACKED_RED_SANDSTONE_BRICK_WALL);
		
		ifr.register(GLASS_SLAB);
		ifr.register(GLASS_STAIRS);
		ifr.register(GLASS_WALL);
		
		ifr.register(WHITE_GLASS_SLAB);
		ifr.register(WHITE_GLASS_STAIRS);
		ifr.register(WHITE_GLASS_WALL);
		ifr.register(ORANGE_GLASS_SLAB);
		ifr.register(ORANGE_GLASS_STAIRS);
		ifr.register(ORANGE_GLASS_WALL);
		ifr.register(MAGENTA_GLASS_SLAB);
		ifr.register(MAGENTA_GLASS_STAIRS);
		ifr.register(MAGENTA_GLASS_WALL);
		ifr.register(LIGHT_BLUE_GLASS_SLAB);
		ifr.register(LIGHT_BLUE_GLASS_STAIRS);
		ifr.register(LIGHT_BLUE_GLASS_WALL);
		ifr.register(YELLOW_GLASS_SLAB);
		ifr.register(YELLOW_GLASS_STAIRS);
		ifr.register(YELLOW_GLASS_WALL);
		ifr.register(LIME_GLASS_SLAB);
		ifr.register(LIME_GLASS_STAIRS);
		ifr.register(LIME_GLASS_WALL);
		ifr.register(PINK_GLASS_SLAB);
		ifr.register(PINK_GLASS_STAIRS);
		ifr.register(PINK_GLASS_WALL);
		ifr.register(GRAY_GLASS_SLAB);
		ifr.register(GRAY_GLASS_STAIRS);
		ifr.register(GRAY_GLASS_WALL);
		ifr.register(LIGHT_GRAY_GLASS_SLAB);
		ifr.register(LIGHT_GRAY_GLASS_STAIRS);
		ifr.register(LIGHT_GRAY_GLASS_WALL);
		ifr.register(CYAN_GLASS_SLAB);
		ifr.register(CYAN_GLASS_STAIRS);
		ifr.register(CYAN_GLASS_WALL);
		ifr.register(PURPLE_GLASS_SLAB);
		ifr.register(PURPLE_GLASS_STAIRS);
		ifr.register(PURPLE_GLASS_WALL);
		ifr.register(BLUE_GLASS_SLAB);
		ifr.register(BLUE_GLASS_STAIRS);
		ifr.register(BLUE_GLASS_WALL);
		ifr.register(BROWN_GLASS_SLAB);
		ifr.register(BROWN_GLASS_STAIRS);
		ifr.register(BROWN_GLASS_WALL);
		ifr.register(GREEN_GLASS_SLAB);
		ifr.register(GREEN_GLASS_STAIRS);
		ifr.register(GREEN_GLASS_WALL);
		ifr.register(RED_GLASS_SLAB);
		ifr.register(RED_GLASS_STAIRS);
		ifr.register(RED_GLASS_WALL);
		ifr.register(BLACK_GLASS_SLAB);
		ifr.register(BLACK_GLASS_STAIRS);
		ifr.register(BLACK_GLASS_WALL);
		
		ifr.register(TERRACOTTA_SLAB);
		ifr.register(TERRACOTTA_STAIRS);
		ifr.register(TERRACOTTA_WALL);
		
		ifr.register(WHITE_TERRACOTTA_SLAB);
		ifr.register(WHITE_TERRACOTTA_STAIRS);
		ifr.register(WHITE_TERRACOTTA_WALL);
		ifr.register(ORANGE_TERRACOTTA_SLAB);
		ifr.register(ORANGE_TERRACOTTA_STAIRS);
		ifr.register(ORANGE_TERRACOTTA_WALL);
		ifr.register(MAGENTA_TERRACOTTA_SLAB);
		ifr.register(MAGENTA_TERRACOTTA_STAIRS);
		ifr.register(MAGENTA_TERRACOTTA_WALL);
		ifr.register(LIGHT_BLUE_TERRACOTTA_SLAB);
		ifr.register(LIGHT_BLUE_TERRACOTTA_STAIRS);
		ifr.register(LIGHT_BLUE_TERRACOTTA_WALL);
		ifr.register(YELLOW_TERRACOTTA_SLAB);
		ifr.register(YELLOW_TERRACOTTA_STAIRS);
		ifr.register(YELLOW_TERRACOTTA_WALL);
		ifr.register(LIME_TERRACOTTA_SLAB);
		ifr.register(LIME_TERRACOTTA_STAIRS);
		ifr.register(LIME_TERRACOTTA_WALL);
		ifr.register(PINK_TERRACOTTA_SLAB);
		ifr.register(PINK_TERRACOTTA_STAIRS);
		ifr.register(PINK_TERRACOTTA_WALL);
		ifr.register(GRAY_TERRACOTTA_SLAB);
		ifr.register(GRAY_TERRACOTTA_STAIRS);
		ifr.register(GRAY_TERRACOTTA_WALL);
		ifr.register(LIGHT_GRAY_TERRACOTTA_SLAB);
		ifr.register(LIGHT_GRAY_TERRACOTTA_STAIRS);
		ifr.register(LIGHT_GRAY_TERRACOTTA_WALL);
		ifr.register(CYAN_TERRACOTTA_SLAB);
		ifr.register(CYAN_TERRACOTTA_STAIRS);
		ifr.register(CYAN_TERRACOTTA_WALL);
		ifr.register(PURPLE_TERRACOTTA_SLAB);
		ifr.register(PURPLE_TERRACOTTA_STAIRS);
		ifr.register(PURPLE_TERRACOTTA_WALL);
		ifr.register(BLUE_TERRACOTTA_SLAB);
		ifr.register(BLUE_TERRACOTTA_STAIRS);
		ifr.register(BLUE_TERRACOTTA_WALL);
		ifr.register(BROWN_TERRACOTTA_SLAB);
		ifr.register(BROWN_TERRACOTTA_STAIRS);
		ifr.register(BROWN_TERRACOTTA_WALL);
		ifr.register(GREEN_TERRACOTTA_SLAB);
		ifr.register(GREEN_TERRACOTTA_STAIRS);
		ifr.register(GREEN_TERRACOTTA_WALL);
		ifr.register(RED_TERRACOTTA_SLAB);
		ifr.register(RED_TERRACOTTA_STAIRS);
		ifr.register(RED_TERRACOTTA_WALL);
		ifr.register(BLACK_TERRACOTTA_SLAB);
		ifr.register(BLACK_TERRACOTTA_STAIRS);
		ifr.register(BLACK_TERRACOTTA_WALL);
		
		ifr.register(WHITE_CONCRETE_SLAB);
		ifr.register(WHITE_CONCRETE_STAIRS);
		ifr.register(WHITE_CONCRETE_WALL);
		ifr.register(ORANGE_CONCRETE_SLAB);
		ifr.register(ORANGE_CONCRETE_STAIRS);
		ifr.register(ORANGE_CONCRETE_WALL);
		ifr.register(MAGENTA_CONCRETE_SLAB);
		ifr.register(MAGENTA_CONCRETE_STAIRS);
		ifr.register(MAGENTA_CONCRETE_WALL);
		ifr.register(LIGHT_BLUE_CONCRETE_SLAB);
		ifr.register(LIGHT_BLUE_CONCRETE_STAIRS);
		ifr.register(LIGHT_BLUE_CONCRETE_WALL);
		ifr.register(YELLOW_CONCRETE_SLAB);
		ifr.register(YELLOW_CONCRETE_STAIRS);
		ifr.register(YELLOW_CONCRETE_WALL);
		ifr.register(LIME_CONCRETE_SLAB);
		ifr.register(LIME_CONCRETE_STAIRS);
		ifr.register(LIME_CONCRETE_WALL);
		ifr.register(PINK_CONCRETE_SLAB);
		ifr.register(PINK_CONCRETE_STAIRS);
		ifr.register(PINK_CONCRETE_WALL);
		ifr.register(GRAY_CONCRETE_SLAB);
		ifr.register(GRAY_CONCRETE_STAIRS);
		ifr.register(GRAY_CONCRETE_WALL);
		ifr.register(LIGHT_GRAY_CONCRETE_SLAB);
		ifr.register(LIGHT_GRAY_CONCRETE_STAIRS);
		ifr.register(LIGHT_GRAY_CONCRETE_WALL);
		ifr.register(CYAN_CONCRETE_SLAB);
		ifr.register(CYAN_CONCRETE_STAIRS);
		ifr.register(CYAN_CONCRETE_WALL);
		ifr.register(PURPLE_CONCRETE_SLAB);
		ifr.register(PURPLE_CONCRETE_STAIRS);
		ifr.register(PURPLE_CONCRETE_WALL);
		ifr.register(BLUE_CONCRETE_SLAB);
		ifr.register(BLUE_CONCRETE_STAIRS);
		ifr.register(BLUE_CONCRETE_WALL);
		ifr.register(BROWN_CONCRETE_SLAB);
		ifr.register(BROWN_CONCRETE_STAIRS);
		ifr.register(BROWN_CONCRETE_WALL);
		ifr.register(GREEN_CONCRETE_SLAB);
		ifr.register(GREEN_CONCRETE_STAIRS);
		ifr.register(GREEN_CONCRETE_WALL);
		ifr.register(RED_CONCRETE_SLAB);
		ifr.register(RED_CONCRETE_STAIRS);
		ifr.register(RED_CONCRETE_WALL);
		ifr.register(BLACK_CONCRETE_SLAB);
		ifr.register(BLACK_CONCRETE_STAIRS);
		ifr.register(BLACK_CONCRETE_WALL);
		
		ifr.register(CRACKED_BRICKS);
		ifr.register(CRACKED_BRICK_SLAB);
		ifr.register(CRACKED_BRICK_STAIRS);
		ifr.register(CRACKED_BRICK_WALL);
		
		ifr.register(END_STONE_SLAB);
		ifr.register(END_STONE_STAIRS);
		ifr.register(END_STONE_WALL);
		
		ifr.register(CRACKED_END_STONE_BRICKS);
		ifr.register(CRACKED_END_STONE_BRICK_SLAB);
		ifr.register(CRACKED_END_STONE_BRICK_STAIRS);
		ifr.register(CRACKED_END_STONE_BRICK_WALL);
		
		ifr.register(PURPUR_WALL);
		
		ifr.register(NETHERRACK_SLAB);
		ifr.register(NETHERRACK_STAIRS);
		ifr.register(NETHERRACK_WALL);
		
		ifr.register(MAGMA_SLAB);
		ifr.register(MAGMA_STAIRS);
		ifr.register(MAGMA_WALL);
		
		ifr.register(GLOWSTONE_SLAB);
		ifr.register(GLOWSTONE_STAIRS);
		ifr.register(GLOWSTONE_WALL);
		
		ifr.register(BASALT_SLAB);
		ifr.register(BASALT_STAIRS);
		ifr.register(BASALT_WALL);
		
		ifr.register(POLISHED_BASALT_SLAB);
		ifr.register(POLISHED_BASALT_STAIRS);
		ifr.register(POLISHED_BASALT_WALL);
		
		ifr.register(CRACKED_NETHER_BRICK_SLAB);
		ifr.register(CRACKED_NETHER_BRICK_STAIRS);
		ifr.register(CRACKED_NETHER_BRICK_WALL);
		ifr.register(CRACKED_NETHER_BRICK_FENCE);
		ifr.register(CRACKED_CHISELED_NETHER_BRICKS);
		
		ifr.register(RED_NETHER_BRICK_FENCE);
		ifr.register(CRACKED_RED_NETHER_BRICKS);
		ifr.register(CRACKED_RED_NETHER_BRICK_SLAB);
		ifr.register(CRACKED_RED_NETHER_BRICK_STAIRS);
		ifr.register(CRACKED_RED_NETHER_BRICK_WALL);
		ifr.register(CRACKED_RED_NETHER_BRICK_FENCE);
		ifr.register(CHISELED_RED_NETHER_BRICKS);
		ifr.register(CRACKED_CHISELED_RED_NETHER_BRICKS);
		
		ifr.register(CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
		ifr.register(CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
		ifr.register(CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
		ifr.register(GILDED_BLACKSTONE_SLAB);
		ifr.register(GILDED_BLACKSTONE_STAIRS);
		ifr.register(GILDED_BLACKSTONE_WALL);
		
		ifr.register(INFESTED_MOSSY_STONE);
		ifr.register(INFESTED_MOSSY_COBBLESTONE);
		ifr.register(INFESTED_MOSSY_CHISELED_STONE_BRICKS);
		ifr.register(INFESTED_CRACKED_CHISELED_STONE_BRICKS);
		ifr.register(INFESTED_CRACKED_MOSSY_STONE_BRICKS);
		ifr.register(INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		ifr.register(INFESTED_SMOOTH_STONE);
	}
	
	public static void registerBlockItems(IForgeRegistry<Item> ifr) {
		createBlocks();
		
		registerBlockItemBB(ifr, OAK_WOOD_SLAB);
		registerBlockItemBB(ifr, OAK_WOOD_STAIRS);
		registerBlockItemDe(ifr, OAK_WOOD_WALL);
		registerBlockItemBB(ifr, SPRUCE_WOOD_SLAB);
		registerBlockItemBB(ifr, SPRUCE_WOOD_STAIRS);
		registerBlockItemDe(ifr, SPRUCE_WOOD_WALL);
		registerBlockItemBB(ifr, BIRCH_WOOD_SLAB);
		registerBlockItemBB(ifr, BIRCH_WOOD_STAIRS);
		registerBlockItemDe(ifr, BIRCH_WOOD_WALL);
		registerBlockItemBB(ifr, JUNGLE_WOOD_SLAB);
		registerBlockItemBB(ifr, JUNGLE_WOOD_STAIRS);
		registerBlockItemDe(ifr, JUNGLE_WOOD_WALL);
		registerBlockItemBB(ifr, ACACIA_WOOD_SLAB);
		registerBlockItemBB(ifr, ACACIA_WOOD_STAIRS);
		registerBlockItemDe(ifr, ACACIA_WOOD_WALL);
		registerBlockItemBB(ifr, DARK_OAK_WOOD_SLAB);
		registerBlockItemBB(ifr, DARK_OAK_WOOD_STAIRS);
		registerBlockItemDe(ifr, DARK_OAK_WOOD_WALL);
		registerBlockItemBB(ifr, CRIMSON_HYPHAE_SLAB);
		registerBlockItemBB(ifr, CRIMSON_HYPHAE_STAIRS);
		registerBlockItemDe(ifr, CRIMSON_HYPHAE_WALL);
		registerBlockItemBB(ifr, WARPED_HYPHAE_SLAB);
		registerBlockItemBB(ifr, WARPED_HYPHAE_STAIRS);
		registerBlockItemDe(ifr, WARPED_HYPHAE_WALL);
		registerBlockItemBB(ifr, STRIPPED_OAK_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_OAK_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_OAK_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_SPRUCE_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_SPRUCE_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_SPRUCE_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_BIRCH_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_BIRCH_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_BIRCH_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_JUNGLE_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_JUNGLE_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_JUNGLE_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_ACACIA_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_ACACIA_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_ACACIA_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_DARK_OAK_WOOD_SLAB);
		registerBlockItemBB(ifr, STRIPPED_DARK_OAK_WOOD_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_DARK_OAK_WOOD_WALL);
		registerBlockItemBB(ifr, STRIPPED_CRIMSON_HYPHAE_SLAB);
		registerBlockItemBB(ifr, STRIPPED_CRIMSON_HYPHAE_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_CRIMSON_HYPHAE_WALL);
		registerBlockItemBB(ifr, STRIPPED_WARPED_HYPHAE_SLAB);
		registerBlockItemBB(ifr, STRIPPED_WARPED_HYPHAE_STAIRS);
		registerBlockItemDe(ifr, STRIPPED_WARPED_HYPHAE_WALL);
		
		registerBlockItemDe(ifr, STONE_WALL);
		registerBlockItemBB(ifr, MOSSY_STONE);
		registerBlockItemBB(ifr, MOSSY_STONE_SLAB);
		registerBlockItemBB(ifr, MOSSY_STONE_STAIRS);
		registerBlockItemDe(ifr, MOSSY_STONE_WALL);
		registerBlockItemBB(ifr, SMOOTH_STONE_STAIRS);
		registerBlockItemDe(ifr, SMOOTH_STONE_WALL);
		
		registerBlockItemBB(ifr, MOSSY_CHISELED_STONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_STONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_STONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_STONE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_CHISELED_STONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_MOSSY_STONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_MOSSY_STONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_MOSSY_STONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_MOSSY_STONE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		
		registerBlockItemDe(ifr, POLISHED_GRANITE_WALL);
		registerBlockItemBB(ifr, GRANITE_BRICKS);
		registerBlockItemBB(ifr, GRANITE_BRICK_SLAB);
		registerBlockItemBB(ifr, GRANITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, GRANITE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_GRANITE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_GRANITE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_GRANITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_GRANITE_BRICK_WALL);
		
		registerBlockItemDe(ifr, POLISHED_DIORITE_WALL);
		registerBlockItemBB(ifr, DIORITE_BRICKS);
		registerBlockItemBB(ifr, DIORITE_BRICK_SLAB);
		registerBlockItemBB(ifr, DIORITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, DIORITE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_DIORITE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_DIORITE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_DIORITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_DIORITE_BRICK_WALL);
		
		registerBlockItemDe(ifr, POLISHED_ANDESITE_WALL);
		registerBlockItemBB(ifr, ANDESITE_BRICKS);
		registerBlockItemBB(ifr, ANDESITE_BRICK_SLAB);
		registerBlockItemBB(ifr, ANDESITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, ANDESITE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_ANDESITE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_ANDESITE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_ANDESITE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_ANDESITE_BRICK_WALL);
		
		registerBlockItemDe(ifr, PRISMARINE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_PRISMARINE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_PRISMARINE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_PRISMARINE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_PRISMARINE_BRICK_WALL);
		registerBlockItemDe(ifr, DARK_PRISMARINE_WALL);
		
		registerBlockItemBB(ifr, OBSIDIAN_SLAB);
		registerBlockItemBB(ifr, OBSIDIAN_STAIRS);
		registerBlockItemDe(ifr, OBSIDIAN_WALL);
		registerBlockItemBB(ifr, CRYING_OBSIDIAN_SLAB);
		registerBlockItemBB(ifr, CRYING_OBSIDIAN_STAIRS);
		registerBlockItemDe(ifr, CRYING_OBSIDIAN_WALL);
		
		registerBlockItemBB(ifr, COAL_SLAB);
		registerBlockItemBB(ifr, COAL_STAIRS);
		registerBlockItemDe(ifr, COAL_WALL);
		
		registerBlockItemBB(ifr, IRON_SLAB);
		registerBlockItemBB(ifr, IRON_STAIRS);
		registerBlockItemDe(ifr, IRON_WALL);
		
		registerBlockItemBB(ifr, GOLD_SLAB);
		registerBlockItemBB(ifr, GOLD_STAIRS);
		registerBlockItemDe(ifr, GOLD_WALL);
		
		registerBlockItemBB(ifr, DIAMOND_SLAB);
		registerBlockItemBB(ifr, DIAMOND_STAIRS);
		registerBlockItemDe(ifr, DIAMOND_WALL);
		
		registerBlockItemBB(ifr, EMERALD_SLAB);
		registerBlockItemBB(ifr, EMERALD_STAIRS);
		registerBlockItemDe(ifr, EMERALD_WALL);
		
		registerBlockItem(ifr, REDSTONE_SLAB, ItemGroup.TAB_REDSTONE);
		registerBlockItem(ifr, REDSTONE_STAIRS, ItemGroup.TAB_REDSTONE);
		registerBlockItem(ifr, REDSTONE_WALL, ItemGroup.TAB_REDSTONE);
		
		registerBlockItemBB(ifr, LAPIS_LAZULI_SLAB);
		registerBlockItemBB(ifr, LAPIS_LAZULI_STAIRS);
		registerBlockItemDe(ifr, LAPIS_LAZULI_WALL);
		
		registerNetheriteItem(ifr, NETHERITE_SLAB, ItemGroup.TAB_BUILDING_BLOCKS);
		registerNetheriteItem(ifr, NETHERITE_STAIRS, ItemGroup.TAB_BUILDING_BLOCKS);
		registerNetheriteItem(ifr, NETHERITE_WALL, ItemGroup.TAB_BUILDING_BLOCKS);
		
		registerBlockItemDe(ifr, QUARTZ_WALL);
		registerBlockItemDe(ifr, SMOOTH_QUARTZ_WALL);
		registerBlockItemBB(ifr, QUARTZ_BRICK_SLAB);
		registerBlockItemBB(ifr, QUARTZ_BRICK_STAIRS);
		registerBlockItemDe(ifr, QUARTZ_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_QUARTZ_BRICKS);
		registerBlockItemBB(ifr, CRACKED_QUARTZ_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_QUARTZ_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_QUARTZ_BRICK_WALL);
		
		registerBlockItemBB(ifr, CUT_SANDSTONE_STAIRS);
		registerBlockItemDe(ifr, CUT_SANDSTONE_WALL);
		registerBlockItemDe(ifr, SMOOTH_SANDSTONE_WALL);
		registerBlockItemBB(ifr, SANDSTONE_BRICKS);
		registerBlockItemBB(ifr, SANDSTONE_BRICK_SLAB);
		registerBlockItemBB(ifr, SANDSTONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, SANDSTONE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_SANDSTONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_SANDSTONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_SANDSTONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_SANDSTONE_BRICK_WALL);
		
		registerBlockItemBB(ifr, CUT_RED_SANDSTONE_STAIRS);
		registerBlockItemDe(ifr, CUT_RED_SANDSTONE_WALL);
		registerBlockItemDe(ifr, SMOOTH_RED_SANDSTONE_WALL);
		registerBlockItemBB(ifr, RED_SANDSTONE_BRICKS);
		registerBlockItemBB(ifr, RED_SANDSTONE_BRICK_SLAB);
		registerBlockItemBB(ifr, RED_SANDSTONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, RED_SANDSTONE_BRICK_WALL);
		registerBlockItemBB(ifr, CRACKED_RED_SANDSTONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_RED_SANDSTONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_RED_SANDSTONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_RED_SANDSTONE_BRICK_WALL);
		
		registerBlockItemBB(ifr, GLASS_SLAB);
		registerBlockItemBB(ifr, GLASS_STAIRS);
		registerBlockItemDe(ifr, GLASS_WALL);
		
		registerBlockItemBB(ifr, WHITE_GLASS_SLAB);
		registerBlockItemBB(ifr, WHITE_GLASS_STAIRS);
		registerBlockItemDe(ifr, WHITE_GLASS_WALL);
		registerBlockItemBB(ifr, ORANGE_GLASS_SLAB);
		registerBlockItemBB(ifr, ORANGE_GLASS_STAIRS);
		registerBlockItemDe(ifr, ORANGE_GLASS_WALL);
		registerBlockItemBB(ifr, MAGENTA_GLASS_SLAB);
		registerBlockItemBB(ifr, MAGENTA_GLASS_STAIRS);
		registerBlockItemDe(ifr, MAGENTA_GLASS_WALL);
		registerBlockItemBB(ifr, LIGHT_BLUE_GLASS_SLAB);
		registerBlockItemBB(ifr, LIGHT_BLUE_GLASS_STAIRS);
		registerBlockItemDe(ifr, LIGHT_BLUE_GLASS_WALL);
		registerBlockItemBB(ifr, YELLOW_GLASS_SLAB);
		registerBlockItemBB(ifr, YELLOW_GLASS_STAIRS);
		registerBlockItemDe(ifr, YELLOW_GLASS_WALL);
		registerBlockItemBB(ifr, LIME_GLASS_SLAB);
		registerBlockItemBB(ifr, LIME_GLASS_STAIRS);
		registerBlockItemDe(ifr, LIME_GLASS_WALL);
		registerBlockItemBB(ifr, PINK_GLASS_SLAB);
		registerBlockItemBB(ifr, PINK_GLASS_STAIRS);
		registerBlockItemDe(ifr, PINK_GLASS_WALL);
		registerBlockItemBB(ifr, GRAY_GLASS_SLAB);
		registerBlockItemBB(ifr, GRAY_GLASS_STAIRS);
		registerBlockItemDe(ifr, GRAY_GLASS_WALL);
		registerBlockItemBB(ifr, LIGHT_GRAY_GLASS_SLAB);
		registerBlockItemBB(ifr, LIGHT_GRAY_GLASS_STAIRS);
		registerBlockItemDe(ifr, LIGHT_GRAY_GLASS_WALL);
		registerBlockItemBB(ifr, CYAN_GLASS_SLAB);
		registerBlockItemBB(ifr, CYAN_GLASS_STAIRS);
		registerBlockItemDe(ifr, CYAN_GLASS_WALL);
		registerBlockItemBB(ifr, PURPLE_GLASS_SLAB);
		registerBlockItemBB(ifr, PURPLE_GLASS_STAIRS);
		registerBlockItemDe(ifr, PURPLE_GLASS_WALL);
		registerBlockItemBB(ifr, BLUE_GLASS_SLAB);
		registerBlockItemBB(ifr, BLUE_GLASS_STAIRS);
		registerBlockItemDe(ifr, BLUE_GLASS_WALL);
		registerBlockItemBB(ifr, BROWN_GLASS_SLAB);
		registerBlockItemBB(ifr, BROWN_GLASS_STAIRS);
		registerBlockItemDe(ifr, BROWN_GLASS_WALL);
		registerBlockItemBB(ifr, GREEN_GLASS_SLAB);
		registerBlockItemBB(ifr, GREEN_GLASS_STAIRS);
		registerBlockItemDe(ifr, GREEN_GLASS_WALL);
		registerBlockItemBB(ifr, RED_GLASS_SLAB);
		registerBlockItemBB(ifr, RED_GLASS_STAIRS);
		registerBlockItemDe(ifr, RED_GLASS_WALL);
		registerBlockItemBB(ifr, BLACK_GLASS_SLAB);
		registerBlockItemBB(ifr, BLACK_GLASS_STAIRS);
		registerBlockItemDe(ifr, BLACK_GLASS_WALL);
		
		registerBlockItemBB(ifr, TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, TERRACOTTA_WALL);
		
		registerBlockItemBB(ifr, WHITE_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, WHITE_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, WHITE_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, ORANGE_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, ORANGE_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, ORANGE_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, MAGENTA_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, MAGENTA_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, MAGENTA_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, LIGHT_BLUE_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, LIGHT_BLUE_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, LIGHT_BLUE_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, YELLOW_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, YELLOW_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, YELLOW_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, LIME_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, LIME_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, LIME_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, PINK_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, PINK_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, PINK_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, GRAY_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, GRAY_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, GRAY_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, LIGHT_GRAY_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, LIGHT_GRAY_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, LIGHT_GRAY_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, CYAN_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, CYAN_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, CYAN_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, PURPLE_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, PURPLE_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, PURPLE_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, BLUE_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, BLUE_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, BLUE_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, BROWN_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, BROWN_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, BROWN_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, GREEN_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, GREEN_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, GREEN_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, RED_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, RED_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, RED_TERRACOTTA_WALL);
		registerBlockItemBB(ifr, BLACK_TERRACOTTA_SLAB);
		registerBlockItemBB(ifr, BLACK_TERRACOTTA_STAIRS);
		registerBlockItemDe(ifr, BLACK_TERRACOTTA_WALL);
		
		registerBlockItemBB(ifr, WHITE_CONCRETE_SLAB);
		registerBlockItemBB(ifr, WHITE_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, WHITE_CONCRETE_WALL);
		registerBlockItemBB(ifr, ORANGE_CONCRETE_SLAB);
		registerBlockItemBB(ifr, ORANGE_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, ORANGE_CONCRETE_WALL);
		registerBlockItemBB(ifr, MAGENTA_CONCRETE_SLAB);
		registerBlockItemBB(ifr, MAGENTA_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, MAGENTA_CONCRETE_WALL);
		registerBlockItemBB(ifr, LIGHT_BLUE_CONCRETE_SLAB);
		registerBlockItemBB(ifr, LIGHT_BLUE_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, LIGHT_BLUE_CONCRETE_WALL);
		registerBlockItemBB(ifr, YELLOW_CONCRETE_SLAB);
		registerBlockItemBB(ifr, YELLOW_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, YELLOW_CONCRETE_WALL);
		registerBlockItemBB(ifr, LIME_CONCRETE_SLAB);
		registerBlockItemBB(ifr, LIME_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, LIME_CONCRETE_WALL);
		registerBlockItemBB(ifr, PINK_CONCRETE_SLAB);
		registerBlockItemBB(ifr, PINK_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, PINK_CONCRETE_WALL);
		registerBlockItemBB(ifr, GRAY_CONCRETE_SLAB);
		registerBlockItemBB(ifr, GRAY_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, GRAY_CONCRETE_WALL);
		registerBlockItemBB(ifr, LIGHT_GRAY_CONCRETE_SLAB);
		registerBlockItemBB(ifr, LIGHT_GRAY_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, LIGHT_GRAY_CONCRETE_WALL);
		registerBlockItemBB(ifr, CYAN_CONCRETE_SLAB);
		registerBlockItemBB(ifr, CYAN_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, CYAN_CONCRETE_WALL);
		registerBlockItemBB(ifr, PURPLE_CONCRETE_SLAB);
		registerBlockItemBB(ifr, PURPLE_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, PURPLE_CONCRETE_WALL);
		registerBlockItemBB(ifr, BLUE_CONCRETE_SLAB);
		registerBlockItemBB(ifr, BLUE_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, BLUE_CONCRETE_WALL);
		registerBlockItemBB(ifr, BROWN_CONCRETE_SLAB);
		registerBlockItemBB(ifr, BROWN_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, BROWN_CONCRETE_WALL);
		registerBlockItemBB(ifr, GREEN_CONCRETE_SLAB);
		registerBlockItemBB(ifr, GREEN_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, GREEN_CONCRETE_WALL);
		registerBlockItemBB(ifr, RED_CONCRETE_SLAB);
		registerBlockItemBB(ifr, RED_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, RED_CONCRETE_WALL);
		registerBlockItemBB(ifr, BLACK_CONCRETE_SLAB);
		registerBlockItemBB(ifr, BLACK_CONCRETE_STAIRS);
		registerBlockItemDe(ifr, BLACK_CONCRETE_WALL);
		
		registerBlockItemBB(ifr, CRACKED_BRICKS);
		registerBlockItemBB(ifr, CRACKED_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_BRICK_WALL);
		
		registerBlockItemBB(ifr, END_STONE_SLAB);
		registerBlockItemBB(ifr, END_STONE_STAIRS);
		registerBlockItemDe(ifr, END_STONE_WALL);
		registerBlockItemBB(ifr, CRACKED_END_STONE_BRICKS);
		registerBlockItemBB(ifr, CRACKED_END_STONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_END_STONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_END_STONE_BRICK_WALL);
		
		registerBlockItemDe(ifr, PURPUR_WALL);
		
		registerBlockItemBB(ifr, NETHERRACK_SLAB);
		registerBlockItemBB(ifr, NETHERRACK_STAIRS);
		registerBlockItemDe(ifr, NETHERRACK_WALL);
		
		registerBlockItemBB(ifr, MAGMA_SLAB);
		registerBlockItemBB(ifr, MAGMA_STAIRS);
		registerBlockItemDe(ifr, MAGMA_WALL);
		
		registerBlockItemBB(ifr, GLOWSTONE_SLAB);
		registerBlockItemBB(ifr, GLOWSTONE_STAIRS);
		registerBlockItemDe(ifr, GLOWSTONE_WALL);
		
		registerBlockItemBB(ifr, BASALT_SLAB);
		registerBlockItemBB(ifr, BASALT_STAIRS);
		registerBlockItemDe(ifr, BASALT_WALL);
		
		registerBlockItemBB(ifr, POLISHED_BASALT_SLAB);
		registerBlockItemBB(ifr, POLISHED_BASALT_STAIRS);
		registerBlockItemDe(ifr, POLISHED_BASALT_WALL);
		
		registerBlockItemBB(ifr, CRACKED_NETHER_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_NETHER_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_NETHER_BRICK_WALL);
		registerBlockItemDe(ifr, CRACKED_NETHER_BRICK_FENCE);
		registerBlockItemBB(ifr, CRACKED_CHISELED_NETHER_BRICKS);
		
		registerBlockItemDe(ifr, RED_NETHER_BRICK_FENCE);
		registerBlockItemBB(ifr, CRACKED_RED_NETHER_BRICKS);
		registerBlockItemBB(ifr, CRACKED_RED_NETHER_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_RED_NETHER_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_RED_NETHER_BRICK_WALL);
		registerBlockItemDe(ifr, CRACKED_RED_NETHER_BRICK_FENCE);
		registerBlockItemBB(ifr, CHISELED_RED_NETHER_BRICKS);
		registerBlockItemBB(ifr, CRACKED_CHISELED_RED_NETHER_BRICKS);
		
		registerBlockItemBB(ifr, CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
		registerBlockItemBB(ifr, CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
		registerBlockItemDe(ifr, CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
		registerBlockItemBB(ifr, GILDED_BLACKSTONE_SLAB);
		registerBlockItemBB(ifr, GILDED_BLACKSTONE_STAIRS);
		registerBlockItemDe(ifr, GILDED_BLACKSTONE_WALL);
		
		registerBlockItemDe(ifr, INFESTED_MOSSY_STONE);
		registerBlockItemDe(ifr, INFESTED_MOSSY_COBBLESTONE);
		registerBlockItemDe(ifr, INFESTED_MOSSY_CHISELED_STONE_BRICKS);
		registerBlockItemDe(ifr, INFESTED_CRACKED_CHISELED_STONE_BRICKS);
		registerBlockItemDe(ifr, INFESTED_CRACKED_MOSSY_STONE_BRICKS);
		registerBlockItemDe(ifr, INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		registerBlockItemDe(ifr, INFESTED_SMOOTH_STONE);
	}
	
	private static void registerBlockItemBB(IForgeRegistry<Item> ifr, Block block) {
		registerBlockItem(ifr, block, ItemGroup.TAB_BUILDING_BLOCKS);
	}
	
	private static void registerBlockItemDe(IForgeRegistry<Item> ifr, Block block) {
		registerBlockItem(ifr, block, ItemGroup.TAB_DECORATIONS);
	}
	
	private static void registerBlockItem(IForgeRegistry<Item> ifr, Block block, ItemGroup group) {
		ifr.register(new BlockItem(block, new Item.Properties().tab(group)).setRegistryName(block.getRegistryName()));
	}
	
	private static void registerNetheriteItem(IForgeRegistry<Item> ifr, Block block, ItemGroup group) {
		ifr.register(new BlockItem(block, new Item.Properties().tab(group).fireResistant()).setRegistryName(block.getRegistryName()));
	}
	
	protected static boolean always(BlockState state, IBlockReader world, BlockPos pos) {
		return true;
	}
	
	protected static boolean never(BlockState state, IBlockReader world, BlockPos pos) {
		return false;
	}
	
	protected static Boolean never(BlockState state, IBlockReader world, BlockPos pos, EntityType<?> entityType) {
		return (boolean)false;
	}
	
	protected static Boolean always(BlockState state, IBlockReader world, BlockPos pos, EntityType<?> entityType) {
		return (boolean)true;
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void setRenderLayers() {
		RenderTypeLookup.setRenderLayer(GLASS_SLAB, RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(GLASS_STAIRS, RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(GLASS_WALL, RenderType.cutoutMipped());
		
		RenderTypeLookup.setRenderLayer(WHITE_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WHITE_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WHITE_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ORANGE_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ORANGE_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ORANGE_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(MAGENTA_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(MAGENTA_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(MAGENTA_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_BLUE_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_BLUE_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_BLUE_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(YELLOW_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(YELLOW_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(YELLOW_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIME_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIME_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIME_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PINK_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PINK_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PINK_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GRAY_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GRAY_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GRAY_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_GRAY_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_GRAY_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(LIGHT_GRAY_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(CYAN_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(CYAN_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(CYAN_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PURPLE_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PURPLE_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PURPLE_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLUE_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLUE_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLUE_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BROWN_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BROWN_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BROWN_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GREEN_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GREEN_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(GREEN_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(RED_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(RED_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(RED_GLASS_WALL, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLACK_GLASS_SLAB, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLACK_GLASS_STAIRS, RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BLACK_GLASS_WALL, RenderType.translucent());
	}
}