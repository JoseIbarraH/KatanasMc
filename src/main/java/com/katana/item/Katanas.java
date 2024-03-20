package com.katana.item;

import com.katana.ItemGroup.KatanaItemGroup;
import com.katana.KatanaMC;
import com.katana.block.KatanaBlock;
import com.katana.item.ToolMaterialKatana.ToolMaterialKatanas;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Katanas extends SwordItem {

    public Katanas(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    //Items
    public static final Item Aki = new Katanas(ToolMaterialKatanas.AKI, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Baiken = new Katanas(ToolMaterialKatanas.BAIKEN, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Calavera = new Katanas(ToolMaterialKatanas.CALAVERA, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Hoja_Plateada = new Katanas(ToolMaterialKatanas.HOJA_PLATEADA, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Kusanagi = new Katanas(ToolMaterialKatanas.KUSANAGI, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Nichirin = new Katanas(ToolMaterialKatanas.NICHIRIN, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Shusui = new Katanas(ToolMaterialKatanas.SHUSUI, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Yasuo = new Katanas(ToolMaterialKatanas.YASUO, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));
    public static final Item Zagetsu = new Katanas(ToolMaterialKatanas.ZEGATSU, 0, -2.4F, new Item.Settings().group(KatanaItemGroup.KatanaMC).maxCount(1));

    //BlockItems
    public static final BlockItem CARTON = new BlockItem(KatanaBlock.CARTON, new Item.Settings().group(KatanaItemGroup.KatanaMC));


    public static void registerItem() {
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton"), CARTON);

        Registry.register(Registry.ITEM, new Identifier("katanamc", "aki"), Aki);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "baiken"), Baiken);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "calavera"), Calavera);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "hoja_plateada"), Hoja_Plateada);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "kusanagi"), Kusanagi);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "nichirin"), Nichirin);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "shusui"), Shusui);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "yasuo"), Yasuo);
        Registry.register(Registry.ITEM, new Identifier("katanamc", "zagetsu"), Zagetsu);
    }
}
