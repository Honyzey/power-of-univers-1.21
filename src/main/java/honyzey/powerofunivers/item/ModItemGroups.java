package honyzey.powerofunivers.item;

import honyzey.powerofunivers.PowerOfUnivers;
import honyzey.powerofunivers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup POWER_OF_UNIVERS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(PowerOfUnivers.MOD_ID, "power_of_univers_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK))
                    .displayName(Text.translatable("itemgroup.powerofunivers.power_of_univers_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST_TEST);
                        entries.add(ModBlocks.TEST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        PowerOfUnivers.LOGGER.info("Registering Mod Item Groups for " + PowerOfUnivers.MOD_ID);
    }
}
