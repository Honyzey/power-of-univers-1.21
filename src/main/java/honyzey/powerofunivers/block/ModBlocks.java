package honyzey.powerofunivers.block;

import honyzey.powerofunivers.PowerOfUnivers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block", new Block(AbstractBlock.Settings
            .create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    ));



    public static final Block ORE_OF_UNIVERS = registerBlock("ore_of_univers", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings
            .create()
            .strength(3f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            )
    );

    public static final Block DEEPSLATE_ORE_OF_UNIVERS = registerBlock("deepslate_ore_of_univers", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings
            .create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.DEEPSLATE)
    ));

    public static final Block NETHER_ORE_OF_UNIVERS = registerBlock("nether_ore_of_univers", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings
            .create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.NETHER_ORE)
    ));

    public static final Block END_ORE_OF_UNIVERS = registerBlock("end_ore_of_univers", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings
            .create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PowerOfUnivers.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PowerOfUnivers.MOD_ID, name), new BlockItem(block, new Item.Settings()
        ));
    }

    public static void registerModBlocks() {
        PowerOfUnivers.LOGGER.info("Registering Mod Blocks for " + PowerOfUnivers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register( fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.TEST_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.ORE_OF_UNIVERS);
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_ORE_OF_UNIVERS);
            fabricItemGroupEntries.add(ModBlocks.NETHER_ORE_OF_UNIVERS);
            fabricItemGroupEntries.add(ModBlocks.END_ORE_OF_UNIVERS);
        });
    }
}
