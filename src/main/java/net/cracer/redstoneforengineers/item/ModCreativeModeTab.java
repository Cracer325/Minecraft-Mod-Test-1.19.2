package net.cracer.redstoneforengineers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORRIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());

        }
    };
}
