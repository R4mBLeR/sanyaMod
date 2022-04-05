package sanyamod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {
    public TestItem() {
        this.setUnlocalizedName("test");
        this.setRegistryName("test");
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
