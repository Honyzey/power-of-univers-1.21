package honyzey.powerofunivers.block.ores;

import honyzey.powerofunivers.registry.ModRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class OreBlocks {

    public static Block ORE_OF_UNIVERS;
    public static Block DEEPSLATE_ORE_OF_UNIVERS;
    public static Block NETHER_ORE_OF_UNIVERS;
    public static Block END_ORE_OF_UNIVERS;

    public static void init() {
        ORE_OF_UNIVERS = ModRegistry.registerBlock("ore_of_univers",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                        AbstractBlock.Settings.create()
                                .strength(3f)
                                .requiresTool()
                                .sounds(BlockSoundGroup.STONE)
                )
        );

        DEEPSLATE_ORE_OF_UNIVERS = ModRegistry.registerBlock("deepslate_ore_of_univers",
                new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                        AbstractBlock.Settings.create()
                                .strength(4f)
                                .requiresTool()
                                .sounds(BlockSoundGroup.DEEPSLATE)
                )
        );

        NETHER_ORE_OF_UNIVERS = ModRegistry.registerBlock("nether_ore_of_univers",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                        AbstractBlock.Settings.create()
                                .strength(4f)
                                .requiresTool()
                                .sounds(BlockSoundGroup.NETHER_ORE)
                )
        );

        END_ORE_OF_UNIVERS = ModRegistry.registerBlock("end_ore_of_univers",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                        AbstractBlock.Settings.create()
                                .strength(5f)
                                .requiresTool()
                                .sounds(BlockSoundGroup.STONE)
                )
        );
    }
}