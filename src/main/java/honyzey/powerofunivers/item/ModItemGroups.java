package honyzey.powerofunivers.item;

import honyzey.powerofunivers.PowerOfUnivers;
import honyzey.powerofunivers.block.ores.OreBlocks;
import honyzey.powerofunivers.block.regular.RegularBlocks;
import honyzey.powerofunivers.item.materials.MaterialItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static ItemGroup POWER_OF_UNIVERS_ITEMS_GROUP;

    public static void registerItemGroups() {
        PowerOfUnivers.LOGGER.info("Registering Mod Item Groups for " + PowerOfUnivers.MOD_ID);

        // Créer le groupe d'items après l'initialisation des blocs et items
        POWER_OF_UNIVERS_ITEMS_GROUP = Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(PowerOfUnivers.MOD_ID, "power_of_univers_items"),
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(OreBlocks.DEEPSLATE_ORE_OF_UNIVERS))
                        .displayName(Text.translatable("itemgroup.powerofunivers.power_of_univers_items"))
                        .entries((displayContext, entries) -> {

                            // Items de matériaux
                            entries.add(MaterialItems.RAW_OF_UNIVERS);
                            entries.add(MaterialItems.INGOT_OF_UNIVERS);

                            // Blocs réguliers
                            entries.add(RegularBlocks.TEST_BLOCK);

                            // Minerais
                            entries.add(OreBlocks.ORE_OF_UNIVERS);
                            entries.add(OreBlocks.DEEPSLATE_ORE_OF_UNIVERS);
                            entries.add(OreBlocks.NETHER_ORE_OF_UNIVERS);
                            entries.add(OreBlocks.END_ORE_OF_UNIVERS);

                            // Special items
                            entries.add(MaterialItems.POWER_OF_TIME);
                        })
                        .build()
        );
    }
}