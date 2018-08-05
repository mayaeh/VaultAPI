/* This file is part of Vault.

    Vault is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Vault is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with Vault.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.milkbowl.vault.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {

    private static final List<ItemInfo> items = new CopyOnWriteArrayList<ItemInfo>();

    /**
     * Returns the list of ItemInfo's registered in Vault as an UnmodifiableList.
     * @return list of Items
     */
    public static List<ItemInfo> getItemList() {
        return Collections.unmodifiableList(items);
    }

    static {
        //1.9 Blocks & Items
        items.add(new ItemInfo("End Rod", new String[][]{{"end", "rod"}}, Material.END_ROD));
        items.add(new ItemInfo("Chorus Plant", new String[][]{{"chor", "plan"}}, Material.CHORUS_PLANT));
        items.add(new ItemInfo("Chorus Flower", new String[][]{{"chor", "flow"}}, Material.CHORUS_FLOWER));
        items.add(new ItemInfo("Purpur Block", new String[][]{{"purp", "bloc"}}, Material.PURPUR_BLOCK));
        items.add(new ItemInfo("Purpur Slab", new String[][]{{"purp", "slab"}, {"qua", "step"}}, Material.PURPUR_SLAB));
        items.add(new ItemInfo("Purpur Double Slab", new String[][]{{"purp", "dou", "sla"}, {"qua", "dou", "step"}}, Material.LEGACY_PURPUR_DOUBLE_SLAB));
        items.add(new ItemInfo("Purpur Stairs", new String[][]{{"purp", "stair"}}, Material.PURPUR_STAIRS));
        items.add(new ItemInfo("Purpur Pillar", new String[][]{{"purp", "pill"}}, Material.PURPUR_PILLAR));        
        items.add(new ItemInfo("End Brick", new String[][]{{"end", "bri"}}, Material.END_STONE_BRICKS));
        items.add(new ItemInfo("Beetroot Block", new String[][]{{"beet", "bloc"}}, Material.LEGACY_BEETROOT_BLOCK));
        items.add(new ItemInfo("Repeating Command Block", new String[][]{{"rep", "comm"}}, Material.REPEATING_COMMAND_BLOCK));
        items.add(new ItemInfo("Chain Command Block", new String[][]{{"chai", "comm"}}, Material.CHAIN_COMMAND_BLOCK));
        items.add(new ItemInfo("End Crystal", new String[][]{{"end", "crys"}}, Material.END_CRYSTAL));
        items.add(new ItemInfo("Chorus Fruit", new String[][]{{"chor", "fruit"}}, Material.CHORUS_FRUIT));
        items.add(new ItemInfo("Popped Chorus Fruit", new String[][]{{"pop", "chor", "fruit"}}, Material.POPPED_CHORUS_FRUIT));
        items.add(new ItemInfo("Beetroot", new String[][]{{"beet", "root"}}, Material.BEETROOT));
        items.add(new ItemInfo("Beetroot Seeds", new String[][]{{"beet", "root", "seed"}}, Material.BEETROOT_SEEDS));
        items.add(new ItemInfo("Beetroot Soup", new String[][]{{"beet", "root", "soup"}, {"soup","beet"}}, Material.BEETROOT_SOUP));
        items.add(new ItemInfo("Dragons Breath", new String[][]{{"drag", "brea"}}, Material.DRAGON_BREATH));
        items.add(new ItemInfo("Beetroot Block", new String[][]{{"beet", "bloc"}}, Material.LEGACY_BEETROOT_BLOCK));
        items.add(new ItemInfo("Elytra", new String[][]{{"elyt"}}, Material.ELYTRA));
        items.add(new ItemInfo("Shield", new String[][]{{"shie"}}, Material.SHIELD));
        items.add(new ItemInfo("Spruce Boat", new String[][]{{"spru", "boa"}}, Material.SPRUCE_BOAT));
        items.add(new ItemInfo("Jungle Boat", new String[][]{{"jung", "boa"}}, Material.JUNGLE_BOAT));
        items.add(new ItemInfo("Acacia Boat", new String[][]{{"acac", "boa"}}, Material.ACACIA_BOAT));
        items.add(new ItemInfo("Dark Oak Boat", new String[][]{{"dark", "oak", "boa"}}, Material.DARK_OAK_BOAT));
        items.add(new ItemInfo("Birch Boat", new String[][]{{"birc", "boa"}}, Material.BIRCH_BOAT));
        items.add(new ItemInfo("Oak Boat", new String[][]{{"oak", "boat"}, {"boat"}}, Material.OAK_BOAT)); //Original boat is now called an Oak Boat, mat name hasnt changed.
        items.add(new ItemInfo("Spectral Arrow", new String[][] {{"spec", "arrow"}}, Material.SPECTRAL_ARROW));
        items.add(new ItemInfo("Tipped Arrow", new String[][] {{"tipp", "arrow"}}, Material.TIPPED_ARROW));
        items.add(new ItemInfo("Splash Potion", new String[][] {{"spla", "poti"}}, Material.SPLASH_POTION));
        items.add(new ItemInfo("Lingering Potion", new String[][] {{"linger", "poti"}}, Material.LINGERING_POTION));
        /* 1.9 possibly inncorrect or depreciated items for potions dont use short data values any more for potion types....
           Need to look into this see if there is issues here down the road....... */
        items.add(new ItemInfo("Splash Mundane Potion", new String[][] {{"poti", "mund", "spl"}}, Material.POTION, (short) 16384));
        items.add(new ItemInfo("Splash Potion of Regeneration", new String[][] {{"poti", "rege", "spl"}}, Material.POTION, (short) 16385));
        items.add(new ItemInfo("Splash Potion of Regeneration (Extended)", new String[][] {{"poti", "rege", "spl", "ext"}}, Material.POTION, (short) 16449));
        items.add(new ItemInfo("Splash Potion of Regeneration II", new String[][] {{"poti", "rege", "spl", "2"}, {"poti", "rege", "spl", "ii"}}, Material.POTION, (short) 16417));
        items.add(new ItemInfo("Splash Potion of Swiftness", new String[][] {{"poti", "swif", "spl"}, {"poti", "speed", "spl"}}, Material.POTION, (short) 16386));
        items.add(new ItemInfo("Splash Potion of Swiftness (Extended)", new String[][] {{"poti", "swif", "spl", "ext"}, {"poti", "speed", "spl", "ext"}}, Material.POTION, (short) 16450));
        items.add(new ItemInfo("Splash Potion of Swiftness II", new String[][] {{"poti", "swif", "spl", "2"}, {"poti", "swif", "spl", "ii"}, {"poti", "speed", "spl", "2"}, {"poti", "speed", "spl", "ii"}}, Material.POTION, (short) 16418));
        items.add(new ItemInfo("Splash Potion of Fire Resistance", new String[][] {{"poti", "fire", "spl"}}, Material.POTION, (short) 16387));
        items.add(new ItemInfo("Splash Potion of Fire Resistance (Extended)", new String[][] {{"poti", "fire", "spl", "ext"}}, Material.POTION, (short) 16451));
        items.add(new ItemInfo("Splash Potion of Fire Resistance (Reverted)", new String[][] {{"poti", "fire", "spl", "rev"}}, Material.POTION, (short) 16419));
        items.add(new ItemInfo("Splash Potion of Healing", new String[][] {{"poti", "heal", "spl"}}, Material.POTION, (short) 16389));
        items.add(new ItemInfo("Splash Potion of Healing (Reverted)", new String[][] {{"poti", "heal", "spl", "rev"}}, Material.POTION, (short) 16453));
        items.add(new ItemInfo("Splash Potion of Healing II", new String[][] {{"poti", "heal", "spl", "2"}, {"poti", "heal", "spl", "ii"}}, Material.POTION, (short) 16421));
        items.add(new ItemInfo("Splash Potion of Strength", new String[][] {{"poti", "str", "spl"}}, Material.POTION, (short) 16393));
        items.add(new ItemInfo("Splash Potion of Strength (Extended)", new String[][] {{"poti", "str", "spl", "ext"}}, Material.POTION, (short) 16457));
        items.add(new ItemInfo("Splash Potion of Strength II", new String[][] {{"poti", "str", "spl", "2"}, {"poti", "str", "spl", "ii"}}, Material.POTION, (short) 16425));
        items.add(new ItemInfo("Splash Potion of Poison", new String[][] {{"poti", "pois", "spl"}}, Material.POTION, (short) 16388));
        items.add(new ItemInfo("Splash Potion of Poison (Extended)", new String[][] {{"poti", "pois", "spl", "ext"}}, Material.POTION, (short) 16452));
        items.add(new ItemInfo("Splash Potion of Poison II", new String[][] {{"poti", "pois", "spl", "2"}, {"poti", "pois", "spl", "ii"}}, Material.POTION, (short) 16420));
        items.add(new ItemInfo("Splash Potion of Weakness", new String[][] {{"poti", "weak", "spl"}}, Material.POTION, (short) 16392));
        items.add(new ItemInfo("Splash Potion of Weakness (Extended)", new String[][] {{"poti", "weak", "spl", "ext"}}, Material.POTION, (short) 16456));
        items.add(new ItemInfo("Splash Potion of Weakness (Reverted)", new String[][] {{"poti", "weak", "spl", "rev"}}, Material.POTION, (short) 16424));
        items.add(new ItemInfo("Splash Potion of Slowness", new String[][] {{"poti", "slow", "spl"}}, Material.POTION, (short) 16394));
        items.add(new ItemInfo("Splash Potion of Slowness (Extended)", new String[][] {{"poti", "slow", "spl", "ext"}}, Material.POTION, (short) 16458));
        items.add(new ItemInfo("Splash Potion of Slowness (Reverted)", new String[][] {{"poti", "slow", "spl", "rev"}}, Material.POTION, (short) 16426));
        items.add(new ItemInfo("Splash Potion of Harming", new String[][] {{"poti", "harm", "spl"}}, Material.POTION, (short) 16396));
        items.add(new ItemInfo("Splash Potion of Harming (Reverted)", new String[][] {{"poti", "harm", "spl", "rev"}}, Material.POTION, (short) 16460));
        items.add(new ItemInfo("Splash Potion of Harming II", new String[][] {{"poti", "harm", "spl", "2"}, {"poti", "harm", "spl", "ii"}}, Material.POTION, (short) 16428));
        //
        items.add(new ItemInfo("Air", new String[][]{{"air"}}, Material.AIR));
        items.add(new ItemInfo("Stone", new String[][]{{"ston"}, {"smoo", "sto"}}, Material.STONE));
        items.add(new ItemInfo("Grass", new String[][]{{"gras"}}, Material.GRASS));
        items.add(new ItemInfo("Dirt", new String[][]{{"dirt"}}, Material.DIRT));
        items.add(new ItemInfo("Cobblestone", new String[][]{{"cobb", "sto"}, {"cobb"}}, Material.COBBLESTONE));
        items.add(new ItemInfo("Oak Plank", new String[][]{{"wood"}, {"oak", "plank"}, {"oak", "wood"}}, Material.OAK_PLANKS));
        items.add(new ItemInfo("Spruce Plank", new String[][]{{"spru", "plank"}, {"spruc", "wood"}}, Material.SPRUCE_PLANKS));
        items.add(new ItemInfo("Birch Plank", new String[][]{{"birch", "plank"}, {"birch", "wood"}}, Material.BIRCH_PLANKS));
        items.add(new ItemInfo("Jungle Plank", new String[][]{{"jung", "plank"}, {"jung", "wood"}}, Material.JUNGLE_PLANKS));
        items.add(new ItemInfo("Oak Sapling", new String[][]{{"sapl"}, {"sapl", "oak"}}, Material.OAK_SAPLING));
        items.add(new ItemInfo("Spruce Sapling", new String[][]{{"sapl", "spruc"}}, Material.SPRUCE_SAPLING));
        items.add(new ItemInfo("Birch Sapling", new String[][]{{"sapl", "birch"}}, Material.BIRCH_SAPLING));
        items.add(new ItemInfo("Jungle Sapling", new String[][]{{"sapl", "jungle"}}, Material.JUNGLE_SAPLING));
        items.add(new ItemInfo("Bedrock", new String[][]{{"rock"}}, Material.BEDROCK));
        items.add(new ItemInfo("Water", new String[][]{{"water"}}, Material.WATER));
        items.add(new ItemInfo("Lava", new String[][]{{"lava"}}, Material.LAVA));
        items.add(new ItemInfo("Sand", new String[][]{{"sand"}}, Material.SAND));
        items.add(new ItemInfo("Gold Ore", new String[][]{{"ore", "gold"}}, Material.GOLD_ORE));
        items.add(new ItemInfo("Iron Ore", new String[][]{{"ore", "iron"}}, Material.IRON_ORE));
        items.add(new ItemInfo("Coal Ore", new String[][]{{"ore", "coal"}}, Material.COAL_ORE));
        items.add(new ItemInfo("Gravel", new String[][]{{"grav"}}, Material.GRAVEL));
        items.add(new ItemInfo("Oak Log", new String[][]{{"oak"}, {"log"}, {"oak", "log"}}, Material.OAK_LOG));
        items.add(new ItemInfo("Spruce Log", new String[][]{{"spruc"}, {"spruc", "log"}}, Material.SPRUCE_LOG));
        items.add(new ItemInfo("Birch Log", new String[][]{{"birch"}, {"birch", "log"}}, Material.BIRCH_LOG));
        items.add(new ItemInfo("Jungle Log", new String[][]{{"jung", "log"}}, Material.JUNGLE_LOG));
        items.add(new ItemInfo("Leaves Block", new String[][]{{"blo", "leaf"}, {"blo", "leaves"}}, Material.OAK_LEAVES));
        items.add(new ItemInfo("Spruce Leaves Block", new String[][]{{"blo", "lea", "spruc"}}, Material.SPRUCE_LEAVES));
        items.add(new ItemInfo("Birch Leaves Block", new String[][]{{"blo", "lea", "birch"}}, Material.BIRCH_LEAVES));
        items.add(new ItemInfo("Jungle Leaves Block", new String[][]{{"blo", "lea", "jung"}}, Material.JUNGLE_LEAVES));
        items.add(new ItemInfo("Leaves", new String[][]{{"leaf"}, {"leaves"}}, Material.OAK_LEAVES));
        items.add(new ItemInfo("Spruce Leaves", new String[][]{{"lea", "spruce"}}, Material.SPRUCE_LEAVES));
        items.add(new ItemInfo("Birch Leaves", new String[][]{{"lea", "birch"}}, Material.BIRCH_LEAVES));
        items.add(new ItemInfo("Jungle Leaves", new String[][]{{"lea", "jung"}}, Material.JUNGLE_LEAVES));
        items.add(new ItemInfo("Sponge", new String[][]{{"sponge"}}, Material.SPONGE));
        items.add(new ItemInfo("Glass", new String[][]{{"glas"}, {"sili"}}, Material.GLASS));
        items.add(new ItemInfo("Lapis Lazuli Ore", new String[][]{{"lap", "laz", "ore"}, {"lazul", "ore"}, {"ore", "lapiz"}}, Material.LAPIS_ORE));
        items.add(new ItemInfo("Lapis Lazuli Block", new String[][]{{"lap", "laz", "bloc"}, {"lazu", "bloc"}, {"blo", "lapi"}}, Material.LAPIS_BLOCK));
        items.add(new ItemInfo("Dispenser", new String[][]{{"dispen"}}, Material.DISPENSER));
        items.add(new ItemInfo("Sandstone", new String[][]{{"sand", "st"}}, Material.SANDSTONE));
        items.add(new ItemInfo("Chiseled Sandstone", new String[][]{{"chis", "sand", "sto"}}, Material.SANDSTONE, (short) 1));
        items.add(new ItemInfo("Smooth Sandstone", new String[][]{{"smoo", "sand", "sto"}}, Material.SANDSTONE, (short) 2));
        items.add(new ItemInfo("Note Block", new String[][]{{"note"}}, Material.NOTE_BLOCK));
        items.add(new ItemInfo("Bed Block", new String[][]{{"block", "bed"}}, Material.RED_BED));
        items.add(new ItemInfo("Powered Rail", new String[][]{{"rail", "pow"}, {"trac", "pow"}, {"boost"}}, Material.POWERED_RAIL));
        items.add(new ItemInfo("Detector Rail", new String[][]{{"rail", "det"}, {"trac", "det"}, {"detec"}}, Material.DETECTOR_RAIL));
        items.add(new ItemInfo("Sticky Piston", new String[][]{{"stic", "pis"}}, Material.STICKY_PISTON));
        items.add(new ItemInfo("Web", new String[][]{{"web"}, {"cobw"}}, Material.COBWEB));
        items.add(new ItemInfo("Dead Shrub", new String[][]{{"dead", "shru"}, {"dese", "shru"}, {"shrub"}}, Material.DEAD_BUSH));
        items.add(new ItemInfo("Tall Grass", new String[][]{{"tall", "gras"}, {"long", "gras"}}, Material.GRASS));
        items.add(new ItemInfo("Fern", new String[][]{{"fern"}}, Material.FERN));
        items.add(new ItemInfo("Piston", new String[][]{{"pisto"}}, Material.PISTON));
        items.add(new ItemInfo("White Wool", new String[][]{{"wool", "whit"}, {"wool"}}, Material.WHITE_WOOL));
        items.add(new ItemInfo("Orange Wool", new String[][]{{"wool", "ora"}}, Material.ORANGE_WOOL));
        items.add(new ItemInfo("Magenta Wool", new String[][]{{"wool", "mag"}}, Material.MAGENTA_WOOL));
        items.add(new ItemInfo("Light Blue Wool", new String[][]{{"wool", "lig", "blue"}}, Material.LIGHT_BLUE_WOOL));
        items.add(new ItemInfo("Yellow Wool", new String[][]{{"wool", "yell"}}, Material.YELLOW_WOOL));
        items.add(new ItemInfo("Light Green Wool", new String[][]{{"wool", "lig", "gree"}, {"wool", "gree"}}, Material.LIME_WOOL));
        items.add(new ItemInfo("Pink Wool", new String[][]{{"wool", "pink"}}, Material.PINK_WOOL));
        items.add(new ItemInfo("Gray Wool", new String[][]{{"wool", "gray"}, {"wool", "grey"}}, Material.GRAY_WOOL));
        items.add(new ItemInfo("Light Gray Wool", new String[][]{{"lig", "wool", "gra"}, {"lig", "wool", "gre"}}, Material.LIGHT_GRAY_WOOL));
        items.add(new ItemInfo("Cyan Wool", new String[][]{{"wool", "cya"}}, Material.CYAN_WOOL));
        items.add(new ItemInfo("Purple Wool", new String[][]{{"wool", "pur"}}, Material.PURPLE_WOOL));
        items.add(new ItemInfo("Blue Wool", new String[][]{{"wool", "blue"}}, Material.BLUE_WOOL));
        items.add(new ItemInfo("Brown Wool", new String[][]{{"wool", "brow"}}, Material.BROWN_WOOL));
        items.add(new ItemInfo("Dark Green Wool", new String[][]{{"wool", "dar", "gree"}, {"wool", "gree"}}, Material.GREEN_WOOL));
        items.add(new ItemInfo("Red Wool", new String[][]{{"wool", "red"}}, Material.RED_WOOL));
        items.add(new ItemInfo("Black Wool", new String[][]{{"wool", "bla"}}, Material.BLACK_WOOL));
        items.add(new ItemInfo("Dandelion", new String[][]{{"flow", "yell"}, {"dande"}}, Material.DANDELION));
        items.add(new ItemInfo("Brown Mushroom", new String[][]{{"mush", "bro"}}, Material.BROWN_MUSHROOM));
        items.add(new ItemInfo("Red Mushroom", new String[][]{{"mush", "red"}}, Material.RED_MUSHROOM));
        items.add(new ItemInfo("Gold Block", new String[][]{{"gold", "bl"}}, Material.GOLD_BLOCK));
        items.add(new ItemInfo("Iron Block", new String[][]{{"iron", "bl"}}, Material.IRON_BLOCK));
        /* 
         * No longer obtainable in inventory in 1.8
         * items.add(new ItemInfo("Double Stone Slab", new String[][]{{"doub", "slab"}, {"doub", "slab", "sto"}, {"doub", "step", "sto"}}, Material.DOUBLE_STEP));
         * items.add(new ItemInfo("Double Sandstone Slab", new String[][]{{"doub", "slab", "sand", "sto"}, {"doub", "step", "sand", "sto"}}, Material.DOUBLE_STEP, (short) 1));
         * items.add(new ItemInfo("Double Wooden Slab", new String[][]{{"doub", "slab", "wood"}, {"doub", "step", "wood"}}, Material.DOUBLE_STEP, (short) 2));
         * items.add(new ItemInfo("Double Cobblestone Slab", new String[][]{{"doub", "slab", "cob", "sto"}, {"doub", "slab", "cob"}, {"doub", "step", "cob"}}, Material.DOUBLE_STEP, (short) 3));
         * items.add(new ItemInfo("Double Brick Slab", new String[][]{{"doub", "slab", "bri"}}, Material.DOUBLE_STEP, (short) 4));
         * items.add(new ItemInfo("Double Stone Brick Slab", new String[][]{{"doub", "slab", "smoo"}, {"doub", "slab", "sto", "bri"}}, Material.DOUBLE_STEP, (short) 5));
         * items.add(new ItemInfo("Double Smooth Sandstone Slab", new String[][]{{"doub", "slab", "sand", "smoo"}}, Material.DOUBLE_STEP, (short) 9));
        **/
        items.add(new ItemInfo("Stone Slab", new String[][]{{"slab", "sto"}, {"slab"}, {"step", "ston"}}, Material.STONE_SLAB));
        items.add(new ItemInfo("Sandstone Slab", new String[][]{{"slab", "sand", "sto"}, {"step", "sand", "sto"}}, Material.SANDSTONE_SLAB));
        items.add(new ItemInfo("Wooden Slab", new String[][]{{"slab", "woo"}, {"step", "woo"}}, Material.OAK_SLAB)); // require other wood type's line, too
        items.add(new ItemInfo("Cobblestone Slab", new String[][]{{"slab", "cob", "sto"}, {"slab", "cob"}}, Material.COBBLESTONE_SLAB));
        items.add(new ItemInfo("Brick Slab", new String[][]{{"slab", "bri"}}, Material.BRICK_SLAB));
        items.add(new ItemInfo("Stone Brick Slab", new String[][]{{"slab", "sto", "bri"}}, Material.STONE_BRICK_SLAB));
        items.add(new ItemInfo("Brick", new String[][]{{"bric"}}, Material.BRICK));
        items.add(new ItemInfo("TNT", new String[][]{{"tnt"}, {"boom"}}, Material.TNT));
        items.add(new ItemInfo("Bookshelf", new String[][]{{"bookshe"}, {"book", "she"}}, Material.BOOKSHELF));
        items.add(new ItemInfo("Moss Stone", new String[][]{{"moss", "sto"}, {"moss"}}, Material.MOSSY_COBBLESTONE));
        items.add(new ItemInfo("Obsidian", new String[][]{{"obsi"}}, Material.OBSIDIAN));
        items.add(new ItemInfo("Torch", new String[][]{{"torc"}}, Material.TORCH));
        items.add(new ItemInfo("Fire", new String[][]{{"fire"}}, Material.FIRE));
        items.add(new ItemInfo("Monster Spawner", new String[][]{{"spawn"}}, Material.SPAWNER));
        items.add(new ItemInfo("Oak Wood Stairs", new String[][]{{"stair", "wood"}, {"oak", "stair"}}, Material.OAK_STAIRS));
        items.add(new ItemInfo("Jungle Wood Stairs", new String[][]{{"jungle", "stair"}, {"jung", "stair", "woo"}}, Material.JUNGLE_STAIRS));
        items.add(new ItemInfo("Spruce Wood Stairs", new String[][]{{"spruce", "stai"}, {"spru", "stair", "woo"}}, Material.SPRUCE_STAIRS));
        items.add(new ItemInfo("Birch Wood Stairs", new String[][]{{"birch", "stair"}, {"birc", "stai", "woo"}}, Material.BIRCH_STAIRS));
        items.add(new ItemInfo("Chest", new String[][]{{"chest"}}, Material.CHEST));
        items.add(new ItemInfo("Diamond Ore", new String[][]{{"ore", "diam"}}, Material.DIAMOND_ORE));
        items.add(new ItemInfo("Diamond Block", new String[][]{{"diam", "bl"}}, Material.DIAMOND_BLOCK));
        items.add(new ItemInfo("Crafting Table", new String[][]{{"benc"}, {"squa"}, {"craft"}}, Material.CRAFTING_TABLE));
        items.add(new ItemInfo("Farmland", new String[][]{{"soil"}, {"farm"}}, Material.FARMLAND));
        items.add(new ItemInfo("Furnace", new String[][]{{"furna"}, {"cooke"}}, Material.FURNACE));
        items.add(new ItemInfo("Ladder", new String[][]{{"ladd"}}, Material.LADDER));
        items.add(new ItemInfo("Rails", new String[][]{{"rail"}, {"trac"}}, Material.RAIL));  // require other type's line, too
        items.add(new ItemInfo("Cobblestone Stairs", new String[][]{{"stair", "cob", "sto"}, {"stair", "cob"}}, Material.COBBLESTONE_STAIRS));
        items.add(new ItemInfo("Lever", new String[][]{{"lever"}, {"switc"}}, Material.LEVER));
        items.add(new ItemInfo("Stone Pressure Plate", new String[][]{{"pres", "plat", "ston"}}, Material.STONE_PRESSURE_PLATE));
        items.add(new ItemInfo("Wooden Pressure Plate", new String[][]{{"pres", "plat", "wood"}}, Material.OAK_PRESSURE_PLATE)); // require other wood type's line, too
        items.add(new ItemInfo("Redstone Ore", new String[][]{{"redst", "ore"}}, Material.REDSTONE_ORE));
        items.add(new ItemInfo("Redstone Torch", new String[][]{{"torc", "red"}, {"torc", "rs"}}, Material.REDSTONE_TORCH));
        items.add(new ItemInfo("Stone Button", new String[][]{{"stone", "button"}, {"button"}}, Material.STONE_BUTTON));
        items.add(new ItemInfo("Snow", new String[][]{{"tile", "snow"}, {"snow", "slab"}, {"snow"}}, Material.SNOW));
        items.add(new ItemInfo("Ice", new String[][]{{"ice"}}, Material.ICE));
        items.add(new ItemInfo("Snow Block", new String[][]{{"blo", "snow"}}, Material.SNOW_BLOCK));
        items.add(new ItemInfo("Cactus", new String[][]{{"cact"}}, Material.CACTUS));
        items.add(new ItemInfo("Clay Block", new String[][]{{"clay", "blo"}}, Material.CLAY));
        items.add(new ItemInfo("Jukebox", new String[][]{{"jukeb"}}, Material.JUKEBOX));
        items.add(new ItemInfo("Oak Fence", new String[][]{{"oak", "fence"}, {"fence"}}, Material.OAK_FENCE));
        items.add(new ItemInfo("Pumpkin", new String[][]{{"pump"}}, Material.PUMPKIN));
        items.add(new ItemInfo("Netherrack", new String[][]{{"netherr"}, {"netherst"}, {"hellst"}}, Material.NETHERRACK));
        items.add(new ItemInfo("Soul Sand", new String[][]{{"soul", "sand"}, {"soul"}, {"slowsa"}, {"nether", "mud"}, {"slow", "sand"}, {"quick", "sand"}, {"mud"}}, Material.SOUL_SAND));
        items.add(new ItemInfo("Glowstone", new String[][]{{"glow", "stone"}, {"light", "stone"}}, Material.GLOWSTONE));
        items.add(new ItemInfo("Portal", new String[][]{{"port"}}, Material.NETHER_PORTAL));
        items.add(new ItemInfo("Jack-O-Lantern", new String[][]{{"jack"}, {"lante"}}, Material.JACK_O_LANTERN));
        items.add(new ItemInfo("Wooden Trapdoor", new String[][]{{"trap", "doo"}, {"woo", "hatc"}, {"woo", "trap", "door"}}, Material.OAK_TRAPDOOR)); // require other wood type's line, too
        items.add(new ItemInfo("Stone Monster Egg", new String[][]{{"mons","egg"},{"sto","mons", "egg"}, {"hid", "silver"}}, Material.INFESTED_STONE));
        items.add(new ItemInfo("Stone Brick Monster Egg", new String[][]{{"sto", "bri", "mons", "egg"}, {"hid", "silver","sto","bri"}}, Material.INFESTED_STONE_BRICKS));
        items.add(new ItemInfo("Mossy Stone Brick Monster Egg", new String[][]{{"moss", "sto", "bri", "mons", "egg"}, {"hid", "silver","mos","sto","bri"}}, Material.INFESTED_MOSSY_STONE_BRICKS));
        items.add(new ItemInfo("Huge Brown Mushroom", new String[][]{{"bro", "huge", "mush"}}, Material.LEGACY_HUGE_MUSHROOM_1));
        items.add(new ItemInfo("Huge Red Mushroom", new String[][]{{"red", "huge", "mush"}}, Material.LEGACY_HUGE_MUSHROOM_2));
        items.add(new ItemInfo("Stone Brick", new String[][]{{"sto", "bric"}, {"smoo", "bric"}}, Material.STONE_BRICKS, (short) 0));
        items.add(new ItemInfo("Iron Fence", new String[][]{{"bars", "iron"}, {"fence", "iron"}}, Material.IRON_BARS));
        items.add(new ItemInfo("Glass Pane", new String[][]{{"thin", "gla"}, {"pane"}, {"gla", "pane"}}, Material.GLASS_PANE));
        items.add(new ItemInfo("Melon Block", new String[][]{{"melon"}}, Material.MELON));
        items.add(new ItemInfo("Mossy Stone Brick", new String[][]{{"moss", "sto", "bri"}, {"moss", "smoo", "bri"}, {"moss", "smoo"}, {"moss", "sto"}}, Material.MOSSY_STONE_BRICKS));
        items.add(new ItemInfo("Cracked Stone Brick", new String[][]{{"cra", "sto", "bri"}, {"cra", "sto"}, {"cra", "smoo", "bri"}, {"cra", "smoo"}}, Material.CRACKED_STONE_BRICKS));
        items.add(new ItemInfo("Chiseled Stone Brick", new String[][]{{"chis", "sto", "bri"}, {"chis", "sto"}, {"chis", "smoo", "bri"}}, Material.CHISELED_STONE_BRICKS));
        items.add(new ItemInfo("Brick Stairs", new String[][]{{"stair", "bri"}}, Material.BRICK_STAIRS));
        items.add(new ItemInfo("Fence Gate", new String[][]{{"gate", "fen"}, {"gate"}}, Material.OAK_FENCE_GATE)); // require other wood type's line, too
        items.add(new ItemInfo("Vines", new String[][]{{"vine"}, {"ivy"}}, Material.VINE));
        items.add(new ItemInfo("Stone Brick Stairs", new String[][]{{"stair", "sto", "bri"}, {"stair", "sto"}, {"stair", "smoo", "bri"}, {"stair", "smoo"}}, Material.STONE_BRICK_STAIRS));
        items.add(new ItemInfo("Iron Shovel", new String[][]{{"shov", "ir"}, {"spad", "ir"}}, Material.IRON_SHOVEL));
        items.add(new ItemInfo("Iron Pickaxe", new String[][]{{"pick", "ir"}}, Material.IRON_PICKAXE));
        items.add(new ItemInfo("Iron Axe", new String[][]{{"axe", "ir"}}, Material.IRON_AXE));
        items.add(new ItemInfo("Flint and Steel", new String[][]{{"steel"}, {"lighter"}, {"flin", "ste"}}, Material.FLINT_AND_STEEL));
        items.add(new ItemInfo("Apple", new String[][]{{"appl"}}, Material.APPLE));
        items.add(new ItemInfo("Bow", new String[][]{{"bow"}}, Material.BOW));
        items.add(new ItemInfo("Arrow", new String[][]{{"arro"}}, Material.ARROW));
        items.add(new ItemInfo("Coal", new String[][]{{"coal"}}, Material.COAL));
        items.add(new ItemInfo("Charcoal", new String[][]{{"char", "coal"}, {"char"}}, Material.COAL, (short) 1));
        items.add(new ItemInfo("Diamond", new String[][]{{"diamo"}}, Material.DIAMOND));
        items.add(new ItemInfo("Iron Ingot", new String[][]{{"ingo", "ir"}, {"iron"}}, Material.IRON_INGOT));
        items.add(new ItemInfo("Gold Ingot", new String[][]{{"ingo", "go"}, {"gold"}}, Material.GOLD_INGOT));
        items.add(new ItemInfo("Iron Sword", new String[][]{{"swor", "ir"}}, Material.IRON_SWORD));
        items.add(new ItemInfo("Wooden Sword", new String[][]{{"swor", "woo"}}, Material.WOODEN_SWORD));
        items.add(new ItemInfo("Wooden Shovel", new String[][]{{"shov", "wo"}, {"spad", "wo"}}, Material.WOODEN_SHOVEL));
        items.add(new ItemInfo("Wooden Pickaxe", new String[][]{{"pick", "woo"}}, Material.WOODEN_PICKAXE));
        items.add(new ItemInfo("Wooden Axe", new String[][]{{"axe", "woo"}}, Material.WOODEN_AXE));
        items.add(new ItemInfo("Stone Sword", new String[][]{{"swor", "sto"}}, Material.STONE_SWORD));
        items.add(new ItemInfo("Stone Shovel", new String[][]{{"shov", "sto"}, {"spad", "sto"}}, Material.STONE_SHOVEL));
        items.add(new ItemInfo("Stone Pickaxe", new String[][]{{"pick", "sto"}}, Material.STONE_PICKAXE));
        items.add(new ItemInfo("Stone Axe", new String[][]{{"axe", "sto"}}, Material.STONE_AXE));
        items.add(new ItemInfo("Diamond Sword", new String[][]{{"swor", "dia"}}, Material.DIAMOND_SWORD));
        items.add(new ItemInfo("Diamond Shovel", new String[][]{{"shov", "dia"}, {"spad", "dia"}}, Material.DIAMOND_SHOVEL));
        items.add(new ItemInfo("Diamond Pickaxe", new String[][]{{"pick", "dia"}}, Material.DIAMOND_PICKAXE));
        items.add(new ItemInfo("Diamond Axe", new String[][]{{"axe", "dia"}}, Material.DIAMOND_AXE));
        items.add(new ItemInfo("Stick", new String[][]{{"stic"}}, Material.STICK));
        items.add(new ItemInfo("Bowl", new String[][]{{"bo", "wl"}}, Material.BOWL));
        items.add(new ItemInfo("Mushroom Soup", new String[][]{{"soup"}}, Material.MUSHROOM_STEW));
        items.add(new ItemInfo("Gold Sword", new String[][]{{"swor", "gol"}}, Material.GOLDEN_SWORD));
        items.add(new ItemInfo("Gold Shovel", new String[][]{{"shov", "gol"}, {"spad", "gol"}}, Material.GOLDEN_SHOVEL));
        items.add(new ItemInfo("Gold Pickaxe", new String[][]{{"pick", "gol"}}, Material.GOLDEN_PICKAXE));
        items.add(new ItemInfo("Gold Axe", new String[][]{{"axe", "gol"}}, Material.GOLDEN_AXE));
        items.add(new ItemInfo("String", new String[][]{{"stri"}}, Material.STRING));
        items.add(new ItemInfo("Feather", new String[][]{{"feat"}}, Material.FEATHER));
        items.add(new ItemInfo("Gunpowder", new String[][]{{"gun"}, {"sulph"}}, Material.GUNPOWDER));
        items.add(new ItemInfo("Wooden Hoe", new String[][]{{"hoe", "wo"}}, Material.WOODEN_HOE));
        items.add(new ItemInfo("Stone Hoe", new String[][]{{"hoe", "sto"}}, Material.STONE_HOE));
        items.add(new ItemInfo("Iron Hoe", new String[][]{{"hoe", "iro"}}, Material.IRON_HOE));
        items.add(new ItemInfo("Diamond Hoe", new String[][]{{"hoe", "dia"}}, Material.DIAMOND_HOE));
        items.add(new ItemInfo("Gold Hoe", new String[][]{{"hoe", "go"}}, Material.GOLDEN_HOE));
        items.add(new ItemInfo("Seeds", new String[][]{{"seed"}}, Material.WHEAT_SEEDS)); // require other wood type's line, too
        items.add(new ItemInfo("Wheat", new String[][]{{"whea"}}, Material.WHEAT));
        items.add(new ItemInfo("Bread", new String[][]{{"brea"}}, Material.BREAD));
        items.add(new ItemInfo("Leather Cap", new String[][]{{"cap", "lea"}, {"hat", "lea"}, {"helm", "lea"}}, Material.LEATHER_HELMET));
        items.add(new ItemInfo("Leather Tunic", new String[][]{{"tun", "lea"}, {"ches", "lea"}}, Material.LEATHER_CHESTPLATE));
        items.add(new ItemInfo("Leather Pants", new String[][]{{"pan", "lea"}, {"trou", "lea"}, {"leg", "lea"}}, Material.LEATHER_LEGGINGS));
        items.add(new ItemInfo("Leather Boots", new String[][]{{"boo", "lea"}}, Material.LEATHER_BOOTS));
        items.add(new ItemInfo("Chainmail Helmet", new String[][]{{"cap", "cha"}, {"hat", "cha"}, {"helm", "cha"}}, Material.CHAINMAIL_HELMET));
        items.add(new ItemInfo("Chainmail Chestplate", new String[][]{{"tun", "cha"}, {"ches", "cha"}}, Material.CHAINMAIL_CHESTPLATE));
        items.add(new ItemInfo("Chainmail Leggings", new String[][]{{"pan", "cha"}, {"trou", "cha"}, {"leg", "cha"}}, Material.CHAINMAIL_LEGGINGS));
        items.add(new ItemInfo("Chainmail Boots", new String[][]{{"boo", "cha"}}, Material.CHAINMAIL_BOOTS));
        items.add(new ItemInfo("Iron Helmet", new String[][]{{"cap", "ir"}, {"hat", "ir"}, {"helm", "ir"}}, Material.IRON_HELMET));
        items.add(new ItemInfo("Iron Chestplate", new String[][]{{"tun", "ir"}, {"ches", "ir"}}, Material.IRON_CHESTPLATE));
        items.add(new ItemInfo("Iron Leggings", new String[][]{{"pan", "ir"}, {"trou", "ir"}, {"leg", "ir"}}, Material.IRON_LEGGINGS));
        items.add(new ItemInfo("Iron Boots", new String[][]{{"boo", "ir"}}, Material.IRON_BOOTS));
        items.add(new ItemInfo("Diamond Helmet", new String[][]{{"cap", "dia"}, {"hat", "dia"}, {"helm", "dia"}}, Material.DIAMOND_HELMET));
        items.add(new ItemInfo("Diamond Chestplate", new String[][]{{"tun", "dia"}, {"ches", "dia"}}, Material.DIAMOND_CHESTPLATE));
        items.add(new ItemInfo("Diamond Leggings", new String[][]{{"pan", "dia"}, {"trou", "dia"}, {"leg", "dia"}}, Material.DIAMOND_LEGGINGS));
        items.add(new ItemInfo("Diamond Boots", new String[][]{{"boo", "dia"}}, Material.DIAMOND_BOOTS));
        items.add(new ItemInfo("Gold Helmet", new String[][]{{"cap", "go"}, {"hat", "go"}, {"helm", "go"}}, Material.GOLDEN_HELMET));
        items.add(new ItemInfo("Gold Chestplate", new String[][]{{"tun", "go"}, {"ches", "go"}}, Material.GOLDEN_CHESTPLATE));
        items.add(new ItemInfo("Gold Leggings", new String[][]{{"pan", "go"}, {"trou", "go"}, {"leg", "go"}}, Material.GOLDEN_LEGGINGS));
        items.add(new ItemInfo("Gold Boots", new String[][]{{"boo", "go"}}, Material.GOLDEN_BOOTS));
        items.add(new ItemInfo("Flint", new String[][]{{"flin"}}, Material.FLINT));
        items.add(new ItemInfo("Raw Porkchop", new String[][]{{"pork"}, {"ham"}}, Material.PORKCHOP));
        items.add(new ItemInfo("Cooked Porkchop", new String[][]{{"pork", "cook"}, {"baco"}}, Material.COOKED_PORKCHOP));
        items.add(new ItemInfo("Paintings", new String[][]{{"paint"}}, Material.PAINTING));
        items.add(new ItemInfo("Golden Apple", new String[][]{{"appl", "go"}}, Material.GOLDEN_APPLE));
        items.add(new ItemInfo("Enchanted Golden Apple", new String[][]{{"appl", "go", "ench"}}, Material.GOLDEN_APPLE, (short) 1));
        items.add(new ItemInfo("Sign", new String[][]{{"sign"}}, Material.SIGN));
        items.add(new ItemInfo("Wooden Door", new String[][]{{"door", "wood"}, {"door"}}, Material.OAK_DOOR)); // require other wood type's line, too
        items.add(new ItemInfo("Bucket", new String[][]{{"buck"}, {"bukk"}}, Material.BUCKET));
        items.add(new ItemInfo("Water Bucket", new String[][]{{"water", "buck"}}, Material.WATER_BUCKET));
        items.add(new ItemInfo("Lava Bucket", new String[][]{{"lava", "buck"}}, Material.LAVA_BUCKET));
        items.add(new ItemInfo("Minecart", new String[][]{{"cart"}}, Material.MINECART));
        items.add(new ItemInfo("Saddle", new String[][]{{"sad"}, {"pig"}}, Material.SADDLE));
        items.add(new ItemInfo("Iron Door", new String[][]{{"door", "iron"}}, Material.IRON_DOOR));
        items.add(new ItemInfo("Redstone Dust", new String[][]{{"red", "ston", "dust"}, {"dust", "rs"}, {"dust", "red"}, {"reds"}}, Material.REDSTONE));
        items.add(new ItemInfo("Snowball", new String[][]{{"snow", "ball"}}, Material.SNOWBALL));
        items.add(new ItemInfo("Leather", new String[][]{{"lea"}, {"hide"}}, Material.LEATHER));
        items.add(new ItemInfo("Milk Bucket", new String[][]{{"buck", "mil"}, {"milk"}}, Material.MILK_BUCKET));
        items.add(new ItemInfo("Clay Brick", new String[][]{{"bric", "cl"}, {"sin", "bric"}}, Material.BRICK));
        items.add(new ItemInfo("Clay", new String[][]{{"clay"}}, Material.CLAY_BALL));
        items.add(new ItemInfo("Sugar Cane", new String[][]{{"reed"}, {"cane"}}, Material.SUGAR_CANE));
        items.add(new ItemInfo("Paper", new String[][]{{"pape"}}, Material.PAPER));
        items.add(new ItemInfo("Book", new String[][]{{"book"}}, Material.BOOK));
        items.add(new ItemInfo("Slimeball", new String[][]{{"slime"}}, Material.SLIME_BALL));
        items.add(new ItemInfo("Storage Minecart", new String[][]{{"cart", "sto"}, {"cart", "che"}, {"cargo"}}, Material.CHEST_MINECART));
        items.add(new ItemInfo("Powered Minecart", new String[][]{{"cart", "pow"}, {"engine"}}, Material.FURNACE_MINECART));
        items.add(new ItemInfo("Egg", new String[][]{{"egg"}}, Material.EGG));
        items.add(new ItemInfo("Compass", new String[][]{{"comp"}}, Material.COMPASS));
        items.add(new ItemInfo("Fishing Rod", new String[][]{{"rod"}, {"rod", "fish"}, {"pole", "fish"}}, Material.FISHING_ROD));
        items.add(new ItemInfo("Clock", new String[][]{{"cloc"}, {"watc"}}, Material.CLOCK));
        items.add(new ItemInfo("Glowstone Dust", new String[][]{{"glow", "sto", "dus"}, {"glow", "dus"}, {"ligh", "dust"}}, Material.GLOWSTONE_DUST));
        items.add(new ItemInfo("Raw Fish", new String[][]{{"fish"}, {"fish", "raw"}}, Material.COD));
        items.add(new ItemInfo("Cooked Fish", new String[][]{{"fish", "coo"}, {"kipper"}}, Material.COOKED_COD));
        items.add(new ItemInfo("Ink Sac", new String[][]{{"ink"}, {"dye", "bla"}}, Material.INK_SAC));
        items.add(new ItemInfo("Red Dye", new String[][]{{"dye", "red"}, {"pain", "red"}, {"pet", "ros"}, {"pet", "red"}}, Material.ROSE_RED));
        items.add(new ItemInfo("Cactus Green", new String[][]{{"cact", "gree"}, {"dye", "gree"}, {"pain", "gree"}}, Material.CACTUS_GREEN));
        items.add(new ItemInfo("Cocoa Beans", new String[][]{{"bean"}, {"choco"}, {"cocoa"}, {"dye", "bro"}, {"pain", "bro"}}, Material.COCOA_BEANS));
        items.add(new ItemInfo("Lapis Lazuli", new String[][]{{"lapi", "lazu"}, {"dye", "lapi"}, {"dye", "blu"}, {"pain", "blu"}}, Material.LAPIS_LAZULI));
        items.add(new ItemInfo("Purple Dye", new String[][]{{"dye", "pur"}, {"pain", "pur"}}, Material.PURPLE_DYE));
        items.add(new ItemInfo("Cyan Dye", new String[][]{{"dye", "cya"}, {"pain", "cya"}}, Material.CYAN_DYE));
        items.add(new ItemInfo("Light Gray Dye", new String[][]{{"dye", "lig", "gra"}, {"dye", "lig", "grey"}, {"pain", "lig", "grey"}, {"pain", "lig", "grey"}}, Material.LIGHT_GRAY_DYE));
        items.add(new ItemInfo("Gray Dye", new String[][]{{"dye", "gra"}, {"dye", "grey"}, {"pain", "grey"}, {"pain", "grey"}}, Material.GRAY_DYE));
        items.add(new ItemInfo("Pink Dye", new String[][]{{"dye", "pin"}, {"pain", "pin"}}, Material.PINK_DYE));
        items.add(new ItemInfo("Lime Dye", new String[][]{{"dye", "lim"}, {"pain", "lim"}, {"dye", "lig", "gree"}, {"pain", "lig", "gree"}}, Material.LIME_DYE));
        items.add(new ItemInfo("Dandelion Yellow", new String[][]{{"dye", "yel"}, {"yel", "dan"}, {"pet", "dan"}, {"pet", "yel"}}, Material.DANDELION_YELLOW));
        items.add(new ItemInfo("Light Blue Dye", new String[][]{{"dye", "lig", "blu"}, {"pain", "lig", "blu"}}, Material.LIGHT_BLUE_DYE));
        items.add(new ItemInfo("Magenta Dye", new String[][]{{"dye", "mag"}, {"pain", "mag"}}, Material.MAGENTA_DYE));
        items.add(new ItemInfo("Orange Dye", new String[][]{{"dye", "ora"}, {"pain", "ora"}}, Material.ORANGE_DYE));
        items.add(new ItemInfo("Bone Meal", new String[][]{{"bonem"}, {"bone", "me"}, {"dye", "whi"}, {"pain", "whi"}}, Material.BONE_MEAL));
        items.add(new ItemInfo("Bone", new String[][]{{"bone"}, {"femur"}}, Material.BONE));
        items.add(new ItemInfo("Sugar", new String[][]{{"suga"}}, Material.SUGAR));
        items.add(new ItemInfo("Cake", new String[][]{{"cake"}}, Material.CAKE));
        items.add(new ItemInfo("Melon Slice", new String[][]{{"sli", "melo"}}, Material.MELON));
        items.add(new ItemInfo("Pumpkin Seed", new String[][]{{"seed", "pump"}}, Material.PUMPKIN_SEEDS));
        items.add(new ItemInfo("Melon Seed", new String[][]{{"seed", "melo"}}, Material.MELON_SEEDS));
        items.add(new ItemInfo("Raw Beef", new String[][]{{"beef", "raw"}}, Material.BEEF));
        items.add(new ItemInfo("Steak", new String[][]{{"steak"}, {"beef", "coo"}}, Material.COOKED_BEEF));
        items.add(new ItemInfo("Raw Chicken", new String[][]{{"chi", "raw"}}, Material.CHICKEN));
        items.add(new ItemInfo("Cooked Chicken", new String[][]{{"chi", "coo"}}, Material.COOKED_CHICKEN));
        items.add(new ItemInfo("Rotten Flesh", new String[][]{{"flesh"}, {"rott"}}, Material.ROTTEN_FLESH));
        items.add(new ItemInfo("Bed", new String[][]{{"bed"}}, Material.RED_BED));
        items.add(new ItemInfo("Redstone Repeater", new String[][]{{"repe", "reds"}, {"diod"}, {"repeat"}}, Material.REPEATER));
        items.add(new ItemInfo("Cookie", new String[][]{{"cooki"}}, Material.COOKIE));
        items.add(new ItemInfo("Map", new String[][]{{"map"}}, Material.MAP));
        items.add(new ItemInfo("Empty Map", new String[][]{{"empt", "ma"}}, Material.MAP));
        items.add(new ItemInfo("Shears", new String[][]{{"shea"}}, Material.SHEARS));
        items.add(new ItemInfo("Ender Pearl", new String[][]{{"end", "pear"}, {"pearl"}}, Material.ENDER_PEARL));
        items.add(new ItemInfo("Mycelium", new String[][]{{ "myc" }}, Material.MYCELIUM));
        items.add(new ItemInfo("Lily Pad", new String[][]{{"lil", "pad"}, {"lil", "wat"}}, Material.LILY_PAD));
        items.add(new ItemInfo("Cauldron Block", new String[][]{{ "bloc", "cauld"}}, Material.CAULDRON));
        items.add(new ItemInfo("Cauldron", new String[][]{{"cauld"}}, Material.CAULDRON));
        items.add(new ItemInfo("Enchantment Table", new String[][]{{"ench", "tab"}}, Material.ENCHANTING_TABLE));
        items.add(new ItemInfo("Brewing Stand Block", new String[][] {{ "bloc", "brew", "stan" }, {"alch", "bloc"}}, Material.BREWING_STAND));
        items.add(new ItemInfo("Brewing Stand", new String[][] {{"brew", "stan"}, {"alch", "stand"}, {"alch", "tab"}}, Material.BREWING_STAND));
        items.add(new ItemInfo("Nether Brick", new String[][] {{"neth", "bric"}}, Material.NETHER_BRICK));
        items.add(new ItemInfo("Nether Brick Stairs", new String[][] {{"neth", "stair"}, {"neth", "stai", "bric"}}, Material.NETHER_BRICK_STAIRS));
        items.add(new ItemInfo("Nether Brick Fence", new String[][]{{"neth", "fence"}, {"neth", "fence", "bric"}}, Material.NETHER_BRICK_FENCE));
        items.add(new ItemInfo("Netherwarts", new String[][]{{"wart"}, {"neth", "war"}}, Material.NETHER_WART));
        items.add(new ItemInfo("Netherstalk", new String[][]{{"neth", "stalk"}}, Material.NETHER_WART));
        items.add(new ItemInfo("End Portal", new String[][] {{"end", "port"}}, Material.END_PORTAL));
        items.add(new ItemInfo("End Portal Frame", new String[][] {{"fram", "end", "port"}}, Material.END_PORTAL_FRAME));
        items.add(new ItemInfo("End Stone", new String[][] {{"end", "ston"}}, Material.END_STONE));
        items.add(new ItemInfo("Dragon Egg", new String[][] {{"drag", "egg"}}, Material.DRAGON_EGG));
        items.add(new ItemInfo("Blaze Rod", new String[][] {{"rod", "blaz"}}, Material.BLAZE_ROD));
        items.add(new ItemInfo("Ghast Tear", new String[][] {{"ghas", "tear"}}, Material.GHAST_TEAR));
        items.add(new ItemInfo("Gold Nugget", new String[][] {{"nugg", "gold"}}, Material.GOLD_NUGGET));
        items.add(new ItemInfo("Glass Bottle", new String[][] {{"bottl"}, {"glas", "bott"}, {"empt", "bott"}}, Material.GLASS_BOTTLE));
        items.add(new ItemInfo("Potion", new String[][] {{"potio"}}, Material.POTION));
        items.add(new ItemInfo("Water Bottle", new String[][] {{"wat", "bot"}}, Material.POTION, (short) 0));
        items.add(new ItemInfo("Awkward Potion", new String[][] {{"poti", "awk"}}, Material.POTION, (short) 16));
        items.add(new ItemInfo("Thick Potion", new String[][] {{"poti", "thic"}}, Material.POTION, (short) 32));
        items.add(new ItemInfo("Mundane Potion (Extended)", new String[][] {{"poti", "mund", "ext"}}, Material.POTION, (short) 64));
        items.add(new ItemInfo("Mundane Potion", new String[][] {{"poti", "mund"}}, Material.POTION, (short) 8192));
        items.add(new ItemInfo("Potion of Regeneration", new String[][] {{"poti", "rege"}}, Material.POTION, (short) 8193));
        items.add(new ItemInfo("Potion of Regeneration (Extended)", new String[][] {{"poti", "rege", "ext"}}, Material.POTION, (short) 8257));
        items.add(new ItemInfo("Potion of Regeneration II", new String[][] {{"poti", "rege", "2"}, {"poti", "rege", "ii"}}, Material.POTION, (short) 8225));
        items.add(new ItemInfo("Potion of Swiftness", new String[][] {{"poti", "swif"}, {"poti", "speed"}}, Material.POTION, (short) 8194));
        items.add(new ItemInfo("Potion of Swiftness (Extended)", new String[][] {{"poti", "swif", "ext"}, {"poti", "speed", "ext"}}, Material.POTION, (short) 8258));
        items.add(new ItemInfo("Potion of Swiftness II", new String[][] {{"poti", "swif", "2"}, {"poti", "swif", "ii"}, {"poti", "speed", "2"}, {"poti", "speed", "ii"}}, Material.POTION, (short) 8226));
        items.add(new ItemInfo("Potion of Fire Resistance", new String[][] {{"poti", "fire"}}, Material.POTION, (short) 8195));
        items.add(new ItemInfo("Potion of Fire Resistance (Extended)", new String[][] {{"poti", "fire", "ext"}}, Material.POTION, (short) 8259));
        items.add(new ItemInfo("Potion of Fire Resistance (Reverted)", new String[][] {{"poti", "fire", "rev"}}, Material.POTION, (short) 8227));
        items.add(new ItemInfo("Potion of Healing", new String[][] {{"poti", "heal"}}, Material.POTION, (short) 8197));
        items.add(new ItemInfo("Potion of Healing (Reverted)", new String[][] {{"poti", "heal", "rev"}}, Material.POTION, (short) 8261));
        items.add(new ItemInfo("Potion of Healing II", new String[][] {{"poti", "heal", "2"}, {"poti", "heal", "ii"}}, Material.POTION, (short) 8229));
        items.add(new ItemInfo("Potion of Strength", new String[][] {{"poti", "str"}}, Material.POTION, (short) 8201));
        items.add(new ItemInfo("Potion of Strength (Extended)", new String[][] {{"poti", "str", "ext"}}, Material.POTION, (short) 8265));
        items.add(new ItemInfo("Potion of Strength II", new String[][] {{"poti", "str", "2"}, {"poti", "str", "ii"}}, Material.POTION, (short) 8233));
        items.add(new ItemInfo("Potion of Poison", new String[][] {{"poti", "pois"}}, Material.POTION, (short) 8196));
        items.add(new ItemInfo("Potion of Poison (Extended)", new String[][] {{"poti", "pois", "ext"}}, Material.POTION, (short) 8260));
        items.add(new ItemInfo("Potion of Poison II", new String[][] {{"poti", "pois", "2"}, {"poti", "pois", "ii"}}, Material.POTION, (short) 8228));
        items.add(new ItemInfo("Potion of Weakness", new String[][] {{"poti", "weak"}}, Material.POTION, (short) 8200));
        items.add(new ItemInfo("Potion of Weakness (Extended)", new String[][] {{"poti", "weak", "ext"}}, Material.POTION, (short) 8264));
        items.add(new ItemInfo("Potion of Weakness (Reverted)", new String[][] {{"poti", "weak", "rev"}}, Material.POTION, (short) 8232));
        items.add(new ItemInfo("Potion of Slowness", new String[][] {{"poti", "slow"}}, Material.POTION, (short) 8202));
        items.add(new ItemInfo("Potion of Slowness (Extended)", new String[][] {{"poti", "slow", "ext"}}, Material.POTION, (short) 8266));
        items.add(new ItemInfo("Potion of Slowness (Reverted)", new String[][] {{"poti", "slow", "rev"}}, Material.POTION, (short) 8234));
        items.add(new ItemInfo("Potion of Harming", new String[][] {{"poti", "harm"}}, Material.POTION, (short) 8204));
        items.add(new ItemInfo("Potion of Harming (Reverted)", new String[][] {{"poti", "harm", "rev"}}, Material.POTION, (short) 8268));
        items.add(new ItemInfo("Potion of Harming II", new String[][] {{"poti", "harm", "2"}, {"poti", "harm", "ii"}}, Material.POTION, (short) 8236));
        items.add(new ItemInfo("Splash Mundane Potion", new String[][] {{"poti", "mund", "spl"}}, Material.POTION, (short) 16384));
        /* Splash Potions and potions changed majorly 1.9 saving for reference
        items.add(new ItemInfo("Splash Potion of Regeneration", new String[][] {{"poti", "rege", "spl"}}, Material.POTION, (short) 16385));
        items.add(new ItemInfo("Splash Potion of Regeneration (Extended)", new String[][] {{"poti", "rege", "spl", "ext"}}, Material.POTION, (short) 16449));
        items.add(new ItemInfo("Splash Potion of Regeneration II", new String[][] {{"poti", "rege", "spl", "2"}, {"poti", "rege", "spl", "ii"}}, Material.POTION, (short) 16417));
        items.add(new ItemInfo("Splash Potion of Swiftness", new String[][] {{"poti", "swif", "spl"}, {"poti", "speed", "spl"}}, Material.POTION, (short) 16386));
        items.add(new ItemInfo("Splash Potion of Swiftness (Extended)", new String[][] {{"poti", "swif", "spl", "ext"}, {"poti", "speed", "spl", "ext"}}, Material.POTION, (short) 16450));
        items.add(new ItemInfo("Splash Potion of Swiftness II", new String[][] {{"poti", "swif", "spl", "2"}, {"poti", "swif", "spl", "ii"}, {"poti", "speed", "spl", "2"}, {"poti", "speed", "spl", "ii"}}, Material.POTION, (short) 16418));
        items.add(new ItemInfo("Splash Potion of Fire Resistance", new String[][] {{"poti", "fire", "spl"}}, Material.POTION, (short) 16387));
        items.add(new ItemInfo("Splash Potion of Fire Resistance (Extended)", new String[][] {{"poti", "fire", "spl", "ext"}}, Material.POTION, (short) 16451));
        items.add(new ItemInfo("Splash Potion of Fire Resistance (Reverted)", new String[][] {{"poti", "fire", "spl", "rev"}}, Material.POTION, (short) 16419));
        items.add(new ItemInfo("Splash Potion of Healing", new String[][] {{"poti", "heal", "spl"}}, Material.POTION, (short) 16389));
        items.add(new ItemInfo("Splash Potion of Healing (Reverted)", new String[][] {{"poti", "heal", "spl", "rev"}}, Material.POTION, (short) 16453));
        items.add(new ItemInfo("Splash Potion of Healing II", new String[][] {{"poti", "heal", "spl", "2"}, {"poti", "heal", "spl", "ii"}}, Material.POTION, (short) 16421));
        items.add(new ItemInfo("Splash Potion of Strength", new String[][] {{"poti", "str", "spl"}}, Material.POTION, (short) 16393));
        items.add(new ItemInfo("Splash Potion of Strength (Extended)", new String[][] {{"poti", "str", "spl", "ext"}}, Material.POTION, (short) 16457));
        items.add(new ItemInfo("Splash Potion of Strength II", new String[][] {{"poti", "str", "spl", "2"}, {"poti", "str", "spl", "ii"}}, Material.POTION, (short) 16425));
        items.add(new ItemInfo("Splash Potion of Poison", new String[][] {{"poti", "pois", "spl"}}, Material.POTION, (short) 16388));
        items.add(new ItemInfo("Splash Potion of Poison (Extended)", new String[][] {{"poti", "pois", "spl", "ext"}}, Material.POTION, (short) 16452));
        items.add(new ItemInfo("Splash Potion of Poison II", new String[][] {{"poti", "pois", "spl", "2"}, {"poti", "pois", "spl", "ii"}}, Material.POTION, (short) 16420));
        items.add(new ItemInfo("Splash Potion of Weakness", new String[][] {{"poti", "weak", "spl"}}, Material.POTION, (short) 16392));
        items.add(new ItemInfo("Splash Potion of Weakness (Extended)", new String[][] {{"poti", "weak", "spl", "ext"}}, Material.POTION, (short) 16456));
        items.add(new ItemInfo("Splash Potion of Weakness (Reverted)", new String[][] {{"poti", "weak", "spl", "rev"}}, Material.POTION, (short) 16424));
        items.add(new ItemInfo("Splash Potion of Slowness", new String[][] {{"poti", "slow", "spl"}}, Material.POTION, (short) 16394));
        items.add(new ItemInfo("Splash Potion of Slowness (Extended)", new String[][] {{"poti", "slow", "spl", "ext"}}, Material.POTION, (short) 16458));
        items.add(new ItemInfo("Splash Potion of Slowness (Reverted)", new String[][] {{"poti", "slow", "spl", "rev"}}, Material.POTION, (short) 16426));
        items.add(new ItemInfo("Splash Potion of Harming", new String[][] {{"poti", "harm", "spl"}}, Material.POTION, (short) 16396));
        items.add(new ItemInfo("Splash Potion of Harming (Reverted)", new String[][] {{"poti", "harm", "spl", "rev"}}, Material.POTION, (short) 16460));
        items.add(new ItemInfo("Splash Potion of Harming II", new String[][] {{"poti", "harm", "spl", "2"}, {"poti", "harm", "spl", "ii"}}, Material.POTION, (short) 16428)); */
        items.add(new ItemInfo("Spider Eye", new String[][] {{"spid", "eye"}}, Material.SPIDER_EYE));
        items.add(new ItemInfo("Fermented Spider Eye", new String[][] {{"ferm", "spid", "eye"}}, Material.FERMENTED_SPIDER_EYE));
        items.add(new ItemInfo("Blaze Powder", new String[][] {{"powd", "blaz"}}, Material.BLAZE_POWDER));
        items.add(new ItemInfo("Magma Cream", new String[][] {{"crea", "magm"}}, Material.MAGMA_CREAM));
        items.add(new ItemInfo("Eye of Ender", new String[][] {{"end", "ey"}}, Material.ENDER_EYE));
        items.add(new ItemInfo("Glistering Melon", new String[][] {{"melo", "glis"}}, Material.GLISTERING_MELON_SLICE));
        items.add(new ItemInfo("Spawn Egg", new String[][] {{"spaw", "egg"}}, Material.SILVERFISH_SPAWN_EGG));
        items.add(new ItemInfo("Creeper Spawn Egg", new String[][] {{"creep", "egg"}}, Material.CREEPER_SPAWN_EGG));
        items.add(new ItemInfo("Skeleton Spawn Egg", new String[][] {{"skele", "egg"}}, Material.SKELETON_SPAWN_EGG));
        items.add(new ItemInfo("Spider Spawn Egg", new String[][] {{"spider", "egg"}}, Material.SPIDER_SPAWN_EGG));
        items.add(new ItemInfo("Zombie Spawn Egg", new String[][] {{"zombie", "egg"}}, Material.ZOMBIE_SPAWN_EGG));
        items.add(new ItemInfo("Slime Spawn Egg", new String[][] {{"slime", "egg"}}, Material.SLIME_SPAWN_EGG));
        items.add(new ItemInfo("Ghast Spawn Egg", new String[][] {{"ghast", "egg"}}, Material.GHAST_SPAWN_EGG));
        items.add(new ItemInfo("Zombie Pigman Spawn Egg", new String[][] {{"zomb", "pig", "egg"}}, Material.ZOMBIE_PIGMAN_SPAWN_EGG));
        items.add(new ItemInfo("Enderman Spawn Egg", new String[][] {{"end", "man", "egg"}}, Material.ENDERMAN_SPAWN_EGG));
        items.add(new ItemInfo("Cave Spider Spawn Egg", new String[][] {{"cav", "spid", "egg"}}, Material.CAVE_SPIDER_SPAWN_EGG));
        items.add(new ItemInfo("Silverfish Spawn Egg", new String[][] {{"silv", "fish", "egg"}}, Material.SILVERFISH_SPAWN_EGG));
        items.add(new ItemInfo("Blaze Spawn Egg", new String[][] {{"blaze", "egg"}}, Material.BLAZE_SPAWN_EGG));
        items.add(new ItemInfo("Magma Cube Spawn Egg", new String[][] {{"mag", "cub", "egg"}, {"neth", "slim", "egg"}}, Material.MAGMA_CUBE_SPAWN_EGG));
        items.add(new ItemInfo("Pig Spawn Egg", new String[][] {{"pig", "spa", "egg"}, {"pig", "egg"}}, Material.PIG_SPAWN_EGG));
        items.add(new ItemInfo("Sheep Spawn Egg", new String[][] {{"sheep", "egg"}}, Material.SHEEP_SPAWN_EGG));
        items.add(new ItemInfo("Cow Spawn Egg", new String[][] {{"cow", "spa", "egg"}, {"cow", "egg"}}, Material.COW_SPAWN_EGG));
        items.add(new ItemInfo("Chicken Spawn Egg", new String[][] {{"chick", "egg"}}, Material.CHICKEN_SPAWN_EGG));
        items.add(new ItemInfo("Squid Spawn Egg", new String[][] {{"squi", "spa", "egg"},{"squi", "egg"}}, Material.SQUID_SPAWN_EGG));
        items.add(new ItemInfo("Wolf Spawn Egg", new String[][] {{"wolf", "spa", "egg"}, {"wolf", "egg"}}, Material.WOLF_SPAWN_EGG));
        items.add(new ItemInfo("Mooshroom Spawn Egg", new String[][] {{"moo", "room", "egg"}, {"mush", "cow", "egg"}}, Material.MOOSHROOM_SPAWN_EGG));
        items.add(new ItemInfo("Ocelot Spawn Egg", new String[][] {{"ocelo", "egg"}, {"ozelo", "egg"}}, Material.OCELOT_SPAWN_EGG));
        items.add(new ItemInfo("Villager Spawn Egg", new String[][] {{"villa", "egg"}}, Material.VILLAGER_SPAWN_EGG));
        items.add(new ItemInfo("Bottle 'o Enchanting", new String[][] {{"bot", "ench"}, {"bot", "xp"}}, Material.EXPERIENCE_BOTTLE));
        items.add(new ItemInfo("Fire Charge", new String[][] {{"fir", "char"}}, Material.FIRE_CHARGE));
        items.add(new ItemInfo("13 Disc", new String[][]{{"dis", "gol"}, {"rec", "gol"}, {"13", "disc"}, {"13", "reco"}}, Material.MUSIC_DISC_13));
        items.add(new ItemInfo("cat Disc", new String[][]{{"dis", "gre"}, {"rec", "gre"}, {"cat", "disc"}, {"cat", "reco"}}, Material.MUSIC_DISC_CAT));
        items.add(new ItemInfo("blocks Disc", new String[][] {{"block", "disc"}, {"block", "reco"}, {"3", "disc"}, {"3", "reco"}}, Material.MUSIC_DISC_BLOCKS));
        items.add(new ItemInfo("chirp Disc", new String[][] {{"chirp", "disc"}, {"chirp", "reco"}, {"4", "disc"}, {"4", "reco"}}, Material.MUSIC_DISC_CHIRP));
        items.add(new ItemInfo("far Disc", new String[][] {{"far", "disc"}, {"far", "reco"}, {"5", "disc"}, {"5", "reco"}}, Material.MUSIC_DISC_FAR));
        items.add(new ItemInfo("mall Disc", new String[][] {{"mall", "disc"}, {"mall", "reco"}, {"6", "disc"}, {"6", "reco"}}, Material.MUSIC_DISC_MALL));
        items.add(new ItemInfo("mellohi Disc", new String[][] {{"mello", "disc"}, {"mello", "reco"}, {"7", "disc"}, {"7", "reco"}}, Material.MUSIC_DISC_MELLOHI));
        items.add(new ItemInfo("stahl Disc", new String[][] {{"stahl", "disc"}, {"stahl", "reco"}, {"8", "disc"}, {"8", "reco"}}, Material.MUSIC_DISC_STAL));
        items.add(new ItemInfo("strad Disc", new String[][] {{"strad", "disc"}, {"strad", "reco"}, {"9", "disc"}, {"9", "reco"}}, Material.MUSIC_DISC_STRAD));
        items.add(new ItemInfo("ward Disc", new String[][] {{"ward", "disc"}, {"ward", "reco"}, {"10", "disc"}, {"10", "reco"}}, Material.MUSIC_DISC_WARD));
        items.add(new ItemInfo("11 Disc", new String[][] {{"11", "disc"}, {"11", "reco"}}, Material.MUSIC_DISC_11));
        items.add(new ItemInfo("wait Disc", new String[][] {{"12", "disc"}, {"wait", "disc"}, {"12", "reco"}, {"wait", "reco"}}, Material.MUSIC_DISC_WAIT));
        items.add(new ItemInfo("Redstone Lamp", new String[][] {{"lamp"}, {"lamp", "redst"}}, Material.REDSTONE_LAMP));
        items.add(new ItemInfo("Redstone Torch Off", new String[][] {{"off", "red", "sto", "tor"}}, Material.REDSTONE_TORCH));
        //1.3 Blocks & Items
        items.add(new ItemInfo("Emerald Ore", new String[][]{{"emer", "ore"}}, Material.EMERALD_ORE));
        items.add(new ItemInfo("Emerald", new String[][]{{"emer"}}, Material.EMERALD));
        items.add(new ItemInfo("Emerald Block", new String[][]{{"emer", "blo"}}, Material.EMERALD_BLOCK));
        items.add(new ItemInfo("Ender Chest", new String[][]{{"end", "ches"}}, Material.ENDER_CHEST));
        items.add(new ItemInfo("Tripwire Hook", new String[][]{{"hoo", "trip"}}, Material.TRIPWIRE_HOOK));
        items.add(new ItemInfo("Tripwire", new String[][]{{"trip"}}, Material.TRIPWIRE));
        items.add(new ItemInfo("Sandstone Stair", new String[][]{{"stair", "sand", "sto"}, {"stair", "sand"}}, Material.SANDSTONE_STAIRS));
        /*
         * Double slabs removed from Inventory in 1.8
         * 
         * items.add(new ItemInfo("Double Oak Slab", new String[][]{{"doub", "slab", "oak"}, {"doub", "step", "oak"}}, Material.WOOD_DOUBLE_STEP));
         * items.add(new ItemInfo("Double Spruce Slab", new String[][]{{"doub", "slab", "spru"}, {"doub", "step", "spru"}}, Material.WOOD_DOUBLE_STEP, (short) 1));
         * items.add(new ItemInfo("Double Birch Slab", new String[][]{{"doub", "slab", "birc"}, {"doub", "step", "birc"}}, Material.WOOD_DOUBLE_STEP, (short) 2));
         * items.add(new ItemInfo("Double Jungle Wood Slab", new String[][]{{"doub", "slab", "jungl"}, {"doub", "step", "jung"}}, Material.WOOD_DOUBLE_STEP, (short) 3));
        **/
        items.add(new ItemInfo("Oak Slab", new String[][]{{"slab", "oak"}, {"step", "oak"}}, Material.OAK_SLAB));
        items.add(new ItemInfo("Spruce Slab", new String[][]{{"slab", "spru"}, {"step", "spru"}}, Material.SPRUCE_SLAB));
        items.add(new ItemInfo("Birch Slab", new String[][]{{"slab", "birc"}, {"step", "birc"}}, Material.BIRCH_SLAB));
        items.add(new ItemInfo("Jungle Wood Slab", new String[][]{{"jung", "wood", "sla"}, {"slab", "jung"}, {"step", "jung"}}, Material.JUNGLE_SLAB));
        items.add(new ItemInfo("Book and Quill", new String[][]{{"qui", "book"}}, Material.WRITABLE_BOOK));
        items.add(new ItemInfo("Written Book", new String[][]{{"wri", "book"}}, Material.WRITTEN_BOOK));
        items.add(new ItemInfo("Cocoa Pod", new String[][]{{"coco"}, {"coc", "pod"}}, Material.COCOA));
        //1.4 Blocks & Items
        items.add(new ItemInfo("Command Block", new String[][]{{"comm"}}, Material.COMMAND_BLOCK));
        items.add(new ItemInfo("Beacon Block", new String[][]{{"beac"}}, Material.BEACON));
        items.add(new ItemInfo("Anvil", new String[][]{{"anv"}}, Material.ANVIL));
        items.add(new ItemInfo("Slightly Damaged Anvil", new String[][]{{"dam", "anv"}, {"sli", "anv"}}, Material.CHIPPED_ANVIL));
        items.add(new ItemInfo("Very Damaged Anvil", new String[][]{{"ver", "dam", "anv"}, {"ver", "anv"}}, Material.DAMAGED_ANVIL));
        items.add(new ItemInfo("Flower Pot Block", new String[][]{{"blo", "flow", "pot"}}, Material.FLOWER_POT));
        items.add(new ItemInfo("Flower Pot", new String[][]{{"flow", "pot"}}, Material.FLOWER_POT));
        items.add(new ItemInfo("Cobblestone Wall", new String[][]{{"cobble", "wall"}}, Material.COBBLESTONE_WALL));
        items.add(new ItemInfo("Mossy Cobblestone Wall", new String[][]{{"mos", "cob", "wall"}}, Material.MOSSY_COBBLESTONE_WALL));
        items.add(new ItemInfo("Item Frame", new String[][]{{"fram"}}, Material.ITEM_FRAME));
        items.add(new ItemInfo("Skeleton Skull", new String[][]{{"skel", "skul"}, {"skel", "hea"}}, Material.SKELETON_SKULL));
        items.add(new ItemInfo("Wither Skeleton Skull", new String[][]{{"wither", "skul"}, {"with", "hea"}}, Material.WITHER_SKELETON_SKULL));
        items.add(new ItemInfo("Zombie Head", new String[][]{{"zomb", "hea"}, {"zomb", "skul"}}, Material.ZOMBIE_HEAD));
        items.add(new ItemInfo("Human Head", new String[][]{{"huma", "skul"}, {"huma", "hea"}}, Material.PLAYER_HEAD));
        items.add(new ItemInfo("Creeper Head", new String[][]{{"cree", "skul"}, {"cree", "hea"}}, Material.CREEPER_HEAD));
        items.add(new ItemInfo("Carrot", new String[][]{{"carro"}}, Material.CARROT));
        items.add(new ItemInfo("Golden Carrot", new String[][]{{"carr", "gol"}}, Material.GOLDEN_CARROT));
        items.add(new ItemInfo("Carrot Block", new String[][]{{"blo", "carr"}}, Material.CARROT));
        items.add(new ItemInfo("Carrot on a Stick", new String[][]{{"sti", "carr"}}, Material.CARROT_ON_A_STICK));
        items.add(new ItemInfo("Potato", new String[][]{{"pota"}}, Material.POTATO));
        items.add(new ItemInfo("Potato Block", new String[][]{{"blo", "pota"}}, Material.POTATO));
        items.add(new ItemInfo("Baked Potato", new String[][]{{"pota", "bak"}}, Material.BAKED_POTATO));
        items.add(new ItemInfo("Poisonous Potato", new String[][]{{"pota", "poi"}}, Material.POISONOUS_POTATO));
        items.add(new ItemInfo("Wood Button", new String[][]{{"woo", "butto"}}, Material.OAK_BUTTON));
        items.add(new ItemInfo("Pumpkin Pie", new String[][]{{"pie"}, {"pumpk", "pie"}}, Material.PUMPKIN_PIE));
        items.add(new ItemInfo("Potion of Invisibility", new String[][] {{"poti", "invi"}}, Material.POTION, (short) 8206));
        items.add(new ItemInfo("Potion of Invisibility (Extended)", new String[][] {{"poti", "invi", "ext"}}, Material.POTION, (short) 8270));
        items.add(new ItemInfo("Potion of Night Vision", new String[][] {{"poti", "nigh", "visi"}, {"poti", "visio"}}, Material.POTION, (short) 8198));
        items.add(new ItemInfo("Potion of Night Vision (Extended)", new String[][] {{"poti", "nigh", "visi", "ext"}, {"poti", "visio", "ext"}}, Material.POTION, (short) 8262));
        items.add(new ItemInfo("Enchanted Book", new String[][]{{"ench", "boo"}}, Material.ENCHANTED_BOOK));
        items.add(new ItemInfo("Nether Star", new String[][]{{"star", "neth"}}, Material.NETHER_STAR));
        items.add(new ItemInfo("Firework Star", new String[][]{{"fire", "star"}}, Material.FIREWORK_STAR));
        items.add(new ItemInfo("Firework Rocket", new String[][]{{"rocket"}, {"firework"}}, Material.FIREWORK_ROCKET));
        items.add(new ItemInfo("White Firework Star", new String[][]{{"whi", "fire", "star"}}, Material.FIREWORK_STAR));
        items.add(new ItemInfo("Orange Firework Star", new String[][]{{"ora", "fire", "star"}}, Material.FIREWORK_STAR, (short) 2));
        items.add(new ItemInfo("Magenta Firework Star", new String[][]{{"mag", "fire", "star"}}, Material.FIREWORK_STAR, (short) 3));
        items.add(new ItemInfo("Light Blue Firework Star", new String[][]{{"blu", "lig", "fire", "star"}}, Material.FIREWORK_STAR, (short) 4));
        items.add(new ItemInfo("Yellow Firework Star", new String[][]{{"yell", "fire", "star"}}, Material.FIREWORK_STAR, (short) 5));
        items.add(new ItemInfo("Lime Firework Star", new String[][]{{"lim", "fire", "star"}}, Material.FIREWORK_STAR, (short) 6));
        items.add(new ItemInfo("Pink Firework Star", new String[][]{{"pin", "fire", "star"}}, Material.FIREWORK_STAR, (short) 7));
        items.add(new ItemInfo("Gray Firework Star", new String[][]{{"gra", "fire", "star"}}, Material.FIREWORK_STAR, (short) 8));
        items.add(new ItemInfo("Light Gray Firework Star", new String[][]{{"lig", "gra", "fire", "star"}}, Material.FIREWORK_STAR, (short) 9));
        items.add(new ItemInfo("Cyan Firework Star", new String[][]{{"cya", "fire", "star"}}, Material.FIREWORK_STAR, (short) 10));
        items.add(new ItemInfo("Purple Firework Star", new String[][]{{"pur", "fire", "star"}}, Material.FIREWORK_STAR, (short) 11));
        items.add(new ItemInfo("Blue Firework Star", new String[][]{{"blue", "fire", "star"}}, Material.FIREWORK_STAR, (short) 12));
        items.add(new ItemInfo("Brown Firework Star", new String[][]{{"bro", "fire", "star"}}, Material.FIREWORK_STAR, (short) 13));
        items.add(new ItemInfo("Green Firework Star", new String[][]{{"gre", "fire", "star"}}, Material.FIREWORK_STAR, (short) 14));
        items.add(new ItemInfo("Red Firework Star", new String[][]{{"red", "fire", "star"}}, Material.FIREWORK_STAR, (short) 15));
        items.add(new ItemInfo("Black Firework Star", new String[][]{{"bla", "fire", "star"}}, Material.FIREWORK_STAR, (short) 16));
        items.add(new ItemInfo("Dead Bush", new String[][]{{"dea", "bush"}}, Material.DEAD_BUSH));
        items.add(new ItemInfo("Nether Brick Slab", new String[][]{{"sla", "net", "bri"}, {"step", "net", "bri"}}, Material.NETHER_BRICK_SLAB, (short) 6));
        //1.5 Blocks & Items
        items.add(new ItemInfo("Activator Rail", new String[][]{{"rail", "acti"}, {"trac", "acti"}, {"activ"}}, Material.ACTIVATOR_RAIL));
        items.add(new ItemInfo("Block of Redstone", new String[][]{{"block", "red"}, {"block", "rs"}}, Material.REDSTONE_BLOCK));
        items.add(new ItemInfo("Daylight Sensor", new String[][]{{"day", "sen"}, {"ligh", "sen"}}, Material.DAYLIGHT_DETECTOR));
        items.add(new ItemInfo("Dropper", new String[][]{{"drop"}}, Material.DROPPER));
        items.add(new ItemInfo("Hopper", new String[][]{{"hop", "item"}, {"hop"}}, Material.HOPPER));
        items.add(new ItemInfo("Explosive Minecart", new String[][]{{"cart", "tnt"}, {"cart", "exp"}}, Material.TNT_MINECART));
        items.add(new ItemInfo("Hopper Minecart", new String[][]{{"cart", "hop"}, {"hop"}}, Material.HOPPER_MINECART));
        items.add(new ItemInfo("Redstone Comparator", new String[][]{{"rs", "compara"}, {"red", "comparat"}, {"comparat"}}, Material.COMPARATOR));
        items.add(new ItemInfo("Trapped Chest", new String[][]{{"tra", "ches"}}, Material.TRAPPED_CHEST));
        items.add(new ItemInfo("Nether Brick Item", new String[][]{{"neth", "bric", "it"}}, Material.NETHER_BRICK));
        items.add(new ItemInfo("Nether Quartz", new String[][]{{"neth", "qua"}, {"qua"}}, Material.QUARTZ));
        items.add(new ItemInfo("Nether Quartz Ore", new String[][]{{"neth", "qua", "ore"}, {"qua", "ore"}}, Material.NETHER_QUARTZ_ORE));
        items.add(new ItemInfo("Quartz Block", new String[][]{{"qua", "blo"}}, Material.QUARTZ_BLOCK));
        items.add(new ItemInfo("Quartz Slab", new String[][]{{"qua", "slab"}, {"qua", "step"}}, Material.QUARTZ_SLAB));
        items.add(new ItemInfo("Quartz Double Slab", new String[][]{{"qua", "dou", "sla"}, {"qua", "dou", "step"}}, Material.SMOOTH_QUARTZ));
        items.add(new ItemInfo("Quartz Stairs", new String[][]{{"qua", "stair"}}, Material.QUARTZ_STAIRS));
        items.add(new ItemInfo("Chiseled Quartz", new String[][]{{"qua", "chis"}}, Material.QUARTZ_BLOCK, (short) 1));
        items.add(new ItemInfo("Quartz Pillar", new String[][]{{"qua", "pil"}}, Material.QUARTZ_BLOCK, (short) 2));
        items.add(new ItemInfo("Weighted Gold Plate", new String[][]{{"wei", "plat", "gol"}, {"pres", "plat", "gol"}}, Material.LIGHT_WEIGHTED_PRESSURE_PLATE));
        items.add(new ItemInfo("Weighted Iron Plate", new String[][]{{"wei", "plat", "iro"}, {"pres", "plat", "iro"}}, Material.HEAVY_WEIGHTED_PRESSURE_PLATE));
        //1.6 Blocks and Items
        items.add(new ItemInfo("Horse Spawn Egg", new String[][] {{"horse", "egg"}}, Material.HORSE_SPAWN_EGG));
        items.add(new ItemInfo("Diamond Horse Armor", new String[][] {{"dia", "horse", "arm"}, {"dia", "bard"}}, Material.DIAMOND_HORSE_ARMOR));
        items.add(new ItemInfo("Gold Horse Armor", new String[][] {{"gold", "horse", "arm"}, {"gold", "bard"}}, Material.GOLDEN_HORSE_ARMOR));
        items.add(new ItemInfo("Iron Horse Armor", new String[][] {{"iron", "horse", "arm"}, {"iron", "bard"}}, Material.IRON_HORSE_ARMOR));
        items.add(new ItemInfo("Leash", new String[][] {{"leas"}, {"lead"}}, Material.LEAD));
        items.add(new ItemInfo("Hay Bale", new String[][] {{"hay", "bale"}, {"hay", "block"}}, Material.HAY_BLOCK));
        items.add(new ItemInfo("Name Tag", new String[][] {{"name", "tag"}}, Material.NAME_TAG));
        items.add(new ItemInfo("Hardened Clay", new String[][]{{"hard", "clay"}}, Material.TERRACOTTA));
        items.add(new ItemInfo("Block of Coal", new String[][]{{"coal", "block"}}, Material.COAL_BLOCK));
        items.add(new ItemInfo("White Stained Clay", new String[][]{{"clay", "whit"}, {"stai", "clay"}, {"whi", "stain", "cla"}}, Material.WHITE_TERRACOTTA));
        items.add(new ItemInfo("Orange Stained Clay", new String[][]{{"clay", "ora"}, {"ora", "stain", "cla"}}, Material.ORANGE_TERRACOTTA));
        items.add(new ItemInfo("Magenta Stained Clay", new String[][]{{"clay", "mag"}, {"mag", "stain", "cla"}}, Material.MAGENTA_TERRACOTTA));
        items.add(new ItemInfo("Light Blue Stained Clay", new String[][]{{"clay", "lig", "blue"}, {"lig", "blu", "stain", "cla"}}, Material.LIGHT_BLUE_TERRACOTTA));
        items.add(new ItemInfo("Yellow Stained Clay", new String[][]{{"clay", "yell"}, {"yell", "stain", "cla"}}, Material.YELLOW_TERRACOTTA));
        items.add(new ItemInfo("Lime Stained Clay", new String[][]{{"clay", "lig", "gree"}, {"clay", "lime"}, {"lime", "stain", "cla"}}, Material.LIME_TERRACOTTA));
        items.add(new ItemInfo("Pink Stained Clay", new String[][]{{"clay", "pink"}, {"pink", "stain", "cla"}}, Material.PINK_TERRACOTTA));
        items.add(new ItemInfo("Gray Stained Clay", new String[][]{{"clay", "gray"}, {"clay", "grey"}, {"gra", "stain", "cla"}, {"gre", "stain", "cla"}}, Material.GRAY_TERRACOTTA));
        items.add(new ItemInfo("Light Gray Stained Clay", new String[][]{{"lig", "clay", "gra"}, {"lig", "clay", "gre"}, {"lig", "gra", "stain", "cla"}}, Material.LIGHT_GRAY_TERRACOTTA));
        items.add(new ItemInfo("Cyan Stained Clay", new String[][]{{"clay", "cya"}, {"cya", "stain", "cla"}}, Material.CYAN_TERRACOTTA));
        items.add(new ItemInfo("Purple Stained Clay", new String[][]{{"clay", "pur"}, {"pur", "stain", "cla"}}, Material.PURPLE_TERRACOTTA));
        items.add(new ItemInfo("Blue Stained Clay", new String[][]{{"clay", "blue"}, {"blue", "stain", "cla"}}, Material.BLUE_TERRACOTTA));
        items.add(new ItemInfo("Brown Stained Clay", new String[][]{{"clay", "brown"}, {"brown", "stain", "cla"}}, Material.BROWN_TERRACOTTA));
        items.add(new ItemInfo("Green Stained Clay", new String[][]{{"clay", "gree"}, {"gree", "stain", "cla"}}, Material.GREEN_TERRACOTTA));
        items.add(new ItemInfo("Red Stained Clay", new String[][]{{"clay", "red"}, {"red", "stain", "cla"}}, Material.RED_TERRACOTTA));
        items.add(new ItemInfo("Black Stained Clay", new String[][]{{"clay", "bla"}, {"bla", "stain", "cla"}}, Material.BLACK_TERRACOTTA));
        items.add(new ItemInfo("White Carpet", new String[][]{{"carpet", "whit"}, {"carpet"}}, Material.WHITE_CARPET));
        items.add(new ItemInfo("Orange Carpet", new String[][]{{"carpet", "ora"}}, Material.ORANGE_CARPET));
        items.add(new ItemInfo("Magenta Carpet", new String[][]{{"carpet", "mag"}}, Material.MAGENTA_CARPET));
        items.add(new ItemInfo("Light Blue Carpet", new String[][]{{"carpet", "lig", "blue"}}, Material.LIGHT_BLUE_CARPET));
        items.add(new ItemInfo("Yellow Carpet", new String[][]{{"carpet", "yell"}}, Material.YELLOW_CARPET));
        items.add(new ItemInfo("Light Green Carpet", new String[][]{{"carpet", "lig", "gree"}, {"carpet", "gree"}}, Material.LIME_CARPET));
        items.add(new ItemInfo("Pink Carpet", new String[][]{{"carpet", "pink"}}, Material.PINK_CARPET));
        items.add(new ItemInfo("Gray Carpet", new String[][]{{"carpet", "gray"}, {"carpet", "grey"}}, Material.GRAY_CARPET));
        items.add(new ItemInfo("Light Gray Carpet", new String[][]{{"lig", "carpet", "gra"}, {"lig", "carpet", "gre"}}, Material.LIGHT_GRAY_CARPET));
        items.add(new ItemInfo("Cyan Carpet", new String[][]{{"carpet", "cya"}}, Material.CYAN_CARPET));
        items.add(new ItemInfo("Purple Carpet", new String[][]{{"carpet", "pur"}}, Material.PURPLE_CARPET));
        items.add(new ItemInfo("Blue Carpet", new String[][]{{"carpet", "blue"}}, Material.BLUE_CARPET));
        items.add(new ItemInfo("Brown Carpet", new String[][]{{"carpet", "brow"}}, Material.BROWN_CARPET));
        items.add(new ItemInfo("Dark Green Carpet", new String[][]{{"carpet", "dar", "gree"}, {"carpet", "gree"}}, Material.GREEN_CARPET));
        items.add(new ItemInfo("Red Carpet", new String[][]{{"carpet", "red"}}, Material.RED_CARPET));
        items.add(new ItemInfo("Black Carpet", new String[][]{{"carpet", "bla"}}, Material.BLACK_CARPET));
        //1.7 Blocks and Items
        items.add(new ItemInfo("Packed Ice", new String[][]{{"pack", "ice"}}, Material.PACKED_ICE));
        // renamed from grassless dirt in 1.8 to Coarse Dirt.
        items.add(new ItemInfo("Coarse Dirt", new String[][]{{"coar", "dirt"}, {"less", "dirt"}}, Material.DIRT, (short) 1)); 
        items.add(new ItemInfo("Acacia Log", new String[][]{{"acac"}, {"log", "acac"}}, Material.ACACIA_LOG));
        items.add(new ItemInfo("Dark Oak Log", new String[][]{{"oak", "dar"}, {"log", "oak", "dar"}}, Material.DARK_OAK_LOG));
        items.add(new ItemInfo("Acacia Plank", new String[][]{{"acac", "plank"}, {"acac", "wood"}}, Material.ACACIA_PLANKS));
        items.add(new ItemInfo("Dark Oak Plank", new String[][]{{"dar", "oak", "plank"}, {"dar", "oak", "wood"}}, Material.DARK_OAK_PLANKS));
        items.add(new ItemInfo("Acacia Wood Stairs", new String[][]{{"stair", "wood", "acac"}, {"acac", "stair"}}, Material.ACACIA_STAIRS));
        items.add(new ItemInfo("Dark Oak Wood Stairs", new String[][]{{"stair", "wood", "dar", "oak"}, {"dar", "oak", "stair"}}, Material.DARK_OAK_STAIRS));
        items.add(new ItemInfo("Acacia Sapling", new String[][]{{"sapl", "acac"}}, Material.ACACIA_SAPLING));
        items.add(new ItemInfo("Dark Oak Sapling", new String[][]{{"sapl", "oak", "dar"}}, Material.DARK_OAK_SAPLING));
        items.add(new ItemInfo("Acacia Leaves", new String[][]{{"lea", "acac"}}, Material.ACACIA_LEAVES));
        items.add(new ItemInfo("Dark Oak Leaves", new String[][]{{"lea", "oak", "dar"}}, Material.DARK_OAK_LEAVES));
        items.add(new ItemInfo("Packed Ice", new String[][]{{"ice", "pac"}, {"ice", "opaq"}}, Material.PACKED_ICE));
        items.add(new ItemInfo("Podzol", new String[][]{{"podz"}, {"dirt", "pod"}}, Material.DIRT, (short) 2));
        items.add(new ItemInfo("Red Sand", new String[][]{{"red", "sand"}}, Material.SAND, (short) 1));
        items.add(new ItemInfo("Cobblestone Monster Egg", new String[][]{{"cobb","sto","mons","egg"},{"cobb","mons", "egg"}, {"hid", "silver", "cob"}}, Material.INFESTED_COBBLESTONE));
        items.add(new ItemInfo("Cracked Stone Brick Monster Egg", new String[][]{{"cra","sto","bri","mons", "egg"}, {"hid", "silver","cra","sto","bri"}}, Material.INFESTED_CRACKED_STONE_BRICKS));
        items.add(new ItemInfo("Chiseled Stone Brick Monster Egg", new String[][]{{"chi","stone","bri","mons", "egg"}, {"hid", "silver","chi","sto","bri"}}, Material.INFESTED_CHISELED_STONE_BRICKS));
        items.add(new ItemInfo("White Stained Glass", new String[][]{{"stai", "glas", "whit"}, {"stai", "glas"}}, Material.WHITE_STAINED_GLASS));
        items.add(new ItemInfo("Orange Stained Glass", new String[][]{{"stai", "glas", "ora"}}, Material.ORANGE_STAINED_GLASS));
        items.add(new ItemInfo("Magenta Stained Glass", new String[][]{{"stai", "glas", "mag"}}, Material.MAGENTA_STAINED_GLASS));
        items.add(new ItemInfo("Light Blue Stained Glass", new String[][]{{"stai", "glas", "lig", "blue"}}, Material.LIGHT_BLUE_STAINED_GLASS));
        items.add(new ItemInfo("Yellow Stained Glass", new String[][]{{"stai", "glas", "yell"}}, Material.YELLOW_STAINED_GLASS));
        items.add(new ItemInfo("Light Green Stained Glass", new String[][]{{"stai", "glas", "lig", "gree"}, {"stai", "glas", "gree"}}, Material.LIME_STAINED_GLASS));
        items.add(new ItemInfo("Pink Stained Glass", new String[][]{{"stai", "glas", "pink"}}, Material.PINK_STAINED_GLASS));
        items.add(new ItemInfo("Gray Stained Glass", new String[][]{{"stai", "glas", "gra"}, {"stai", "glas", "gre"}}, Material.GRAY_STAINED_GLASS));
        items.add(new ItemInfo("Light Gray Stained Glass", new String[][]{{"lig", "stai", "glas", "gra"}, {"lig", "stai", "glas", "gre"}}, Material.LIGHT_GRAY_STAINED_GLASS));
        items.add(new ItemInfo("Cyan Stained Glass", new String[][]{{"stai", "glas", "cya"}}, Material.CYAN_STAINED_GLASS));
        items.add(new ItemInfo("Purple Stained Glass", new String[][]{{"stai", "glas", "pur"}}, Material.PURPLE_STAINED_GLASS));
        items.add(new ItemInfo("Blue Stained Glass", new String[][]{{"stai", "glas", "blue"}}, Material.BLUE_STAINED_GLASS));
        items.add(new ItemInfo("Brown Stained Glass", new String[][]{{"stai", "glas", "brow"}}, Material.BROWN_STAINED_GLASS));
        items.add(new ItemInfo("Dark Green Stained Glass", new String[][]{{"stai", "glas", "dar", "gree"}, {"stai", "glas", "gree"}}, Material.GREEN_STAINED_GLASS));
        items.add(new ItemInfo("Red Stained Glass", new String[][]{{"stai", "glas", "red"}}, Material.RED_STAINED_GLASS));
        items.add(new ItemInfo("Black Stained Glass", new String[][]{{"stai", "glas", "bla"}}, Material.BLACK_STAINED_GLASS));
        items.add(new ItemInfo("White Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "whit"}, {"stai", "glas", "pane"}}, Material.WHITE_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Orange Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "ora"}}, Material.ORANGE_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Magenta Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "mag"}}, Material.MAGENTA_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Light Blue Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "lig", "blue"}}, Material.LIGHT_BLUE_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Yellow Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "yell"}}, Material.YELLOW_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Light Green Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "lig", "gree"}, {"stai", "glas", "pane", "gree"}}, Material.LIME_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Pink Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "pink"}}, Material.PINK_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Gray Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "gra"}, {"stai", "glas", "pane", "gre"}}, Material.GRAY_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Light Gray Stained Glass Pane", new String[][]{{"lig", "stai", "glas", "pane", "gra"}, {"lig", "stai", "glas", "pane", "gre"}}, Material.LIGHT_GRAY_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Cyan Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "cya"}}, Material.CYAN_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Purple Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "pur"}}, Material.PURPLE_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Blue Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "blue"}}, Material.BLUE_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Brown Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "brow"}}, Material.BROWN_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Dark Green Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "dar", "gree"}, {"stai", "glas", "pane", "gree"}}, Material.GREEN_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Red Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "red"}}, Material.RED_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Black Stained Glass Pane", new String[][]{{"stai", "glas", "pane", "bla"}}, Material.BLACK_STAINED_GLASS_PANE));
        items.add(new ItemInfo("Poppy", new String[][]{{"flow", "red"}, {"rose"}, {"poppy"}}, Material.POPPY));
        items.add(new ItemInfo("Blue Orchid", new String[][]{{"flow", "blue"}, {"orch", "blue"}}, Material.BLUE_ORCHID));
        items.add(new ItemInfo("Allium", new String[][]{{"flow", "mag"}, {"alli"}}, Material.ALLIUM));
        items.add(new ItemInfo("Azure Bluet", new String[][]{{"flow", "whit"}, {"azu", "blue"}}, Material.AZURE_BLUET));
        items.add(new ItemInfo("Red Tulip", new String[][]{{"tul", "red"}}, Material.RED_TULIP));
        items.add(new ItemInfo("Orange Tulip", new String[][]{{"tul", "ora"}}, Material.ORANGE_TULIP));
        items.add(new ItemInfo("White Tulip", new String[][]{{"tul", "whit"}}, Material.WHITE_TULIP));
        items.add(new ItemInfo("Pink Tulip", new String[][]{{"tul", "pin"}}, Material.PINK_TULIP));
        items.add(new ItemInfo("Oxeye Daisy", new String[][]{{"dais"}, {"oxe", "dais"}}, Material.OXEYE_DAISY));
        items.add(new ItemInfo("Sunflower", new String[][]{{"flow", "sun"}}, Material.SUNFLOWER));
        items.add(new ItemInfo("Lilac", new String[][]{{"flow", "lila"}, {"lila"}}, Material.LILAC));
        items.add(new ItemInfo("Double Tallgrass", new String[][]{{"doub", "tall", "gras"}, {"doub", "long", "gras"}}, Material.TALL_GRASS));
        items.add(new ItemInfo("Large Fern", new String[][]{{"larg", "fern"}, {"doub", "fern"}}, Material.LARGE_FERN));
        items.add(new ItemInfo("Rose Bush", new String[][]{{"bush", "rose"}}, Material.ROSE_BUSH));
        items.add(new ItemInfo("Peony", new String[][]{{"flow", "peon"}, {"peon"}}, Material.PEONY));
        items.add(new ItemInfo("Command Minecart", new String[][]{{"cart", "comm"}}, Material.COMMAND_BLOCK_MINECART));
        items.add(new ItemInfo("Potion of Water Breathing", new String[][] {{"poti", "wate", "breat"}}, Material.POTION, (short) 8205));
        items.add(new ItemInfo("Potion of Water Breathing (Reverted)", new String[][] {{"poti", "wate", "breat", "rev"}}, Material.POTION, (short) 8237));
        items.add(new ItemInfo("Potion of Water Breathing (Extended)", new String[][] {{"poti", "wate", "breat", "ext"}}, Material.POTION, (short) 8269));
        items.add(new ItemInfo("Splash Potion of Water Breathing", new String[][] {{"poti", "wate", "breat", "spl"}}, Material.POTION, (short) 16397));
        items.add(new ItemInfo("Splash Potion of Water Breathing (Reverted)", new String[][] {{"poti", "wate", "breat", "rev", "spl"}}, Material.POTION, (short) 16429));
        items.add(new ItemInfo("Splash Potion of Water Breathing (Extended)", new String[][] {{"poti", "wate", "breat", "ext", "spl"}}, Material.POTION, (short) 16461));
        items.add(new ItemInfo("Raw Salmon", new String[][]{{"salm"}, {"raw", "salm"}}, Material.SALMON));
        items.add(new ItemInfo("Cooked Salmon", new String[][]{{"salm", "cook"}}, Material.COOKED_SALMON));
        items.add(new ItemInfo("Clownfish", new String[][]{{"fish", "clow"}}, Material.TROPICAL_FISH));
        items.add(new ItemInfo("Pufferfish", new String[][]{{"fish", "puff"}, {"fish", "blo"}, {"fish", "glob"}}, Material.PUFFERFISH));
        items.add(new ItemInfo("Acacia Slab", new String[][]{{"slab", "aca"}, {"step", "aca"}}, Material.ACACIA_SLAB));
        items.add(new ItemInfo("Dark Oak Slab", new String[][]{{"slab", "dar", "oak"}, {"step", "dar", "oak"}}, Material.DARK_OAK_SLAB));
        // items added in 1.8
        items.add(new ItemInfo("Granite", new String[][]{{"gran"}}, Material.STONE, (short) 1));
        items.add(new ItemInfo("Polished Granite", new String[][]{{"pol", "gran"}, {"smoo", "gran"}}, Material.STONE, (short) 2));
        items.add(new ItemInfo("Diorite", new String[][]{{"dior"}}, Material.STONE, (short) 3));
        items.add(new ItemInfo("Polished Diorite", new String[][]{{"pol", "dior"}, {"smoo", "dior"}}, Material.STONE, (short) 4));
        items.add(new ItemInfo("Andesite", new String[][]{{"ande"}}, Material.STONE, (short) 5));
        items.add(new ItemInfo("Polished Andesite", new String[][]{{"pol", "ande"}, {"smoo", "ande"}}, Material.STONE, (short) 6));
        items.add(new ItemInfo("Slime Block", new String[][]{{"sli", "blo"}}, Material.SLIME_BLOCK));
        items.add(new ItemInfo("Wet Sponge", new String[][]{{"wet", "spon"}}, Material.SPONGE, (short) 1));
        items.add(new ItemInfo("Barrier", new String[][]{{"barri"}}, Material.BARRIER));
        items.add(new ItemInfo("Iron Trapdoor", new String[][]{{"tra", "doo", "iron"}, {"iron", "hatc"}}, Material.IRON_TRAPDOOR));
        items.add(new ItemInfo("Prismarine", new String[][]{{"pris", "mar"}}, Material.PRISMARINE));
        items.add(new ItemInfo("Prismarine Bricks", new String[][]{{"bri", "pris", "mar"}}, Material.PRISMARINE, (short) 1));
        items.add(new ItemInfo("Dark Prismarine", new String[][]{{"dar", "pris", "mar"}}, Material.PRISMARINE, (short) 2));
        items.add(new ItemInfo("Sea Lantern", new String[][]{{"sea", "lan"}}, Material.SEA_LANTERN));
        items.add(new ItemInfo("Red Sandstone", new String[][]{{"red", "san", "sto"}}, Material.RED_SANDSTONE));
        items.add(new ItemInfo("Chiseled Red Sandstone", new String[][]{{"red", "chi", "san", "sto"}}, Material.RED_SANDSTONE, (short) 1));
        items.add(new ItemInfo("Smooth Red Sandstone", new String[][]{{"red", "smoo", "san", "sto"}}, Material.RED_SANDSTONE, (short) 2));
        items.add(new ItemInfo("Red Sandstone Stairs", new String[][]{{"red", "san", "ston", "stai"}, {"red", "san", "ston", "step"}}, Material.RED_SANDSTONE_STAIRS));
        items.add(new ItemInfo("Red Sandstone Slab", new String[][]{{"red", "san", "ston", "slab"}, {"red", "san", "ston", "step"}}, Material.RED_SANDSTONE_SLAB));
        items.add(new ItemInfo("Spruce Fence Gate", new String[][]{{"gate", "spru", "fence"}}, Material.SPRUCE_FENCE_GATE));
        items.add(new ItemInfo("Birch Fence Gate", new String[][]{{"gate", "birc", "fence"}}, Material.BIRCH_FENCE_GATE));
        items.add(new ItemInfo("Jungle Fence Gate", new String[][]{{"gate", "jung", "fence"}}, Material.JUNGLE_FENCE_GATE));
        items.add(new ItemInfo("Dark Oak Fence Gate", new String[][]{{"gate", "dark", "oak", "fence"}}, Material.DARK_OAK_FENCE_GATE));
        items.add(new ItemInfo("Acacia Fence Gate", new String[][]{{"gate", "acac", "fence"}}, Material.ACACIA_FENCE_GATE));
        items.add(new ItemInfo("Spruce Fence", new String[][]{{"spru", "fence"}}, Material.SPRUCE_FENCE));
        items.add(new ItemInfo("Birch Fence", new String[][]{{"birc", "fence"}}, Material.BIRCH_FENCE));
        items.add(new ItemInfo("Jungle Fence", new String[][]{{"jung", "fence"}}, Material.JUNGLE_FENCE));
        items.add(new ItemInfo("Dark Oak Fence", new String[][]{{"dark", "oak", "fence"}}, Material.DARK_OAK_FENCE));
        items.add(new ItemInfo("Acacia Fence", new String[][]{{"acac", "fence"}}, Material.ACACIA_FENCE));
        items.add(new ItemInfo("Spruce Door", new String[][]{{"spru", "door"}}, Material.SPRUCE_DOOR));
        items.add(new ItemInfo("Birch Door", new String[][]{{"birc", "door"}}, Material.BIRCH_DOOR));
        items.add(new ItemInfo("Jungle Door", new String[][]{{"jung", "door"}}, Material.JUNGLE_DOOR));
        items.add(new ItemInfo("Dark Oak Door", new String[][]{{"dark", "oak", "door"}}, Material.DARK_OAK_DOOR));
        items.add(new ItemInfo("Acacia Door", new String[][]{{"acac", "door"}}, Material.ACACIA_DOOR));
        items.add(new ItemInfo("Prismarine Shard", new String[][]{{"shar", "pris"}} , Material.PRISMARINE_SHARD));
        items.add(new ItemInfo("Prismarine Crystal", new String[][]{{"pris", "crys"}}, Material.PRISMARINE_CRYSTALS));
        items.add(new ItemInfo("Raw Rabbit", new String[][]{{"raw", "rabb"}, {"rabb"}}, Material.RABBIT));
        items.add(new ItemInfo("Cooked Rabbit", new String[][]{{"cook", "rabb"}}, Material.COOKED_RABBIT));
        items.add(new ItemInfo("Rabbit Stew", new String[][]{{"rabb", "stew"}}, Material.RABBIT_STEW));
        items.add(new ItemInfo("Rabbit Foot", new String[][]{{"rabb", "foot"}}, Material.RABBIT_FOOT));
        items.add(new ItemInfo("Rabbit Hide", new String[][]{{"hide", "rab"}}, Material.RABBIT_HIDE));
        items.add(new ItemInfo("Armor Stand", new String[][]{{"armo", "stan"}}, Material.ARMOR_STAND));
        items.add(new ItemInfo("Raw Mutton", new String[][]{{"mutt"}, {"raw", "mutt"}}, Material.MUTTON));
        items.add(new ItemInfo("Cooked Mutton", new String[][]{{"cook", "mutt"}}, Material.COOKED_MUTTON));
        items.add(new ItemInfo("White Banner", new String[][]{{"banner", "whit"}, {"banner"}}, Material.WHITE_BANNER));
        items.add(new ItemInfo("Orange Banner", new String[][]{{"banner", "ora"}}, Material.ORANGE_BANNER));
        items.add(new ItemInfo("Magenta Banner", new String[][]{{"banner", "mag"}}, Material.MAGENTA_BANNER));
        items.add(new ItemInfo("Light Blue Banner", new String[][]{{"banner", "lig", "blue"}}, Material.LIGHT_BLUE_BANNER));
        items.add(new ItemInfo("Yellow Banner", new String[][]{{"banner", "yell"}}, Material.YELLOW_BANNER));
        items.add(new ItemInfo("Lime Banner", new String[][]{{"banner", "lime"}, {"banner", "lime"}}, Material.LIME_BANNER));
        items.add(new ItemInfo("Pink Banner", new String[][]{{"banner", "pink"}}, Material.PINK_BANNER));
        items.add(new ItemInfo("Gray Banner", new String[][]{{"banner", "gray"}, {"banner", "grey"}}, Material.GRAY_BANNER));
        items.add(new ItemInfo("Light Gray Banner", new String[][]{{"lig", "banner", "gra"}, {"lig", "banner", "gre"}}, Material.LIGHT_GRAY_BANNER));
        items.add(new ItemInfo("Cyan Banner", new String[][]{{"banner", "cya"}}, Material.CYAN_BANNER));
        items.add(new ItemInfo("Purple Banner", new String[][]{{"banner", "pur"}}, Material.PURPLE_BANNER));
        items.add(new ItemInfo("Blue Banner", new String[][]{{"banner", "blue"}}, Material.BLUE_BANNER));
        items.add(new ItemInfo("Brown Banner", new String[][]{{"banner", "brow"}}, Material.BROWN_BANNER));
        items.add(new ItemInfo("Green Banner", new String[][]{{"banner", "gree"}, {"banner", "gree"}}, Material.GREEN_BANNER));
        items.add(new ItemInfo("Red Banner", new String[][]{{"banner", "red"}}, Material.RED_BANNER));
        items.add(new ItemInfo("Black Banner", new String[][]{{"banner", "bla"}}, Material.BLACK_BANNER));
        items.add(new ItemInfo("Potion of Leaping", new String[][] {{"poti", "leap"}}, Material.POTION, (short) 8203));
        items.add(new ItemInfo("Potion of Leaping (Extended)", new String[][] {{"poti", "leap", "ext"}}, Material.POTION, (short) 8267));
        items.add(new ItemInfo("Potion of Leaping II", new String[][] {{"poti", "leap", "ii"}, {"poti", "leap", "2"}}, Material.POTION, (short) 8235));
        items.add(new ItemInfo("Splash Potion of Leaping", new String[][] {{"spl", "poti", "leap"}}, Material.POTION, (short) 16395));
        items.add(new ItemInfo("Splash Potion of Leaping (Extended)", new String[][] {{"poti", "leap", "spl", "ext"}}, Material.POTION, (short) 16459));
        items.add(new ItemInfo("Splash Potion of Leaping II", new String[][] {{"poti", "leap", "spl", "2"}, {"poti", "leap", "spl", "ii"}}, Material.POTION, (short) 16427));
        items.add(new ItemInfo("Bat Spawn Egg", new String[][] {{"bat", "spaw", "egg"}}, Material.BAT_SPAWN_EGG));
        items.add(new ItemInfo("Witch Spawn Egg", new String[][] {{"witc", "spaw", "egg"}}, Material.WITCH_SPAWN_EGG));
        items.add(new ItemInfo("Endermite Spawn Egg", new String[][] {{"mite", "end", "spaw", "egg"}}, Material.ENDERMITE_SPAWN_EGG));
        items.add(new ItemInfo("Guardian Spawn Egg", new String[][] {{"guard", "spaw", "egg"}}, Material.GUARDIAN_SPAWN_EGG));
        items.add(new ItemInfo("Rabbit Spawn Egg", new String[][] {{"rabb", "spaw", "egg"}}, Material.RABBIT_SPAWN_EGG));

    }

    @Deprecated
    public static ItemInfo itemById(int typeId) {
        return itemByType(Material.getMaterial(typeId), (short) 0);
    }

    @Deprecated
    public static ItemInfo itemById(int typeId, short subType) {
        return itemByType(Material.getMaterial(typeId), subType);
    }

    /**
     * Searchs for an ItemInfo from the given ItemStack
     * @param itemStack to search on
     * @return ItemInfo found, or null
     */
    public static ItemInfo itemByStack(ItemStack itemStack) {
        if (itemStack == null) {
            return null;
        }

        for (ItemInfo item : items) {
            if (itemStack.getType().equals(item.getType())) {
                if (itemStack.getType().isSolid() && item.getType().isSolid()) {
                    //Solid, so check durability (Podzol, Colored Wool, et al.)
                    if (item.isDurable()) {
                        return item;
                    }
                } else {
                    //Not solid, so ignore durability (Stick, Stone Button, et al.)
                    return item;
                }
            }
        }

        return null;
    }

    public static ItemInfo itemByItem(ItemInfo item) {
        for (ItemInfo i : items) {
            if (item.equals(i)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Gets a relevant ItemInfo by it's Material
     * @param type of Material
     * @return ItemInfo record found or null if none
     */
    public static ItemInfo itemByType(Material type) {
        return itemByType(type, (short) 0);
    }

    /**
     * Searches for an ItemInfo record by Material and SubTypeID
     * @param type of Material
     * @param subType to check for
     * @return ItemInfo record found or null if none
     */
    public static ItemInfo itemByType(Material type, short subType) {
        for (ItemInfo item : items) {
            if (item.getType() == type && item.getSubTypeId() == subType) {
                return item;
            }
        }
        return null;
    }

    /**
     * Search for an item from a given string, useful for user input.  Uses 3 different types of reg-exp searching.
     *  Checks first for an ItemID.
     *  Checks second for ItemID:SubType
     *  Last, it will run a by-name item search assuming the string is the name of an item.
     *   
     * @param string to parse
     * @return ItemInfo found or null
     */
    public static ItemInfo itemByString(String string) {

        // int
        Pattern pattern = Pattern.compile("(?i)^(\\d+)$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            int id = Integer.parseInt(matcher.group(1));
            return itemById(id);
        }

        // int:int
        matcher.reset();
        pattern = Pattern.compile("(?i)^(\\d+):(\\d+)$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            int id = Integer.parseInt(matcher.group(1));
            short type = Short.parseShort(matcher.group(2));
            return itemById(id, type);
        }

        // name
        matcher.reset();
        pattern = Pattern.compile("(?i)^(.*)$");
        matcher = pattern.matcher(string);
        if (matcher.find()) {
            String name = matcher.group(1);
            return itemByName(name);
        }

        return null;
    }

    public static ItemInfo itemByName(ArrayList<String> search) {
        String searchString = join(search, " ");
        return itemByName(searchString);
    }

    public static ItemInfo[] itemByNames(ArrayList<String> search, boolean multi) {
        String searchString = join(search, " ");
        return itemsByName(searchString, multi);
    }

    /**
     * Multi-Item return search for dumping all items with the search string to the player
     *
     *
     * @param searchString to search for
     * @param multi whether to return a list of items or just the first
     * @return Array of items found
     */
    public static ItemInfo[] itemsByName(String searchString, boolean multi) {
        if (multi == false) {
            return new ItemInfo[]{itemByName(searchString)};
        }

        ItemInfo[] itemList = new ItemInfo[]{};

        if (searchString.matches("\\d+:\\d+")) {
            // Match on integer:short to get typeId and subTypeId

            // Retrieve/parse data
            String[] params = searchString.split(":");
            int typeId = Integer.parseInt(params[0]);
            short subTypeId = Short.parseShort(params[1]);

            // Iterate through Items
            for (ItemInfo item : items) {
                // Test for match
                if (item.getId() == typeId && item.getSubTypeId() == subTypeId) {
                    itemList[0] = item;
                    break;
                }
            }
        } else if (searchString.matches("\\d+")) {

            // Retrieve/parse data
            int typeId = Integer.parseInt(searchString);

            // Iterate through Items
            int i = 0;
            for (ItemInfo item : items) {
                // Test for match
                if (item.getId() == typeId) {
                    itemList[i] = item;
                    i++;
                }
            }
        } else {
            // Else this must be a string that we need to identify

            // Iterate through Items
            int i = 0;
            for (ItemInfo item : items) {
                // Look through each possible match criteria
                for (String[] attributes : item.search) {
                    boolean match = false;
                    // Loop through entire criteria strings
                    for (String attribute : attributes) {
                        if (searchString.toLowerCase().contains(attribute)) {
                            match = true;
                            break;
                        }
                    }
                    // THIS was a match
                    if (match) {
                        itemList[i] = item;
                        i++;
                    }
                }
            }
        }

        return itemList;
    }

    /**
     * Single item search function, for when we only ever want to return 1 result
     *
     * @param searchString to search for
     * @return ItemInfo Object
     */
    public static ItemInfo itemByName(String searchString) {
        ItemInfo matchedItem = null;
        int matchedItemStrength = 0;
        int matchedValue = 0;

        if (searchString.matches("\\d+:\\d+")) {
            // Match on integer:short to get typeId and subTypeId

            // Retrieve/parse data
            String[] params = searchString.split(":");
            int typeId = Integer.parseInt(params[0]);
            short subTypeId = Short.parseShort(params[1]);

            // Iterate through Items
            for (ItemInfo item : items) {
                // Test for match
                if (item.getId() == typeId && item.getSubTypeId() == subTypeId) {
                    matchedItem = item;
                    break;
                }
            }
        } else if (searchString.matches("\\d+")) {
            // Match an integer only, assume subTypeId = 0

            // Retrieve/parse data
            int typeId = Integer.parseInt(searchString);
            short subTypeId = 0;

            // Iterate through Items
            for (ItemInfo item : items) {
                // Test for match
                if (item.getId() == typeId && item.getSubTypeId() == subTypeId) {
                    matchedItem = item;
                    break;
                }
            }
        } else if (searchString.matches("\\w+:\\d+")) {
            // Match on string:short to get typeId and subTypeId

            // Retrieve/parse data
            String[] params = searchString.split(":");
            short subTypeId = Short.parseShort(params[1]);
            ItemInfo namedItem = itemByName(params[0]);

            if (namedItem != null) {
                int typeId = namedItem.getId();
                // Iterate through items
                for (ItemInfo item : items) {
                    // Test for match
                    if (item.getId() == typeId && item.getSubTypeId() == subTypeId) {
                        matchedItem = item;
                        break;
                    }
                }
            }
        } else {
            // Else this must be a string that we need to identify

            // Iterate through Items
            for (ItemInfo item : items) {
                // Look through each possible match criteria
                for (String[] attributes : item.search) {
                    int val = 0;
                    boolean match = false;
                    // Loop through entire criteria strings
                    for (String attribute : attributes) {
                        if (searchString.toLowerCase().contains(attribute)) {
                            val += attribute.length();
                            match = true;
                        } else {
                            match = false;
                            break;
                        }
                    }

                    // THIS was a match
                    if (match) {
                        if (matchedItem == null || val > matchedValue || attributes.length > matchedItemStrength) {
                            matchedItem = item;
                            matchedValue = val;
                            matchedItemStrength = attributes.length;
                        }
                    }
                }
            }
        }

        return matchedItem;
    }

    /**
     * Joins elements of a String array with the glue between them into a String.
     * @param array of elements to join together
     * @param glue what to put between each element
     * @return Concacted Array combined with glue
     */
    public static String join(String[] array, String glue) {
        String joined = null;
        for (String element : array) {
            if (joined == null) {
                joined = element;
            } else {
                joined += glue + element;
            }
        }

        if (joined == null) {
            return "";
        } else {
            return joined;
        }
    }

    /**
     * Joins elements of a String array with the glue between them into a String.
     * @param list of items to join together
     * @param glue what to put between each element
     * @return Concacted Array combined with glue
     */
    public static String join(List<String> list, String glue) {
        String joined = null;
        for (String element : list) {
            if (joined == null) {
                joined = element;
            } else {
                joined += glue + element;
            }
        }

        if (joined == null) {
            return "";
        } else {
            return joined;
        }
    }
}
