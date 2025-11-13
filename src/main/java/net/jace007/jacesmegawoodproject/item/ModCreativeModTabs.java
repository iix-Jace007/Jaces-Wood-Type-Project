package net.jace007.jacesmegawoodproject.item;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JacesMegaWoodProject.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Jaces_Wood = CREATIVE_MODE_TABS.register("wood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABADON_STICK.get()))
                    .title(Component.translatable("creativetab.wood.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABADON_STICK.get());
                        output.accept(ModItems.ABU_STICK.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
