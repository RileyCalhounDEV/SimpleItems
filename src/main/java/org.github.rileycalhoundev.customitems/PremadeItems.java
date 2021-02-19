package org.github.rileycalhoundev.customitems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PremadeItems {

    public static void registerAllItems() {
        NamespacedKey itemKey = new NamespacedKey(CustomItems.getItems(), "assassin_shard");
        ShapedRecipe recipe = new ShapedRecipe(itemKey, getAssassinShard());

        recipe.shape(" I ", " I ");
        recipe.setIngredient('I', Material.IRON_INGOT);

        Bukkit.addRecipe(recipe);

        // Assassin Helmet
        itemKey = new NamespacedKey(CustomItems.getItems(), "assassin_helmet");
        recipe = new ShapedRecipe(itemKey, getAssassinHelmet());

        recipe.shape("III", "I I");
        recipe.setIngredient('I', Objects.requireNonNull(getAssassinShard().getData()));

        Bukkit.addRecipe(recipe);

        // Assassin Chestplate
        itemKey = new NamespacedKey(CustomItems.getItems(), "assassin_chestplate");
        recipe = new ShapedRecipe(itemKey, getAssassinChestplate());

        recipe.shape("I I", "III", "III");
        recipe.setIngredient('I', Objects.requireNonNull(getAssassinShard().getData()));

        Bukkit.addRecipe(recipe);

        // Assassin Leggings
        itemKey = new NamespacedKey(CustomItems.getItems(), "assassin_leggings");
        recipe = new ShapedRecipe(itemKey, getAssassinLeggings());

        recipe.shape("III", "I I", "I I");
        recipe.setIngredient('I', Objects.requireNonNull(getAssassinShard().getData()));

        Bukkit.addRecipe(recipe);

        // Assassin Boots
        itemKey = new NamespacedKey(CustomItems.getItems(), "assassin_boots");
        recipe = new ShapedRecipe(itemKey, getAssassinBoots());

        recipe.shape("I I", "I I");
        recipe.setIngredient('I', Objects.requireNonNull(getAssassinShard().getData()));

        Bukkit.addRecipe(recipe);
    }

    public static ItemStack getAssassinShard() {
        ItemStack assassinShard = new ItemStack(Material.IRON_NUGGET);
        ItemMeta shardMeta = assassinShard.getItemMeta();
        if (shardMeta != null)
            shardMeta.setDisplayName("§aAssassin Shard");
        assassinShard.setItemMeta(shardMeta);
        return assassinShard;
    }

    public static ItemStack getAssassinHelmet() {
        ItemStack assassinHelm = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta helmMeta = assassinHelm.getItemMeta();
        if (helmMeta != null) {
            helmMeta.setDisplayName("§aAssassin Helmet");
            List<String> lore = new ArrayList<>();
            lore.add("§aEffects while wearing full set:");
            lore.add("§7Speed I, Invisibility I");
            helmMeta.setLore(lore);
        }

        assassinHelm.setItemMeta(helmMeta);
        return assassinHelm;
    }

    public static ItemStack getAssassinChestplate() {
        ItemStack assassinChest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta helmMeta = assassinChest.getItemMeta();
        if (helmMeta != null) {
            helmMeta.setDisplayName("§aAssassin Chestplate");
            List<String> lore = new ArrayList<>();
            lore.add("§aEffects while wearing full set:");
            lore.add("§7Speed I, Invisibility I");
            helmMeta.setLore(lore);
        }

        assassinChest.setItemMeta(helmMeta);
        return assassinChest;
    }

    public static ItemStack getAssassinLeggings() {
        ItemStack assassinLegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta helmMeta = assassinLegs.getItemMeta();
        if (helmMeta != null) {
            helmMeta.setDisplayName("§aAssassin Leggings");
            List<String> lore = new ArrayList<>();
            lore.add("§aEffects while wearing full set:");
            lore.add("§7Speed I, Invisibility I");
            helmMeta.setLore(lore);
        }

        assassinLegs.setItemMeta(helmMeta);
        return assassinLegs;
    }

    public static ItemStack getAssassinBoots() {
        ItemStack assassinBoots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta helmMeta = assassinBoots.getItemMeta();
        if (helmMeta != null) {
            helmMeta.setDisplayName("§aAssassin Boots");
            List<String> lore = new ArrayList<>();
            lore.add("§aEffects while wearing full set:");
            lore.add("§7Speed I, Invisibility I");
            helmMeta.setLore(lore);
        }

        assassinBoots.setItemMeta(helmMeta);
        return assassinBoots;
    }

}
