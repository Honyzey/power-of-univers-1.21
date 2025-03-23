package honyzey.powerofunivers.registry;

import honyzey.powerofunivers.PowerOfUnivers;
import honyzey.powerofunivers.block.ores.OreBlocks;
import honyzey.powerofunivers.block.regular.RegularBlocks;
import honyzey.powerofunivers.item.ModItemGroups;
import honyzey.powerofunivers.item.materials.MaterialItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModRegistry {

    // Méthodes centralisées pour l'enregistrement
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PowerOfUnivers.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PowerOfUnivers.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PowerOfUnivers.MOD_ID, name), item);
    }

    // Méthode qui initialise tout
    public static void registerAll() {
        PowerOfUnivers.LOGGER.info("Initializing registrations for " + PowerOfUnivers.MOD_ID);

        // Initialiser les items et blocs
        ModItemGroups.registerItemGroups();
        RegularBlocks.init();
        OreBlocks.init();
        MaterialItems.init();

        // Enregistrer les groupes d'items
        setupItemGroups();
    }

    private static void setupItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(RegularBlocks.TEST_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(OreBlocks.ORE_OF_UNIVERS);
            entries.add(OreBlocks.DEEPSLATE_ORE_OF_UNIVERS);
            entries.add(OreBlocks.NETHER_ORE_OF_UNIVERS);
            entries.add(OreBlocks.END_ORE_OF_UNIVERS);
        });

        // Autres groupes d'items...
    }
}