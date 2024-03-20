package com.katana.item.ToolMaterialKatana;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ToolMaterialKatanas implements ToolMaterial {
    AKI(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BAIKEN(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    CALAVERA(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    HOJA_PLATEADA(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    KUSANAGI(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    NICHIRIN(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    SHUSUI(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    YASUO(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    ZEGATSU(3, 4500, 5.0f, 14.0f, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT));



    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterialKatanas(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
