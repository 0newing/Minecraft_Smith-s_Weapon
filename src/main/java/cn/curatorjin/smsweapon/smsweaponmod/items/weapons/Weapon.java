package cn.curatorjin.smsweapon.smsweaponmod.items.weapons;

import cn.curatorjin.smsweapon.smsweaponmod.items.moulds.Mould;


/**
 * 武器接口
 *
 * @author 0newing
 * @version 1.0
 */
public interface Weapon
{

    /**
     * 武器的分解方法
     *
     * @return 返还铸造所用的模具
     */
    Mould decompose();
}
