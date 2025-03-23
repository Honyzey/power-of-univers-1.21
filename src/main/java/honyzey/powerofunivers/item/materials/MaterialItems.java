package honyzey.powerofunivers.item.materials;

import honyzey.powerofunivers.item.special.PowerOfTime;
import honyzey.powerofunivers.registry.ModRegistry;
import net.minecraft.item.Item;

public class MaterialItems {

    public static Item INGOT_OF_UNIVERS;
    public static Item RAW_OF_UNIVERS;
    public static PowerOfTime POWER_OF_TIME;

    public static void init() {
        INGOT_OF_UNIVERS = ModRegistry.registerItem("ingot_of_univers", new Item(new Item.Settings()));
        RAW_OF_UNIVERS = ModRegistry.registerItem("raw_of_univers", new Item(new Item.Settings()));
        POWER_OF_TIME = (PowerOfTime) ModRegistry.registerItem("power_of_time", new PowerOfTime(new Item.Settings()));
    }
}