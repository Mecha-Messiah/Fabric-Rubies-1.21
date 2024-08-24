package net.mecha.rubiesmod.item;

import net.mecha.rubiesmod.RubiesMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item ARUBINUS_INGOT = registerItem("arubinus_ingot", new Item(new Item.Settings().fireproof().rarity(Rarity.RARE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RubiesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubiesMod.LOGGER.info("Registering Mod Items for " + RubiesMod.MOD_ID);

        }
    }
