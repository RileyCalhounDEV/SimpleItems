package org.github.rileycalhoundev.customitems;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;
import static org.github.rileycalhoundev.customitems.PremadeItems.getAssassinHelmet;
import static org.github.rileycalhoundev.customitems.PremadeItems.getAssassinChestplate;
import static org.github.rileycalhoundev.customitems.PremadeItems.getAssassinLeggings;
import static org.github.rileycalhoundev.customitems.PremadeItems.getAssassinBoots;


public class CustomItems extends JavaPlugin implements Listener {

    private static CustomItems plugin;

    @Override
    public void onEnable() {
        plugin = this;
        PremadeItems.registerAllItems();
        getServer().getPluginManager().registerEvents(this, this);
    }
    public static CustomItems getItems() {
        return plugin;
    }

    @EventHandler
    public void PlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        if(isWearingAssassinArmor(player)) {
            PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 20 * 60, 1);
            PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, 20 * 60, 1);

            player.addPotionEffect(speed);
            player.addPotionEffect(invis);
        }
    }

    @EventHandler
    public boolean isWearingAssassinArmor(Player player) {

        ItemStack helmet = player.getInventory().getHelmet();
        ItemStack chestplate = player.getInventory().getChestplate();
        ItemStack leggings = player.getInventory().getLeggings();
        ItemStack boots = player.getInventory().getBoots();

        if(helmet == null || chestplate == null || leggings == null || boots == null)
            return false;

        return helmet.getItemMeta().getDisplayName().equals("§aAssassin Helmet") && chestplate.getItemMeta().getDisplayName().equals("§aAssassin Chestplate") && leggings.getItemMeta().getDisplayName().equals("§aAssassin Leggings") && boots.getItemMeta().getDisplayName().equals("§aAssassin Boots");
    }

}
