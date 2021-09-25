package com.dairyyy.metalmod;

import com.dairyyy.metalmod.block.MetalModBlocks;
import com.dairyyy.metalmod.block.ModFluids;
import com.dairyyy.metalmod.block.SeaModBlocks;
import com.dairyyy.metalmod.entity.*;
import com.dairyyy.metalmod.events.ModEvents;
import com.dairyyy.metalmod.item.ModItems;
import com.dairyyy.metalmod.setup.ClientProxy;
import com.dairyyy.metalmod.setup.IProxy;
import com.dairyyy.metalmod.setup.ServerProxy;
import com.dairyyy.metalmod.sound.ModSoundEvents;
import com.dairyyy.metalmod.util.Registration;
import com.dairyyy.metalmod.world.biome.ModBiomes;
import com.dairyyy.metalmod.world.biome.ModSurfaceBuilders;
import com.dairyyy.metalmod.world.dimension.ModDimensions;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MetalMod.MOD_ID)
public class MetalMod
{
    public static final String MOD_ID = "metalmod";

    public static final ItemGroup METAL_TAB = new ItemGroup("metaltab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.BISMUTH_INGOT.get());
        }
    };

    public static final ItemGroup SEA_TAB = new ItemGroup("seatab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.SALMON_SEA_FRUIT.get());
        }
    };

    public static IProxy proxy;

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MetalMod()
    {
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        registerModAddtions();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        registerConfigs();

        proxy.init();

        DeferredWorkQueue.runLater(() ->{
            GlobalEntityTypeAttributes.put(ModEntityTypes.POSSUM.get(), PossumEntity.setCustomAttributes().create());
                });
        DeferredWorkQueue.runLater(() ->{
            GlobalEntityTypeAttributes.put(ModEntityTypes.ELEPHANT_SHREW.get(), ElephantShrewEntity.setCustomAttributes().create());
        });
        DeferredWorkQueue.runLater(() ->{
            GlobalEntityTypeAttributes.put(ModEntityTypes.SERPENT.get(), SerpentEntity.setCustomAttributes().create());
        });
        DeferredWorkQueue.runLater(() ->{
            GlobalEntityTypeAttributes.put(ModEntityTypes.MOSASAURUS.get(), MosasaurusEntity.setCustomAttributes().create());
        });

        loadConfigs();
    }

    private void registerConfigs()
    {

    }

    private void loadConfigs()
    {

    }

    private void registerModAddtions()
    {
        // Inits the registration of additions
        Registration.init();

        // regosters items, blocks, ect. added in mod
        ModItems.register();
        MetalModBlocks.register();
        SeaModBlocks.register();
        ModFluids.register();
        ModEntityTypes.register();

        ModBiomes.register();
        ModSurfaceBuilders.register();

        ModSoundEvents.register();

        ModDimensions.register();

        // register mod events
        MinecraftForge.EVENT_BUS.register(new ModEvents());
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
       //LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }



    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
