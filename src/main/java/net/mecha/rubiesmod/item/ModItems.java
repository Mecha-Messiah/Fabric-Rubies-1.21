package net.mecha.rubiesmod.item;

import net.mecha.rubiesmod.RubiesMod;
import net.mecha.rubiesmod.item.custom.ArchitectWandItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item ARUBINUS_INGOT = registerItem("arubinus_ingot", new Item(new Item.Settings().fireproof()));

    public static final Item ARCHITECT_WAND = registerItem("architect_wand", new ArchitectWandItem(new Item.Settings().maxDamage(2000).maxCount(1)));

    public static final Item NETHERITE_ROD = registerItem("netherite_rod", new Item(new Item.Settings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RubiesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubiesMod.LOGGER.info("Registering Mod Items for " + RubiesMod.MOD_ID);

        }
    }
