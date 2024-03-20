package com.katana.block;


import com.katana.ItemGroup.KatanaItemGroup;
import com.katana.KatanaMC;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KatanaBlock {

    public static final Block CARTON = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_AMARILLO = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_CAFE = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_GRIS = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_GRIS_CLARO = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_NARANJA = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_NEGRO = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_ROJO = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block CARTON_ROSA = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .requiresTool()
            .strength(1.5f, 15.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static void registerBlock(){
        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton"), CARTON);
        /*Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton"), new BlockItem(CARTON, new Item.Settings().group(KatanaItemGroup.KatanaMC)));*/

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_amarillo"), CARTON_AMARILLO);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_amarillo"), new BlockItem(CARTON_AMARILLO, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_cafe"), CARTON_CAFE);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_cafe"), new BlockItem(CARTON_CAFE, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_gris"), CARTON_GRIS);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_gris"), new BlockItem(CARTON_GRIS, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_gris_claro"), CARTON_GRIS_CLARO);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_gris_claro"), new BlockItem(CARTON_GRIS_CLARO, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_naranja"), CARTON_NARANJA);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_naranja"), new BlockItem(CARTON_NARANJA, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_negro"), CARTON_NEGRO);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_negro"), new BlockItem(CARTON_NEGRO, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_rojo"), CARTON_ROJO);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_rojo"), new BlockItem(CARTON_ROJO, new Item.Settings().group(KatanaItemGroup.KatanaMC)));

        Registry.register(Registry.BLOCK, new Identifier(KatanaMC.MOD_ID, "carton_rosa"), CARTON_ROSA);
        Registry.register(Registry.ITEM, new Identifier(KatanaMC.MOD_ID, "carton_rosa"), new BlockItem(CARTON_ROSA, new Item.Settings().group(KatanaItemGroup.KatanaMC)));
    }
}
