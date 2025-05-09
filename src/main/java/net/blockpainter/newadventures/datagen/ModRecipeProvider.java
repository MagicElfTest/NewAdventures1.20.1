package net.blockpainter.newadventures.datagen;

import net.blockpainter.newadventures.NewAdventures;
import net.blockpainter.newadventures.blocks.ModBlocks;
import net.blockpainter.newadventures.items.ModItems;
import net.blockpainter.newadventures.util.ModTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_PLANKS.get(), 4)
                .requires(ModTags.Items.YIRA_LOG)
                .unlockedBy(getHasName(ModBlocks.YIRA_LOG.get()), has(ModBlocks.YIRA_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, ModBlocks.YIRA_BUTTON.get(), 1)
                .requires(ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.YIRA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_LOG.get()), has(ModBlocks.YIRA_LOG.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_YIRA_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.STRIPPED_YIRA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_YIRA_LOG.get()), has(ModBlocks.STRIPPED_YIRA_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.YIRA_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_FENCE.get(), 2)
                .pattern("#S#")
                .pattern("#S#")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YIRA_FENCE_GATE.get(), 2)
                .pattern("S#S")
                .pattern("S#S")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YIRA_BOAT.get())
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YIRA_CHEST_BOAT.get())
                .requires(ModItems.YIRA_BOAT.get())
                .requires(Blocks.CHEST)
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YIRA_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .define('#', ModBlocks.YIRA_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YIRA_HANGING_SIGN.get(), 3)
                .pattern("S S")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.STRIPPED_YIRA_LOG.get())
                .define('S', Blocks.CHAIN)
                .unlockedBy(getHasName(ModBlocks.YIRA_PLANKS.get()), has(ModBlocks.YIRA_PLANKS.get()))
                .save(pWriter);
        trimSmithing(pWriter, ModItems.CURSE_SMITHING_TEMPALTE.get(), new ResourceLocation(NewAdventures.MODID, "curse"));
    }
}