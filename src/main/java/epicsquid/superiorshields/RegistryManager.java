package epicsquid.superiorshields;

import epicsquid.superiorshields.item.ItemVanillaShield;
import epicsquid.superiorshields.shield.GenericShieldType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SuperiorShields.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryManager {

  private static final GenericShieldType IRON = new GenericShieldType(5f, 80, 40, ItemTier.IRON.getMaxUses());
  private static final GenericShieldType GOLD = new GenericShieldType(3f, 20, 40, ItemTier.GOLD.getMaxUses());
  private static final GenericShieldType DIAMOND = new GenericShieldType(7f, 60, 40, ItemTier.DIAMOND.getMaxUses());

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().register(new ItemVanillaShield(new Item.Properties().maxStackSize(1).group(SuperiorShields.ITEM_GROUP).maxDamage(ItemTier.IRON.getMaxUses()), IRON).setRegistryName(SuperiorShields.MODID, "iron_shield"));
    event.getRegistry().register(new ItemVanillaShield(new Item.Properties().maxStackSize(1).group(SuperiorShields.ITEM_GROUP).maxDamage(ItemTier.GOLD.getMaxUses()), GOLD).setRegistryName(SuperiorShields.MODID, "golden_shield"));
    event.getRegistry().register(new ItemVanillaShield(new Item.Properties().maxStackSize(1).group(SuperiorShields.ITEM_GROUP).maxDamage(ItemTier.DIAMOND.getMaxUses()), DIAMOND).setRegistryName(SuperiorShields.MODID, "diamond_shield"));
  }
}
