package net.mecha.rubiesmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mecha.rubiesmod.RubiesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RubiesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubiesMod.LOGGER.info("Registering Mod Items for " + RubiesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
