package net.cracer.redstoneforengineers.item;

import net.cracer.redstoneforengineers.RedstoneForEngineers;
import net.cracer.redstoneforengineers.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RedstoneForEngineers.MOD_ID);
    public static  final RegistryObject<Item> ZIRCON = ITEMS.register("ziricon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORRIAL_TAB)));

    public static  final RegistryObject<Item> EXAMPLE_ITEM2 = ITEMS.register("example_item2",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORRIAL_TAB)));

    public static  final RegistryObject<Item> EIGHTBALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.TUTORRIAL_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
