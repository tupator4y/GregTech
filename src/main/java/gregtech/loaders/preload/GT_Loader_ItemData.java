package gregtech.loaders.preload;

import gregtech.api.items.ItemList;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.util.GTLog;
import gregtech.api.util.GTUtility;
import gregtech.api.util.GT_ModHandler;
import ic2.core.item.type.NuclearResourceType;
import ic2.core.ref.ItemName;
import ic2.core.ref.TeBlock;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GT_Loader_ItemData
        implements Runnable {
    public void run() {
        GTLog.out.println("GregTechMod: Loading Item Data Tags");
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "item.giantPick", 1, 0), new ItemMaterialInfo(Materials.Stone, 696729600L, new MaterialStack(Materials.Wood, 464486400L)));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "item.giantSword", 1, 0), new ItemMaterialInfo(Materials.Stone, 464486400L, new MaterialStack(Materials.Wood, 232243200L)));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "tile.GiantLog", 1, 32767), new ItemMaterialInfo(Materials.Wood, 232243200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "tile.GiantCobble", 1, 32767), new ItemMaterialInfo(Materials.Stone, 232243200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "tile.GiantObsidian", 1, 32767), new ItemMaterialInfo(Materials.Obsidian, 232243200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "item.minotaurAxe", 1, 0), new ItemMaterialInfo(Materials.Diamond, 14515200L, new MaterialStack(Materials.Wood, OrePrefix.stick.mMaterialAmount * 2L)));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "item.armorShards", 1, 0), new ItemMaterialInfo(Materials.Knightmetal, 403200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("TwilightForest", "item.shardCluster", 1, 0), new ItemMaterialInfo(Materials.Knightmetal, 3628800L));
        OreDictUnifier.addItemData(ItemList.TF_LiveRoot.get(1), new ItemMaterialInfo(Materials.LiveRoot, 3628800L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1, 10), new ItemMaterialInfo(Materials.CertusQuartz, 1814400L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1, 11), new ItemMaterialInfo(Materials.NetherQuartz, 1814400L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1, 12), new ItemMaterialInfo(Materials.Fluix, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 32767), new ItemMaterialInfo(Materials.NetherQuartz, 14515200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockQuartz", 1, 32767), new ItemMaterialInfo(Materials.CertusQuartz, 14515200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockQuartzPillar", 1, 32767), new ItemMaterialInfo(Materials.CertusQuartz, 14515200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockQuartzChiseled", 1, 32767), new ItemMaterialInfo(Materials.CertusQuartz, 14515200L));
        OreDictUnifier.addItemData(new ItemStack(Items.WHEAT, 1, 32767), new ItemMaterialInfo(Materials.Wheat, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.HAY_BLOCK, 1, 32767), new ItemMaterialInfo(Materials.Wheat, 32659200L));
        OreDictUnifier.addItemData(new ItemStack(Items.SNOWBALL, 1, 32767), new ItemMaterialInfo(Materials.Snow, 907200L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.SNOW, 1, 32767), new ItemMaterialInfo(Materials.Snow, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.GLOWSTONE, 1, 32767), new ItemMaterialInfo(Materials.Glowstone, 14515200L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.REDSTONE_LAMP, 1, 32767), new ItemMaterialInfo(Materials.Glowstone, 14515200L, new MaterialStack(Materials.Redstone, OrePrefix.dust.mMaterialAmount * 4L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.LIT_REDSTONE_LAMP, 1, 32767), new ItemMaterialInfo(Materials.Glowstone, 14515200L, new MaterialStack(Materials.Redstone, OrePrefix.dust.mMaterialAmount * 4L)));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Forestry", "craftingMaterial", 1, 5), new ItemMaterialInfo(Materials.Ice, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ICE, 1, 32767), new ItemMaterialInfo(Materials.Ice, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.PACKED_ICE, 1, 32767), new ItemMaterialInfo(Materials.Ice, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Items.CLAY_BALL, 1, 32767), new ItemMaterialInfo(Materials.Clay, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.CLAY, 1, 32767), new ItemMaterialInfo(Materials.Clay, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.HARDENED_CLAY, 1, 32767), new ItemMaterialInfo(Materials.Clay, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 32767), new ItemMaterialInfo(Materials.Clay, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.BRICK_BLOCK, 1, 32767), new ItemMaterialInfo(Materials.Clay, 3628800L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2Item(ItemName.nuclear, NuclearResourceType.uranium_238, 1), new ItemMaterialInfo(Materials.Uranium, 3628800L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2Item(ItemName.nuclear, NuclearResourceType.uranium_235, 1), new ItemMaterialInfo(Materials.Uranium235, 3628800L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2Item(ItemName.nuclear, NuclearResourceType.plutonium, 1), new ItemMaterialInfo(Materials.Plutonium, 3628800L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2Item(ItemName.nuclear, NuclearResourceType.small_uranium_235, 1), new ItemMaterialInfo(Materials.Uranium235, 403200L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2Item(ItemName.nuclear, NuclearResourceType.small_plutonium, 1), new ItemMaterialInfo(Materials.Plutonium, 403200L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Iron.get(1), new ItemMaterialInfo(Materials.Iron, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Gold.get(1), new ItemMaterialInfo(Materials.Gold, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Bronze.get(1), new ItemMaterialInfo(Materials.Bronze, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Copper.get(1), new ItemMaterialInfo(Materials.Copper, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Tin.get(1), new ItemMaterialInfo(Materials.Tin, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Lead.get(1), new ItemMaterialInfo(Materials.Lead, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Item_Casing_Steel.get(1), new ItemMaterialInfo(Materials.Steel, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Items.BOOK, 1, 32767), new ItemMaterialInfo(Materials.Paper, 10886400L));
        OreDictUnifier.addItemData(new ItemStack(Items.WRITTEN_BOOK, 1, 32767), new ItemMaterialInfo(Materials.Paper, 10886400L));
        OreDictUnifier.addItemData(new ItemStack(Items.WRITABLE_BOOK, 1, 32767), new ItemMaterialInfo(Materials.Paper, 10886400L));
        OreDictUnifier.addItemData(new ItemStack(Items.ENCHANTED_BOOK, 1, 32767), new ItemMaterialInfo(Materials.Paper, 10886400L));
        OreDictUnifier.addItemData(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new ItemMaterialInfo(Materials.Gold, OrePrefix.block.mMaterialAmount * 8L));
        OreDictUnifier.addItemData(new ItemStack(Items.GOLDEN_APPLE, 1, 0), new ItemMaterialInfo(Materials.Gold, OrePrefix.ingot.mMaterialAmount * 8L));
        OreDictUnifier.addItemData(new ItemStack(Items.GOLD_NUGGET, 1, 0), new ItemMaterialInfo(Materials.Gold, OrePrefix.nugget.mMaterialAmount * 8L));
        OreDictUnifier.addItemData(new ItemStack(Items.SPECKLED_MELON, 1, 0), new ItemMaterialInfo(Materials.Gold, OrePrefix.nugget.mMaterialAmount * 8L));
        OreDictUnifier.addItemData(new ItemStack(Items.MINECART, 1), new ItemMaterialInfo(Materials.Iron, 18144000L));
        OreDictUnifier.addItemData(new ItemStack(Items.CAULDRON, 1), new ItemMaterialInfo(Materials.Iron, 25401600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.IRON_BARS, 8, 32767), new ItemMaterialInfo(Materials.Iron, 10886400L));
        OreDictUnifier.addItemData(GT_ModHandler.getIC2TEItem(TeBlock.iron_furnace, 1), new ItemMaterialInfo(Materials.Iron, 18144000L));
        OreDictUnifier.addItemData(ItemList.IC2_Food_Can_Empty.get(1), new ItemMaterialInfo(Materials.Tin, 1814400L));
        OreDictUnifier.addItemData(ItemList.IC2_Fuel_Rod_Empty.get(1), new ItemMaterialInfo(Materials.Iron, 3628800L));
        OreDictUnifier.addItemData(ItemList.IC2_Fuel_Can_Empty.get(1), new ItemMaterialInfo(Materials.Tin, 25401600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, 1, 32767), new ItemMaterialInfo(Materials.Gold, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 1, 32767), new ItemMaterialInfo(Materials.Iron, 7257600L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Railcraft", "tile.railcraft.anvil", 1, 0), new ItemMaterialInfo(Materials.Steel, 108864000L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Railcraft", "tile.railcraft.anvil", 1, 1), new ItemMaterialInfo(Materials.Steel, 72576000L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Railcraft", "tile.railcraft.anvil", 1, 2), new ItemMaterialInfo(Materials.Steel, 36288000L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ANVIL, 1, 0), new ItemMaterialInfo(Materials.Iron, 108864000L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ANVIL, 1, 1), new ItemMaterialInfo(Materials.Iron, 72576000L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ANVIL, 1, 2), new ItemMaterialInfo(Materials.Iron, 36288000L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.HOPPER, 1, 32767), new ItemMaterialInfo(Materials.Iron, 18144000L, new MaterialStack(Materials.Wood, 29030400L)));
        OreDictUnifier.addItemData(ItemList.Cell_Universal_Fluid.get(1), new ItemMaterialInfo(Materials.Tin, 7257600L, new MaterialStack(Materials.Glass, 1360800L)));
        OreDictUnifier.addItemData(ItemList.Cell_Empty.get(1), new ItemMaterialInfo(Materials.Tin, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.TRIPWIRE_HOOK, 1, 32767), new ItemMaterialInfo(Materials.Iron, OrePrefix.ring.mMaterialAmount * 2L, new MaterialStack(Materials.Wood, 3628800L)));
        OreDictUnifier.addItemData(ItemList.Bottle_Empty.get(1), new ItemMaterialInfo(Materials.Glass, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Items.POTIONITEM, 1, 32767), new ItemMaterialInfo(Materials.Glass, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STAINED_GLASS, 1, 32767), new ItemMaterialInfo(Materials.Glass, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.GLASS, 1, 32767), new ItemMaterialInfo(Materials.Glass, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 32767), new ItemMaterialInfo(Materials.Glass, 1360800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.GLASS_PANE, 1, 32767), new ItemMaterialInfo(Materials.Glass, 1360800L));
        OreDictUnifier.addItemData(new ItemStack(Items.CLOCK, 1, 32767), new ItemMaterialInfo(Materials.Gold, 14515200L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Items.COMPASS, 1, 32767), new ItemMaterialInfo(Materials.Iron, 14515200L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Items.IRON_HORSE_ARMOR, 1, 32767), new ItemMaterialInfo(Materials.Iron, 29030400L, new MaterialStack(Materials.Leather, 21772800L)));
        OreDictUnifier.addItemData(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1, 32767), new ItemMaterialInfo(Materials.Gold, 29030400L, new MaterialStack(Materials.Leather, 21772800L)));
        OreDictUnifier.addItemData(new ItemStack(Items.LEAD, 1, 32767), new ItemMaterialInfo(Materials.Diamond, 29030400L, new MaterialStack(Materials.Leather, 21772800L)));
        OreDictUnifier.addItemData(new ItemStack(Items.LEATHER, 1, 32767), new ItemMaterialInfo(Materials.Leather, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.BEACON, 1, 32767), new ItemMaterialInfo(Materials.NetherStar, 3628800L, new MaterialStack(Materials.Obsidian, 10886400L), new MaterialStack(Materials.Glass, 18144000L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ENCHANTING_TABLE, 1, 32767), new ItemMaterialInfo(Materials.Diamond, 7257600L, new MaterialStack(Materials.Obsidian, 14515200L), new MaterialStack(Materials.Paper, 10886400L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ENDER_CHEST, 1, 32767), new ItemMaterialInfo(Materials.EnderEye, 3628800L, new MaterialStack(Materials.Obsidian, 29030400L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.BOOKSHELF, 1, 32767), new ItemMaterialInfo(Materials.Paper, 32659200L, new MaterialStack(Materials.Wood, 21772800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.LEVER, 1, 32767), new ItemMaterialInfo(Materials.Stone, 3628800L, new MaterialStack(Materials.Wood, 1814400L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.ICE, 1, 32767), new ItemMaterialInfo(Materials.Ice, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.PACKED_ICE, 1, 32767), new ItemMaterialInfo(Materials.Ice, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.SNOW, 1, 32767), new ItemMaterialInfo(Materials.Snow, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Items.SNOWBALL, 1, 32767), new ItemMaterialInfo(Materials.Snow, 907200L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.SNOW_LAYER, 1, 32767), new ItemMaterialInfo(Materials.Snow, -1));
        OreDictUnifier.addItemData(new ItemStack(Blocks.SAND, 1, 32767), new ItemMaterialInfo(Materials.Sand, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.SANDSTONE, 1, 32767), new ItemMaterialInfo(Materials.Sand, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 0), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 8), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 0), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 8), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 1), new ItemMaterialInfo(Materials.Sand, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 9), new ItemMaterialInfo(Materials.Sand, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 1), new ItemMaterialInfo(Materials.Sand, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 9), new ItemMaterialInfo(Materials.Sand, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 2), new ItemMaterialInfo(Materials.Wood, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 10), new ItemMaterialInfo(Materials.Wood, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 2), new ItemMaterialInfo(Materials.Wood, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 10), new ItemMaterialInfo(Materials.Wood, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 3), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 11), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 3), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 11), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 5), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_SLAB, 1, 13), new ItemMaterialInfo(Materials.Stone, 1814400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 5), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DOUBLE_STONE_SLAB, 1, 13), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.FURNACE, 1, 32767), new ItemMaterialInfo(Materials.Stone, 29030400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.LIT_FURNACE, 1, 32767), new ItemMaterialInfo(Materials.Stone, 29030400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONEBRICK, 1, 32767), new ItemMaterialInfo(Materials.Stone, 3628800L));

        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 0), new ItemMaterialInfo(Materials.Stone, 3628800L));
        //added automatically in Loader_OreDictionary
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 1), new ItemMaterialInfo(Materials.GraniteBlack, 3628800L));
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 2), new ItemMaterialInfo(Materials.GraniteBlack, 3628800L));
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 5), new ItemMaterialInfo(Materials.Diorite, 3628800L));
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 6), new ItemMaterialInfo(Materials.Diorite, 3628800L));
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 3), new ItemMaterialInfo(Materials.Andesite, 3628800L));
        //OreDictUnifier.addItemData(new ItemStack(Blocks.STONE, 1, 4), new ItemMaterialInfo(Materials.Andesite, 3628800L));

        OreDictUnifier.addItemData(new ItemStack(Blocks.COBBLESTONE, 1, 32767), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 32767), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_BUTTON, 1, 32767), new ItemMaterialInfo(Materials.Stone, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STONE_PRESSURE_PLATE, 1, 32767), new ItemMaterialInfo(Materials.Stone, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.LADDER, 1, 32767), new ItemMaterialInfo(Materials.Wood, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.WOODEN_BUTTON, 1, 32767), new ItemMaterialInfo(Materials.Wood, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 1, 32767), new ItemMaterialInfo(Materials.Wood, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.OAK_FENCE, 1, 32767), new ItemMaterialInfo(Materials.Wood, 5443200L));
        OreDictUnifier.addItemData(new ItemStack(Items.BOWL, 1, 32767), new ItemMaterialInfo(Materials.Wood, 3628800L));
        OreDictUnifier.addItemData(new ItemStack(Items.SIGN, 1, 32767), new ItemMaterialInfo(Materials.Wood, 7257600L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.CHEST, 1, 32767), new ItemMaterialInfo(Materials.Wood, 29030400L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.TRAPPED_CHEST, 1, 32767), new ItemMaterialInfo(Materials.Wood, 32659200L, new MaterialStack(Materials.Iron, OrePrefix.ring.mMaterialAmount * 2L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.REDSTONE_TORCH, 1, 32767), new ItemMaterialInfo(Materials.Wood, 1814400L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.UNLIT_REDSTONE_TORCH, 1, 32767), new ItemMaterialInfo(Materials.Wood, 1814400L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.NOTEBLOCK, 1, 32767), new ItemMaterialInfo(Materials.Wood, 29030400L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.JUKEBOX, 1, 32767), new ItemMaterialInfo(Materials.Wood, 29030400L, new MaterialStack(Materials.Diamond, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.CRAFTING_TABLE, 1, 32767), new ItemMaterialInfo(Materials.Wood, 14515200L));
        OreDictUnifier.addItemData(new ItemStack(Blocks.PISTON, 1, 32767), new ItemMaterialInfo(Materials.Stone, 14515200L, new MaterialStack(Materials.Wood, 10886400L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.STICKY_PISTON, 1, 32767), new ItemMaterialInfo(Materials.Stone, 14515200L, new MaterialStack(Materials.Wood, 10886400L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DISPENSER, 1, 32767), new ItemMaterialInfo(Materials.Stone, 25401600L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(new ItemStack(Blocks.DROPPER, 1, 32767), new ItemMaterialInfo(Materials.Stone, 25401600L, new MaterialStack(Materials.Redstone, 3628800L)));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Thaumcraft", "ItemNuggetChicken", 1, 32767), new ItemMaterialInfo(Materials.MeatCooked, 403200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Thaumcraft", "ItemNuggetBeef", 1, 32767), new ItemMaterialInfo(Materials.MeatCooked, 403200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Thaumcraft", "ItemNuggetPork", 1, 32767), new ItemMaterialInfo(Materials.MeatCooked, 403200L));
        OreDictUnifier.addItemData(GT_ModHandler.getModItem("Thaumcraft", "ItemNuggetFish", 1, 32767), new ItemMaterialInfo(Materials.MeatCooked, 403200L));
        for (ItemStack tItem : new ItemStack[]{
                GT_ModHandler.getModItem("TwilightForest", "item.meefRaw", 1, 0),
                GT_ModHandler.getModItem("TwilightForest", "item.venisonRaw", 1, 0),
                new ItemStack(Items.PORKCHOP),
                new ItemStack(Items.BEEF),
                new ItemStack(Items.CHICKEN),
                new ItemStack(Items.FISH)}) {
            if (tItem != null) {
                OreDictUnifier.addItemData(GTUtility.copyMetaData(OreDictionary.WILDCARD_VALUE, tItem),
                        new ItemMaterialInfo(Materials.MeatRaw, 3628800L,
                                new MaterialStack(Materials.Bone, 403200L)));
            }
        }
        for (ItemStack tItem : new ItemStack[]{
                GT_ModHandler.getModItem("TwilightForest", "item.meefSteak", 1, 0),
                GT_ModHandler.getModItem("TwilightForest", "item.venisonCooked", 1, 0),
                new ItemStack(Items.COOKED_PORKCHOP),
                new ItemStack(Items.COOKED_BEEF),
                new ItemStack(Items.COOKED_CHICKEN),
                new ItemStack(Items.COOKED_FISH)}) {
            if (tItem != null) {
                OreDictUnifier.addItemData(
                        GTUtility.copyMetaData(OreDictionary.WILDCARD_VALUE, tItem),
                        new ItemMaterialInfo(Materials.MeatCooked, 3628800L, new MaterialStack(Materials.Bone, 403200L)));
            }
        }
    }
}