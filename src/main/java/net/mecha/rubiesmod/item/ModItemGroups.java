package net.mecha.rubiesmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mecha.rubiesmod.RubiesMod;
import net.mecha.rubiesmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBIES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RubiesMod.MOD_ID, "rubies_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.rubiesmod.rubies_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                    }).build());



    public static void registerItemGroups() {
        RubiesMod.LOGGER.info("Registering Item Groups for " + RubiesMod.MOD_ID);
    }
}
