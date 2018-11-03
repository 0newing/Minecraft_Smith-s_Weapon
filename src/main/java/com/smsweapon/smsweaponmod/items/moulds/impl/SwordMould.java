package com.smsweapon.smsweaponmod.items.moulds.impl;

import com.smsweapon.smsweaponmod.SmithsWeapon;
import com.smsweapon.smsweaponmod.items.moulds.Mould;
import com.smsweapon.smsweaponmod.items.weapons.Weapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * 剑模具
 *
 * @author 0newing
 */
public class SwordMould extends Item implements Mould
{

    public SwordMould()
    {
        super();
        this.setUnlocalizedName("swordMould");
        this.setTextureName("smsweaponmod:swordMould");
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public Weapon synthetic(ItemStack itemStack)
    {
        return SmithsWeapon.getFireSword();
    }

}
