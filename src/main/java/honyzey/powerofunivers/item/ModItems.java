package honyzey.powerofunivers.item;

import honyzey.powerofunivers.PowerOfUnivers;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Test = registerItem("test", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PowerOfUnivers.MOD_ID, name), item);
    }

    public static void registerItems() {
        // Register items here
        PowerOfUnivers.LOGGER.info("Registering Mod Items for " + PowerOfUnivers.MOD_ID);
    }
}
