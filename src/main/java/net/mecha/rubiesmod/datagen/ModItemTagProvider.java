package net.mecha.rubiesmod.datagen;

import net.mecha.rubiesmod.item.ModItems;
import net.mecha.rubiesmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagProvider {
    public ModItemTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture, CompletableFuture<TagLookup<Item>> parentTagLookupFuture, CompletableFuture<TagLookup<Block>> blockTagLookupFuture) {
        super(output, registryLookupFuture, parentTagLookupFuture, blockTagLookupFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RUBY);
    }
}
