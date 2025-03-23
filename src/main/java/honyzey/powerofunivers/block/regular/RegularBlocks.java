package honyzey.powerofunivers.block.regular;

import honyzey.powerofunivers.registry.ModRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class RegularBlocks {

    public static Block TEST_BLOCK;

    public static void init() {
        TEST_BLOCK = ModRegistry.registerBlock("test_block", new Block(AbstractBlock.Settings
                .create()
                .strength(4f)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
        ));
    }
}