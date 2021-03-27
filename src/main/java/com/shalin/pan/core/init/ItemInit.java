package com.shalin.pan.core.init;

import com.shalin.pan.PanTheMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PanTheMod.MOD_ID);

    public static final RegistryObject<Item> IRON_PAN = ITEMS.register("iron_pan",
            () -> new net.minecraft.item.SwordItem(ItemTier.DIAMOND,4, -2.4f,new Item.Properties().tab(ItemGroup.TAB_COMBAT).defaultDurability(-1)));

    public static final RegistryObject<Item> NETHERITE_PAN = ITEMS.register("netherite_pan",
            () -> new net.minecraft.item.SwordItem(ItemTier.NETHERITE,7, -2.4f,new Item.Properties().tab(ItemGroup.TAB_COMBAT).defaultDurability(-1)));

    public static final RegistryObject<Item> THROWABLE_PAN = ITEMS.register("throwable_pan",
            () -> new TridentItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT)));


}
