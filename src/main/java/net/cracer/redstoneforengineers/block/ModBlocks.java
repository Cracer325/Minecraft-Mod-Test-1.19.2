package net.cracer.redstoneforengineers.block;

import net.cracer.redstoneforengineers.RedstoneForEngineers;
import net.cracer.redstoneforengineers.item.ModCreativeModeTab;
import net.cracer.redstoneforengineers.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    //todo figure out how to make a block have 2
    // redstone inputs and output a redstone signal

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RedstoneForEngineers.MOD_ID);



    /* ------------- */

    public static final RegistryObject<Block> ZIRICON_ORE = registerBlock("ziricon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.TUTORRIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_ZIRICON_ORE = registerBlock("deepslate_ziricon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.TUTORRIAL_TAB);
    public static final RegistryObject<Block> ZIRICON_BLOCK = registerBlock("ziricon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORRIAL_TAB);

    /* ------------- */


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
