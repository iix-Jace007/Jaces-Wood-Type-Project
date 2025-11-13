package net.jace007.jacesmegawoodproject.item;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, JacesMegaWoodProject.MOD_ID);

    public static final RegistryObject<Item> ABADON_STICK = ITEMS.register("abadon_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABU_STICK = ITEMS.register("abu_stick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
