package com.katana.ItemGroup;


import com.katana.block.KatanaBlock;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class KatanaItemGroup{

    public static final ItemGroup KatanaMC = FabricItemGroupBuilder
            .build(new Identifier("katanamc", "general"),
                    ()->new ItemStack(KatanaBlock.CARTON));
}
