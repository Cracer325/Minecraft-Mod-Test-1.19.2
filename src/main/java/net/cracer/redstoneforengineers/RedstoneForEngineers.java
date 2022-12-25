package net.cracer.redstoneforengineers;

import com.mojang.logging.LogUtils;
import net.cracer.redstoneforengineers.block.ModBlocks;
import net.cracer.redstoneforengineers.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RedstoneForEngineers.MOD_ID)
public class RedstoneForEngineers
{
    public static final String MOD_ID = "redstoneforengineers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RedstoneForEngineers()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /* ------------- */
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        /* ------------- */

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
