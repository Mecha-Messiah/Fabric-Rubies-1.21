package net.mecha.rubiesmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mecha.rubiesmod.block.ModBlocks;
import net.mecha.rubiesmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RUBY, ModBlocks.RUBY_ORE,
                ModBlocks.DEEPSLATE_RUBY_ORE);

        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200,"ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100,"ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ARUBINUS_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ARUBINUS_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARCHITECT_WAND)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" # ")
                .input('@', ModItems.ARUBINUS_INGOT)
                .input('#', ModItems.NETHERITE_ROD)
                .criterion(hasItem(ModItems.ARUBINUS_INGOT), conditionsFromItem(ModItems.ARUBINUS_INGOT))
                .criterion(hasItem(ModItems.NETHERITE_ROD), conditionsFromItem(ModItems.NETHERITE_ROD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_ROD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY, 9)
                .input(ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARUBINUS_INGOT, 9)
                .input(ModBlocks.ARUBINUS_BLOCK)
                .criterion(hasItem(ModBlocks.ARUBINUS_BLOCK), conditionsFromItem(ModBlocks.ARUBINUS_BLOCK))
                .offerTo(exporter);
    }
}
