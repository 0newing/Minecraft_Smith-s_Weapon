package com.smsweapon.smsweaponmod.items.moulds;

import com.smsweapon.smsweaponmod.items.weapons.Weapon;
import net.minecraft.item.ItemStack;


/**
 * 模具接口
 *
 * @author 0newing
 */
public interface Mould
{
    /**
     * 铸造方法
     *
     * @param itemStack 铸造所需的材料
     * @return 合成的武器
     */
    Weapon synthetic(ItemStack itemStack);
}
